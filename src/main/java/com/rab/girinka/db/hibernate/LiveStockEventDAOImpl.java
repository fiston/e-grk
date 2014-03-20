/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.LiveStockEventDAO;
import com.rab.girinka.models.LiveStockEvent;
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
public class LiveStockEventDAOImpl implements LiveStockEventDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveLiveStockEvent(LiveStockEvent LiveStockEvent) {
        sessionFactory.getCurrentSession().save(LiveStockEvent);
    }

    @Transactional
    public List<LiveStockEvent> listLiveStockEvents() {
        return sessionFactory.getCurrentSession().createQuery("from LiveStockEvent").list();
    }
}
