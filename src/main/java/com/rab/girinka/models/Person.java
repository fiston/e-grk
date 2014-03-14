/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class Person implements Serializable {
    @OneToMany(mappedBy = "person")
    private List<Kwitura> kwituras;
    @OneToMany(mappedBy = "person")
    private List<Girinka> girinkas;
    @OneToOne(mappedBy = "person")
    private User user;
 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;
    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;
    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;
    @Column(name = "telephone", nullable = false, length = 50)
    private String telephone;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "dob", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    @Column(name = "sex", nullable = false)
    private String sex;
    @Column(name = "identity", nullable = false, length = 50)
    private String identity;
    @Column(name = "martalStatus", nullable = false, length = 50)
    private String martalStatus;
    @ManyToOne
    private Location location;

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerson != null ? idPerson.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idPerson fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.idPerson == null && other.idPerson != null) || (this.idPerson != null && !this.idPerson.equals(other.idPerson))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Person[ id=" + idPerson + " ]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
}
