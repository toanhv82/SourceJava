
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeRevertPayment_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeRevertPayment_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{bian.com.vn}ServiceProviderForBillPaymentType" minOccurs="0"/>
 *         &lt;element name="revertTransInfo" type="{bian.com.vn}RevertTransInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeRevertPayment_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "serviceProvider",
    "revertTransInfo"
})
public class ExecuteRevertPaymentInType {

    protected TransactionInfoType transactionInfo;
    protected ServiceProviderForBillPaymentType serviceProvider;
    protected RevertTransInfoType revertTransInfo;

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
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderForBillPaymentType }
     *     
     */
    public ServiceProviderForBillPaymentType getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderForBillPaymentType }
     *     
     */
    public void setServiceProvider(ServiceProviderForBillPaymentType value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the revertTransInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RevertTransInfoType }
     *     
     */
    public RevertTransInfoType getRevertTransInfo() {
        return revertTransInfo;
    }

    /**
     * Sets the value of the revertTransInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevertTransInfoType }
     *     
     */
    public void setRevertTransInfo(RevertTransInfoType value) {
        this.revertTransInfo = value;
    }

}
