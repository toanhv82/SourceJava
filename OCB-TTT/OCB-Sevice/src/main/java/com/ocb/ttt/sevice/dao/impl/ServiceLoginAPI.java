/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.dao.impl;

import com.ocb.ttt.service.dto.UserAPI;
import com.ocb.ttt.sevice.runtime.ContextApp;
import com.ocb.ttt.sevice.security.ServiceUserLogin;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.SHAHashing;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceLoginAPI {    
    private static Logger logger = Logger.getLogger(ServiceLoginAPI.class);
    @ConfigValue(Value = "managerApiUser")
    private String beanManagerUser="managerApiUser";
    public boolean getLogin(String user, String pass, int role) {
        
        ServiceUserLogin serviceUserLogin=ContextApp.getBean(beanManagerUser);
        
        logger.info("Processing login:" + user + "-role:" + role);    
        
        
        UserAPI ur=serviceUserLogin.getUser(user, role);    
        
        boolean status= SHAHashing.bytesToHex(pass).toUpperCase().equals(ur.getPw().toUpperCase());                
                
        logger.info("Processing login:" + user + "-role:" + role + "- is:" +status);
        return status;
    }
     private String encryptPassword(String pw) {
        return SHAHashing.bytesToHex(pw);
        //   return null;
    }
}
