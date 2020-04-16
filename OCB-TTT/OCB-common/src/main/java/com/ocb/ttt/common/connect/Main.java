/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.connect;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 *
 * @author toanhv1
 */
public class Main {
    
    public static void main(String[] args) {
        
        String url="http://10.96.60.142:8080/auth/realms/OCBTokenzationService_DO_NOT_DELETE/protocol/openid-connect/token";
        //String url="http://localhost:21104/OCB-API-TOKEN/TOKEN/BY_CARD_CIF";
        Map<String,String> header=new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", "ttt@123");
        header.put("Content-Type", "application/json");            
                try
                {         
                    
                    //  String content= ConnectionAPI.postHttp(url,header,params);
                   //   System.out.println("com.ocb.ttt.common.connect.Main.main():"+content);
                      
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
    
}
