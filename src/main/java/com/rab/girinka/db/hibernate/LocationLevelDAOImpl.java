/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.LocationLevelDAO;
import com.rab.girinka.models.LocationLevel;
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
public class LocationLevelDAOImpl implements LocationLevelDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveLocationLevel(LocationLevel LocationLevel) {
        sessionFactory.getCurrentSession().save(LocationLevel);
    }

    @Transactional
    public List<LocationLevel> listLocationLevels() {
        return sessionFactory.getCurrentSession().createQuery("from LocationLevel").list();
    }
}
