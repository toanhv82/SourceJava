/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.model;

/**
 *
 * @author toanhv1
 */
public class DataRegister {
    
    private String cIFNo;
    private String processID ;
    private String typeId;
    public String getcIFNo() {
        return cIFNo;
    }

    public void setcIFNo(String cIFNo) {
        this.cIFNo = cIFNo;
    }

    public String getProcessID() {
        return processID;
    }

    public void setProcessID(String processID) {
        this.processID = processID;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
    
    
    
    
}
