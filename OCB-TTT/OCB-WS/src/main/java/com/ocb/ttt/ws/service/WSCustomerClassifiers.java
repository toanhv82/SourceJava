/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.service;

import com.ocb.ttt.ws.way4.model.CardBatch;
import com.ocb.ttt.ws.way4.model.CardFee;
import java.util.List;

/**
 *
 * @author Win 10
 */

public interface WSCustomerClassifiers {
    
    String getSQ();    
    String getRRN();     
    List<CardBatch>  getBatchUnauthorize(String batchNum);
    public List<CardBatch> getBatchUnauthorize(String batchNum,String type,String func);
    String getClientName(String cardNum);
    List<CardFee>  getCardFeeByNameType(String name,String type);
    boolean updateProcesscardBatch(String status,String cardNum,String batch_num);
    boolean updateProcesscardBatch(String status,String cardNum,String batch_num,String type,String func);
}
