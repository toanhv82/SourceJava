
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectFuturePaymentTransaction_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectFuturePaymentTransaction_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="filterInfo" type="{bian.com.vn}FilterInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectFuturePaymentTransaction_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "cifInfo",
    "filterInfo"
})
public class SelectFuturePaymentTransactionInType {

    protected TransactionInfoType transactionInfo;
    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected FilterInfoType filterInfo;

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
     * Gets the value of the cifInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CIFInfoType }
     *     
     */
    public CIFInfoType getCIFInfo() {
        return cifInfo;
    }

    /**
     * Sets the value of the cifInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIFInfoType }
     *     
     */
    public void setCIFInfo(CIFInfoType value) {
        this.cifInfo = value;
    }

    /**
     * Gets the value of the filterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FilterInfoType }
     *     
     */
    public FilterInfoType getFilterInfo() {
        return filterInfo;
    }

    /**
     * Sets the value of the filterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterInfoType }
     *     
     */
    public void setFilterInfo(FilterInfoType value) {
        this.filterInfo = value;
    }

}
