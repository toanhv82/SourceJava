
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executePaymentCardRepayment_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executePaymentCardRepayment_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="cardRepaymentInfo" type="{bian.com.vn}CardRepaymentInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executePaymentCardRepayment_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "cardRepaymentInfo"
})
public class ExecutePaymentCardRepaymentInType {

    protected TransactionInfoType transactionInfo;
    protected CardRepaymentInfoType cardRepaymentInfo;

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
     * Gets the value of the cardRepaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardRepaymentInfoType }
     *     
     */
    public CardRepaymentInfoType getCardRepaymentInfo() {
        return cardRepaymentInfo;
    }

    /**
     * Sets the value of the cardRepaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRepaymentInfoType }
     *     
     */
    public void setCardRepaymentInfo(CardRepaymentInfoType value) {
        this.cardRepaymentInfo = value;
    }

}
