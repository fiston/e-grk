/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.BullDAO;
import com.rab.girinka.models.Bull;
import com.rab.girinka.service.BullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class BullServiceImplementation implements BullService {

    @Autowired
    private BullDAO BullDAO;


    @Transactional
    public void saveBull(Bull Bull) {
        BullDAO.saveBull(Bull); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Bull> listBulls() {
        return BullDAO.listBulls(); //To change body of generated methods, choose Tools | Templates.
    }

}
