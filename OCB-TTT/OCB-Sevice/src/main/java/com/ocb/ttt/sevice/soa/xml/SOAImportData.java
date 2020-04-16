/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.soa.xml;

import java.io.File;
import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
public class SOAImportData extends ConvertXmlToString{
    
    private String fileName;
    private String orderDprt="0168";
    private String xmlString;
    
    public  SOAImportData(String f)
    {
        try
        {
            this.fileName=f;
            xmlString=getFile(fileName); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
    public  String getXml()
    {
        return xmlString;
    }
    public  String convertData(String xml,HashMap<String,String> param)
    {                  
        
        return xml;
    }
    
    
    
    
}
