/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.ProductionDAO;
import com.rab.girinka.models.Production;
import com.rab.girinka.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class ProductionServiceImplementation implements ProductionService {

    @Autowired
    private ProductionDAO ProductionDAO;


    @Transactional
    public void saveProduction(Production Production) {
        ProductionDAO.saveProduction(Production); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Production> listProductions() {
        return ProductionDAO.listProductions(); //To change body of generated methods, choose Tools | Templates.
    }

}
