
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectTransaction_out_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectTransaction_out_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="transactionItemList" type="{bian.com.vn}TransactionItemListType" minOccurs="0"/>
 *         &lt;element name="transactionSummary" type="{bian.com.vn}TransactionStatementSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectTransaction_out_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "transactionItemList",
    "transactionSummary"
})
public class SelectTransactionOutType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    protected TransactionItemListType transactionItemList;
    protected TransactionStatementSummaryType transactionSummary;

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
     * Gets the value of the transactionItemList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemListType }
     *     
     */
    public TransactionItemListType getTransactionItemList() {
        return transactionItemList;
    }

    /**
     * Sets the value of the transactionItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemListType }
     *     
     */
    public void setTransactionItemList(TransactionItemListType value) {
        this.transactionItemList = value;
    }

    /**
     * Gets the value of the transactionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatementSummaryType }
     *     
     */
    public TransactionStatementSummaryType getTransactionSummary() {
        return transactionSummary;
    }

    /**
     * Sets the value of the transactionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatementSummaryType }
     *     
     */
    public void setTransactionSummary(TransactionStatementSummaryType value) {
        this.transactionSummary = value;
    }

}
