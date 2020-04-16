/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.ttt.ws;

import com.ocb.ttt.ws.way4.api.ConvertXML;
import com.ocb.ttt.ws.way4.api.HttpWriteXML;
import org.apache.log4j.Logger;
import org.tempuri.TrungTamThe;
import org.tempuri.TrungTamTheSoap;

/**
 *
 * @author Win 10
 */
public class testWS {
    
    public static void main(String[] args) {
        
        
        
        ConvertXML convertXML=new ConvertXML();
        
        String xml= convertXML.readXml("1234","AAAAAAAAAAAAAAAA","BBBBBBBBBBBBBBBBBBBBBBBBB","1","2","3");
        
       // System.out.print(ConvertXML.class.getResource("Change_Classifier_Related_Card.xml"));
        System.out.println(xml);
        String url="http://10.96.21.153:9110/way4gate/httpadapter";  
        try
        {
             //HttpWriteXML.postXmlHttps(xml, url);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
       
        
    }
    
}
