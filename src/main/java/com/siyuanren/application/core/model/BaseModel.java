package com.siyuanren.application.core.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable {
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
