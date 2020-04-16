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
public class ChinhSach {
    @Key(Value = "MACHINHSACH")
    private String MACHINHSACH;
    public String getMACHINHSACH() {
        return MACHINHSACH;
    }

    public void setMACHINHSACH(String MACHINHSACH) {
        this.MACHINHSACH = MACHINHSACH;
    }
    @Key(Value = "CLASSIFIER_NAME")
    private String CLASSIFIER_NAME;
    public String getCLASSIFIER_NAME() {
        return CLASSIFIER_NAME;
    }

    public void setCLASSIFIER_NAME(String CLASSIFIER_NAME) {
        this.CLASSIFIER_NAME = CLASSIFIER_NAME;
    }
    @Key(Value = "CLASSIFIER_VALUE")
    private String CLASSIFIER_VALUE;
    public String getCLASSIFIER_VALUE() {
        return CLASSIFIER_VALUE;
    }

    public void setCLASSIFIER_VALUE(String CLASSIFIER_VALUE) {
        this.CLASSIFIER_VALUE = CLASSIFIER_VALUE;
    }
    @Key(Value = "ACTIVE")
    private String ACTIVE;
    public String getACTIVE() {
        return ACTIVE;
    }

    public void setACTIVE(String ACTIVE) {
        this.ACTIVE = ACTIVE;
    }
    @Key(Value = "USER_CREATE")
    private String USER_CREATE;
    public String getUSER_CREATE() {
        return USER_CREATE;
    }

    public void setUSER_CREATE(String USER_CREATE) {
        this.USER_CREATE = USER_CREATE;
    }
    @Key(Value = "DATE_MODIFY")
    private String DATE_MODIFY;
    public String getDATE_MODIFY() {
        return DATE_MODIFY;
    }

    public void setDATE_MODIFY(String DATE_MODIFY) {
        this.DATE_MODIFY = DATE_MODIFY;
    }
}
