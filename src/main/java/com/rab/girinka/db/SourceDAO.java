/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rab.girinka.db;

import com.rab.girinka.models.Source;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public interface SourceDAO {

    public void saveSource(Source source);

    public List<Source> listSources();
}
