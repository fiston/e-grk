/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.SourceDAO;
import com.rab.girinka.models.Source;
import com.rab.girinka.service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class SourceServiceImplementation implements SourceService {

    @Autowired
    private SourceDAO sourceDAO;


    @Transactional
    public void saveSource(Source source) {
        sourceDAO.saveSource(source); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<Source> listSources() {
        return sourceDAO.listSources(); //To change body of generated methods, choose Tools | Templates.
    }

}
