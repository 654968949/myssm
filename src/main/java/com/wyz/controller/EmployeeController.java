package com.wyz.controller;

import com.wyz.entity.Employee;
import com.wyz.service.EmployeeService;
import com.wyz.to.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工表(Employee)表控制层
 *
 * @author makejava
 * @since 2020-09-08 14:14:16
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 通过员工姓名查询员工信息
     * @param to 姓名
     * @return 员工信息
     */
    @RequestMapping(value = "/getByName",method = RequestMethod.POST)

    public List<Employee> getByName(@RequestBody @Validated GetEmployeeByNameTO to) {
        System.out.println("aaaaaaaaaaaaaaaaaaa"+to.getName());
        List<Employee> employeeLists = employeeService.getByName(to.getName());
        return employeeLists;
    }

    /**
     * 通过Id查询某个员工信息
     * @param to 员工Id
     * @return 单个员工信息
     */
    @RequestMapping(value = "/getById",method = RequestMethod.POST)
    public Employee getById(@RequestBody GetOneEmployeeByIdTO to ) {
        System.out.println("bbbbbb"+ to.getId());
        Employee em = employeeService.queryById(to.getId());
        return em;
    }

    /**
     * 获取所有员工信息
     */
    @RequestMapping(value = "/getAllEmployees",method = RequestMethod.GET)
    public  List<Employee> getAllEmployees() {
        List<Employee> employeeLists = employeeService.queryAllByLimit(0,1000);
        return employeeLists;
    }

    /**
     * 修改员工信息
     */
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public Employee updateById(@RequestBody UpdateEmployeeByIdTO to) {
        Employee employee = new Employee();
        employee.setId(to.getId());
        employee.setEmployeeName(to.getEmployeeName());
        employee.setJob(to.getJob());
        employee.setSalary(to.getSalary());
        employee.setDepartmentId(to.getDepartmentId());
        Employee em = employeeService.update(employee);
        return em;
    }

    /**
     * 新增员工
     */
    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public String addEmployee(@RequestBody AddEmployeeTO to) {
        Employee employee = new Employee();
        employee.setEmployeeName(to.getEmployeeName());
        employee.setJob(to.getJob());
        employee.setSalary(to.getSalary());
        employee.setDepartmentId(to.getDepartmentId());
        int count = employeeService.insert(employee);
        if (count >= 1) {
            return "success!";
        }
        return "fail!";
    }
    /**
     * 删除员工
     *
     */
    @RequestMapping(value = "/deleteEmployee",method = RequestMethod.POST)
    public String deleteEmployee(@RequestBody DeleteTO to) {
        Boolean b = employeeService.deleteById(to.getId());
        if (b) {
            return "success";
        }
        return "fail";
    }


}