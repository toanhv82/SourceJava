/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com.ttt.sms;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author toanhv1
 */
public class test {
    
    public static void main(String[] args) {
        send();
    }
    
    private static void send()
    {
        URL url = null;
        try {
            QName TRUNGTAMTHE_QNAME = new QName("http://bian.com.vn/Correspondence/", "Correspondence");
            url = new URL("http://10.96.20.45:8800/correspondence/v1/ws?wsdl");
            Correspondence_Service  service=new Correspondence_Service(url,TRUNGTAMTHE_QNAME);  
             
           Correspondence soap= service.getCorrespondenceSOAP();
           
           NotifyCorrespondenceSMSInType parameters=new NotifyCorrespondenceSMSInType();
           
           SMSNotificationType mSNotificationType=new SMSNotificationType();
           mSNotificationType.setContent("HELO anh PHUC");
           mSNotificationType.setPhoneNumber("0977693694");
           parameters.setSMSNotification(mSNotificationType);
           
           TransactionInfoType type=new TransactionInfoType();
          
           type.setUserId("cardcenter");
           type.setClientCode("Card");           
           type.setCRefNum("012344321");
           BranchInfoType branchInfoType=new BranchInfoType();
           branchInfoType.setBranchCode("VN0010168");
          
          type.setBranchInfo(branchInfoType);                   
           parameters.setTransactionInfo(type);           
          NotifyCorrespondenceSMSOutType out=  soap.notifyCorrespondenceSMS(parameters);
          
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
        }
      
        
        
    }
    
}
