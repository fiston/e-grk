/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.GirinkaDAO;
import com.rab.girinka.models.Girinka;
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
public class GirinkaDAOImpl implements GirinkaDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveGirinka(Girinka Girinka) {
        sessionFactory.getCurrentSession().save(Girinka);
    }

    @Transactional
    public List<Girinka> listGirinkas() {
        return sessionFactory.getCurrentSession().createQuery("from Girinka").list();
    }
}
