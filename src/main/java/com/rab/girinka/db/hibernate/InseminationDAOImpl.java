/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.InseminationDAO;
import com.rab.girinka.models.Insemination;
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
public class InseminationDAOImpl implements InseminationDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveInsemination(Insemination Insemination) {
        sessionFactory.getCurrentSession().save(Insemination);
    }

    @Transactional
    public List<Insemination> listInseminations() {
        return sessionFactory.getCurrentSession().createQuery("from Insemination").list();
    }
}
