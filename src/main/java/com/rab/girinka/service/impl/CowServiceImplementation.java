/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.CowDAO;
import com.rab.girinka.models.Cow;
import com.rab.girinka.service.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class CowServiceImplementation implements CowService {

    @Autowired
    private CowDAO CowDAO;


    @Transactional
    public void saveCow(Cow Cow) {
        CowDAO.saveCow(Cow); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Cow> listCow() {
        return CowDAO.listCow(); //To change body of generated methods, choose Tools | Templates.
    }

}
