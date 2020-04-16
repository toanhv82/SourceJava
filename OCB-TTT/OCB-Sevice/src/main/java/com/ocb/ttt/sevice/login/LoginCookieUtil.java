/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.login;

import com.ocb.ttt.model.LoginInfo;
import java.util.Date;
import ocb.ttt.common.convert.JsonPharse;

import ocb.ttt.common.hash.AES256;


/**
 *
 * @author toanhv1
 */
public class LoginCookieUtil {
    
    public static String encryptInfo(String key,LoginInfo info)
    {
        try
        {
        info.setExprire(new Date());
        String json=JsonPharse.ConvertToString1(info);        
        String encrypt=AES256.encrypt(json, key);  
        return encrypt;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return "";
        
    }
    public static LoginInfo deCrypt(String key,String json)
    {
        try
        {
            String de=AES256.decrypt(json, key);
            LoginInfo info=JsonPharse.ConvertToObj(de, LoginInfo.class);
            
            return info;
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return null;
        
    }
    
}
