/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.service;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.dhkt.model.CardInfo;
import com.ocb.ttt.dhkt.model.ResponseOpenAPI;
import com.ocb.ttt.dhkt.respository.ImportFileDao;
import com.ocb.ttt.dhkt.respository.ProcessDataDao;
import com.ocb.ttt.service.def.ResponseCode;
import com.ocb.ttt.service.def.ResponseStatus;
import java.util.ArrayList;
import java.util.List;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class PaymentService {
    
    private  LoggerLoader logger = new LoggerLoader(ImportFileDao.class);
    @Autowired
    ProcessDataDao processDataDao;
    public  ResponseOpenAPI getCardInfo(String idMife)
    {
        ResponseOpenAPI  openAPI=new ResponseOpenAPI();
        openAPI.setFunction("CardInquiry");
        List<CardInfo> cardInfo=  processDataDao.getCardInfo(idMife);
        
        if(cardInfo.size()>0)
        {
            CardInfo cardInfo1=cardInfo.get(0);            
            if(cardInfo1.getStatus().equals("00"))
            {
                openAPI.setResponseCode(200);
                openAPI.setResponseCode(ResponseCode.Success);
                openAPI.setData(cardInfo1);
                openAPI.setDescription(ResponseStatus.SUCCESS.toString());                
                String hash=openAPI.getResponseID()+cardInfo1.getStatus();
                hash=SHAHashing.bytesToHex(hash);
                openAPI.setHashKey(hash);
                
                
            }else
            {
                openAPI.setResponseCode(ResponseCode.CardStatusInvalid);
                openAPI.setDescription(ResponseStatus.REJECT.toString());
            }            
           
             
        }else
        {
             openAPI.setResponseCode(ResponseCode.CardNotExist);
             openAPI.setDescription("CHECK CARD ON WAY 4");
             
        }  

        
        return openAPI;
        
    }
    
}
