package com.wyz.service.impl;

import com.wyz.dao.DepartmentDao;
import com.wyz.dao.EmployeeDao;
import com.wyz.entity.Department;
import com.wyz.entity.Employee;
import com.wyz.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 部门表(Department)表服务实现类
 *
 * @author makejava
 * @since 2020-09-08 22:50:04
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;
    @Resource
    private EmployeeDao employeeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Department queryById(Long id) {
        return this.departmentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Department> queryAllByLimit(int offset, int limit) {
        return this.departmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department insert(Department department) {
        this.departmentDao.insert(department);
        return department;
    }

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department update(Department department) {
        this.departmentDao.update(department);
        return this.queryById(department.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.departmentDao.deleteById(id) > 0;
    }

    /**
     * 获取某部门下所有子部门
     * @param id
     * @return
     */
    @Override
    public List<Department> queryAllById(Long id) {
        return departmentDao.queryAllById(id);
    }

    @Override
    public List<Employee> getAllEmployee(Long id) {
        //先获取到所有部门
        List<Department> departments = departmentDao.queryAllById(id);
        //拿到所有的部门Id
        List<Long> departmentIds = departments.stream().map(Department::getId).collect(Collectors.toList());
        System.out.println(departmentIds);

        List<Employee> employees = new ArrayList<>();
        for (Long dId:departmentIds) {
            Employee employee = employeeDao.queryById(dId);
            if (!StringUtils.isEmpty(employee)) {
                employees.add(employee);
            }
        }
        return employees;
    }

}