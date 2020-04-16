/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.repository;

import com.ocb.ttt.soa.util.RealFileSOA;
import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.service.WSCustomerClassifiers;
import com.ocb.ttt.ws.way4.model.ClientW4;

import java.util.HashMap;
import ocb.ttt.common.anotion.ConfigValue;
import com.ocb.ttt.common.util.FormatDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */

public class SOAClient  extends SOAConvertData{
    
   @ConfigValue(Value = "xml_change_client_info")
   String file_client_info;  
   private final String xmlString;
   private String orderDprt="0168";
   private String mesId;
   @Autowired
   private WSCustomerClassifiers classifiersDao;
   public SOAClient() throws Exception
   {       
         xmlString=RealFileSOA.getFile(file_client_info);      
         mesId= getMesId();
   }   
   public String UpdateClient(ClientW4 client)
   {                    
        String   xml=xmlString;
                xml= xmlString.replace(DEF_XML.OrderDprt, orderDprt)
                    .replace(DEF_XML.messageId, mesId)
                    .replace(DEF_XML.ClientNumber, client.getClientNumber())
                    .replace(DEF_XML.RegNumber,client.getRegNumber())
                    .replace("{RegNumber1}", getRegNumber())                   
                    .replace(DEF_XML.ShortName, client.getShortName())
                    .replace(DEF_XML.RegNumberType, client.getRegNumberType())
                    .replace(DEF_XML.ClientRegNumber, client.getClientNumber())
                    .replace(DEF_XML.reasonDetails, client.getRegNumberDetails())
                    .replace(DEF_XML.BirthName, "")
                        .replace(DEF_XML.ContractNumber, client.getContractNumber())
                        .replace(DEF_XML.ContractName, client.getContractName())
                        .replace(DEF_XML.Title, client.getTitle())
                        .replace(DEF_XML.FirstName, client.getFirstName())
                        .replace(DEF_XML.LastName, client.getLastName())
                        .replace(DEF_XML.MiddleName, client.getMiddleName())
                        .replace(DEF_XML.ProductCode, client.getProductCode1())
                        .replace(DEF_XML.BirthDate, FormatDate.covertToTime(client.getBirthDate()))
                        .replace(DEF_XML.CommentText, "SOA WS")
                        .replace(DEF_XML.MaritalStatus, client.getMaritalStatus())
                        .replace(DEF_XML.Country, "")
                        .replace(DEF_XML.Language, "")
                        .replace(DEF_XML.CompanyName, "OCB")
                        .replace(DEF_XML.CompanyTradeName, "OCB")
                        .replace(DEF_XML.PlasticInfoTitle, client.getPlasticInfoTitle())
                        .replace(DEF_XML.PlasticInfoFirstName, client.getPlasticInfoFirstName())
                        .replace(DEF_XML.PlasticInfoLastName, client.getPlasticInfoLastName())                            
                        .replace(DEF_XML.PlasticInfoCompanyName, client.getPlasticInfoCompanyName())
                        .replace(DEF_XML.PhoneNumber, client.getPhoneNumber())
                        .replace(DEF_XML.PhoneHome, client.getPhoneHome())
                        .replace(DEF_XML.PhoneMobile, client.getPhoneMobile())
                        .replace(DEF_XML.DateOpen,FormatDate.covertToTime(client.getDateOpen()))
                        .replace(DEF_XML.DateExpri, FormatDate.covertToTime("2099-08-31"));
                                                               
            
            return xml;
   }
   protected String getRegNumber() {
        return classifiersDao.getSQ();
    }
    
}
