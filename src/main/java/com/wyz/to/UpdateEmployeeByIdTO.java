package com.wyz.to;


import javax.validation.constraints.NotNull;

public class UpdateEmployeeByIdTO {

    /**
     * 员工id
     */
    @NotNull(message = "ID不能为空")
    private Long id;
    /**
     * 员工姓名
     */
    private String employeeName;
    /**
     * 所属部门
     */
    private Long departmentId;
    /**
     * 员工工作岗位
     */
    private String job;
    /**
     * 工资
     */
    private String salary;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
