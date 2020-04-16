/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.dao;

import com.ocb.ttt.flc.model.request.RegisterCustomerForm;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import com.ocb.ttt.db.util.DataRowMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceRegisterFLC {
    
    @Autowired
    JdbcTemplate jdbc;
    
    private static Logger logger = Logger.getLogger(ServiceRegisterFLC.class);
    @ConfigParamSQL(Value = "SQL_REGISTER_COSTOMER")
    private String SQL_REGISTER_COSTOMER;    
    @ConfigParamSQL(Value = "SQL_GET_CUSTOMER_BY_REQUEST")
    private String SQL_GET_CUSTOMER_BY_REQUEST;   
    @ConfigParamSQL(Value = "API_FLC_INSERT_CUSTOMER_BY_REQUEST")
    private String API_FLC_INSERT_CUSTOMER_BY_REQUEST;
    @ConfigParamSQL(Value = "API_FLC_UPDATE_STATUS_BY_REQUEST")
    private String API_FLC_UPDATE_STATUS_BY_REQUEST;
    public List<RegisterCustomerForm> getListCustomerByRegister(String registerId,String customerId)
    {
        try
        {
            DataRowMapper dataRowMapper=new DataRowMapper(RegisterCustomerForm.class);
            List<RegisterCustomerForm> list=jdbc.query(SQL_GET_CUSTOMER_BY_REQUEST, new Object[] {registerId,customerId},dataRowMapper);
            
            return list;
        }catch(Exception e)
        {
            logger.error(e);
        }
        return null;
    }
    public  int insertCustomerFLC(String customerId,String email,String phone,String fullName,String requestId )
    {
        try
        {
             int r=jdbc.update(API_FLC_INSERT_CUSTOMER_BY_REQUEST, new Object[] {customerId,email,phone,fullName,requestId});
             return r;
        }catch(Exception e)
        {
            logger.error("ERROR:"+e);
            e.printStackTrace();
            return 0;
        }
    }
    
   public int updateStatusCustomerFLC(String requestId )
    {
        try
        {
             int r=jdbc.update(API_FLC_UPDATE_STATUS_BY_REQUEST, new Object[] {requestId});
             return r;
        }catch(Exception e)
        {
            logger.error("ERROR:"+e);
            e.printStackTrace();
            return 0;
        }
    }
    
}
