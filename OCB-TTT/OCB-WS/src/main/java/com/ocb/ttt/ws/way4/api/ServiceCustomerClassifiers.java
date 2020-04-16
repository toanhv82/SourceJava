/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.common.log.LogFile;
import com.ocb.ttt.ws.def.FEECODE;
import com.ocb.ttt.ws.service.WSCustomerClassifiers;
import com.ocb.ttt.ws.way4.model.CardBatch;
import com.ocb.ttt.ws.way4.model.CardFee;
import java.util.HashMap;
import java.util.List;
import ocb.ttt.common.anotion.ConfigValue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author Win 10
 */
//@Service
public class ServiceCustomerClassifiers extends PostToWay4{
    
   private static Logger logger = Logger.getLogger(ServiceCustomerClassifiers.class);
    
   @ConfigValue(Value = "way4gate")
   String url;  
    
   @Autowired
   ConvertXML convertXML;
    
   @Autowired
   private WSCustomerClassifiers classifiersDao;  
     
   
    public   List<CardBatch> count(String batch_id)
    {
        List<CardBatch> list =getListBatch(batch_id);  
        
        return list;
    }
    private HashMap<String,Object> updateClassifier(String batch_id)
    {
        try
        {
        ServiceXmlClassifier classifier=new ServiceXmlClassifier();
        /*
           String contractNum,String regNumber,String ShortName
        */       
         int isSuccess=0;
        List<CardBatch> list =getListBatch(batch_id);  
        for(int i=0;i<list.size();i++)
        {
            
            CardBatch item=list.get(i);
            String codefee=FEECODE.CARD_TRANS_FEE_CLS.toString();
            String feeValue=getCardFeeType(item.getCardTranxFee(),FEECODE.CARD_TRANS_FEE_CLS.toString());
            String reason=item.getReason();
            String xml= classifier.convertToData(item.getContractNumber(), getRegNumber(), item.getShortName(),codefee,feeValue,reason);
           if(item.getContractNumber().isEmpty()||feeValue.isEmpty()||feeValue.isEmpty())
           {
                    logger.info("clientName->:"+item.getClientNumber()+"||feeValue->:"+codefee+"||Client->:"+item.getClientNumber());    
                    continue;
           }
           String sre= PostToWay4(xml,url);                
                boolean isSuc=false;
                try
                {
                    isSuc=checkResponse(sre); 
                }catch(Exception e)
                {
                    e.printStackTrace();
                    logger.error(e);
                }        
                if(isSuc)
                {
                    /**
                     * update to DB Success
                     */
                    updateProcesscardBatch("Successfull!", item.getContractNumber(), batch_id);
                    logger.info("Post to way4 Success! client:"+item.getClientNumber());
                    isSuccess++;
                    
                }else
                {
                    /**
                     * update to DB Fail
                     */
                    updateProcesscardBatch("Fail", item.getContractNumber(), batch_id);
                    logger.info("Post to way4 Fail! client:"+item.getClientNumber());
                    
                }
           
                        
        }
         logger.info("Total:"+list.size()+"--- Success:"+isSuccess);
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }
        return null;
    }   
    public  HashMap<String,Object> process(String batch_id)
    {
        return updateClassifier(batch_id);
    }
    public  HashMap<String,Object> updateClassifierRelatedCard(String batch_id)
    {
     
        int isSuccess=0;
        List<CardBatch> list =getListBatch(batch_id);  
        logger.info("Begin:-------------------------------"+batch_id);
        for(int i=0;i<list.size();i++)
        {
            CardBatch item=list.get(i);            
            if(item.getCardYearFee()!=null)
            {                
                String clientName=item.getShortName();
                String codefee=FEECODE.CARD_TRANS_FEE_CLS.toString();
                String feeValue=getCardFeeType(item.getCardTranxFee(),FEECODE.CARD_TRANS_FEE_CLS.toString());
                String reason=item.getReason();
                String contractNumber=item.getContractNumber();
                String xml= convertXML.readXml(contractNumber,getRegNumber(),clientName,codefee,feeValue,reason);  
                
                if(clientName.isEmpty()||feeValue.isEmpty()||contractNumber.isEmpty())
                {
                    logger.info("clientName->:"+clientName+"||feeValue->:"+feeValue+"||contractNumber->:"+contractNumber);    
                    continue;
                }                
                logger.info("XML:"+xml);                
                String sre= PostToWay4(xml,url);                
                boolean isSuc=false;
                try
                {
                    isSuc=checkResponse(sre); 
                }catch(Exception e)
                {
                    e.printStackTrace();
                    logger.error(e);
                }        
                if(isSuc)
                {
                    /**
                     * update to DB Success
                     */
                    updateProcesscardBatch("Successfull!", contractNumber, batch_id);
                    logger.info("Post to way4 Success!");
                    isSuccess++;
                    
                }else
                {
                    /**
                     * update to DB Fail
                     */
                    updateProcesscardBatch("Fail", contractNumber, batch_id);
                    logger.info("Post to way4 Fail!");
                    
                }
                
                
            }else
            {
                logger.error("Card Year fee is Null:"+item.getContractNumber());
            }      
          
        }
        
        logger.info("End:------------------------------->Success:"+isSuccess+"  -- Total:"+list.size());
            
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("total", list.size());
        map.put("Success", isSuccess);
        return map;
    }
    private List<CardBatch> getListBatch(String batch_id)
    {
       return classifiersDao.getBatchUnauthorize(batch_id);
    }
    protected String getRegNumber() {
      return  classifiersDao.getRRN();
    }
    private String getClientName(String clientNum)
    {
        return classifiersDao.getClientName(clientNum);        
    }
    private String getCardFeeType(String name,String type)
    {
       List<CardFee> list= classifiersDao.getCardFeeByNameType(name, type);
       
       if(list.size()==1)
       {
            return list.get(0).getCode();
       }else  if(list.size()==0)
       {
           logger.error("CODE FEE->empty:"+name+" type "+type);
       }else
       {
           logger.error("CODE FEE-> more than 1 row:"+name+" type "+type);
       }
       return "";
    }
    private void  updateProcesscardBatch(String status, String cardNum, String batch_num)
    {
         classifiersDao.updateProcesscardBatch(status, cardNum,batch_num);
    }
   
    public static void main(String[] args) {
        
        ServiceCustomerClassifiers classifiers=new ServiceCustomerClassifiers();
        classifiers.process("20190731_1");
        
    }

    @Override
    protected String getUrl() {
        return url;
    }
}
