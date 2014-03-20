/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.LocationDAO;
import com.rab.girinka.models.Location;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class LocationDAOImpl implements LocationDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveLocation(Location Location) {
        sessionFactory.getCurrentSession().save(Location);
    }

    @Transactional
    public List<Location> listLocations() {
        return sessionFactory.getCurrentSession().createQuery("from Location").list();
    }
}
