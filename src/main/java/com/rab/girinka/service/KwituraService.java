/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.service;

import com.rab.girinka.models.Kwitura;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface KwituraService {

    public void saveKwitura(Kwitura source);

    public List<Kwitura> listKwituras();
}
