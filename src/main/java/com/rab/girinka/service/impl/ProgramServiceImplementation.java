/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.ProgramDAO;
import com.rab.girinka.models.Program;
import com.rab.girinka.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class ProgramServiceImplementation implements ProgramService {

    @Autowired
    private ProgramDAO ProgramDAO;


    @Transactional
    public void saveProgram(Program Program) {
        ProgramDAO.saveProgram(Program); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Program> listPrograms() {
        return ProgramDAO.listPrograms(); //To change body of generated methods, choose Tools | Templates.
    }

}
