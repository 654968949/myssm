package com.wyz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工表(Employee)实体类
 *
 * @author wyz
 * @since 2020-09-08 14:06:44
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -80171265184388539L;
    /**
     * 员工id
     */
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
    /**
     * 创建时间
     */
    private Date serverCreateTime;
    /**
     * 修改时间
     */
    private Date serverUpdateTime;


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

    public Date getServerCreateTime() {
        return serverCreateTime;
    }

    public void setServerCreateTime(Date serverCreateTime) {
        this.serverCreateTime = serverCreateTime;
    }

    public Date getServerUpdateTime() {
        return serverUpdateTime;
    }

    public void setServerUpdateTime(Date serverUpdateTime) {
        this.serverUpdateTime = serverUpdateTime;
    }

}