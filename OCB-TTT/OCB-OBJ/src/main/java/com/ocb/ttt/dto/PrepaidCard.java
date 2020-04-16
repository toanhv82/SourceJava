/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dto;

/**
 *
 * @author toanhv1
 */
public class PrepaidCard extends BaseCard{
    
    private String short_name="PREPAID NO NAME 1";    
    private String dateOpen;
    private String dateExperi;
    private String addInfo="";
    
    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }  

    public String getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(String dateOpen) {
        this.dateOpen = dateOpen;
    }

    public String getDateExperi() {
        return dateExperi;
    }

    public void setDateExperi(String dateExperi) {
        this.dateExperi = dateExperi;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }
    
    
    
}
