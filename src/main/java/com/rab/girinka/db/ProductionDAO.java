/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db;

import com.rab.girinka.models.Production;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface ProductionDAO {

    public void saveProduction(Production source);

    public List<Production> listProductions();
}
