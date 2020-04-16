/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.cclient.model;

import com.ocb.ttt.ws.way4.model.ClientW4;

/**
 *
 * @author toanhv1
 */
public class ReqClient  {
    
    private String requestID;
    private String requestDateTime;
    private String function;   
    private String hash;
    private ClientW4 data; 

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public ClientW4 getData() {
        return data;
    }

    public void setData(ClientW4 data) {
        this.data = data;
    }
    
    
    
}
