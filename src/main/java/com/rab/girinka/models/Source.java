/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
public class Source implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSource;
  @Column(name = "sourceName", nullable = false, length = 50)
    private String sourceName;
   @Column(name = "description", nullable = false, length = 150)
    private String description;
    @OneToMany
    private List<Program> programs;
    @ManyToOne
    private User createdBy;
    public String getUuid() {
        return uuid;
    }
    @Column(name="uuid", nullable=false)
    private String uuid;

    public Source(String sourceName, String description) {
        this.sourceName = sourceName;
        this.description = description;
    }

    public Source() {
        uuid= UUID.randomUUID().toString();
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdSource() {
        return idSource;
    }

    public void setIdSource(int idSource) {
        this.idSource = idSource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSource;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idSource fields are not set
        if (!(object instanceof Source)) {
            return false;
        }
        Source other = (Source) object;
        if (this.idSource != other.idSource) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.girinka.models.Source[ idSource=" + idSource + " ]";
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }
    
}
