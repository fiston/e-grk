/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
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
public class Kwitura implements Serializable {
    private static final long serialVersionUID = 1L;
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
