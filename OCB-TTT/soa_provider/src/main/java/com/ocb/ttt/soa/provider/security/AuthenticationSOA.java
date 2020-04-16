/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.security;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.dto.UserAPI;
import com.ocb.ttt.sevice.runtime.ContextApp;
import com.ocb.ttt.sevice.security.ServiceUserLogin;
import com.ocb.ttt.soa.provider.templet.dao.ServiceContractDao;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class AuthenticationSOA {
    
    @ConfigValue(Value = "alias_keys_soa")
    private String keyEncryptData;   
    private static LoggerLoader logger = new LoggerLoader(AuthenticationSOA.class); 
    public boolean getLogin(String user, String pass, int role) {
        ServiceUserLogin serviceUserLogin=ContextApp.getBean("managerApiUser");        
        logger.info("Processing login:" + user + "-role:" + role);        
        UserAPI aPI=serviceUserLogin.getUser(user, role);        
        boolean status=SHAHashing.bytesToHex(pass).toUpperCase().equals((aPI.getPw().trim()).toUpperCase());        
        logger.info("Processing login:" + user + "-role:" + role + "- is:" +status);
        return status;
    }
     public boolean  hashData(String data,String hashData)
     {
         String hex=SHAHashing.bytesToHex(data+keyEncryptData);         
         boolean result= hex.equals(hashData);
         System.out.println("hash Data:"+result);
         if(!result)
         {             
             logger.info("Compare Data is Fail!");
         }else
         {
             logger.info("Compare Data is OK!");
         }
         return result;    
         
     }
     private String encryptPassword(String pw) {
        return SHAHashing.bytesToHex(pw);
        //   return null;
    }
}
