package com.scaler.splitwise.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group extends BaseModel {

    private String name;

    // 1 group can have multiple admins
    // 1 admin can be a part of multiple groups
    @ManyToMany
    private List<User> admins = new ArrayList<>();

    @ManyToMany
    private List<User> members = new ArrayList<>();

    @ManyToOne
    private User createdBy;


}
