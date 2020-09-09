package com.wyz.to;

import javax.validation.constraints.NotNull;

public class GetOneDepartmentTO {



    /**
     * 部门Id
     */
    @NotNull
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
