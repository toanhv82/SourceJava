/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.respository;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.dhkt.model.Student_TMP;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ImportFileDao {
    
    @Autowired
    JdbcTemplate jdbc;
    
    private  LoggerLoader logger = new LoggerLoader(ImportFileDao.class);
    @ConfigParamSQL(Value = "UPDATE_INFO_CLIENT_NAB_CARD")
    private String UPDATE_INFO_CLIENT_NAB_CARD;  
    @ConfigParamSQL(Value = "INSERT_CLIENT_TMP")
    private String INSERT_CLIENT_TMP;  
    
    public int addSvTmp(Student_TMP item)
    {
        
       // NamedParameterJdbcTemplate jdbcTemplate=new NamedParameterJdbcTemplate(jdbc.getDataSource());
        
        /*CLIENT_CODE,	
            BASIC_CARD_NUMBER,	
            TITLE,	
            EMBOSSED_NAME,
            GENDER,	
            LEGAL_ID,	
            BIRTH_DATE,	
            ACCOUNT1,	
            USER_DEFINED_FIELD1,	
            PHONE_HOME,	
            PHONE_NBR_SMS,		
            AUTHORIZE
        */
        Object [] obj=new Object[]{item.getCLIENT_CODE(),
           item.getTITLE(),item.getFULL_NAME(),item.getGENDER(),item.getLEGAL_ID(),item.getBIRTH_DATE(),
            item.getACCOUNT1(),item.getIDMifare(),item.getMOBILE_PHONE(),item.getPHONE_NBR_SMS(),"N"        
        };         
        int rs= jdbc.update(INSERT_CLIENT_TMP, obj);      
       
        return rs;
    }
    
    
}
