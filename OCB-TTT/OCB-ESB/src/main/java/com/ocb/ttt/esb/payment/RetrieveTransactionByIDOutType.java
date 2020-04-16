
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveTransactionByID_out_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTransactionByID_out_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="transactionItem" type="{bian.com.vn}TransactionHistoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTransactionByID_out_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "transactionItem"
})
public class RetrieveTransactionByIDOutType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    protected TransactionHistoryType transactionItem;

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
     * Gets the value of the transactionItem property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHistoryType }
     *     
     */
    public TransactionHistoryType getTransactionItem() {
        return transactionItem;
    }

    /**
     * Sets the value of the transactionItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHistoryType }
     *     
     */
    public void setTransactionItem(TransactionHistoryType value) {
        this.transactionItem = value;
    }

}
