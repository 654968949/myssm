package com.wyz.to;

import javax.validation.constraints.NotNull;

public class GetEmployeeByNameTO {


    /**
     * 员工姓名
     */
    @NotNull(message = "员工姓名不能为空")
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
