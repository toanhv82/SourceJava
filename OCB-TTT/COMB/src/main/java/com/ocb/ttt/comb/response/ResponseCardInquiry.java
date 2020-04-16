/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.response;

import com.ocb.ttt.service.model.ResponseAPI;
import com.ocb.ttt.comb.model.DataCardInquiry;


/**
 *
 * @author toanhv1
 */
public class ResponseCardInquiry extends ResponseAPI{
    
    private DataCardInquiry cardInquiry;   
    public ResponseCardInquiry()
    {
        setResponseID(this.createRequestID());
        setResponseDateTime(this.createTime());
        this.setResponseCode(200);
    }

    public DataCardInquiry getCardInquiry() {
        return cardInquiry;
    }

    public void setCardInquiry(DataCardInquiry cardInquiry) {
        this.cardInquiry = cardInquiry;
    }

   
    
    
    
}
