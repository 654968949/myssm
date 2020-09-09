package com.wyz.controller;

import com.wyz.entity.Department;
import com.wyz.entity.Employee;
import com.wyz.service.DepartmentService;
import com.wyz.to.*;
import org.springframework.beans.BeanUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部门表(Department)表控制层
 *
 * @author makejava
 * @since 2020-09-08 22:50:04
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

    /**
     * 查询现有的所有的部门
     */
    @RequestMapping(value = "/getAllDepartment",method = RequestMethod.GET)
    public List<Department> getAllDepartment() {
        return this.departmentService.queryAllByLimit(0,1000);
    }

    /**
     * 查询单个部门
     */
    @RequestMapping(value = "/getOneDepartment",method = RequestMethod.POST)
    public Department getOneDepartment(@RequestBody @Validated GetOneEmployeeByIdTO to) {
        return this.departmentService.queryById(to.getId());
    }

    /**
     * 查询某部门的父部门信息
     */
    @RequestMapping(value = "/getParentDepartment",method = RequestMethod.POST)
    public Department getParentDepartment(@RequestBody GetParentDepartmentTO to) {
        //先查询父部门
        Department department = departmentService.queryById(to.getId());
        return this.departmentService.queryById(department.getParentId());
    }

    /**
     * 查询某部门下的所有子部门
     */
    @RequestMapping(value = "/getAllDepartmentById",method = RequestMethod.POST)
    public List<Department> getAllDepartmentById(@RequestBody GetAllDepartmentByIdTO to) {
        return this.departmentService.queryAllById(to.getId());
    }

    /**
     * 查询某部门下的所有员工信息
     */
    @RequestMapping(value = "/getAllEmployee",method = RequestMethod.POST)
    public List<Employee> getAllEmployee(@RequestBody GetAllEmployeeTO to) {
        return this.departmentService.getAllEmployee(to.getId());
    }

    /**
     * 修改部门信息
     */
    @RequestMapping(value = "/updateDepartment",method = RequestMethod.POST)
    public Department updateDepartment(@RequestBody UpdateDepartmentTO to) {

        Department department = new Department();
        BeanUtils.copyProperties(to,department);
        return departmentService.update(department);
    }

    /**
     * 删除部门
     */
    @RequestMapping(value = "/deleteDepartment",method = RequestMethod.POST)
    public String deleteDepartment(@RequestBody DeleteTO to) {
        Boolean b = departmentService.deleteById(to.getId());
        if (b) {
            return "success";
        }
        return "fail";
    }






}