/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.PersonDAO;
import com.rab.girinka.models.Person;
import com.rab.girinka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class PersonServiceImplementation implements PersonService {

    @Autowired
    private PersonDAO PersonDAO;


    @Transactional
    public void savePerson(Person Person) {
        PersonDAO.savePerson(Person); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Person> listPersons() {
        return PersonDAO.listPersons(); //To change body of generated methods, choose Tools | Templates.
    }

}
