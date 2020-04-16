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
public class CardFee {
    
    @Key(Value = "NAME")
    private String name;
    @Key(Value = "CODE")
    private String code;
    @Key(Value = "STATUS_TYPE_CODE")
    private String statusCode;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    
    
}
