/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.UserDAO;
import com.rab.girinka.models.User;
import com.rab.girinka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserDAO UserDAO;


    @Transactional
    public void saveUser(User User) {
        UserDAO.saveUser(User); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<User> listUsers() {
        return UserDAO.listUsers(); //To change body of generated methods, choose Tools | Templates.
    }

}
