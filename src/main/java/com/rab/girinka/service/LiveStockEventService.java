/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.LiveStockEvent;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface LiveStockEventService {

    public void saveLiveStockEvent(LiveStockEvent source);

    public List<LiveStockEvent> listLiveStockEvents();
}
