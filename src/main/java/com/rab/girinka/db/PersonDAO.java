/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db;

import com.rab.girinka.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface PersonDAO {

    public void savePerson(Person source);

    public List<Person> listPersons();
}
