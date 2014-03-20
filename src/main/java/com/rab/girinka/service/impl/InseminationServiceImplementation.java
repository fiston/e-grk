/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.InseminationDAO;
import com.rab.girinka.models.Insemination;
import com.rab.girinka.service.InseminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class InseminationServiceImplementation implements InseminationService {

    @Autowired
    private InseminationDAO InseminationDAO;


    @Transactional
    public void saveInsemination(Insemination Insemination) {
        InseminationDAO.saveInsemination(Insemination); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Insemination> listInseminations() {
        return InseminationDAO.listInseminations(); //To change body of generated methods, choose Tools | Templates.
    }

}
