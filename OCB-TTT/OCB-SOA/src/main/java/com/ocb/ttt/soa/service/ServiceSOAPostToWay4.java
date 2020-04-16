/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.service;



import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.sevice.soa.ServiceSOA;

import com.ocb.ttt.ws.way4.api.PostToWay4;
import ocb.ttt.common.anotion.ConfigValue;


import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service(value = "ServiceSOAPostToWay4")
public class ServiceSOAPostToWay4   extends PostToWay4 implements ServiceSOA{
    
   private static LoggerLoader logger = new LoggerLoader(ServiceSOAPostToWay4.class);   
   
   @ConfigValue(Value = "way4gate")
   String url;
   @Override
   public String postData(String xml) {    
       
       try
       {       
            String result= PostToWay4(xml);           
            boolean status= checkResponse(result);        
            logger.info("CALL SOA:"+status);
            logger.info(result);
        if(status)
        {
            return result;
        }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return "FAIL";
   }

    @Override
    protected String getUrl() {
        return url;
    }
     
}
