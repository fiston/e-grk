/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.ProgramDAO;
import com.rab.girinka.models.Program;
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
public class ProgramDAOImpl implements ProgramDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveProgram(Program Program) {
        sessionFactory.getCurrentSession().save(Program);
    }

    @Transactional
    public List<Program> listPrograms() {
        return sessionFactory.getCurrentSession().createQuery("from Program").list();
    }
}
