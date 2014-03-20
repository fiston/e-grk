/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.ParityDAO;
import com.rab.girinka.models.Parity;
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
public class ParityDAOImpl implements ParityDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveParity(Parity Parity) {
        sessionFactory.getCurrentSession().save(Parity);
    }

    @Transactional
    public List<Parity> listParitys() {
        return sessionFactory.getCurrentSession().createQuery("from Parity").list();
    }
}
