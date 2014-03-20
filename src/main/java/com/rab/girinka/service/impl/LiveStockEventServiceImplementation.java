/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service.impl;

import com.rab.girinka.db.LiveStockEventDAO;
import com.rab.girinka.models.LiveStockEvent;
import com.rab.girinka.service.LiveStockEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class LiveStockEventServiceImplementation implements LiveStockEventService {

    @Autowired
    private LiveStockEventDAO LiveStockEventDAO;


    @Transactional
    public void saveLiveStockEvent(LiveStockEvent LiveStockEvent) {
        LiveStockEventDAO.saveLiveStockEvent(LiveStockEvent); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    public List<LiveStockEvent> listLiveStockEvents() {
        return LiveStockEventDAO.listLiveStockEvents(); //To change body of generated methods, choose Tools | Templates.
    }

}
