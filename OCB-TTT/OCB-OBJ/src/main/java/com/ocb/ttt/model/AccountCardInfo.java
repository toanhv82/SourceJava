/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class AccountCardInfo {
    
    @Key(Value = "ACCOUNT_NUMBER")
    private String acountNumber;
    @Key(Value = "CONTRACT_NAME")
    private String contractName;
    @Key(Value = "CONTR_STATUS_CODE")
    private String statusCode;
    @Key(Value = "CONTR_STATUS_NAME")
    private String statusName;
    @Key(Value = "CLIENT_NUMBER")
    private String CIFNo;
    @Key(Value = "contr_type_code")
    private String contractTypeCode ;
    @Key(Value = "contr_type_name")
    private String contractTypeName ;
    @Key(Value = "DATE_OPEN")
    private String DateTimeActivate;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }   
    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }
    public String getCIFNo() {
        return CIFNo;
    }

    public void setCIFNo(String CIFNo) {
        this.CIFNo = CIFNo;
    }

    public String getContractTypeCode() {
        return contractTypeCode;
    }

    public void setContractTypeCode(String contractTypeCode) {
        this.contractTypeCode = contractTypeCode;
    }

    public String getContractTypeName() {
        return contractTypeName;
    }

    public void setContractTypeName(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    
    
    public String getDateTimeActivate() {
        return DateTimeActivate;
    }

    public void setDateTimeActivate(String DateTimeActivate) {
        this.DateTimeActivate = DateTimeActivate;
    }
   
    
    
    
}
