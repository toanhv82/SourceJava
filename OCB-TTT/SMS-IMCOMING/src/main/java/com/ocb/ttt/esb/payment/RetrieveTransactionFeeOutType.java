
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveTransactionFee_out_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTransactionFee_out_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTransactionFee_out_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "fundTransferInfo"
})
public class RetrieveTransactionFeeOutType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(required = true)
    protected FundTransferInfoType fundTransferInfo;

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
     * Gets the value of the fundTransferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundTransferInfoType }
     *     
     */
    public FundTransferInfoType getFundTransferInfo() {
        return fundTransferInfo;
    }

    /**
     * Sets the value of the fundTransferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransferInfoType }
     *     
     */
    public void setFundTransferInfo(FundTransferInfoType value) {
        this.fundTransferInfo = value;
    }

}
