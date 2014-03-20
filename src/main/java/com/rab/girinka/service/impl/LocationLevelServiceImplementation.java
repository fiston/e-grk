/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.LocationLevelDAO;
import com.rab.girinka.models.LocationLevel;
import com.rab.girinka.service.LocationLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class LocationLevelServiceImplementation implements LocationLevelService {

    @Autowired
    private LocationLevelDAO LocationLevelDAO;


    @Transactional
    public void saveLocationLevel(LocationLevel LocationLevel) {
        LocationLevelDAO.saveLocationLevel(LocationLevel); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<LocationLevel> listLocationLevels() {
        return LocationLevelDAO.listLocationLevels(); //To change body of generated methods, choose Tools | Templates.
    }

}
