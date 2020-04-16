
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadMetaDataInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadMetaDataInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditOrgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="badDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warningLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cicDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusJob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="income" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestLoanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestLoanTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthlyIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeSources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeAsset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankReceiveSalary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seniority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMonthlyPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeadMetaDataInfoType", propOrder = {
    "telco",
    "leadId",
    "creditOrgs",
    "warningDebt",
    "badDebt",
    "warningLevel",
    "cicDate",
    "yearOfBirth",
    "cusJob",
    "income",
    "incomeType",
    "requestLoanAmount",
    "requestLoanTerm",
    "gender",
    "email",
    "nationalType",
    "cardIssueDate",
    "cardIssuePlace",
    "marriedStatus",
    "nationality",
    "district",
    "ward",
    "addressNo",
    "regAddress",
    "position",
    "monthlyIncome",
    "incomeSources",
    "loanPurpose",
    "guaranteeAsset",
    "bankReceiveSalary",
    "companyType",
    "companyName",
    "contractType",
    "seniority",
    "creditLimit",
    "totalMonthlyPayment"
})
public class LeadMetaDataInfoType {

    protected String telco;
    protected String leadId;
    protected String creditOrgs;
    protected String warningDebt;
    protected String badDebt;
    protected String warningLevel;
    protected String cicDate;
    protected String yearOfBirth;
    protected String cusJob;
    protected String income;
    protected String incomeType;
    protected String requestLoanAmount;
    protected String requestLoanTerm;
    protected String gender;
    protected String email;
    protected String nationalType;
    protected String cardIssueDate;
    protected String cardIssuePlace;
    protected String marriedStatus;
    protected String nationality;
    protected String district;
    protected String ward;
    protected String addressNo;
    protected String regAddress;
    protected String position;
    protected String monthlyIncome;
    protected String incomeSources;
    protected String loanPurpose;
    protected String guaranteeAsset;
    protected String bankReceiveSalary;
    protected String companyType;
    protected String companyName;
    protected String contractType;
    protected String seniority;
    protected String creditLimit;
    protected String totalMonthlyPayment;

    /**
     * Gets the value of the telco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelco() {
        return telco;
    }

    /**
     * Sets the value of the telco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelco(String value) {
        this.telco = value;
    }

    /**
     * Gets the value of the leadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadId() {
        return leadId;
    }

    /**
     * Sets the value of the leadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadId(String value) {
        this.leadId = value;
    }

    /**
     * Gets the value of the creditOrgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditOrgs() {
        return creditOrgs;
    }

    /**
     * Sets the value of the creditOrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditOrgs(String value) {
        this.creditOrgs = value;
    }

    /**
     * Gets the value of the warningDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningDebt() {
        return warningDebt;
    }

    /**
     * Sets the value of the warningDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningDebt(String value) {
        this.warningDebt = value;
    }

    /**
     * Gets the value of the badDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadDebt() {
        return badDebt;
    }

    /**
     * Sets the value of the badDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadDebt(String value) {
        this.badDebt = value;
    }

    /**
     * Gets the value of the warningLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningLevel() {
        return warningLevel;
    }

    /**
     * Sets the value of the warningLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningLevel(String value) {
        this.warningLevel = value;
    }

    /**
     * Gets the value of the cicDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCicDate() {
        return cicDate;
    }

    /**
     * Sets the value of the cicDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCicDate(String value) {
        this.cicDate = value;
    }

    /**
     * Gets the value of the yearOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Sets the value of the yearOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfBirth(String value) {
        this.yearOfBirth = value;
    }

    /**
     * Gets the value of the cusJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusJob() {
        return cusJob;
    }

    /**
     * Sets the value of the cusJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusJob(String value) {
        this.cusJob = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncome(String value) {
        this.income = value;
    }

    /**
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeType(String value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the requestLoanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestLoanAmount() {
        return requestLoanAmount;
    }

    /**
     * Sets the value of the requestLoanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestLoanAmount(String value) {
        this.requestLoanAmount = value;
    }

    /**
     * Gets the value of the requestLoanTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestLoanTerm() {
        return requestLoanTerm;
    }

    /**
     * Sets the value of the requestLoanTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestLoanTerm(String value) {
        this.requestLoanTerm = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the nationalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalType() {
        return nationalType;
    }

    /**
     * Sets the value of the nationalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalType(String value) {
        this.nationalType = value;
    }

    /**
     * Gets the value of the cardIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueDate() {
        return cardIssueDate;
    }

    /**
     * Sets the value of the cardIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueDate(String value) {
        this.cardIssueDate = value;
    }

    /**
     * Gets the value of the cardIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuePlace() {
        return cardIssuePlace;
    }

    /**
     * Sets the value of the cardIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuePlace(String value) {
        this.cardIssuePlace = value;
    }

    /**
     * Gets the value of the marriedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedStatus() {
        return marriedStatus;
    }

    /**
     * Sets the value of the marriedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedStatus(String value) {
        this.marriedStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the ward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWard() {
        return ward;
    }

    /**
     * Sets the value of the ward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWard(String value) {
        this.ward = value;
    }

    /**
     * Gets the value of the addressNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * Sets the value of the addressNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNo(String value) {
        this.addressNo = value;
    }

    /**
     * Gets the value of the regAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegAddress() {
        return regAddress;
    }

    /**
     * Sets the value of the regAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegAddress(String value) {
        this.regAddress = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the monthlyIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Sets the value of the monthlyIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyIncome(String value) {
        this.monthlyIncome = value;
    }

    /**
     * Gets the value of the incomeSources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeSources() {
        return incomeSources;
    }

    /**
     * Sets the value of the incomeSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeSources(String value) {
        this.incomeSources = value;
    }

    /**
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * Gets the value of the guaranteeAsset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeAsset() {
        return guaranteeAsset;
    }

    /**
     * Sets the value of the guaranteeAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeAsset(String value) {
        this.guaranteeAsset = value;
    }

    /**
     * Gets the value of the bankReceiveSalary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReceiveSalary() {
        return bankReceiveSalary;
    }

    /**
     * Sets the value of the bankReceiveSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReceiveSalary(String value) {
        this.bankReceiveSalary = value;
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyType(String value) {
        this.companyType = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniority(String value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the totalMonthlyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMonthlyPayment() {
        return totalMonthlyPayment;
    }

    /**
     * Sets the value of the totalMonthlyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMonthlyPayment(String value) {
        this.totalMonthlyPayment = value;
    }

}
