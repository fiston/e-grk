/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.BreedDAO;
import com.rab.girinka.models.Breed;
import com.rab.girinka.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class BreedServiceImplementation implements BreedService {

    @Autowired
    private BreedDAO BreedDAO;


    @Transactional
    public void saveBreed(Breed Breed) {
        BreedDAO.saveBreed(Breed); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Breed> listBreed() {
        return BreedDAO.listBreed(); //To change body of generated methods, choose Tools | Templates.
    }

}
