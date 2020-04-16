
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeCheckingNameBatchPayment_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeCheckingNameBatchPayment_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="paymentBatch" type="{bian.com.vn}BatchPaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeCheckingNameBatchPayment_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "paymentBatch"
})
public class ExecuteCheckingNameBatchPaymentInType {

    protected TransactionInfoType transactionInfo;
    protected BatchPaymentType paymentBatch;

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
     * Gets the value of the paymentBatch property.
     * 
     * @return
     *     possible object is
     *     {@link BatchPaymentType }
     *     
     */
    public BatchPaymentType getPaymentBatch() {
        return paymentBatch;
    }

    /**
     * Sets the value of the paymentBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchPaymentType }
     *     
     */
    public void setPaymentBatch(BatchPaymentType value) {
        this.paymentBatch = value;
    }

}
