package com.jpabook.ch07mapping.compositekey.identify.embeddedid.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChildId implements Serializable {
    private String parentId;

    @Column(name = "CHILD_ID")
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildId childId = (ChildId) o;
        return Objects.equals(parentId, childId.parentId) && Objects.equals(id, childId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, id);
    }
}
