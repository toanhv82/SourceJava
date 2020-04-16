/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.service;

import com.ocb.ttt.sevice.soa.xml.SOAImportData;
import java.util.HashMap;
import java.util.Map;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */

@Service
public class ClientXmlService {
    
   
    
   
    @ConfigValue(Value = "Credit_addclient_liaby_issu_card_Scard")
    private final String file="xml/Credit_addclient_liaby_issu_card_Scard.xml";
    
    @ConfigValue(Value = "update_client")
    private final String file_update_client="xml/update_client_info.xml";
    public ClientXmlService()
    {
       
        
    }
    public  String importParamUpdate(HashMap<String, String> param)
    {
       SOAImportData aImportData=new SOAImportData(file_update_client);        
       String  xml=aImportData.getXml();
        for (Map.Entry<String, String> entry : param.entrySet()) {
           String key=entry.getKey();
           String value=entry.getValue();
           xml=xml.replace(key, value);           
        }      
        return xml;
    }
    public  String importParam(HashMap<String, String> param)
    {
         SOAImportData aImportData=new SOAImportData(file);        
         String  xml=aImportData.getXml();
        for (Map.Entry<String, String> entry : param.entrySet()) {
           String key=entry.getKey();
           String value=entry.getValue();
           xml.replace(key, value);           
        }      
        return xml;
    }
    
   
    
}
