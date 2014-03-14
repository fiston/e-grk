/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;


/**
 *
 * @author Administrator
 */
@Entity
public class Insemination implements Serializable {
    @OneToMany(mappedBy = "previous")
    private List<Insemination> inseminations;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idInsemination;
    @ManyToOne
    private Cow cow;
    private int calvingNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periodOfLastCalving;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date inseminationTime;
    private String inseminationNumber;
    private int agesOfCow;
   
    @ManyToOne
    private User inseminator;
    @ManyToOne
    private Insemination previous;
    private String observation;
    
    

    public Long getIdInsemination() {
        return idInsemination;
    }

    public void setIdInsemination(Long idInsemination) {
        this.idInsemination = idInsemination;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInsemination != null ? idInsemination.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idInsemination fields are not set
        if (!(object instanceof Insemination)) {
            return false;
        }
        Insemination other = (Insemination) object;
        if ((this.idInsemination == null && other.idInsemination != null) || (this.idInsemination != null && !this.idInsemination.equals(other.idInsemination))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rab.girinka.models.Insemination[ id=" + idInsemination + " ]";
    }

    public List<Insemination> getInseminations() {
        return inseminations;
    }

    public void setInseminations(List<Insemination> inseminations) {
        this.inseminations = inseminations;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public int getCalvingNumber() {
        return calvingNumber;
    }

    public void setCalvingNumber(int calvingNumber) {
        this.calvingNumber = calvingNumber;
    }

    public Date getPeriodOfLastCalving() {
        return periodOfLastCalving;
    }

    public void setPeriodOfLastCalving(Date periodOfLastCalving) {
        this.periodOfLastCalving = periodOfLastCalving;
    }

    public Date getInseminationTime() {
        return inseminationTime;
    }

    public void setInseminationTime(Date inseminationTime) {
        this.inseminationTime = inseminationTime;
    }

    public String getInseminationNumber() {
        return inseminationNumber;
    }

    public void setInseminationNumber(String inseminationNumber) {
        this.inseminationNumber = inseminationNumber;
    }

    public int getAgesOfCow() {
        return agesOfCow;
    }

    public void setAgesOfCow(int agesOfCow) {
        this.agesOfCow = agesOfCow;
    }

    public User getInseminator() {
        return inseminator;
    }

    public void setInseminator(User inseminator) {
        this.inseminator = inseminator;
    }

    public Insemination getPrevious() {
        return previous;
    }

    public void setPrevious(Insemination previous) {
        this.previous = previous;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
}
