/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.security;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.sevice.runtime.ContextApp;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class AuthenticationAPI {
    
     
    @ConfigValue(Value = "alias_keys_soa")
    private String keyEncryptData;   
    private static LoggerLoader logger = new LoggerLoader(AuthenticationAPI.class); 
    public boolean getLogin(String user, String pass, int role) {
        ServiceUserLogin serviceUserLogin=ContextApp.getBean("managerApiUser");        
        logger.info("Processing login:" + user + "-role:" + role);      
        boolean status= serviceUserLogin.hashContent(user,SHAHashing.bytesToHex(pass), role);           
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
