
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundTransferInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundTransferInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fundTransferTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferTransactionTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFeeChgComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferVATAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferVATChgComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferNarative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferActiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferActualAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFeePayee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferChanelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferChanelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferDRCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferTxnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferRouteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferExternalPayload" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferExtPayloadAvaible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferReferenceContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferClearingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferBookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingCurrencyExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferBalanceAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBatchTransfer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *         &lt;element name="exchangeRateInfo" type="{bian.com.vn}ExchangeRateInfoType" minOccurs="0"/>
 *         &lt;element name="premiumCalculation" type="{bian.com.vn}PremiumCalculationType" minOccurs="0"/>
 *         &lt;element name="fundTransferDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferRemainAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferDiscountPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fundTransferCrefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundTransferInfoType", propOrder = {
    "fundTransferTransactionType",
    "fundTransferTransactionTypeDesc",
    "fundTransferProductCode",
    "fundTransferAmount",
    "fundTransferFeeAmount",
    "fundTransferFeeChgComp",
    "fundTransferVATAmount",
    "fundTransferVATChgComp",
    "fundTransferNarative",
    "fundTransferActiveDate",
    "fundTransferActualAmount",
    "fundTransferComment",
    "fundTransferFeeType",
    "fundTransferFeeCode",
    "fundTransferFeePayee",
    "fundTransferServiceType",
    "fundTransferChanelId",
    "fundTransferFT",
    "fundTransferChanelCode",
    "fundTransferDRCR",
    "fundTransferTxnCode",
    "fundTransferRouteCode",
    "fundTransferExternalPayload",
    "fundTransferExtPayloadAvaible",
    "fundTransferReferenceContract",
    "fundTransferCurrency",
    "fundTransferClearingNetwork",
    "fundTransferBookingDate",
    "fundTransferValueDate",
    "fundTransferLocation",
    "fundTransferExchangeRate",
    "billingCurrencyExchangeRate",
    "fundTransferBalanceAfter",
    "isBatchTransfer",
    "branchInfo",
    "exchangeRateInfo",
    "premiumCalculation",
    "fundTransferDiscountAmount",
    "fundTransferRemainAmount",
    "fundTransferDiscountPercent",
    "fundTransferCrefNum"
})
public class FundTransferInfoType {

    protected String fundTransferTransactionType;
    protected String fundTransferTransactionTypeDesc;
    protected String fundTransferProductCode;
    protected String fundTransferAmount;
    protected String fundTransferFeeAmount;
    protected String fundTransferFeeChgComp;
    protected String fundTransferVATAmount;
    protected String fundTransferVATChgComp;
    protected String fundTransferNarative;
    protected String fundTransferActiveDate;
    protected String fundTransferActualAmount;
    protected String fundTransferComment;
    protected String fundTransferFeeType;
    protected String fundTransferFeeCode;
    protected String fundTransferFeePayee;
    protected String fundTransferServiceType;
    protected String fundTransferChanelId;
    protected String fundTransferFT;
    protected String fundTransferChanelCode;
    protected String fundTransferDRCR;
    protected String fundTransferTxnCode;
    protected String fundTransferRouteCode;
    protected String fundTransferExternalPayload;
    protected String fundTransferExtPayloadAvaible;
    protected String fundTransferReferenceContract;
    protected String fundTransferCurrency;
    protected String fundTransferClearingNetwork;
    protected String fundTransferBookingDate;
    protected String fundTransferValueDate;
    protected String fundTransferLocation;
    protected String fundTransferExchangeRate;
    protected String billingCurrencyExchangeRate;
    protected String fundTransferBalanceAfter;
    protected String isBatchTransfer;
    protected BranchInfoType branchInfo;
    protected ExchangeRateInfoType exchangeRateInfo;
    protected PremiumCalculationType premiumCalculation;
    protected String fundTransferDiscountAmount;
    protected String fundTransferRemainAmount;
    protected String fundTransferDiscountPercent;
    protected String fundTransferCrefNum;

    /**
     * Gets the value of the fundTransferTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferTransactionType() {
        return fundTransferTransactionType;
    }

    /**
     * Sets the value of the fundTransferTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferTransactionType(String value) {
        this.fundTransferTransactionType = value;
    }

    /**
     * Gets the value of the fundTransferTransactionTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferTransactionTypeDesc() {
        return fundTransferTransactionTypeDesc;
    }

    /**
     * Sets the value of the fundTransferTransactionTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferTransactionTypeDesc(String value) {
        this.fundTransferTransactionTypeDesc = value;
    }

    /**
     * Gets the value of the fundTransferProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferProductCode() {
        return fundTransferProductCode;
    }

    /**
     * Sets the value of the fundTransferProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferProductCode(String value) {
        this.fundTransferProductCode = value;
    }

    /**
     * Gets the value of the fundTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferAmount() {
        return fundTransferAmount;
    }

    /**
     * Sets the value of the fundTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferAmount(String value) {
        this.fundTransferAmount = value;
    }

    /**
     * Gets the value of the fundTransferFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFeeAmount() {
        return fundTransferFeeAmount;
    }

    /**
     * Sets the value of the fundTransferFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFeeAmount(String value) {
        this.fundTransferFeeAmount = value;
    }

    /**
     * Gets the value of the fundTransferFeeChgComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFeeChgComp() {
        return fundTransferFeeChgComp;
    }

    /**
     * Sets the value of the fundTransferFeeChgComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFeeChgComp(String value) {
        this.fundTransferFeeChgComp = value;
    }

    /**
     * Gets the value of the fundTransferVATAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferVATAmount() {
        return fundTransferVATAmount;
    }

    /**
     * Sets the value of the fundTransferVATAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferVATAmount(String value) {
        this.fundTransferVATAmount = value;
    }

    /**
     * Gets the value of the fundTransferVATChgComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferVATChgComp() {
        return fundTransferVATChgComp;
    }

    /**
     * Sets the value of the fundTransferVATChgComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferVATChgComp(String value) {
        this.fundTransferVATChgComp = value;
    }

    /**
     * Gets the value of the fundTransferNarative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferNarative() {
        return fundTransferNarative;
    }

    /**
     * Sets the value of the fundTransferNarative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferNarative(String value) {
        this.fundTransferNarative = value;
    }

    /**
     * Gets the value of the fundTransferActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferActiveDate() {
        return fundTransferActiveDate;
    }

    /**
     * Sets the value of the fundTransferActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferActiveDate(String value) {
        this.fundTransferActiveDate = value;
    }

    /**
     * Gets the value of the fundTransferActualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferActualAmount() {
        return fundTransferActualAmount;
    }

    /**
     * Sets the value of the fundTransferActualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferActualAmount(String value) {
        this.fundTransferActualAmount = value;
    }

    /**
     * Gets the value of the fundTransferComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferComment() {
        return fundTransferComment;
    }

    /**
     * Sets the value of the fundTransferComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferComment(String value) {
        this.fundTransferComment = value;
    }

    /**
     * Gets the value of the fundTransferFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFeeType() {
        return fundTransferFeeType;
    }

    /**
     * Sets the value of the fundTransferFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFeeType(String value) {
        this.fundTransferFeeType = value;
    }

    /**
     * Gets the value of the fundTransferFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFeeCode() {
        return fundTransferFeeCode;
    }

    /**
     * Sets the value of the fundTransferFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFeeCode(String value) {
        this.fundTransferFeeCode = value;
    }

    /**
     * Gets the value of the fundTransferFeePayee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFeePayee() {
        return fundTransferFeePayee;
    }

    /**
     * Sets the value of the fundTransferFeePayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFeePayee(String value) {
        this.fundTransferFeePayee = value;
    }

    /**
     * Gets the value of the fundTransferServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferServiceType() {
        return fundTransferServiceType;
    }

    /**
     * Sets the value of the fundTransferServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferServiceType(String value) {
        this.fundTransferServiceType = value;
    }

    /**
     * Gets the value of the fundTransferChanelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferChanelId() {
        return fundTransferChanelId;
    }

    /**
     * Sets the value of the fundTransferChanelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferChanelId(String value) {
        this.fundTransferChanelId = value;
    }

    /**
     * Gets the value of the fundTransferFT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFT() {
        return fundTransferFT;
    }

    /**
     * Sets the value of the fundTransferFT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFT(String value) {
        this.fundTransferFT = value;
    }

    /**
     * Gets the value of the fundTransferChanelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferChanelCode() {
        return fundTransferChanelCode;
    }

    /**
     * Sets the value of the fundTransferChanelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferChanelCode(String value) {
        this.fundTransferChanelCode = value;
    }

    /**
     * Gets the value of the fundTransferDRCR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferDRCR() {
        return fundTransferDRCR;
    }

    /**
     * Sets the value of the fundTransferDRCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferDRCR(String value) {
        this.fundTransferDRCR = value;
    }

    /**
     * Gets the value of the fundTransferTxnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferTxnCode() {
        return fundTransferTxnCode;
    }

    /**
     * Sets the value of the fundTransferTxnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferTxnCode(String value) {
        this.fundTransferTxnCode = value;
    }

    /**
     * Gets the value of the fundTransferRouteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferRouteCode() {
        return fundTransferRouteCode;
    }

    /**
     * Sets the value of the fundTransferRouteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferRouteCode(String value) {
        this.fundTransferRouteCode = value;
    }

    /**
     * Gets the value of the fundTransferExternalPayload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferExternalPayload() {
        return fundTransferExternalPayload;
    }

    /**
     * Sets the value of the fundTransferExternalPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferExternalPayload(String value) {
        this.fundTransferExternalPayload = value;
    }

    /**
     * Gets the value of the fundTransferExtPayloadAvaible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferExtPayloadAvaible() {
        return fundTransferExtPayloadAvaible;
    }

    /**
     * Sets the value of the fundTransferExtPayloadAvaible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferExtPayloadAvaible(String value) {
        this.fundTransferExtPayloadAvaible = value;
    }

    /**
     * Gets the value of the fundTransferReferenceContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferReferenceContract() {
        return fundTransferReferenceContract;
    }

    /**
     * Sets the value of the fundTransferReferenceContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferReferenceContract(String value) {
        this.fundTransferReferenceContract = value;
    }

    /**
     * Gets the value of the fundTransferCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferCurrency() {
        return fundTransferCurrency;
    }

    /**
     * Sets the value of the fundTransferCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferCurrency(String value) {
        this.fundTransferCurrency = value;
    }

    /**
     * Gets the value of the fundTransferClearingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferClearingNetwork() {
        return fundTransferClearingNetwork;
    }

    /**
     * Sets the value of the fundTransferClearingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferClearingNetwork(String value) {
        this.fundTransferClearingNetwork = value;
    }

    /**
     * Gets the value of the fundTransferBookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferBookingDate() {
        return fundTransferBookingDate;
    }

    /**
     * Sets the value of the fundTransferBookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferBookingDate(String value) {
        this.fundTransferBookingDate = value;
    }

    /**
     * Gets the value of the fundTransferValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferValueDate() {
        return fundTransferValueDate;
    }

    /**
     * Sets the value of the fundTransferValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferValueDate(String value) {
        this.fundTransferValueDate = value;
    }

    /**
     * Gets the value of the fundTransferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferLocation() {
        return fundTransferLocation;
    }

    /**
     * Sets the value of the fundTransferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferLocation(String value) {
        this.fundTransferLocation = value;
    }

    /**
     * Gets the value of the fundTransferExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferExchangeRate() {
        return fundTransferExchangeRate;
    }

    /**
     * Sets the value of the fundTransferExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferExchangeRate(String value) {
        this.fundTransferExchangeRate = value;
    }

    /**
     * Gets the value of the billingCurrencyExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCurrencyExchangeRate() {
        return billingCurrencyExchangeRate;
    }

    /**
     * Sets the value of the billingCurrencyExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCurrencyExchangeRate(String value) {
        this.billingCurrencyExchangeRate = value;
    }

    /**
     * Gets the value of the fundTransferBalanceAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferBalanceAfter() {
        return fundTransferBalanceAfter;
    }

    /**
     * Sets the value of the fundTransferBalanceAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferBalanceAfter(String value) {
        this.fundTransferBalanceAfter = value;
    }

    /**
     * Gets the value of the isBatchTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBatchTransfer() {
        return isBatchTransfer;
    }

    /**
     * Sets the value of the isBatchTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBatchTransfer(String value) {
        this.isBatchTransfer = value;
    }

    /**
     * Gets the value of the branchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BranchInfoType }
     *     
     */
    public BranchInfoType getBranchInfo() {
        return branchInfo;
    }

    /**
     * Sets the value of the branchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchInfoType }
     *     
     */
    public void setBranchInfo(BranchInfoType value) {
        this.branchInfo = value;
    }

    /**
     * Gets the value of the exchangeRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateInfoType }
     *     
     */
    public ExchangeRateInfoType getExchangeRateInfo() {
        return exchangeRateInfo;
    }

    /**
     * Sets the value of the exchangeRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateInfoType }
     *     
     */
    public void setExchangeRateInfo(ExchangeRateInfoType value) {
        this.exchangeRateInfo = value;
    }

    /**
     * Gets the value of the premiumCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumCalculationType }
     *     
     */
    public PremiumCalculationType getPremiumCalculation() {
        return premiumCalculation;
    }

    /**
     * Sets the value of the premiumCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumCalculationType }
     *     
     */
    public void setPremiumCalculation(PremiumCalculationType value) {
        this.premiumCalculation = value;
    }

    /**
     * Gets the value of the fundTransferDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferDiscountAmount() {
        return fundTransferDiscountAmount;
    }

    /**
     * Sets the value of the fundTransferDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferDiscountAmount(String value) {
        this.fundTransferDiscountAmount = value;
    }

    /**
     * Gets the value of the fundTransferRemainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferRemainAmount() {
        return fundTransferRemainAmount;
    }

    /**
     * Sets the value of the fundTransferRemainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferRemainAmount(String value) {
        this.fundTransferRemainAmount = value;
    }

    /**
     * Gets the value of the fundTransferDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferDiscountPercent() {
        return fundTransferDiscountPercent;
    }

    /**
     * Sets the value of the fundTransferDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferDiscountPercent(String value) {
        this.fundTransferDiscountPercent = value;
    }

    /**
     * Gets the value of the fundTransferCrefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferCrefNum() {
        return fundTransferCrefNum;
    }

    /**
     * Sets the value of the fundTransferCrefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferCrefNum(String value) {
        this.fundTransferCrefNum = value;
    }

}
