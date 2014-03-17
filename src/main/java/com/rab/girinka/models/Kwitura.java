/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
public class Kwitura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idKwitura;
    @ManyToOne
    private Cow cow;
    @ManyToOne
    private Person person;
    @ManyToOne
    private Girinka girinka;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

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

    public Long getIdKwitura() {
        return idKwitura;
    }

    public void setIdKwitura(Long idKwitura) {
        this.idKwitura = idKwitura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKwitura != null ? idKwitura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idKwitura fields are not set
        if (!(object instanceof Kwitura)) {
            return false;
        }
        Kwitura other = (Kwitura) object;
        if ((this.idKwitura == null && other.idKwitura != null) || (this.idKwitura != null && !this.idKwitura.equals(other.idKwitura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Kwitura[ id=" + idKwitura + " ]";
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Girinka getGirinka() {
        return girinka;
    }

    public void setGirinka(Girinka girinka) {
        this.girinka = girinka;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
