/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.repository;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.obj.model.User;
import com.ocb.ttt.db.util.DataRowMapper;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




/**
 *
 * @author Win 10
 */
@Component
public class ServiceUsersDAO {
    
     private  LoggerLoader logger = new LoggerLoader(ServiceUsersDAO.class);
    
    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "SELECT_ALL_USER")
    private String SQL_GET_ALL_USER;
    //private final String SQL_GET_ALL_USER="select * from nab_app_users";
    @ConfigParamSQL(Value = "SQL_GET_ALL_PRIVILEGES")
    private String SQL_GET_ALL_PRIVILEGES;
   
    
    public  List<User>  getALLUser(String user,String pass)
    {
         DataRowMapper dataRowMapper=new DataRowMapper(User.class);
         List<User> list=jdbc.query(SQL_GET_ALL_USER, dataRowMapper);         
         return list;
    }
    public List<String>  getPriveled(String user)
    {
        try
        {
        DataRowMapper dataRowMapper=new DataRowMapper(String.class);        
        CallStoredProcedure<String> callStoredProcedure =new CallStoredProcedure(jdbc,String.class);
        List<Object> param = new ArrayList<>();
        param.add(user);
        List<String> list = callStoredProcedure.query(SQL_GET_ALL_PRIVILEGES, param, 2);
         return list;
        }catch(Exception e)
        {
            e.printStackTrace();
          logger.error(e);
        } 
        return new ArrayList<String>();        
    }
    
    private String encryptPassword(String pw)
    {
         return null;
    }
    
 
    
    
}
