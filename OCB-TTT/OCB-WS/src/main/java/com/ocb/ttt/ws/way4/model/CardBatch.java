/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author Win 10
 */
public class CardBatch {
    
   
    @Key(Value = "CLIENT_NUMBER")
    private String clientNumber;
    @Key(Value = "CONTRACT_NUMBER")
    private String contractNumber;
    @Key(Value = "TYPE")
    private String type;
    @Key(Value = "FUNCTION")
    private String function;
    @Key(Value = "CARD_ANUAL_FEE_CLS")
    private String cardYearFee;
    @Key(Value = "CARD_TRANS_FEE_CLS")
    private String cardTranxFee;
    @Key(Value = "CONNECT_SCHOOL")
    private String connect_school;
    @Key(Value = "REASON")
    private String reason;
    @Key(Value = "AUTHORIZE")
    private String authorize;
    @Key(Value = "BATCH_NUMBER")
    private String batchNumber;
    @Key(Value = "SHORT_NAME")
    private String ShortName;

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getCardYearFee() {
        return cardYearFee;
    }

    public void setCardYearFee(String cardYearFee) {
        this.cardYearFee = cardYearFee;
    }

    public String getCardTranxFee() {
        return cardTranxFee;
    }

    public void setCardTranxFee(String cardTranxFee) {
        this.cardTranxFee = cardTranxFee;
    }

    public String getConnect_school() {
        return connect_school;
    }

    public void setConnect_school(String connect_school) {
        this.connect_school = connect_school;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

  
    
    
    
}
