/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db;

import com.rab.girinka.models.Parity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface ParityDAO {

    public void saveParity(Parity source);

    public List<Parity> listParitys();
}
