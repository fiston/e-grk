/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Administrator
 */
@Entity
public class LocationLevel implements Serializable {

    @OneToMany(mappedBy = "locationLevel")
    private List<Location> locations;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLocation;
    @Column(name = "levelName", nullable = false, length = 50)
    private String levelName;
    @Column(name = "description", nullable = false, length = 50)
    private String description;

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

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
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
