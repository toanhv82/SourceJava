
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationCurrExchRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originatedBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="srcAccount" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *         &lt;element name="beneficialInfo" type="{bian.com.vn}BeneficialInfoType" minOccurs="0"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType" minOccurs="0"/>
 *         &lt;element name="cardInfo" type="{bian.com.vn}CardInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionHistoryType", propOrder = {
    "orderEntry",
    "sourceApplication",
    "reconciliationCurrency",
    "reconciliationCurrExchRate",
    "originatedBranchCode",
    "transactionInfo",
    "srcAccount",
    "beneficialInfo",
    "fundTransferInfo",
    "cardInfo"
})
public class TransactionHistoryType {

    protected String orderEntry;
    protected String sourceApplication;
    protected String reconciliationCurrency;
    protected String reconciliationCurrExchRate;
    protected String originatedBranchCode;
    protected TransactionInfoType transactionInfo;
    protected AccountInfoType srcAccount;
    protected BeneficialInfoType beneficialInfo;
    protected FundTransferInfoType fundTransferInfo;
    protected CardInfoType cardInfo;

    /**
     * Gets the value of the orderEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderEntry() {
        return orderEntry;
    }

    /**
     * Sets the value of the orderEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderEntry(String value) {
        this.orderEntry = value;
    }

    /**
     * Gets the value of the sourceApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceApplication() {
        return sourceApplication;
    }

    /**
     * Sets the value of the sourceApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceApplication(String value) {
        this.sourceApplication = value;
    }

    /**
     * Gets the value of the reconciliationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationCurrency() {
        return reconciliationCurrency;
    }

    /**
     * Sets the value of the reconciliationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationCurrency(String value) {
        this.reconciliationCurrency = value;
    }

    /**
     * Gets the value of the reconciliationCurrExchRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationCurrExchRate() {
        return reconciliationCurrExchRate;
    }

    /**
     * Sets the value of the reconciliationCurrExchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationCurrExchRate(String value) {
        this.reconciliationCurrExchRate = value;
    }

    /**
     * Gets the value of the originatedBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatedBranchCode() {
        return originatedBranchCode;
    }

    /**
     * Sets the value of the originatedBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatedBranchCode(String value) {
        this.originatedBranchCode = value;
    }

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
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCardInfo(CardInfoType value) {
        this.cardInfo = value;
    }

}
