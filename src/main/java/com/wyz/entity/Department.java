package com.wyz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门表(Department)实体类
 *
 * @author wyz
 * @since 2020-09-08 14:06:16
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 701797689961377607L;
    /**
     * 部门编号
     */
    private Long id;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 父部门编号
     */
    private Long parentId;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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