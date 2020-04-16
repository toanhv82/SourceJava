
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardInfo" type="{bian.com.vn}CardInfoType" minOccurs="0"/>
 *         &lt;element name="paymenCardtFi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardtAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="paymenCardRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardReloadMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardReloadSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardChannelSrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardActInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenCardApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentSequenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardInfoType", propOrder = {
    "cardInfo",
    "paymenCardtFi",
    "paymenCardtAmount",
    "paymenCardRefNo",
    "paymenCardReloadMethod",
    "paymenCardReloadSource",
    "paymenCardSequenceNo",
    "paymenCardChannelSrc",
    "paymenCardActInd",
    "paymenCardApprovalCode",
    "paymentSequenceNo"
})
public class PaymentCardInfoType {

    protected CardInfoType cardInfo;
    protected String paymenCardtFi;
    protected Float paymenCardtAmount;
    protected String paymenCardRefNo;
    protected String paymenCardReloadMethod;
    protected String paymenCardReloadSource;
    protected String paymenCardSequenceNo;
    protected String paymenCardChannelSrc;
    protected String paymenCardActInd;
    protected String paymenCardApprovalCode;
    protected String paymentSequenceNo;

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCardInfo(CardInfoType value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the paymenCardtFi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardtFi() {
        return paymenCardtFi;
    }

    /**
     * Sets the value of the paymenCardtFi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardtFi(String value) {
        this.paymenCardtFi = value;
    }

    /**
     * Gets the value of the paymenCardtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPaymenCardtAmount() {
        return paymenCardtAmount;
    }

    /**
     * Sets the value of the paymenCardtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPaymenCardtAmount(Float value) {
        this.paymenCardtAmount = value;
    }

    /**
     * Gets the value of the paymenCardRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardRefNo() {
        return paymenCardRefNo;
    }

    /**
     * Sets the value of the paymenCardRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardRefNo(String value) {
        this.paymenCardRefNo = value;
    }

    /**
     * Gets the value of the paymenCardReloadMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardReloadMethod() {
        return paymenCardReloadMethod;
    }

    /**
     * Sets the value of the paymenCardReloadMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardReloadMethod(String value) {
        this.paymenCardReloadMethod = value;
    }

    /**
     * Gets the value of the paymenCardReloadSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardReloadSource() {
        return paymenCardReloadSource;
    }

    /**
     * Sets the value of the paymenCardReloadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardReloadSource(String value) {
        this.paymenCardReloadSource = value;
    }

    /**
     * Gets the value of the paymenCardSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardSequenceNo() {
        return paymenCardSequenceNo;
    }

    /**
     * Sets the value of the paymenCardSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardSequenceNo(String value) {
        this.paymenCardSequenceNo = value;
    }

    /**
     * Gets the value of the paymenCardChannelSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardChannelSrc() {
        return paymenCardChannelSrc;
    }

    /**
     * Sets the value of the paymenCardChannelSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardChannelSrc(String value) {
        this.paymenCardChannelSrc = value;
    }

    /**
     * Gets the value of the paymenCardActInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardActInd() {
        return paymenCardActInd;
    }

    /**
     * Sets the value of the paymenCardActInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardActInd(String value) {
        this.paymenCardActInd = value;
    }

    /**
     * Gets the value of the paymenCardApprovalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenCardApprovalCode() {
        return paymenCardApprovalCode;
    }

    /**
     * Sets the value of the paymenCardApprovalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenCardApprovalCode(String value) {
        this.paymenCardApprovalCode = value;
    }

    /**
     * Gets the value of the paymentSequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSequenceNo() {
        return paymentSequenceNo;
    }

    /**
     * Sets the value of the paymentSequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSequenceNo(String value) {
        this.paymentSequenceNo = value;
    }

}
