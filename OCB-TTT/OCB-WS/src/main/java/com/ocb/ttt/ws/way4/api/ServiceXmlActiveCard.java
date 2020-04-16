/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.common.util.Xmlphasre;
import ocb.ttt.common.anotion.ConfigValue;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */

public class ServiceXmlActiveCard extends XmlToString{
    
   private final String orderDprt="0168";
   private final String file="xml/Change_Contr_Status.xml";
   private final String xmlString;
   
   public ServiceXmlActiveCard() throws Exception
   {       
       xmlString=getFile(file); 
   }
  
   public String convertToData(String messageId,String contractNum,String regNumber,String ShortName) throws Exception
   {                  
             
         String   xml=xmlString;
                xml= xml.replace(DEF_XML.ContractNumber, contractNum)
                    .replace(DEF_XML.OrderDprt, orderDprt)
                    .replace(DEF_XML.RegNumber, regNumber)
                    .replace(DEF_XML.ShortName, ShortName).replace(DEF_XML.messageId, messageId);
            
            return xml;         
    }
    
    
    public static void main(String[] args) {
        
      //  ServiceXmlActiveCard ac=new ServiceXmlActiveCard();
        
        
           // String xml=ac.convertToData("123","123","123");
          /// System.out.println("com.ocb.ttt.ws.way4.api.ServiceActiveCard.main():"+xml);  
     
        
        
    }
    
}
