/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class Student_TMP {
    
    @Key(Value = "USER_DEFINED_FIELD1")
    private String IDMifare;
    @Key(Value = "CLIENT_CODE")
    private String CLIENT_CODE	;
    @Key(Value = "FAMILY_NAME")
    private String FAMILY_NAME;
    @Key(Value = "FIRST_NAME")
    private String FIRST_NAME;
    @Key(Value = "EMBOSSED_NAME")
    private String FULL_NAME;
    @Key(Value = "GENDER")
    private String GENDER;
    @Key(Value = "LEGAL_ID")
    private String LEGAL_ID;
    @Key(Value = "BIRTH_DATE")
    private String BIRTH_DATE;
    @Key(Value = "BIRTH_CITY")
    private String BIRTH_CITY;
    @Key(Value = "MOBILE_PHONE")
    private String MOBILE_PHONE;
    @Key(Value = "ACCOUNT1")
    private String ACCOUNT1;
    @Key(Value = "BASIC_CARD_NUMBER")
    private String BASIC_CARD_NUMBER;
    @Key(Value = "PHONE_NBR_SMS")
    private String PHONE_NBR_SMS;
    @Key(Value = "TITLE")
    private String TITLE;
    @Key(Value = "AUTHORIZE")
    private String AUTHORIZE="N";
    @Key(Value = "BATCH_ID")
    private String BTACH_ID;
    @Key(Value = "ADDRESS1")
    private String ADDRESS1;
    @Key(Value = "EMPLOYER")
    private String EMPLOYER;
    @Key(Value = "CARD_NUMBER")
    private String CARD_NUMBER;
    @Key(Value = "EMPL_ADDRESS1")
    private String CLASS;
    @Key(Value = "EMPL_ADDRESS2")
    private String COURSE;
    @Key(Value = "EMPL_ADDRESS3")
    private String CLASS_YEAR;
    @Key(Value = "PRODUCT_CODE")
    private String HEX_CODE;
    
    public String getIDMifare() {
        return IDMifare;
    }

    public void setIDMifare(String IDMifare) {
        this.IDMifare = IDMifare;
    }

    public String getCLIENT_CODE() {
        return CLIENT_CODE;
    }

    public void setCLIENT_CODE(String CLIENT_CODE) {
        this.CLIENT_CODE = CLIENT_CODE;
    }

    public String getFAMILY_NAME() {
        return FAMILY_NAME;
    }

    public void setFAMILY_NAME(String FAMILY_NAME) {
        this.FAMILY_NAME = FAMILY_NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getLEGAL_ID() {
        return LEGAL_ID;
    }

    public void setLEGAL_ID(String LEGAL_ID) {
        this.LEGAL_ID = LEGAL_ID;
    }

    public String getBIRTH_DATE() {
        return BIRTH_DATE;
    }

    public void setBIRTH_DATE(String BIRTH_DATE) {
        this.BIRTH_DATE = BIRTH_DATE;
    }

    public String getBIRTH_CITY() {
        return BIRTH_CITY;
    }

    public void setBIRTH_CITY(String BIRTH_CITY) {
        this.BIRTH_CITY = BIRTH_CITY;
    }

    public String getMOBILE_PHONE() {
        return MOBILE_PHONE;
    }

    public void setMOBILE_PHONE(String MOBILE_PHONE) {
        this.MOBILE_PHONE = MOBILE_PHONE;
    }

    public String getACCOUNT1() {
        return ACCOUNT1;
    }

    public void setACCOUNT1(String ACCOUNT1) {
        this.ACCOUNT1 = ACCOUNT1;
    }

    public String getBASIC_CARD_NUMBER() {
        return BASIC_CARD_NUMBER;
    }

    public void setBASIC_CARD_NUMBER(String BASIC_CARD_NUMBER) {
        this.BASIC_CARD_NUMBER = BASIC_CARD_NUMBER;
    }

    

    public String getPHONE_NBR_SMS() {
        return PHONE_NBR_SMS;
    }

    public void setPHONE_NBR_SMS(String PHONE_NBR_SMS) {
        this.PHONE_NBR_SMS = PHONE_NBR_SMS;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getAUTHORIZE() {
        return AUTHORIZE;
    }

    public void setAUTHORIZE(String AUTHORIZE) {
        this.AUTHORIZE = AUTHORIZE;
    }

    public String getFULL_NAME() {
        return FULL_NAME;
    }

    public void setFULL_NAME(String FULL_NAME) {
        this.FULL_NAME = FULL_NAME;
    }

    public String getBTACH_ID() {
        return BTACH_ID;
    }

    public void setBTACH_ID(String BTACH_ID) {
        this.BTACH_ID = BTACH_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getADDRESS1() {
        return ADDRESS1;
    }

    public void setADDRESS1(String ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }

    public String getEMPLOYER() {
        return EMPLOYER;
    }

    public void setEMPLOYER(String EMPLOYER) {
        this.EMPLOYER = EMPLOYER;
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public void setCARD_NUMBER(String CARD_NUMBER) {
        this.CARD_NUMBER = CARD_NUMBER;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getCOURSE() {
        return COURSE;
    }

    public void setCOURSE(String COURSE) {
        this.COURSE = COURSE;
    }

    public String getCLASS_YEAR() {
        return CLASS_YEAR;
    }

    public void setCLASS_YEAR(String CLASS_YEAR) {
        this.CLASS_YEAR = CLASS_YEAR;
    }

    public String getHEX_CODE() {
        return HEX_CODE;
    }

    public void setHEX_CODE(String HEX_CODE) {
        this.HEX_CODE = HEX_CODE;
    }
    
    
}
