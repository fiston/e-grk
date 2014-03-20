/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.UserDAO;
import com.rab.girinka.models.User;
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
public class UserDAOImpl implements UserDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveUser(User User) {
        sessionFactory.getCurrentSession().save(User);
    }

    @Transactional
    public List<User> listUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }
}
