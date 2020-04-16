package com.ocb.ttt.soa.provider.templet.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class ContractClassifier {
    
    private String reason="";
    @Key(Value = "contractNumber")
    private String contractNumber;    
    private String type;
    @Key(Value = "name")
    private String name;
    @Key(Value = "value")
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
    
}
