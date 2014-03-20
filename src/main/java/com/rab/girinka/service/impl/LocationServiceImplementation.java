/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.LocationDAO;
import com.rab.girinka.models.Location;
import com.rab.girinka.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class LocationServiceImplementation implements LocationService {

    @Autowired
    private LocationDAO LocationDAO;


    @Transactional
    public void saveLocation(Location Location) {
        LocationDAO.saveLocation(Location); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Location> listLocations() {
        return LocationDAO.listLocations(); //To change body of generated methods, choose Tools | Templates.
    }

}
