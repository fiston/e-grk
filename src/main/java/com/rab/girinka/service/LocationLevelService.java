/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.LocationLevel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface LocationLevelService {

    public void saveLocationLevel(LocationLevel source);

    public List<LocationLevel> listLocationLevels();
}
