/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db;

import com.rab.girinka.models.Girinka;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface GirinkaDAO {

    public void saveGirinka(Girinka source);

    public List<Girinka> listGirinkas();
}
