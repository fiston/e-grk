/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.BullDAO;
import com.rab.girinka.models.Bull;
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
public class BullDAOImpl implements BullDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveBull(Bull Bull) {
        sessionFactory.getCurrentSession().save(Bull);
    }

    @Transactional
    public List<Bull> listBulls() {
        return sessionFactory.getCurrentSession().createQuery("from Bull").list();
    }
}
