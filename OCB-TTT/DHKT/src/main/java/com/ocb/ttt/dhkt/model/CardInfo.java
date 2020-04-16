/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class CardInfo {
     
    @Key(Value = "embossingName")
    private String embossingName;
    @Key(Value = "RBS_NUMBER")
    private String accountNo;
    @Key(Value = "status")
    private String status;
    @Key(Value = "CLIENT_NUMBER")
    private String CIFNo;
    @Key(Value = "TOKEN_ID")
    private String TokenID ;
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

    
}
