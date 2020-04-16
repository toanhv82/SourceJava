/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class DataCardLastTranx {
    
    @Key(Value = "ACCOUNT_NUMBER")
    private String accountNumber;    
    @Key(Value = "CARD_NUMBER")
    private String cardNumber;
    @Key(Value = "TRANSACTION_CODE")
    private String transactionCode;
    @Key(Value = "TRANSACTION_TYPE")
    private String transactionType;
    @Key(Value = "TRANS_DATE")
    private String transDate;
    @Key(Value = "TRANS_AMOUNT")
    private String transAmount;
    @Key(Value = "TRANS_DETAILS")
    private String transDetail;
    @Key(Value = "TRANSACTION_PLACE")
    private String transactionPlace;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransDetail() {
        return transDetail;
    }

    public void setTransDetail(String transDetail) {
        this.transDetail = transDetail;
    }

    public String getTransactionPlace() {
        return transactionPlace;
    }

    public void setTransactionPlace(String transactionPlace) {
        this.transactionPlace = transactionPlace;
    }
    
    
    
}
