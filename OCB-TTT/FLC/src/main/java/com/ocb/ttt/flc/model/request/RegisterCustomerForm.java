/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.model.request;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author Win 10
 */
public class RegisterCustomerForm {
   
    
    @Key(Value = "CUSTOMERID")
    private String customerID;
    @Key(Value = "FULLNAME")
    private String fullName;
    @Key(Value = "PHONENUMBER")
    private String phoneNumber;
    @Key(Value = "EMAIL")
    private String email;
    @Key(Value = "REQUEST_ID")
    private String RequestId;
    @Key(Value = "STATUS")
    private String status;
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
       
       
    
    
}
