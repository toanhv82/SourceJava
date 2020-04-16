/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.model.request;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class CardProcess {
    
    
    @Key(Value = "CLIENT_NUMBER")
    private String cif;
    @Key(Value = "CONTRACT_NUMBER")
    private String cardNumber;
    @Key(Value = "TYPE")
    private String type;
    @Key(Value = "FUNCTION")
    private String function;
    @Key(Value = "REASON")
    private String reason;
    @Key(Value = "BATCH_NUMBER")
    private String batchId;
    @Key(Value = "USER_CREATE",require = false)
    private String user;
    @Key(Value = "DATE_CREATE",require = false)
    private String dateCreate;
    @Key(Value = "USER_AUTHORIZE",require = false)
    private String userAuthorize;
    @Key(Value = "DATE_AUTHORIZE",require = false)
    private String dateAuthorize;
    @Key(Value = "AUTHORIZE",require = false)
    private String authorize;
    @Key(Value = "result",require = false) 
    private String result;
    private String users;
    private String rs;
    
    public String getCif() {
        return cif;
    }

    public String getUserAuthorize() {
        return userAuthorize;
    }

    public void setUserAuthorize(String userAuthorize) {
        this.userAuthorize = userAuthorize;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDateAuthorize() {
        return dateAuthorize;
    }

    public void setDateAuthorize(String dateAuthorize) {
        this.dateAuthorize = dateAuthorize;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getUsers() {
        return userAuthorize==null?user : user + "-" + userAuthorize;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getRs() {
        return result==null?authorize : authorize + " - " + result;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    
    
    
    
}
