
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CBApprovalRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBApprovalRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userToSign1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userToSign2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userToSign3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoOfSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBApprovalRoleType", propOrder = {
    "currency",
    "dateFrom",
    "dateTo",
    "maxTransactionAmount",
    "minTransactionAmount",
    "transactionType",
    "userToSign1",
    "userToSign2",
    "userToSign3",
    "noOfSign"
})
public class CBApprovalRoleType {

    protected String currency;
    protected String dateFrom;
    protected String dateTo;
    protected String maxTransactionAmount;
    protected String minTransactionAmount;
    protected String transactionType;
    protected String userToSign1;
    protected String userToSign2;
    protected String userToSign3;
    @XmlElement(name = "NoOfSign")
    protected String noOfSign;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the maxTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    /**
     * Sets the value of the maxTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTransactionAmount(String value) {
        this.maxTransactionAmount = value;
    }

    /**
     * Gets the value of the minTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinTransactionAmount() {
        return minTransactionAmount;
    }

    /**
     * Sets the value of the minTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinTransactionAmount(String value) {
        this.minTransactionAmount = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the userToSign1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToSign1() {
        return userToSign1;
    }

    /**
     * Sets the value of the userToSign1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToSign1(String value) {
        this.userToSign1 = value;
    }

    /**
     * Gets the value of the userToSign2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToSign2() {
        return userToSign2;
    }

    /**
     * Sets the value of the userToSign2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToSign2(String value) {
        this.userToSign2 = value;
    }

    /**
     * Gets the value of the userToSign3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserToSign3() {
        return userToSign3;
    }

    /**
     * Sets the value of the userToSign3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserToSign3(String value) {
        this.userToSign3 = value;
    }

    /**
     * Gets the value of the noOfSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfSign() {
        return noOfSign;
    }

    /**
     * Sets the value of the noOfSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfSign(String value) {
        this.noOfSign = value;
    }

}
