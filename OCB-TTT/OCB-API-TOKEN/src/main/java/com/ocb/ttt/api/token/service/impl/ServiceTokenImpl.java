/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.token.service.impl;

import com.ocb.ttt.api.token.model.TokenPan;
import com.ocb.ttt.api.token.service.ServiceToken;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceTokenImpl implements ServiceToken{

    private static LoggerLoader logger = new LoggerLoader(ServiceTokenImpl.class);
    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "GET_CARD_NUMBER_TOKEN_BY_CIF")
    private String GET_CARD_NUMBER_TOKEN_BY_CIF; 
    
    @Override
    public TokenPan getInfoCardByCif(String pan, String cif) {
        
         List<TokenPan> list=new ArrayList<>();
        try
        {
        CallStoredProcedure<TokenPan> callStoredProcedure = new CallStoredProcedure<>(jdbc, TokenPan.class);        
        List<Object> param=new ArrayList<>();
        param.add(pan);
        param.add(cif);
        list = callStoredProcedure.query(GET_CARD_NUMBER_TOKEN_BY_CIF, param, 3);
        if(list.size()==1)
        {
            return list.get(0);
        }else if(list.size()==0)
        {
            logger.error("Get TokenPan empty");
        }else if(list.size()>1)
        {
            logger.error("Get TokenPan more than 1 row");
        }
        }catch(Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        
        return null;
        
    }
    
}
