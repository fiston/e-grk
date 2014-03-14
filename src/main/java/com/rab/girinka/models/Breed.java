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
    @OneToMany(mappedBy = "breed")
    private List<Bull> bulls;
   
   

    public Breed() {
    }

}
