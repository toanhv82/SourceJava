
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executePaymentFastNapas_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executePaymentFastNapas_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType" minOccurs="0"/>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="srcAccount" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *         &lt;element name="destinationAccount" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *         &lt;element name="destCard" type="{bian.com.vn}CardInfoType" minOccurs="0"/>
 *         &lt;element name="transferInfo" type="{bian.com.vn}TransferInfoType" minOccurs="0"/>
 *         &lt;element name="beneficialInfo" type="{bian.com.vn}BeneficialInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executePaymentFastNapas_in_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "fundTransferInfo",
    "cifInfo",
    "srcAccount",
    "destinationAccount",
    "destCard",
    "transferInfo",
    "beneficialInfo"
})
public class ExecutePaymentFastNapasInType {

    protected TransactionInfoType transactionInfo;
    protected FundTransferInfoType fundTransferInfo;
    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected AccountInfoType srcAccount;
    protected AccountInfoType destinationAccount;
    protected CardInfoType destCard;
    protected TransferInfoType transferInfo;
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
     * Gets the value of the destCard property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getDestCard() {
        return destCard;
    }

    /**
     * Sets the value of the destCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setDestCard(CardInfoType value) {
        this.destCard = value;
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
