/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.dao;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractBaseSOA;
import java.util.ArrayList;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceContractDao {
    
    private static LoggerLoader logger = new LoggerLoader(ServiceContractDao.class);    
    @Autowired
    JdbcTemplate jdbc;
    
    @ConfigParamSQL(Value = "GET_CARD_INFO_TOKEN_TOKEN_1")
    private String GET_CARD_INFO_TOKEN_TOKEN_1;      
    
    @ConfigParamSQL(Value = "SQL_GET_CONTRACT_INFO_BY_CTR_NUMBER")
    private String SQL_GET_CONTRACT_INFO_BY_CTR_NUMBER;  
    
    public CardSOA getCardSOA(String token_id)
     {
         CardSOA cardSOA=new CardSOA();
         try
         {
         CallStoredProcedure<CardSOA> callStoredProcedure=new CallStoredProcedure(jdbc, CardSOA.class);
         
         List<Object> param = new ArrayList<>();
         param.add(token_id);
         List<CardSOA> list=callStoredProcedure.query(GET_CARD_INFO_TOKEN_TOKEN_1, param, 2);
            if(list.size()==1)
            {
                return list.get(0);
            }else
            {
                logger.error("Get Oject FAIL size:"+list.size());
            }
         }catch(Exception e)
         {
             e.printStackTrace();
         }
         return cardSOA;
     }  
    public  ContractBaseSOA getContractBaseSOA(String contractNumber)
    {
        try
        {
             CallStoredProcedure<ContractBaseSOA> callStoredProcedure=new CallStoredProcedure(jdbc, ContractBaseSOA.class);
            
            List<Object> param = new ArrayList<>();
            param.add(contractNumber);
            
           List<ContractBaseSOA> list= callStoredProcedure.query(SQL_GET_CONTRACT_INFO_BY_CTR_NUMBER, param, 2);
           
           if(list.size()>1)
           {
               logger.error("COntactNumber:"+contractNumber+" is more than 1, please check Contarct Type. SQL:"+SQL_GET_CONTRACT_INFO_BY_CTR_NUMBER);
           }else if(list.size()==0||list==null)
           {
               logger.error("COntactNumber:"+contractNumber+" is  empty, please check Contarct Type. SQL:"+SQL_GET_CONTRACT_INFO_BY_CTR_NUMBER);
           }
           return list.get(0);
            
        }catch(Exception e)
         {       
             logger.error(e);
             e.printStackTrace();
         }
        
        return null;
    }
    
}
