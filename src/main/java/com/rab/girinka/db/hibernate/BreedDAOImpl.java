/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db.hibernate;

import com.rab.girinka.db.BreedDAO;
import com.rab.girinka.models.Breed;
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
public class BreedDAOImpl implements BreedDAO {

    @Autowired
    protected  SessionFactory sessionFactory;

    @Transactional
    public void saveBreed(Breed Breed) {
        sessionFactory.getCurrentSession().save(Breed);
    }

    @Transactional
    public List<Breed> listBreed() {
        return sessionFactory.getCurrentSession().createQuery("from Breed").list();
    }
}
