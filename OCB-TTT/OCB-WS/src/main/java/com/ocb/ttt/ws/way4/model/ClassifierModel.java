/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.model;
import com.ocb.ttt.anotaion.Key;
/**
 *
 * @author quantm1
 */
public class ClassifierModel extends SOAModel {
    private String ContractNumber;
    public String getContractNumber() {
        return ContractNumber;
    }

    public void setContractNumber(String ContractNumber) {
        this.ContractNumber = ContractNumber;
    }
    private String ShortName;    
    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }
    private String Code;
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }
    private String Value;
    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }
    
}
