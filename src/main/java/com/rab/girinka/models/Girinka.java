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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class Girinka implements Serializable {
    @OneToMany(mappedBy = "girinka")
    private List<Kwitura> kwituras;
    @OneToMany(mappedBy = "girinka")
    private List<Production> productions;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGirinka;
    @ManyToOne
    private Person person;
    @ManyToOne
    private Cow cow;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date girinkaDate;
    @Column(name = "cowStatus", nullable = false, length = 50)
    private String cowStatus;
    @Column(name = "milkEstimation", nullable = false, length = 50)
    private String milkEstimation;
    @Column(name = "status", nullable = false, length = 50)
    private String status;

    public Long getIdGirinka() {
        return idGirinka;
    }

    public void setIdGirinka(Long idGirinka) {
        this.idGirinka = idGirinka;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGirinka != null ? idGirinka.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idGirinka fields are not set
        if (!(object instanceof Girinka)) {
            return false;
        }
        Girinka other = (Girinka) object;
        if ((this.idGirinka == null && other.idGirinka != null) || (this.idGirinka != null && !this.idGirinka.equals(other.idGirinka))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.girinka.models.Girinka[ id=" + idGirinka + " ]";
    }

    public List<Production> getProductions() {
        return productions;
    }

    public void setProductions(List<Production> productions) {
        this.productions = productions;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Date getGirinkaDate() {
        return girinkaDate;
    }

    public void setGirinkaDate(Date girinkaDate) {
        this.girinkaDate = girinkaDate;
    }

    public String getCowStatus() {
        return cowStatus;
    }

    public void setCowStatus(String cowStatus) {
        this.cowStatus = cowStatus;
    }

    public String getMilkEstimation() {
        return milkEstimation;
    }

    public void setMilkEstimation(String milkEstimation) {
        this.milkEstimation = milkEstimation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
