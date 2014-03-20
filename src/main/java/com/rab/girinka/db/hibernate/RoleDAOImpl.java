/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.RoleDAO;
import com.rab.girinka.models.Role;
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
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveRole(Role Role) {
        sessionFactory.getCurrentSession().save(Role);
    }

    @Transactional
    public List<Role> listRoles() {
        return sessionFactory.getCurrentSession().createQuery("from Role").list();
    }
}
