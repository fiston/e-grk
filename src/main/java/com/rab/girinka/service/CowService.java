/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.Cow;
import com.rab.girinka.models.Cow;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface CowService {

    public void saveCow(Cow cow);

    public List<Cow> listCow();
}
