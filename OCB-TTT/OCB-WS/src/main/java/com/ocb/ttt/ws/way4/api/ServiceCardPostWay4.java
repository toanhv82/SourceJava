/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.service.WSCustomerClassifiers;
import com.ocb.ttt.ws.way4.model.CardBatch;
import com.ocb.ttt.ws.way4.model.CardContract;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import ocb.ttt.common.anotion.ConfigValue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceCardPostWay4 extends PostToWay4{        
   
   @Autowired
   private WSCustomerClassifiers classifiersDao;     
   String type="CARD";
   String func="UNLOCK";    
   private static Logger logger = Logger.getLogger(ServiceCardPostWay4.class);
    
   @ConfigValue(Value = "way4gate")
   String url;  
   
   public int ProcessAll(String batch_id)
   {
       int isSuccess=0;
       try
       {       
           ServiceXmlActiveCard activeCard=new ServiceXmlActiveCard();    
           List<CardBatch> list= getListBatch(batch_id);
           
          for(int i=0;i<list.size();i++)
           {
               CardBatch item=list.get(i);
               String xml=activeCard.convertToData(getMesId(),item.getContractNumber(), getRegNumber(),item.getShortName());
               
               String res= PostToWay4(xml,url);
               boolean isSuc=checkResponse(res);
               if(isSuc)
                {
                    /**
                     * update to DB Success
                     */
                    updateProcesscardBatch("Successfull!", item.getContractNumber(), batch_id,type,func);
                    logger.info("Post to way4 Success!");
                    isSuccess++;
                    
                }else
                {
                    /**
                     * update to DB Fail
                     */
                    updateProcesscardBatch("Fail", item.getContractNumber(), batch_id,type,func);
                    logger.error("Post to way4 Fail!");
                    
                }           
           }           
          
          logger.info("Active Card total:"+list.size()+" is success:"+isSuccess);
          
          return isSuccess;
           
       
         // System.out.println("xml:"+xml);
       }catch(Exception e)
       {
           e.printStackTrace();
           logger.error(e);
       }     
            
       return 0;
   }
   public int addRelationCard(CardContract cardContract)
   {
       try
       { 
           cardContract.setMesId(getMesId());
           cardContract.setRegNumber(getRegNumber());
             AddRelationCardXML addRelationCardXML=new  AddRelationCardXML();
             String xml=addRelationCardXML.convertToData(cardContract);
             String res= PostToWay4(xml,url);
             System.out.println("Post add relation Card:"+res);
             
       }catch(Exception e)
       {
           e.printStackTrace();
           logger.error("Post to way4 Fail!"+e);
       }
       
       return 1;
   }
   public int updateAddressCard(CardContract cardContract)
   {
       try
       { 
           cardContract.setMesId(getMesId());
           cardContract.setRegNumber(getRegNumber());
             UpdateContractCardInfo contractCardInfo=new  UpdateContractCardInfo();
             String xml=contractCardInfo.convertToData(cardContract);
             String res= PostToWay4(xml,url);
             System.out.println("Post add relation Card:"+res);
             
       }catch(Exception e)
       {
           e.printStackTrace();
           logger.error("Post to way4 Fail!"+e);
       }
       
       return 1;
   }
   public int updateRelationCard(CardContract cardContract)
   {
       try
       { 
           cardContract.setMesId(getMesId());
           cardContract.setRegNumber(getRegNumber());
           UpdateRelationCardXML addRelationCardXML=new  UpdateRelationCardXML();
             String xml=addRelationCardXML.convertToData(cardContract);
             String res= PostToWay4(xml,url);
             System.out.println("Post add relation Card:"+res);
             
       }catch(Exception e)
       {
           e.printStackTrace();
           logger.error("Post to way4 Fail!"+e);
       }
       
       return 1;
   }
   public int updateInfoCard(CardContract cardContract)
   {
       try
       { 
           cardContract.setMesId(getMesId());
           cardContract.setRegNumber(getRegNumber());
             UpdateContractCardInfo addRelationCardXML=new  UpdateContractCardInfo("xml/Update_Contract_card_info.xml");
             String xml=addRelationCardXML.convertToData(cardContract);
             String res= PostToWay4(xml,url);
          //   System.out.println("Post add Card:"+res);
             
       }catch(Exception e)
       {
           e.printStackTrace();
           logger.error("Post to way4 Fail!"+e);
       }
       
       return 1;
   }
   public List<CardBatch> getListBatch(String batch_id)
    {
       return classifiersDao.getBatchUnauthorize(batch_id,type,func);
    }
    protected String getRegNumber() {
      return  classifiersDao.getRRN();
    }
    private void  updateProcesscardBatch(String status, String cardNum, String batch_num)
    {
         classifiersDao.updateProcesscardBatch(status, cardNum,batch_num);
    }
    private void  updateProcesscardBatch(String status, String cardNum, String batch_num,String type,String func)
    {
         classifiersDao.updateProcesscardBatch(status, cardNum,batch_num,type,func);
    }

    @Override
    protected String getUrl() {
        return url;
    }
}
