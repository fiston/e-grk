/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
public class LocationLevel implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLocation;
    @Column(name = "levelName", nullable = false, length = 50)
    private String levelName;
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;

    public int getId() {
        return idLocation;
    }

    public void setId(int id) {
        this.idLocation = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idLocation;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLocation fields are not set
        if (!(object instanceof LocationLevel)) {
            return false;
        }
        LocationLevel other = (LocationLevel) object;
        if (this.idLocation != other.idLocation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Level[ id=" + idLocation + " ]";
    }


    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
