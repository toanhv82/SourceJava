/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.soa;

import com.ocb.ttt.ws.way4.api.XmlToString;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author toanhv1
 */
public abstract class AbstractSOA extends XmlToString{
    
    
    public  String convertData()throws Exception
    {              
        HashMap<String,String> param=getParam();
        String xml=ToStringByXML();
        Set<String> keys=param.keySet();        
        for (Object k : keys) {
            String key = (String) k;            
            xml= xml.replace(key, param.get(k));
        };                 
        return xml;
    }    
    private String ToStringByXML() throws Exception
    {                       
        return getFile(getFileName());
    }
    protected abstract HashMap getParam();
   
    protected abstract String getFileName();
        
}
