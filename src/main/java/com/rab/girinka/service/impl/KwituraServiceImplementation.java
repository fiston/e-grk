/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.KwituraDAO;
import com.rab.girinka.models.Kwitura;
import com.rab.girinka.service.KwituraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class KwituraServiceImplementation implements KwituraService {

    @Autowired
    private KwituraDAO KwituraDAO;


    @Transactional
    public void saveKwitura(Kwitura Kwitura) {
        KwituraDAO.saveKwitura(Kwitura); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Kwitura> listKwituras() {
        return KwituraDAO.listKwituras(); //To change body of generated methods, choose Tools | Templates.
    }

}
