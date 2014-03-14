/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.SourceDAO;
import java.util.List;

import com.rab.girinka.models.Source;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class SourceDAOImpl implements SourceDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveSource(Source source) {
        sessionFactory.getCurrentSession().save(source);
    }

    @Transactional
    public List<Source> listSources() {
        return null;//sessionFactory.getCurrentSession().createQuery("from Source").list();
    }
}
