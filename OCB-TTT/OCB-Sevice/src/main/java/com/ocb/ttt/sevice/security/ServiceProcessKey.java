/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.security;

import com.ocb.ttt.common.security.key.PasswordAES;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceProcessKey {
    
    private String key="";
    @ConfigValue(Value = "password_keystore")
    String password;
    @ConfigValue(Value = "fileName_keystore")
    String fileName;    
    
    public  String getKey(String alias)
    {
        PasswordAES passwordAES=new PasswordAES(password, fileName);        
        String key=passwordAES.getKey(alias);        
        return key;
        
        
    }
    
}
