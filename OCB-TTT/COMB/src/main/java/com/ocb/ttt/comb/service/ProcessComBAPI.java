/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.service;


import com.ocb.ttt.comb.dao.ServiceUsersDAO;
import com.ocb.ttt.comb.model.CustomerCards;
import com.ocb.ttt.comb.model.DataCardInquiry;
import com.ocb.ttt.comb.model.DataCardLastTranx;
import com.ocb.ttt.comb.response.ResponseCardInquiry;
import com.ocb.ttt.comb.response.ResponseCardLastTranx;
import com.ocb.ttt.comb.response.ResponseCustomerCard;
import com.ocb.ttt.common.log.LoggerLoader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ProcessComBAPI {
    
     private static LoggerLoader logger = new LoggerLoader(ServiceUsersDAO.class);
    @Autowired
    ServiceComB  serviceComB;
    public  ResponseCardInquiry getResponseCardInquiry(String card)
    {
        
         DataCardInquiry cardInquiry=serviceComB.getCardBalance(card);
         ResponseCardInquiry res=new ResponseCardInquiry();         
         res.setCardInquiry(cardInquiry);
         res.setResponseID(createResponseId());
         logger.info("getResponseCardInquiry:"+card+"->ID:"+createResponseId());
         return res;
    }
    public  ResponseCardLastTranx getResponseCardLastTranx(String card)
    {
         List<DataCardLastTranx> cardInquiry=serviceComB.getDataCardLastTranx(card);
         ResponseCardLastTranx res=new ResponseCardLastTranx();         
         res.setDataCardLastTranx(cardInquiry);  
         res.setResponseID(createResponseId());
         return res;
    }
    public ResponseCustomerCard getResponseCustomerCard(String customerId)
    {
        List<CustomerCards> list=serviceComB.getCustomerCards(customerId);        
        ResponseCustomerCard responseCustomerCard=new ResponseCustomerCard();        
        responseCustomerCard.setCustomerCards(list);
        responseCustomerCard.setResponseID(customerId);
        responseCustomerCard.setFunction("");
        if(list!=null &&list.size()>0)
        {
            responseCustomerCard.setHasCard("Y");
        }else
        {
            responseCustomerCard.setHasCard("N");
        }
        responseCustomerCard.setResponseID(createResponseId());
        
        return responseCustomerCard;
    }
    private String createResponseId()
    {
        Date date=new Date();        
        String ms="";
        Random ran=new Random();        
        SimpleDateFormat f = new SimpleDateFormat("yyyMMdd");
        String dateStr = f.format(date);        
        String h=date.getHours()>=10?String.valueOf(date.getHours()):"0"+String.valueOf(date.getHours());
        String m=date.getMinutes()>=10?String.valueOf(date.getMinutes()):"0"+String.valueOf(date.getMinutes());
        String s=date.getSeconds()>=10?String.valueOf(date.getSeconds()):"0"+String.valueOf(date.getSeconds());
        String mil=String.valueOf(date.getTime()).substring(0,5);
        ms=dateStr+h+m+s+mil;      
        
        return "comB-"+ms;
    }
   
    
}
