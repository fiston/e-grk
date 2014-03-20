/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.ProductionDAO;
import com.rab.girinka.models.Production;
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
public class ProductionDAOImpl implements ProductionDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveProduction(Production Production) {
        sessionFactory.getCurrentSession().save(Production);
    }

    @Transactional
    public List<Production> listProductions() {
        return sessionFactory.getCurrentSession().createQuery("from Production").list();
    }
}
