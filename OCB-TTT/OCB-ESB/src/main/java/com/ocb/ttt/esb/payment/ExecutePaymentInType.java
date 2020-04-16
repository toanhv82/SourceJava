
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executePayment_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executePayment_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="transferInfo" type="{bian.com.vn}TransferInfoType"/>
 *         &lt;element name="payment" type="{bian.com.vn}PaymentInfoType"/>
 *         &lt;element name="qrcodeInfo" type="{bian.com.vn}QRcodeInfoType" minOccurs="0"/>
 *         &lt;element name="cardInfo" type="{bian.com.vn}CardInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executePayment_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "transferInfo",
    "payment",
    "qrcodeInfo",
    "cardInfo"
})
public class ExecutePaymentInType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(required = true)
    protected TransferInfoType transferInfo;
    @XmlElement(required = true)
    protected PaymentInfoType payment;
    protected QRcodeInfoType qrcodeInfo;
    protected CardInfoType cardInfo;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoType }
     *     
     */
    public TransactionInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoType }
     *     
     */
    public void setTransactionInfo(TransactionInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the transferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInfoType }
     *     
     */
    public TransferInfoType getTransferInfo() {
        return transferInfo;
    }

    /**
     * Sets the value of the transferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInfoType }
     *     
     */
    public void setTransferInfo(TransferInfoType value) {
        this.transferInfo = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPayment(PaymentInfoType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the qrcodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QRcodeInfoType }
     *     
     */
    public QRcodeInfoType getQrcodeInfo() {
        return qrcodeInfo;
    }

    /**
     * Sets the value of the qrcodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRcodeInfoType }
     *     
     */
    public void setQrcodeInfo(QRcodeInfoType value) {
        this.qrcodeInfo = value;
    }

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

}
