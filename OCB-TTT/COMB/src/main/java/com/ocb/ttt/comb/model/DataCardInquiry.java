/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author toanhv1
 */
public class DataCardInquiry {
    
    @Key(Value = "ACCOUNT_NUMBER")
    private String accountNumber;
    @Key(Value = "CUSTOMER_CIF")
    private String customerCif;      
    @Key(Value = "LASTEST_STATEMENT_DATE")
    private String latestStatementDate;
    @Key(Value = "LASTEST_MIN_PAYMENT_AMOUNT")
    private String latestMinPaymentAmount;
    @Key(Value = "LASTEST_PAY_DATE")
    private String latestPayDate;
    @Key(Value = "CURRENT_BALANCE")
    private String currentBalance;
    @Key(Value = "LAST_BALANCE")
    private String lastBalance;
    @Key(Value = "REST_MIN_AMOUNT")
    private String restMinAmount;
    @Key(Value = "DEBT_GROUP")
    private String debtGroup;
    @Key(Value = "EXCEED_AMOUNT")
    private String creditLimit;
    @Key(Value = "LASTEST_INCOMING_DUE_DATE")
    private String latestIncomingDueDate;
    @Key(Value = "LASTEST_PAYMENT_AMOUNT")
    private String latestPaymentAmount;
    @Key(Value = "OVDDAYS")
    private String ovdDays;
    @Key(Value = "TOTAL_OVD")
    private String totalOvd;

    public String getCustomerCif() {
        return customerCif;
    }

    public void setCustomerCif(String customerCif) {
        this.customerCif = customerCif;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getLatestStatementDate() {
        return latestStatementDate;
    }

    public void setLatestStatementDate(String latestStatementDate) {
        this.latestStatementDate = latestStatementDate;
    }

    public String getLatestMinPaymentAmount() {
        return latestMinPaymentAmount;
    }

    public void setLatestMinPaymentAmount(String latestMinPaymentAmount) {
        this.latestMinPaymentAmount = latestMinPaymentAmount;
    }

    public String getLatestPayDate() {
        return latestPayDate;
    }

    public void setLatestPayDate(String latestPayDate) {
        this.latestPayDate = latestPayDate;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(String lastBalance) {
        this.lastBalance = lastBalance;
    }

    public String getRestMinAmount() {
        return restMinAmount;
    }

    public void setRestMinAmount(String restMinAmount) {
        this.restMinAmount = restMinAmount;
    }

    public String getDebtGroup() {
        return debtGroup;
    }

    public void setDebtGroup(String debtGroup) {
        this.debtGroup = debtGroup;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getLatestIncomingDueDate() {
        return latestIncomingDueDate;
    }

    public void setLatestIncomingDueDate(String latestIncomingDueDate) {
        this.latestIncomingDueDate = latestIncomingDueDate;
    }

    public String getLatestPaymentAmount() {
        return latestPaymentAmount;
    }

    public void setLatestPaymentAmount(String latestPaymentAmount) {
        this.latestPaymentAmount = latestPaymentAmount;
    }

    public String getOvdDays() {
        return ovdDays;
    }

    public void setOvdDays(String ovdDays) {
        this.ovdDays = ovdDays;
    }

    public String getTotalOvd() {
        return totalOvd;
    }

    public void setTotalOvd(String totalOvd) {
        this.totalOvd = totalOvd;
    }
    
    
    
}
