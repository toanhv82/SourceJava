/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.way4.model.CardContract;

/**
 *
 * @author toanhv1
 */
public class AddRelationCardXML extends XmlToString {
    
    private String fileName="xml/add_Contract_relaticard.xml";
    private String xmlString;
    private final String orderDprt="0168";
    public  AddRelationCardXML() throws Exception
    {
         xmlString=getFile(fileName); 
    }
     public String convertToData(CardContract cardContract) throws Exception
   {                  
       
             
         String  xml=xmlString;
                xml= xml.replace(DEF_XML.ContractNumber, cardContract.getIssContractNumber())
                    .replace(DEF_XML.OrderDprt, orderDprt)
                    .replace(DEF_XML.RegNumber, cardContract.getRegNumber())
                    .replace(DEF_XML.RBSNumber, cardContract.getrBSNumber()) 
                     .replace(DEF_XML.ClientNumber, cardContract.getClientNumberl())     
                    .replace(DEF_XML.CardContractNumber, cardContract.getCardContractNumber())
                    .replace(DEF_XML.AddressLine1, cardContract.getAddressLine1())
                    .replace(DEF_XML.ShortName, cardContract.getShortName()).replace(DEF_XML.messageId, cardContract.getMesId());
            
            return xml;         
    }
}
