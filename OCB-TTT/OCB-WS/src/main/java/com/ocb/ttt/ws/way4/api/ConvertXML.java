/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.dao.WSCustomerClassifiersDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
/**
 *
 * @author Win 10
 */

@Service
public class ConvertXML extends ConvertXmlAbt{

    
    @Autowired
    private WSCustomerClassifiersDao classifiersDao;   
    
    public String createXml()
    {
        return "";
    }

    @Override
    protected String getFileName() {
       return "xml/Change_Classifier_Related_Card.xml";
    }
    
   
    
        
    public static void main(String[] args) {
        ConvertXML xml=new ConvertXML();
        String ms=xml.getMesId();
        System.out.println(ms);
    }

}
