package com.rab.girinka.models;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Role implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRole;
    @Column(length = 50,nullable=false)
    private String roleName;
    @Column(length = 50,nullable=false)
    private String role_status;
    @Column(length = 50,nullable=false)
    private String description;
    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role(String roleName, String role_status, String description) {
        this.roleName = roleName;
        this.role_status = role_status;
        this.description = description;
    }

    public Role() {
    }

  

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRole_status() {
        return role_status;
    }

    public void setRole_status(String role_status) {
        this.role_status = role_status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
