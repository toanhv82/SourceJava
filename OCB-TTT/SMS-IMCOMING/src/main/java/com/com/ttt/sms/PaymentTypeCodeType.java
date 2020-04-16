
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topupPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fastTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuitionFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eWallet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeCodeType", propOrder = {
    "internalPayment",
    "localPayment",
    "topupPayment",
    "fastTransfer",
    "billPayment",
    "tuitionFee",
    "payU",
    "eWallet"
})
public class PaymentTypeCodeType {

    protected String internalPayment;
    protected String localPayment;
    protected String topupPayment;
    protected String fastTransfer;
    protected String billPayment;
    protected String tuitionFee;
    protected String payU;
    protected String eWallet;

    /**
     * Gets the value of the internalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalPayment() {
        return internalPayment;
    }

    /**
     * Sets the value of the internalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalPayment(String value) {
        this.internalPayment = value;
    }

    /**
     * Gets the value of the localPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPayment() {
        return localPayment;
    }

    /**
     * Sets the value of the localPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPayment(String value) {
        this.localPayment = value;
    }

    /**
     * Gets the value of the topupPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopupPayment() {
        return topupPayment;
    }

    /**
     * Sets the value of the topupPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopupPayment(String value) {
        this.topupPayment = value;
    }

    /**
     * Gets the value of the fastTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastTransfer() {
        return fastTransfer;
    }

    /**
     * Sets the value of the fastTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastTransfer(String value) {
        this.fastTransfer = value;
    }

    /**
     * Gets the value of the billPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPayment() {
        return billPayment;
    }

    /**
     * Sets the value of the billPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPayment(String value) {
        this.billPayment = value;
    }

    /**
     * Gets the value of the tuitionFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuitionFee() {
        return tuitionFee;
    }

    /**
     * Sets the value of the tuitionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuitionFee(String value) {
        this.tuitionFee = value;
    }

    /**
     * Gets the value of the payU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayU() {
        return payU;
    }

    /**
     * Sets the value of the payU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayU(String value) {
        this.payU = value;
    }

    /**
     * Gets the value of the eWallet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWallet() {
        return eWallet;
    }

    /**
     * Sets the value of the eWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWallet(String value) {
        this.eWallet = value;
    }

}
