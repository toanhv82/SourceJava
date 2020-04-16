
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanChangeParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanChangeParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestPeriodStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestRateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamInterestSpread" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamOutstandingInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamOutstandingPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamPrincipalIncrease" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanChangeParamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanChangeParamType", propOrder = {
    "loanContract",
    "loanChangeParamCurrency",
    "loanChangeParamDescription",
    "loanChangeParamEventDate",
    "loanChangeParamInterestBasis",
    "loanChangeParamInterestPeriodEnd",
    "loanChangeParamInterestPeriodStart",
    "loanChangeParamInterestRate",
    "loanChangeParamInterestRateKey",
    "loanChangeParamInterestRateType",
    "loanChangeParamInterestSpread",
    "loanChangeParamOutstandingInterest",
    "loanChangeParamOutstandingPrincipal",
    "loanChangeParamPrincipalIncrease",
    "loanChangeParamType"
})
public class LoanChangeParamType {

    protected String loanContract;
    protected String loanChangeParamCurrency;
    protected String loanChangeParamDescription;
    protected String loanChangeParamEventDate;
    protected String loanChangeParamInterestBasis;
    protected String loanChangeParamInterestPeriodEnd;
    protected String loanChangeParamInterestPeriodStart;
    protected String loanChangeParamInterestRate;
    protected String loanChangeParamInterestRateKey;
    protected String loanChangeParamInterestRateType;
    protected String loanChangeParamInterestSpread;
    protected String loanChangeParamOutstandingInterest;
    protected String loanChangeParamOutstandingPrincipal;
    protected String loanChangeParamPrincipalIncrease;
    protected String loanChangeParamType;

    /**
     * Gets the value of the loanContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContract() {
        return loanContract;
    }

    /**
     * Sets the value of the loanContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContract(String value) {
        this.loanContract = value;
    }

    /**
     * Gets the value of the loanChangeParamCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamCurrency() {
        return loanChangeParamCurrency;
    }

    /**
     * Sets the value of the loanChangeParamCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamCurrency(String value) {
        this.loanChangeParamCurrency = value;
    }

    /**
     * Gets the value of the loanChangeParamDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamDescription() {
        return loanChangeParamDescription;
    }

    /**
     * Sets the value of the loanChangeParamDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamDescription(String value) {
        this.loanChangeParamDescription = value;
    }

    /**
     * Gets the value of the loanChangeParamEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamEventDate() {
        return loanChangeParamEventDate;
    }

    /**
     * Sets the value of the loanChangeParamEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamEventDate(String value) {
        this.loanChangeParamEventDate = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestBasis() {
        return loanChangeParamInterestBasis;
    }

    /**
     * Sets the value of the loanChangeParamInterestBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestBasis(String value) {
        this.loanChangeParamInterestBasis = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestPeriodEnd() {
        return loanChangeParamInterestPeriodEnd;
    }

    /**
     * Sets the value of the loanChangeParamInterestPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestPeriodEnd(String value) {
        this.loanChangeParamInterestPeriodEnd = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestPeriodStart() {
        return loanChangeParamInterestPeriodStart;
    }

    /**
     * Sets the value of the loanChangeParamInterestPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestPeriodStart(String value) {
        this.loanChangeParamInterestPeriodStart = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestRate() {
        return loanChangeParamInterestRate;
    }

    /**
     * Sets the value of the loanChangeParamInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestRate(String value) {
        this.loanChangeParamInterestRate = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestRateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestRateKey() {
        return loanChangeParamInterestRateKey;
    }

    /**
     * Sets the value of the loanChangeParamInterestRateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestRateKey(String value) {
        this.loanChangeParamInterestRateKey = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestRateType() {
        return loanChangeParamInterestRateType;
    }

    /**
     * Sets the value of the loanChangeParamInterestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestRateType(String value) {
        this.loanChangeParamInterestRateType = value;
    }

    /**
     * Gets the value of the loanChangeParamInterestSpread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamInterestSpread() {
        return loanChangeParamInterestSpread;
    }

    /**
     * Sets the value of the loanChangeParamInterestSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamInterestSpread(String value) {
        this.loanChangeParamInterestSpread = value;
    }

    /**
     * Gets the value of the loanChangeParamOutstandingInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamOutstandingInterest() {
        return loanChangeParamOutstandingInterest;
    }

    /**
     * Sets the value of the loanChangeParamOutstandingInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamOutstandingInterest(String value) {
        this.loanChangeParamOutstandingInterest = value;
    }

    /**
     * Gets the value of the loanChangeParamOutstandingPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamOutstandingPrincipal() {
        return loanChangeParamOutstandingPrincipal;
    }

    /**
     * Sets the value of the loanChangeParamOutstandingPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamOutstandingPrincipal(String value) {
        this.loanChangeParamOutstandingPrincipal = value;
    }

    /**
     * Gets the value of the loanChangeParamPrincipalIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamPrincipalIncrease() {
        return loanChangeParamPrincipalIncrease;
    }

    /**
     * Sets the value of the loanChangeParamPrincipalIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamPrincipalIncrease(String value) {
        this.loanChangeParamPrincipalIncrease = value;
    }

    /**
     * Gets the value of the loanChangeParamType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanChangeParamType() {
        return loanChangeParamType;
    }

    /**
     * Sets the value of the loanChangeParamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanChangeParamType(String value) {
        this.loanChangeParamType = value;
    }

}
