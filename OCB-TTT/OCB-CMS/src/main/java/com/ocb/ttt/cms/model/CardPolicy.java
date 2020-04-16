/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class CardPolicy {
    
    @Key(Value = "CONTRACT_NUMBER")
    private String contractNuber;
    @Key(Value = "CONTRACT_NAME")
    private String contractName;
    @Key(Value = "status_value_code")
    private String policyCode;
    @Key(Value = "name")
    private String cardType;
     
    public String getContractNuber() {
        return contractNuber;
    }
    public void setContractNuber(String contractNuber) {
        this.contractNuber = contractNuber;
    }
    public String getContractName() {
        return contractName;
    }
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    
    
    
}
