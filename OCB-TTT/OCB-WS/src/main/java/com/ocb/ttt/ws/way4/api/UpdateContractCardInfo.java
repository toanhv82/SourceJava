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
public class UpdateContractCardInfo  extends XmlToString {
     private String fileName="xml/Change_Contract_Address.xml";
    private String xmlString;
    private final String orderDprt="0168";
    public  UpdateContractCardInfo() throws Exception
    {
         xmlString=getFile(fileName); 
    }
    public  UpdateContractCardInfo(String file) throws Exception
    {
         xmlString=getFile(file); 
    }
   public String convertToData(CardContract cardContract) throws Exception
   {                  
       
             
         String   xml=xmlString;
                xml= xml.replace(DEF_XML.ContractNumber, cardContract.getIssContractNumber())
                    .replace(DEF_XML.OrderDprt, orderDprt)
                    .replace(DEF_XML.RegNumber, cardContract.getRegNumber())
                    .replace(DEF_XML.RBSNumber, cardContract.getrBSNumber()) 
                    .replace(DEF_XML.ClientNumber, cardContract.getClientNumberl())     
                    .replace(DEF_XML.CardContractNumber, cardContract.getCardContractNumber())
                    .replace(DEF_XML.AddressLine1, cardContract.getAddressLine1()==null?"":cardContract.getAddressLine1())
                    .replace(DEF_XML.FirstName, cardContract.getFirstName())
                    .replace(DEF_XML.LastName, cardContract.getLastName())
                    .replace(DEF_XML.PhoneNumber, cardContract.getPhoneNumber()==null?"":cardContract.getPhoneNumber())
                    .replace(DEF_XML.ShortName, cardContract.getShortName()).replace(DEF_XML.messageId, cardContract.getMesId());
            
            return xml;         
    }
    
}
