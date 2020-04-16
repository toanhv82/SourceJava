/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.test;

import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.service.model.RequestForm;
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
        
        String url="http://localhost:21104/OCB-SOA/Card/changeStatusCard";
        //String url="http://localhost:21104/OCB-API-TOKEN/TOKEN/BY_CARD_CIF";
        Map<String,String> header=new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", "ttt@123");
        header.put("Content-Type", "application/json");            
                try
                {         
                    RequestForm form=new RequestForm();
                    form.setRequestID("123");
                    form.setRequestDateTime("123");
                    form.setFunction("changeStatusCard");
                    form.setHash("123");
                    form.setData("{ \"token_id\":\"9OCT046690\",\"status\": \"00\",\"reason\":\"CARD Close\",\"user\":\"HiepNP\" }");
                    
                     String content= ConnectionAPI.postJsonObjectHttp(url, header, form);
                     System.out.println("com.ocb.ttt.common.connect.Main.main():"+content);
                      
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
    
}
