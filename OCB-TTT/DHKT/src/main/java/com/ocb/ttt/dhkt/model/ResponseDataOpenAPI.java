/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.model;

import java.util.List;

/**
 *
 * @author toanhv1
 */
public class ResponseDataOpenAPI {
    
    private String embossingName;
    private String accountNo;
    private String cardStatus;
    private String CIFNo;
    private String TokenID ;
    private String DateTimeActivate;
    private String FeeCode;
   

    public String getEmbossingName() {
        return embossingName;
    }

    public void setEmbossingName(String embossingName) {
        this.embossingName = embossingName;
    }


    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
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

    public String getFeeCode() {
        return FeeCode;
    }

    public void setFeeCode(String FeeCode) {
        this.FeeCode = FeeCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    
    
}
