/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ocb.tokenization.provider;

import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.ocb.tokenization.model.AccessToken;
import com.ocb.ttt.ocb.tokenization.model.ErrorToken;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.convert.JsonPharse;
import ocb.ttt.common.hash.AES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ConectionToken {
    
     private static final LoggerLoader log =new LoggerLoader(ConectionToken.class);
    
    @ConfigValue(Value = "url_tokennization")
    private String url="http://10.96.60.142:8080/auth/realms/OCBTokenzationService_DO_NOT_DELETE/protocol/openid-connect/token";
    @ConfigValue(Value = "grant_type")
    private String grant_type="password";
    @ConfigValue(Value = "password_tk")
    private String password="qqq111!!!";
    @ConfigValue(Value = "client_secret")
    private String client_secret="49f7318b-0ef7-4e3f-b99b-e76e9de023ba";
     @ConfigValue(Value = "client_id")
    private String client_id="Token-Management";
    @ConfigValue(Value = "username")
    private String username="t24client";
    private String key_client="E6674965D7D1081472A58A31B5E1F2A9BFFA370F8FECAD5390A686C9D4EAD349";
    
    public String getTokenId(String pan)
    {
        try
        {
            AccessToken accessToken=getAccessToken();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public  String deToken(String tokentId)
    {
        return "";
    }
    
    private AccessToken getAccessToken() throws URISyntaxException
    {
        Map<String,String> header=new HashMap<String, String>();
        HashMap<String,Object> params=new HashMap<String, Object>();
        params.put("grant_type", grant_type);
        params.put("password", password);
        params.put("client_secret", client_secret);
        params.put("client_id", client_id);
        params.put("username", username);        
        header.put("Content-Type", "application/x-www-form-urlencoded");
         AccessToken accessToken=new AccessToken();
         String result="";
        try
        {
            accessToken=  ConnectionAPI.postHttp(url, header, params, AccessToken.class);          
           
            if(accessToken==null)
            {
                ErrorToken errorToken=JsonPharse.ConvertToObj(result, ErrorToken.class);
                log.error("Error message:"+errorToken);
            }
            
        
        }catch(Exception e)
        {
           // ErrorToken errorToken=ConnectionAPI.postHttp(url, header, params, ErrorToken.class);  
            e.printStackTrace();
            
        }
        return accessToken;
    }
    private String encryptPan(String pan)
    {
        String enPan=AES.encrypt(pan, key_client);
        System.out.println("com.ocb.ttt.ocb.tokenization.provider.ConectionToken.encryptPan():"+enPan);
        return enPan;
    }
    public static void main(String[] args) {
        ConectionToken conectionToken=new ConectionToken();        
        String tk=conectionToken.encryptPan("{\"CardNumber\":\"9704480221171220\"}");
    }
    
    
    
}
