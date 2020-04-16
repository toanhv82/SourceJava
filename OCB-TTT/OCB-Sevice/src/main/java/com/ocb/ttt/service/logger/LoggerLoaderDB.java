/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.logger;

import com.ocb.ttt.common.log.LoggerLoader;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author toanhv1
 */

public class LoggerLoaderDB extends LoggerLoader{
  
    private JdbcTemplate jdbc;
        
    public LoggerLoaderDB(Class className,JdbcTemplate jdbc) {          
        super(className);
        this.jdbc=jdbc;
    }
               
    
    
}
