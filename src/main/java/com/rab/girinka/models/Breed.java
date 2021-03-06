package com.rab.girinka.models;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Breed implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idBreed;


    protected String breedName;

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
   
   

    public Breed() {
    }
    public int getIdBreed() {
        return idBreed;
    }

    public void setIdBreed(int idBreed) {
        this.idBreed = idBreed;
    }

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


}
