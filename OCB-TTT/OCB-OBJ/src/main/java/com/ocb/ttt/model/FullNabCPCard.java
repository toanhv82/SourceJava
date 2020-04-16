/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author quantm1
 */
public class FullNabCPCard {
    @Key(Value = "BATCH_ID")
    private String BATCH_ID;
    public String getBATCH_ID() {
        return BATCH_ID;
    }

    public void setBATCH_ID(String BATCH_ID) {
        this.BATCH_ID = BATCH_ID;
    }
    @Key(Value = "CONTRACT_NAME")
    private String CONTRACT_NAME;
    public String getCONTRACT_NAME() {
        return CONTRACT_NAME;
    }

    public void setCONTRACT_NAME(String CONTRACT_NAME) {
        this.CONTRACT_NAME = CONTRACT_NAME;
    }
    @Key(Value = "CONTRACT_NUMBER")
    private String CONTRACT_NUMBER;
    public String getCONTRACT_NUMBER() {
        return CONTRACT_NUMBER;
    }

    public void setCONTRACT_NUMBER(String CONTRACT_NUMBER) {
        this.CONTRACT_NUMBER = CONTRACT_NUMBER;
    }
    @Key(Value = "MACHINHSACHTD")
    private String MACHINHSACHTD;
    public String getMACHINHSACHTD() {
        return MACHINHSACHTD;
    }

    public void setMACHINHSACHTD(String MACHINHSACHTD) {
        this.MACHINHSACHTD = MACHINHSACHTD;
    }
    @Key(Value = "ACC_FEE_CLASSIFIER")
    private String ACC_FEE_CLASSIFIER;
    public String getACC_FEE_CLASSIFIER() {
        return ACC_FEE_CLASSIFIER;
    }

    public void setACC_FEE_CLASSIFIER(String ACC_FEE_CLASSIFIER) {
        this.ACC_FEE_CLASSIFIER = ACC_FEE_CLASSIFIER;
    }
    @Key(Value = "CARD_FEE_CLASSIFIER")
    private String CARD_FEE_CLASSIFIER;
    public String getCARD_FEE_CLASSIFIER() {
        return CARD_FEE_CLASSIFIER;
    }

    public void setCARD_FEE_CLASSIFIER(String CARD_FEE_CLASSIFIER) {
        this.CARD_FEE_CLASSIFIER = CARD_FEE_CLASSIFIER;
    }
    @Key(Value = "GUARANTEE_POLICY")
    private String GUARANTEE_POLICY;
    public String getGUARANTEE_POLICY() {
        return GUARANTEE_POLICY;
    }

    public void setGUARANTEE_POLICY(String GUARANTEE_POLICY) {
        this.GUARANTEE_POLICY = GUARANTEE_POLICY;
    }
    @Key(Value = "YEARLY_FEE_CLASSIFIER")
    private String YEARLY_FEE_CLASSIFIER;
    public String getYEARLY_FEE_CLASSIFIER() {
        return YEARLY_FEE_CLASSIFIER;
    }

    public void setYEARLY_FEE_CLASSIFIER(String YEARLY_FEE_CLASSIFIER) {
        this.YEARLY_FEE_CLASSIFIER = YEARLY_FEE_CLASSIFIER;
    }
    @Key(Value = "Source_Application_No")
    private String Source_Application_No;
    public String getSource_Application_No() {
        return Source_Application_No;
    }

    public void setSource_Application_No(String Source_Application_No) {
        this.Source_Application_No = Source_Application_No;
    }
}
