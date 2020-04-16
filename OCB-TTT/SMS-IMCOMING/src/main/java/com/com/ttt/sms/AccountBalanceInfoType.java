
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountBalanceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBalanceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountBalanceClosingMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceClosingMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceOpeningMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceOpeningMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceClosingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceOpeningAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceTurnOverCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceTurnOverDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceInfoType", propOrder = {
    "accountBalanceClosingMax",
    "accountBalanceClosingMin",
    "accountBalanceFromDate",
    "accountBalanceOpeningMax",
    "accountBalanceOpeningMin",
    "accountBalanceToDate",
    "accountBalanceClosingAmount",
    "accountBalanceDate",
    "accountBalanceOpeningAmount",
    "accountBalanceTurnOverCredit",
    "accountBalanceTurnOverDebit"
})
public class AccountBalanceInfoType {

    protected String accountBalanceClosingMax;
    protected String accountBalanceClosingMin;
    protected String accountBalanceFromDate;
    protected String accountBalanceOpeningMax;
    protected String accountBalanceOpeningMin;
    protected String accountBalanceToDate;
    protected String accountBalanceClosingAmount;
    protected String accountBalanceDate;
    protected String accountBalanceOpeningAmount;
    protected String accountBalanceTurnOverCredit;
    protected String accountBalanceTurnOverDebit;

    /**
     * Gets the value of the accountBalanceClosingMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceClosingMax() {
        return accountBalanceClosingMax;
    }

    /**
     * Sets the value of the accountBalanceClosingMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceClosingMax(String value) {
        this.accountBalanceClosingMax = value;
    }

    /**
     * Gets the value of the accountBalanceClosingMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceClosingMin() {
        return accountBalanceClosingMin;
    }

    /**
     * Sets the value of the accountBalanceClosingMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceClosingMin(String value) {
        this.accountBalanceClosingMin = value;
    }

    /**
     * Gets the value of the accountBalanceFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceFromDate() {
        return accountBalanceFromDate;
    }

    /**
     * Sets the value of the accountBalanceFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceFromDate(String value) {
        this.accountBalanceFromDate = value;
    }

    /**
     * Gets the value of the accountBalanceOpeningMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceOpeningMax() {
        return accountBalanceOpeningMax;
    }

    /**
     * Sets the value of the accountBalanceOpeningMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceOpeningMax(String value) {
        this.accountBalanceOpeningMax = value;
    }

    /**
     * Gets the value of the accountBalanceOpeningMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceOpeningMin() {
        return accountBalanceOpeningMin;
    }

    /**
     * Sets the value of the accountBalanceOpeningMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceOpeningMin(String value) {
        this.accountBalanceOpeningMin = value;
    }

    /**
     * Gets the value of the accountBalanceToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceToDate() {
        return accountBalanceToDate;
    }

    /**
     * Sets the value of the accountBalanceToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceToDate(String value) {
        this.accountBalanceToDate = value;
    }

    /**
     * Gets the value of the accountBalanceClosingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceClosingAmount() {
        return accountBalanceClosingAmount;
    }

    /**
     * Sets the value of the accountBalanceClosingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceClosingAmount(String value) {
        this.accountBalanceClosingAmount = value;
    }

    /**
     * Gets the value of the accountBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceDate() {
        return accountBalanceDate;
    }

    /**
     * Sets the value of the accountBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceDate(String value) {
        this.accountBalanceDate = value;
    }

    /**
     * Gets the value of the accountBalanceOpeningAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceOpeningAmount() {
        return accountBalanceOpeningAmount;
    }

    /**
     * Sets the value of the accountBalanceOpeningAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceOpeningAmount(String value) {
        this.accountBalanceOpeningAmount = value;
    }

    /**
     * Gets the value of the accountBalanceTurnOverCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceTurnOverCredit() {
        return accountBalanceTurnOverCredit;
    }

    /**
     * Sets the value of the accountBalanceTurnOverCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceTurnOverCredit(String value) {
        this.accountBalanceTurnOverCredit = value;
    }

    /**
     * Gets the value of the accountBalanceTurnOverDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceTurnOverDebit() {
        return accountBalanceTurnOverDebit;
    }

    /**
     * Sets the value of the accountBalanceTurnOverDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceTurnOverDebit(String value) {
        this.accountBalanceTurnOverDebit = value;
    }

}
