/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.card.api.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class CardInfo {
    
    @Key(Value = "CARD_NUMBER")
    private String cardNumber;
    @Key(Value = "ACCOUNT_NUMBER")
    private String acountNumber;
    @Key(Value = "CONTRACT_NAME")
    private String embossingName;
    @Key(Value = "RBS_NUMBER")
    private String accountNo;
    @Key(Value = "CONTR_STATUS")
    private String status;
    @Key(Value = "CLIENT_NUMBER")
    private String CIFNo;
    @Key(Value = "TOKEN_ID")
    private String TokenID ;
    @Key(Value = "contr_type")
    private String CARDTYPE ;
    @Key(Value = "DATE_OPEN")
    private String DateTimeActivate;
    private int FeeCode=0;

    public String getEmbossingName() {
        return embossingName;
    }

    public void setEmbossingName(String embossingName) {
        this.embossingName = embossingName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCIFNo() {
        return CIFNo;
    }

    public void setCIFNo(String CIFNo) {
        this.CIFNo = CIFNo;
    }

    public String getTokenID() {
        return TokenID;
    }

    public void setTokenID(String TokenID) {
        this.TokenID = TokenID;
    }

    public String getDateTimeActivate() {
        return DateTimeActivate;
    }

    public void setDateTimeActivate(String DateTimeActivate) {
        this.DateTimeActivate = DateTimeActivate;
    }

    public int getFeeCode() {
        return FeeCode;
    }

    public void setFeeCode(int FeeCode) {
        this.FeeCode = FeeCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getCARDTYPE() {
        return CARDTYPE;
    }

    public void setCARDTYPE(String CARDTYPE) {
        this.CARDTYPE = CARDTYPE;
    }
    
    
    
}
