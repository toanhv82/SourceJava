/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.webservice.esb.service;

import com.ocb.ttt.ws.service.esb.BranchInfoType;
import com.ocb.ttt.ws.service.esb.Correspondence;
import com.ocb.ttt.ws.service.esb.Correspondence_Service;
import com.ocb.ttt.ws.service.esb.NotifyCorrespondenceSMSInType;
import com.ocb.ttt.ws.service.esb.NotifyCorrespondenceSMSOutType;
import com.ocb.ttt.ws.service.esb.SMSNotificationType;
import com.ocb.ttt.ws.service.esb.TransactionInfoType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author toanhv1
 */
public class test {
    
    
    public static void main(String[] args) {
        
        Correspondence_Service correspondence_Service=new Correspondence_Service();
        Correspondence correspondence= correspondence_Service.getCorrespondenceSOAP();
        
        
        NotifyCorrespondenceSMSInType correspondenceSMSInType=new NotifyCorrespondenceSMSInType();        
        TransactionInfoType infoType=new TransactionInfoType();
        infoType.setCRefNum(getRef());
        infoType.setUserId("cardcenter");
        infoType.setClientCode("Card");
        
        BranchInfoType my_branch=new BranchInfoType();
        my_branch.setBranchCode("VN0010168");
        infoType.setBranchInfo(my_branch);
        correspondenceSMSInType.setTransactionInfo(infoType);        
       
        SMSNotificationType mSNotificationType=new SMSNotificationType();
        
        mSNotificationType.setContent("test");
        mSNotificationType.setPhoneNumber("0977693694");
        
        
        correspondenceSMSInType.setSMSNotification(mSNotificationType);
        
        
        NotifyCorrespondenceSMSOutType mSOutType=  correspondence.notifyCorrespondenceSMS(correspondenceSMSInType);
        String st= mSOutType.getTransactionInfo().getClientCode();
              
        System.out.println("com.ocb.ttt.webservice.esb.service.test.main()"+st);
        
    }
    
    private static String getRef()
    {
        Date date=new Date();
        SimpleDateFormat  df = new SimpleDateFormat("yyyyMMddHHmmsss");    
        
        
        String s = df.format(date);  
      
        
        return s;
    }
    
}
