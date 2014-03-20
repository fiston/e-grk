/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.PersonDAO;
import com.rab.girinka.models.Person;
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
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void savePerson(Person Person) {
        sessionFactory.getCurrentSession().save(Person);
    }

    @Transactional
    public List<Person> listPersons() {
        return sessionFactory.getCurrentSession().createQuery("from Person").list();
    }
}
