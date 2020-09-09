package com.wyz.to;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class AddEmployeeTO {

    /**
     * 员工姓名
     */
    @NotNull(message = "员工姓名不能为空")
    private String employeeName;
    /**
     * 所属部门
     */
    @NotNull(message = "部门id不能为空")

    private Long departmentId;
    /**
     * 员工工作岗位
     */
    @NotNull(message = "员工岗位不能为空")
    private String job;
    /**
     * 工资
     */
    @NotNull(message = "员工工资不能为空")
    private String salary;


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



}
