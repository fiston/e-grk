/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
public class Parity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idParity;
    @Column(name = "partyName", nullable = false, length = 50)
    private String partyName;
      @Column(name = "description", nullable = false, length = 100)
    private String description;
    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;

    public int getIdParity() {
        return idParity;
    }

    public void setIdParity(int idParity) {
        this.idParity = idParity;
    }
    public Parity(){
        uuid= UUID.randomUUID().toString();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idParity;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idParity fields are not set
        if (!(object instanceof Parity)) {
            return false;
        }
        Parity other = (Parity) object;
        if (this.idParity != other.idParity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Parity[ id=" + idParity + " ]";
    }
    
}
