
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentOrderCif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paymentOrderTransID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderTransStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderExecutePayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderNextApprAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderNaratives" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderCreationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprAcct1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprTime1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprAcct2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprTime2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprAcct3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderApprTime3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sourceAccountInfo" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *         &lt;element name="paymentOrderItem" type="{bian.com.vn}PaymentOrderItemType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOrderType", propOrder = {
    "paymentOrderCif",
    "paymentOrderContract",
    "paymentOrderTransID",
    "paymentOrderTransStatus",
    "paymentOrderComment",
    "paymentOrderExecutePayment",
    "paymentOrderApprType",
    "paymentOrderServiceType",
    "paymentOrderNextApprAccount",
    "paymentOrderNaratives",
    "paymentOrderCreationTime",
    "paymentOrderUpdateTime",
    "paymentOrderApprAcct1",
    "paymentOrderApprTime1",
    "paymentOrderApprAcct2",
    "paymentOrderApprTime2",
    "paymentOrderApprAcct3",
    "paymentOrderApprTime3",
    "itemCount",
    "sourceAccountInfo",
    "paymentOrderItem"
})
public class PaymentOrderType {

    protected String paymentOrderCif;
    @XmlElement(required = true)
    protected String paymentOrderContract;
    protected String paymentOrderTransID;
    protected String paymentOrderTransStatus;
    protected String paymentOrderComment;
    protected Integer paymentOrderExecutePayment;
    protected String paymentOrderApprType;
    protected String paymentOrderServiceType;
    protected String paymentOrderNextApprAccount;
    protected String paymentOrderNaratives;
    protected String paymentOrderCreationTime;
    @XmlElementRef(name = "paymentOrderUpdateTime", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentOrderUpdateTime;
    protected String paymentOrderApprAcct1;
    protected String paymentOrderApprTime1;
    protected String paymentOrderApprAcct2;
    protected String paymentOrderApprTime2;
    protected String paymentOrderApprAcct3;
    protected String paymentOrderApprTime3;
    protected int itemCount;
    protected AccountInfoType sourceAccountInfo;
    @XmlElement(required = true)
    protected PaymentOrderItemType paymentOrderItem;

    /**
     * Gets the value of the paymentOrderCif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderCif() {
        return paymentOrderCif;
    }

    /**
     * Sets the value of the paymentOrderCif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderCif(String value) {
        this.paymentOrderCif = value;
    }

    /**
     * Gets the value of the paymentOrderContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderContract() {
        return paymentOrderContract;
    }

    /**
     * Sets the value of the paymentOrderContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderContract(String value) {
        this.paymentOrderContract = value;
    }

    /**
     * Gets the value of the paymentOrderTransID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderTransID() {
        return paymentOrderTransID;
    }

    /**
     * Sets the value of the paymentOrderTransID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderTransID(String value) {
        this.paymentOrderTransID = value;
    }

    /**
     * Gets the value of the paymentOrderTransStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderTransStatus() {
        return paymentOrderTransStatus;
    }

    /**
     * Sets the value of the paymentOrderTransStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderTransStatus(String value) {
        this.paymentOrderTransStatus = value;
    }

    /**
     * Gets the value of the paymentOrderComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderComment() {
        return paymentOrderComment;
    }

    /**
     * Sets the value of the paymentOrderComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderComment(String value) {
        this.paymentOrderComment = value;
    }

    /**
     * Gets the value of the paymentOrderExecutePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentOrderExecutePayment() {
        return paymentOrderExecutePayment;
    }

    /**
     * Sets the value of the paymentOrderExecutePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentOrderExecutePayment(Integer value) {
        this.paymentOrderExecutePayment = value;
    }

    /**
     * Gets the value of the paymentOrderApprType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprType() {
        return paymentOrderApprType;
    }

    /**
     * Sets the value of the paymentOrderApprType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprType(String value) {
        this.paymentOrderApprType = value;
    }

    /**
     * Gets the value of the paymentOrderServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderServiceType() {
        return paymentOrderServiceType;
    }

    /**
     * Sets the value of the paymentOrderServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderServiceType(String value) {
        this.paymentOrderServiceType = value;
    }

    /**
     * Gets the value of the paymentOrderNextApprAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderNextApprAccount() {
        return paymentOrderNextApprAccount;
    }

    /**
     * Sets the value of the paymentOrderNextApprAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderNextApprAccount(String value) {
        this.paymentOrderNextApprAccount = value;
    }

    /**
     * Gets the value of the paymentOrderNaratives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderNaratives() {
        return paymentOrderNaratives;
    }

    /**
     * Sets the value of the paymentOrderNaratives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderNaratives(String value) {
        this.paymentOrderNaratives = value;
    }

    /**
     * Gets the value of the paymentOrderCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderCreationTime() {
        return paymentOrderCreationTime;
    }

    /**
     * Sets the value of the paymentOrderCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderCreationTime(String value) {
        this.paymentOrderCreationTime = value;
    }

    /**
     * Gets the value of the paymentOrderUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentOrderUpdateTime() {
        return paymentOrderUpdateTime;
    }

    /**
     * Sets the value of the paymentOrderUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentOrderUpdateTime(JAXBElement<String> value) {
        this.paymentOrderUpdateTime = value;
    }

    /**
     * Gets the value of the paymentOrderApprAcct1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprAcct1() {
        return paymentOrderApprAcct1;
    }

    /**
     * Sets the value of the paymentOrderApprAcct1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprAcct1(String value) {
        this.paymentOrderApprAcct1 = value;
    }

    /**
     * Gets the value of the paymentOrderApprTime1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprTime1() {
        return paymentOrderApprTime1;
    }

    /**
     * Sets the value of the paymentOrderApprTime1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprTime1(String value) {
        this.paymentOrderApprTime1 = value;
    }

    /**
     * Gets the value of the paymentOrderApprAcct2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprAcct2() {
        return paymentOrderApprAcct2;
    }

    /**
     * Sets the value of the paymentOrderApprAcct2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprAcct2(String value) {
        this.paymentOrderApprAcct2 = value;
    }

    /**
     * Gets the value of the paymentOrderApprTime2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprTime2() {
        return paymentOrderApprTime2;
    }

    /**
     * Sets the value of the paymentOrderApprTime2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprTime2(String value) {
        this.paymentOrderApprTime2 = value;
    }

    /**
     * Gets the value of the paymentOrderApprAcct3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprAcct3() {
        return paymentOrderApprAcct3;
    }

    /**
     * Sets the value of the paymentOrderApprAcct3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprAcct3(String value) {
        this.paymentOrderApprAcct3 = value;
    }

    /**
     * Gets the value of the paymentOrderApprTime3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderApprTime3() {
        return paymentOrderApprTime3;
    }

    /**
     * Sets the value of the paymentOrderApprTime3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderApprTime3(String value) {
        this.paymentOrderApprTime3 = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     */
    public void setItemCount(int value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the sourceAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getSourceAccountInfo() {
        return sourceAccountInfo;
    }

    /**
     * Sets the value of the sourceAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setSourceAccountInfo(AccountInfoType value) {
        this.sourceAccountInfo = value;
    }

    /**
     * Gets the value of the paymentOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrderItemType }
     *     
     */
    public PaymentOrderItemType getPaymentOrderItem() {
        return paymentOrderItem;
    }

    /**
     * Sets the value of the paymentOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrderItemType }
     *     
     */
    public void setPaymentOrderItem(PaymentOrderItemType value) {
        this.paymentOrderItem = value;
    }

}
