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
public class Location implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLocation;
    private String locationName;
    @ManyToOne
    private LocationLevel locationLevel;

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

    public List<Location> getChildLocation() {
        return childLocation;
    }

    public void setChildLocation(List<Location> childLocation) {
        this.childLocation = childLocation;
    }

    public LocationLevel getLocationLevel() {
        return locationLevel;
    }

    public void setLocationLevel(LocationLevel locationLevel) {
        this.locationLevel = locationLevel;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @OneToMany
    private List<Location> childLocation;

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocation != null ? idLocation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLocation fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.idLocation == null && other.idLocation != null) || (this.idLocation != null && !this.idLocation.equals(other.idLocation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.ririnka.model.Location[ id=" + idLocation + " ]";
    }
}
