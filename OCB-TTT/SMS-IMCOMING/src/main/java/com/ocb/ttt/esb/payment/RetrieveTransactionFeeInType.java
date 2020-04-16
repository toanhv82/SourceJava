
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveTransactionFee_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveTransactionFee_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType"/>
 *         &lt;element name="makerCif" type="{bian.com.vn}CIFInfoType"/>
 *         &lt;element name="authorizeCif" type="{bian.com.vn}CIFInfoType"/>
 *         &lt;element name="srcAccount" type="{bian.com.vn}AccountInfoType"/>
 *         &lt;element name="destinationAccount" type="{bian.com.vn}AccountInfoType"/>
 *         &lt;element name="transferInfo" type="{bian.com.vn}TransferInfoType"/>
 *         &lt;element name="beneficialInfo" type="{bian.com.vn}BeneficialInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveTransactionFee_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "fundTransferInfo",
    "makerCif",
    "authorizeCif",
    "srcAccount",
    "destinationAccount",
    "transferInfo",
    "beneficialInfo"
})
public class RetrieveTransactionFeeInType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(required = true)
    protected FundTransferInfoType fundTransferInfo;
    @XmlElement(required = true)
    protected CIFInfoType makerCif;
    @XmlElement(required = true)
    protected CIFInfoType authorizeCif;
    @XmlElement(required = true)
    protected AccountInfoType srcAccount;
    @XmlElement(required = true)
    protected AccountInfoType destinationAccount;
    @XmlElement(required = true)
    protected TransferInfoType transferInfo;
    @XmlElement(required = true)
    protected BeneficialInfoType beneficialInfo;

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

    /**
     * Gets the value of the destinationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Sets the value of the destinationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setDestinationAccount(AccountInfoType value) {
        this.destinationAccount = value;
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
     * Gets the value of the beneficialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialInfoType }
     *     
     */
    public BeneficialInfoType getBeneficialInfo() {
        return beneficialInfo;
    }

    /**
     * Sets the value of the beneficialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialInfoType }
     *     
     */
    public void setBeneficialInfo(BeneficialInfoType value) {
        this.beneficialInfo = value;
    }

}
