package com.rab.girinka.models;


import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;

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
    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Role(String roleName, String role_status, String description) {
        this.roleName = roleName;
        this.role_status = role_status;
        this.description = description;
    }

    public Role() {
        uuid= UUID.randomUUID().toString();
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

}
