package com.siyuanren.application.model;

import com.siyuanren.application.core.model.BaseModel;



public class User extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
