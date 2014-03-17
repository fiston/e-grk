/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
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
public class Production implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduction;
    @ManyToOne
    private Girinka girinka;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date startDate;
    @Column(name = "product", nullable = false, length = 50)
    private String product;
    @Column( nullable = false)
    private int qtyMorning;
    @Column( nullable = false)
    private int qtyEvening;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date endDate;
    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;

    public Long getIdProduction() {
        return idProduction;
    }

    public void setIdProduction(Long idProduction) {
        this.idProduction = idProduction;
    }

    public Production(){
        uuid= UUID.randomUUID().toString();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduction != null ? idProduction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idProduction fields are not set
        if (!(object instanceof Production)) {
            return false;
        }
        Production other = (Production) object;
        if ((this.idProduction == null && other.idProduction != null) || (this.idProduction != null && !this.idProduction.equals(other.idProduction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Production[ id=" + idProduction + " ]";
    }

    public Girinka getGirinka() {
        return girinka;
    }

    public void setGirinka(Girinka girinka) {
        this.girinka = girinka;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getQtyMorning() {
        return qtyMorning;
    }

    public void setQtyMorning(int qtyMorning) {
        this.qtyMorning = qtyMorning;
    }

    public int getQtyEvening() {
        return qtyEvening;
    }

    public void setQtyEvening(int qtyEvening) {
        this.qtyEvening = qtyEvening;
    }
    
}
