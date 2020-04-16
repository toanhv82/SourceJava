/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service.impl;

import com.ocb.ttt.sevice.soa.ServiceAplication;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author hiepnp
 */
@Component
public class SeviceApplicationImpl  implements ServiceAplication{

    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "SQL_SOURCE_APPLICATION_NO")
    private String SQL_SOURCE_APPLICATION_NO;   
    @Override
    public String getSQN() {

        String rrn= jdbc.queryForObject(SQL_SOURCE_APPLICATION_NO, String.class);
        return rrn;
    
    }
    
}
