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
public class CustomerCards {
    
    @Key(Value = "CONTRACT_NAME")
    private String contracName;
    @Key(Value = "account_number")
    private String accountNumber;
    @Key(Value = "card_number")
    private String cardNumber;
    @Key(Value = "contr_status")
    private String cardStatus;
    @Key(Value = "TOTAL_BALANCE")
    private String totalBalance;       
    @Key(Value = "BRANCH")
    private String brand;
    @Key(Value = "AUTH_LIMIT_AMOUNT")
    private String limitAmount;    
    @Key(Value = "IS_READY")
    private String statusAccount;
    public String getContracName() {
        return contracName;
    }

    public void setContracName(String contracName) {
        this.contracName = contracName;
    }

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

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(String limitAmount) {
        this.limitAmount = limitAmount;
    }

    public String getStatusAccount() {
        return statusAccount;
    }

    public void setStatusAccount(String statusAccount) {
        this.statusAccount = statusAccount;
    }
       
    
    
}
