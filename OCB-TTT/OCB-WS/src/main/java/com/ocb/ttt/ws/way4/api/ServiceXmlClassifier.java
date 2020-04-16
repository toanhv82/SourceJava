/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.def.DEF_XML;

/**
 *
 * @author toanhv1
 */
public class ServiceXmlClassifier  extends XmlToString{
    
   private final String orderDprt="0168";
   private final String file="xml/Change_Classifier.xml";
   private final String xmlString;
    
   
   public ServiceXmlClassifier()throws Exception
   {
        xmlString=getFile(file); 
   }
   public String convertToData(String contractNum,String regNumber,String ShortName,String codeFee,String valueFee,String reason) throws Exception
   {
        String   xml=xmlString;
                xml= xml.replace(DEF_XML.ContractNumber, contractNum)
                    .replace(DEF_XML.OrderDprt, orderDprt)
                    .replace(DEF_XML.RegNumber, regNumber)
                    .replace(DEF_XML.reasonDetails, reason)
                    .replace(DEF_XML.code, codeFee)
                    .replace(DEF_XML.value, valueFee)
                    .replace(DEF_XML.ShortName, ShortName).replace(DEF_XML.messageId, getMesId());
            
            return xml;
   }
}
