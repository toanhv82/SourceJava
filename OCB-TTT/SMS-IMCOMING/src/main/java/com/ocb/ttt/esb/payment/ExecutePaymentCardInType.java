
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executePaymentCard_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executePaymentCard_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType" minOccurs="0"/>
 *         &lt;element name="makerCif" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="authorizeCif" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="srcAccount" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executePaymentCard_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "fundTransferInfo",
    "makerCif",
    "authorizeCif",
    "srcAccount"
})
public class ExecutePaymentCardInType {

    protected TransactionInfoType transactionInfo;
    protected FundTransferInfoType fundTransferInfo;
    protected CIFInfoType makerCif;
    protected CIFInfoType authorizeCif;
    protected AccountInfoType srcAccount;

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

    /**
     * Gets the value of the makerCif property.
     * 
     * @return
     *     possible object is
     *     {@link CIFInfoType }
     *     
     */
    public CIFInfoType getMakerCif() {
        return makerCif;
    }

    /**
     * Sets the value of the makerCif property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIFInfoType }
     *     
     */
    public void setMakerCif(CIFInfoType value) {
        this.makerCif = value;
    }

    /**
     * Gets the value of the authorizeCif property.
     * 
     * @return
     *     possible object is
     *     {@link CIFInfoType }
     *     
     */
    public CIFInfoType getAuthorizeCif() {
        return authorizeCif;
    }

    /**
     * Sets the value of the authorizeCif property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIFInfoType }
     *     
     */
    public void setAuthorizeCif(CIFInfoType value) {
        this.authorizeCif = value;
    }

    /**
     * Gets the value of the srcAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getSrcAccount() {
        return srcAccount;
    }

    /**
     * Sets the value of the srcAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setSrcAccount(AccountInfoType value) {
        this.srcAccount = value;
    }

}
