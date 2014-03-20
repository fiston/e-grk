/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.RoleDAO;
import com.rab.girinka.models.Role;
import com.rab.girinka.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class RoleServiceImplementation implements RoleService {

    @Autowired
    private RoleDAO RoleDAO;


    @Transactional
    public void saveRole(Role Role) {
        RoleDAO.saveRole(Role); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Role> listRoles() {
        return RoleDAO.listRoles(); //To change body of generated methods, choose Tools | Templates.
    }

}
