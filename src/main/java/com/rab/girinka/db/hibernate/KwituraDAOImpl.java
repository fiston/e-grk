/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.KwituraDAO;
import com.rab.girinka.models.Kwitura;
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
public class KwituraDAOImpl implements KwituraDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveKwitura(Kwitura Kwitura) {
        sessionFactory.getCurrentSession().save(Kwitura);
    }

    @Transactional
    public List<Kwitura> listKwituras() {
        return sessionFactory.getCurrentSession().createQuery("from Kwitura").list();
    }
}
