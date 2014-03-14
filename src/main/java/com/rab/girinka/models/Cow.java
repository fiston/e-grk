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
public class Cow implements Serializable {
    @OneToMany(mappedBy = "cow")
    private List<Kwitura> kwituras;
    @OneToMany(mappedBy = "cow")
    private List<LivestockEvent> livestockEvents;
    @OneToMany(mappedBy = "cow")
    private List<Insemination> inseminations;
    @OneToMany(mappedBy = "cow")
    private List<Girinka> girinkas;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCow;
    @Column(name = "earTag", nullable = false, length = 50)
    private String earTag;
    @ManyToOne
    private Breed breed;
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dod;
    @Column(name = "sex", nullable = false, length = 20)
    private String sex;
    @Column(name = "deathReason", nullable = false, length = 200)
    private String deathReason;
    @ManyToOne
    private Parity parity;
    @ManyToOne
    private Program program;
    @OneToOne
    private Insemination insemination;
    private int weight;

    public Long getIdCow() {
        return idCow;
    }

    public void setIdCow(Long idCow) {
        this.idCow = idCow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCow != null ? idCow.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idCow fields are not set
        if (!(object instanceof Cow)) {
            return false;
        }
        Cow other = (Cow) object;
        if ((this.idCow == null && other.idCow != null) || (this.idCow != null && !this.idCow.equals(other.idCow))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Cow[ id=" + idCow + " ]";
    }

    public String getEarTag() {
        return earTag;
    }

    public void setEarTag(String earTag) {
        this.earTag = earTag;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDod() {
        return dod;
    }

    public void setDod(Date dod) {
        this.dod = dod;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public Parity getParity() {
        return parity;
    }

    public void setParity(Parity parity) {
        this.parity = parity;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Insemination getInsemination() {
        return insemination;
    }

    public void setInsemination(Insemination insemination) {
        this.insemination = insemination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
