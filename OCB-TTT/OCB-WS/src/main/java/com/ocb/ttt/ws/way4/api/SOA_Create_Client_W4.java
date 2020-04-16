/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.way4.model.ClientW4;

import java.util.Date;
import com.ocb.ttt.common.util.FormatDate;
import com.ocb.ttt.ws.def.DEF_XML;

/**
 *
 * @author toanhv1
 */
public class SOA_Create_Client_W4 extends XmlToString {
    
   //private final String file="xml/Add_Client_Add_Card_Contract.xml";

   private String orderDprt="0168";
        
   public String Credit_addclient_liaby_issu_card_Scard(ClientW4 client, String regNumber,String regNumber1,String mesId)throws Exception
   {
       String f="xml/Credit_addclient_liaby_issu_card_Scard.xml";
       String xml=getFile(f);
       return convertToData(xml,client,regNumber,regNumber1,mesId);
   }
   public String Debit_Prepaid_addclient_issu_card_Scard(ClientW4 client, String regNumber,String regNumber1,String mesId)throws Exception
   {
        String f="xml/Debit_Prepaid_addclient_issu_card_Scard.xml";
       String xml=getFile(f);
       return convertToData(xml,client,regNumber,regNumber1,mesId);
   }
   public  String convertToData(String xml,ClientW4 client, String regNumber,String regNumber1,String mesId) throws Exception
   {       
       Date date=new Date();         
      // System.out.println("com.ocb.ttt.ws.way4.api.SOA_Create_Client_W4.convertToData()"+DEF_XML.ClientNumber);
       
                xml= xml.replace(DEF_XML.OrderDprt, orderDprt).replace(DEF_XML.messageId, mesId)
                    .replace(DEF_XML.ClientNumber, client.getClientNumber())
                    .replace(DEF_XML.RegNumber,regNumber)
                    .replace("{RegNumber1}", regNumber1)                   
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
                        .replace(DEF_XML.DateExpri, FormatDate.covertToTime("2099-08-31"))
                        .replace(DEF_XML.ADDINFO01,client.getADDINFO01());
                                                               
            
            return xml;
   }
   
   
   
    
}
