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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class LivestockEvent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLivestockEvent;
    @ManyToOne
    private Cow cow;
    @Column(name = "event", nullable = false, length = 50)
    private String event;
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date eventDate;

    public Long getIdLivestockEvent() {
        return idLivestockEvent;
    }

    public void setIdLivestockEvent(Long idLivestockEvent) {
        this.idLivestockEvent = idLivestockEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLivestockEvent != null ? idLivestockEvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLivestockEvent fields are not set
        if (!(object instanceof LivestockEvent)) {
            return false;
        }
        LivestockEvent other = (LivestockEvent) object;
        if ((this.idLivestockEvent == null && other.idLivestockEvent != null) || (this.idLivestockEvent != null && !this.idLivestockEvent.equals(other.idLivestockEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.girinka.models.LivestockEvents[ id=" + idLivestockEvent + " ]";
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    
    
}
