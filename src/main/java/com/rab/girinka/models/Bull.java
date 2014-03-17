/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class Bull implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBull;
    private String bullName;
    @ManyToOne
    private Breed breed;//
    @Column(name = "bullNumber", nullable = false, length = 50)
    private String bullNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date freezingDate;
    @Column(name = "internationalCode", nullable = false, length = 50)
    private String internationalCode;
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registrationDate;

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;

    public Long getIdBull() {
        return idBull;
    }

    public void setIdBull(Long idBull) {
        this.idBull = idBull;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBull != null ? idBull.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idBull fields are not set
        if (!(object instanceof Bull)) {
            return false;
        }
        Bull other = (Bull) object;
        if ((this.idBull == null && other.idBull != null) || (this.idBull != null && !this.idBull.equals(other.idBull))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Bull[ id=" + idBull + " ]";
    }

    public String getBullName() {
        return bullName;
    }

    public void setBullName(String bullName) {
        this.bullName = bullName;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getBullNumber() {
        return bullNumber;
    }

    public void setBullNumber(String bullNumber) {
        this.bullNumber = bullNumber;
    }

    public Date getFreezingDate() {
        return freezingDate;
    }

    public void setFreezingDate(Date freezingDate) {
        this.freezingDate = freezingDate;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    
}
