
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveLastTransaction_out_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveLastTransaction_out_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="lastTransactionInfo" type="{bian.com.vn}LastTransactionInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveLastTransaction_out_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "lastTransactionInfo"
})
public class RetrieveLastTransactionOutType {

    protected TransactionInfoType transactionInfo;
    protected LastTransactionInfoType lastTransactionInfo;

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
     * Gets the value of the lastTransactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LastTransactionInfoType }
     *     
     */
    public LastTransactionInfoType getLastTransactionInfo() {
        return lastTransactionInfo;
    }

    /**
     * Sets the value of the lastTransactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastTransactionInfoType }
     *     
     */
    public void setLastTransactionInfo(LastTransactionInfoType value) {
        this.lastTransactionInfo = value;
    }

}
