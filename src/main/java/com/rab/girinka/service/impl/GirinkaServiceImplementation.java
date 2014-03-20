/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.GirinkaDAO;
import com.rab.girinka.models.Girinka;
import com.rab.girinka.service.GirinkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class GirinkaServiceImplementation implements GirinkaService {

    @Autowired
    private GirinkaDAO GirinkaDAO;


    @Transactional
    public void saveGirinka(Girinka Girinka) {
        GirinkaDAO.saveGirinka(Girinka); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Girinka> listGirinkas() {
        return GirinkaDAO.listGirinkas(); //To change body of generated methods, choose Tools | Templates.
    }

}
