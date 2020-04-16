/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.service.Impl;

import com.ocb.ttt.ws.dao.WSCustomerClassifiersDao;
import com.ocb.ttt.ws.service.WSCustomerClassifiers;
import com.ocb.ttt.ws.way4.model.CardBatch;
import com.ocb.ttt.ws.way4.model.CardFee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Win 10
 */
@Service
public class WSCustomerClassifiersImpl implements WSCustomerClassifiers{

    
  @Autowired
  private WSCustomerClassifiersDao wsclassifiersDao;    
    
    @Override
    public String getRRN() {    
        return wsclassifiersDao.getRRN();
    }

    public List<CardBatch> getBatchUnauthorize(String batchNum) {
     return  wsclassifiersDao.getBatchUnauthorize(batchNum);
    }
    public List<CardBatch> getBatchUnauthorize(String batchNum,String type,String func) {
     return  wsclassifiersDao.getBatchUnauthorize(batchNum,type,func);
    }

    public String getClientName(String cardNum) {
       return wsclassifiersDao.getClientName(cardNum);
    }

    public List<CardFee> getCardFeeByNameType(String name, String type) {
        return wsclassifiersDao.getCardFeeByNameType(name, type);
    }

    public boolean updateProcesscardBatch(String status, String cardNum,  String batch_num) {
        return wsclassifiersDao.updateProcesscardBatch(status, cardNum,batch_num);
    }

    public boolean updateProcesscardBatch(String status, String cardNum, String batch_num, String type, String func) {
       return wsclassifiersDao.updateProcesscardBatch(status, cardNum,batch_num,type,func);
    }

    public String getSQ() {
       return wsclassifiersDao.getSOURCE_APPLICATION();
    }
    
}
