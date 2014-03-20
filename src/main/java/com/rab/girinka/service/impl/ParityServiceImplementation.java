/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.ParityDAO;
import com.rab.girinka.models.Parity;
import com.rab.girinka.service.ParityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class ParityServiceImplementation implements ParityService {

    @Autowired
    private ParityDAO ParityDAO;


    @Transactional
    public void saveParity(Parity Parity) {
        ParityDAO.saveParity(Parity); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Parity> listParitys() {
        return ParityDAO.listParitys(); //To change body of generated methods, choose Tools | Templates.
    }

}
