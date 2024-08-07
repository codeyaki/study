package com.jpabook.ch07mapping.compositekey.embeddedid.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

//@Entity
public class Parent {

    @EmbeddedId
    private ParentId id;

    private String name;

    public ParentId getId() {
        return id;
    }

    public void setId(ParentId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
