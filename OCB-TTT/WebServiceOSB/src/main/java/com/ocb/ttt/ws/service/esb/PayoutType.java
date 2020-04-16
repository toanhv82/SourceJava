
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayoutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payoutType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutAClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutAccountBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payoutInterestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayoutType", propOrder = {
    "payoutType",
    "payoutAClass",
    "payoutAccount",
    "bookAccount",
    "payoutMode",
    "payoutAmount",
    "payoutAccountBRN",
    "payoutPercentage",
    "payoutInterestAmount"
})
public class PayoutType {

    protected String payoutType;
    protected String payoutAClass;
    protected String payoutAccount;
    protected String bookAccount;
    protected String payoutMode;
    protected String payoutAmount;
    protected String payoutAccountBRN;
    protected String payoutPercentage;
    protected String payoutInterestAmount;

    /**
     * Gets the value of the payoutType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutType() {
        return payoutType;
    }

    /**
     * Sets the value of the payoutType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutType(String value) {
        this.payoutType = value;
    }

    /**
     * Gets the value of the payoutAClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAClass() {
        return payoutAClass;
    }

    /**
     * Sets the value of the payoutAClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAClass(String value) {
        this.payoutAClass = value;
    }

    /**
     * Gets the value of the payoutAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAccount() {
        return payoutAccount;
    }

    /**
     * Sets the value of the payoutAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAccount(String value) {
        this.payoutAccount = value;
    }

    /**
     * Gets the value of the bookAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookAccount() {
        return bookAccount;
    }

    /**
     * Sets the value of the bookAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookAccount(String value) {
        this.bookAccount = value;
    }

    /**
     * Gets the value of the payoutMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutMode() {
        return payoutMode;
    }

    /**
     * Sets the value of the payoutMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutMode(String value) {
        this.payoutMode = value;
    }

    /**
     * Gets the value of the payoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAmount() {
        return payoutAmount;
    }

    /**
     * Sets the value of the payoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAmount(String value) {
        this.payoutAmount = value;
    }

    /**
     * Gets the value of the payoutAccountBRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutAccountBRN() {
        return payoutAccountBRN;
    }

    /**
     * Sets the value of the payoutAccountBRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutAccountBRN(String value) {
        this.payoutAccountBRN = value;
    }

    /**
     * Gets the value of the payoutPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutPercentage() {
        return payoutPercentage;
    }

    /**
     * Sets the value of the payoutPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutPercentage(String value) {
        this.payoutPercentage = value;
    }

    /**
     * Gets the value of the payoutInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutInterestAmount() {
        return payoutInterestAmount;
    }

    /**
     * Sets the value of the payoutInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutInterestAmount(String value) {
        this.payoutInterestAmount = value;
    }

}
