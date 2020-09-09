package com.wyz.to;

import javax.validation.constraints.NotNull;

public class UpdateDepartmentTO {
    /**
     * 部门编号
     */
    @NotNull(message = "ID不能为空")
    private Long id;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 父部门编号
     */
    private Long parentId;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }



    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
