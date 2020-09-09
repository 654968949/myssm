package com.wyz.to;

import javax.validation.constraints.NotNull;


public class GetOneEmployeeByIdTO {



    /**
     * 员工ID
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
