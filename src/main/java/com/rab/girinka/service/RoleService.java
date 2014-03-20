/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface RoleService {

    public void saveRole(Role role);

    public List<Role> listRoles();
}
