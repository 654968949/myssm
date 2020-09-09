package com.wyz.service;

import com.wyz.entity.Department;
import com.wyz.entity.Employee;

import java.util.List;

/**
 * 部门表(Department)表服务接口
 *
 * @author makejava
 * @since 2020-09-08 22:50:04
 */
public interface DepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Department queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Department> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department insert(Department department);

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department update(Department department);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过该部门Id获取其下所有部门
     * @param id
     * @return
     */
    List<Department> queryAllById(Long id);

    /**
     * 获取该部门下的所有员工
     */
    List<Employee> getAllEmployee(Long id);


}