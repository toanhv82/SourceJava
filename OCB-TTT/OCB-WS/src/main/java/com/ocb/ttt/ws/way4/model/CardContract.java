/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.model;

/**
 *
 * @author toanhv1
 */
public class CardContract extends SOAModel{
    
    private String issContractNumber;
    private String cardContractNumber;    
    private String clientNumberl;
    private String shortName;
    private String rBSNumber;
    private String AddressLine1;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public String getIssContractNumber() {
        return issContractNumber;
    }

    public void setIssContractNumber(String issContractNumber) {
        this.issContractNumber = issContractNumber;
    }

    public String getCardContractNumber() {
        return cardContractNumber;
    }

    public void setCardContractNumber(String cardContractNumber) {
        this.cardContractNumber = cardContractNumber;
    }

    public String getClientNumberl() {
        return clientNumberl;
    }

    public void setClientNumberl(String clientNumberl) {
        this.clientNumberl = clientNumberl;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getrBSNumber() {
        return rBSNumber;
    }

    public void setrBSNumber(String rBSNumber) {
        this.rBSNumber = rBSNumber;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
}
