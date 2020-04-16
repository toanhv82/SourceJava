/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.token.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class TokenPan {

    @Key(Value = "client_number")
    private String clientId;
    @Key(Value = "pan")
    private String pan;
    @Key(Value = "token_id")
    private String tokentId;    
    @Key(Value = "ACCOUNT_NUMBER")
    private String accountNumber;
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getTokentId() {
        return tokentId;
    }

    public void setTokentId(String tokentId) {
        this.tokentId = tokentId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    

}
