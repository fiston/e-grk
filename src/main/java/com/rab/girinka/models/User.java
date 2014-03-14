package com.rab.girinka.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idUser;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "password", nullable = false, length = 150)
    private String password;
    @Column(name = "uniqueId", nullable = false, length = 50)
    private String uniqueId;
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @ManyToOne
    private Role role;
    @OneToOne
    private Person person;
    @OneToMany(mappedBy = "user")
    private List<Program> programs;
    @OneToMany(mappedBy = "inseminator")
    private List<Insemination> inseminations;
    @OneToMany(mappedBy = "user")
    private List<Log> logss;
   
  
    public User() {
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    public List<Insemination> getInseminations() {
        return inseminations;
    }

    public void setInseminations(List<Insemination> inseminations) {
        this.inseminations = inseminations;
    }
    
}
