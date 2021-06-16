package com.andrew.springcloudzuul;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "roleGenerator")
    @SequenceGenerator(name = "roleGenerator", sequenceName = "roleSequence", initialValue = 3)
    private Integer roleId;
    private String roleName;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role() {
    }

    public Role(Integer id, String name, List<User> users) {
        this.roleId = id;
        this.roleName = name;
        this.users = users;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
