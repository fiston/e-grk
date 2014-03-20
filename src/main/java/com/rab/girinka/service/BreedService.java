/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.Breed;
import com.rab.girinka.models.Source;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface BreedService {

    public void saveBreed(Breed breed);

    public List<Breed> listBreed();
}
