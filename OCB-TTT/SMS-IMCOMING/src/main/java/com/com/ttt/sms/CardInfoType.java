
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hiddenCardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOutstandingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLatestTransDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOpenBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardActivatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardMinimumInstallmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardInstallmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCurrentLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOtherAccountOutstanding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCustomerTotalLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCustomerCurrentLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPaneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLockStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLockDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLockExpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPaidAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPaidType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCasaAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOnlineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardBookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOriginalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardOriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardTransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardTransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="OTPData" type="{bian.com.vn}OTPDataType" minOccurs="0"/>
 *         &lt;element name="cardBillingCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCashTransactionsInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNonCashTransactionsInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardUnclearedRepaymentsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardWorkingAvailableFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoRepayment" type="{bian.com.vn}AutoRepaymentType" minOccurs="0"/>
 *         &lt;element name="cardRepaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardReasonRestrictionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDailyAtmLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDailyAtmUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDailyPosLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDailyPosUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardInternetLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardInternetUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardMotoLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardMotoUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardEmbossedCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardEmbossedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLayoutId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_Status_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="card_Status_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_Status_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_Status_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRepaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPaymentAfterBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLastOutstAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLastMinInstAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDInfo" type="{bian.com.vn}IDInfoType" minOccurs="0"/>
 *         &lt;element name="cardAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAuthenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardIsBasic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSafeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDailyLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardAccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardFeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCancelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoType", propOrder = {
    "cardAccountNum",
    "hiddenCardNum",
    "cardStatus",
    "cardType",
    "cardBrand",
    "cardProduct",
    "cardDescription",
    "cardLimit",
    "cardOutstandingAmount",
    "cardLatestTransDate",
    "cardCurrency",
    "cardOpenBranchCode",
    "cardActivatedDate",
    "cardIssueDate",
    "cardProperty",
    "cardInstallmentAmount",
    "cardMinimumInstallmentAmount",
    "cardInstallmentDate",
    "cardCurrentLimit",
    "cardOtherAccountOutstanding",
    "cardCustomerTotalLimit",
    "cardCustomerCurrentLimit",
    "cardExpiredDate",
    "cardPaneID",
    "cardOwnerName",
    "cardLockStatus",
    "cardLockDate",
    "cardLockExpDate",
    "cardPaidAmount",
    "cardPaidAccount",
    "cardPaidType",
    "cardCasaAccount",
    "cardOnlineStatus",
    "cardDueDate",
    "cardNumber",
    "cardAmount",
    "cardBookingDate",
    "cardId",
    "cardOriginalAmount",
    "cardOriginalCurrency",
    "cardTransactionDate",
    "cardTransactionType",
    "cifInfo",
    "otpData",
    "cardBillingCycle",
    "cardCashTransactionsInterest",
    "cardNonCashTransactionsInterest",
    "cardUnclearedRepaymentsAmount",
    "cardWorkingAvailableFunds",
    "autoRepayment",
    "cardRepaymentType",
    "cardReasonRestrictionType",
    "cardKey",
    "cardDailyAtmLimit",
    "cardDailyAtmUseLimit",
    "cardDailyPosLimit",
    "cardDailyPosUseLimit",
    "cardInternetLimit",
    "cardInternetUseLimit",
    "cardMotoLimit",
    "cardMotoUseLimit",
    "cardActive",
    "cardHolder",
    "cardEmbossedCompanyName",
    "cardEmbossedName",
    "cardLayoutId",
    "cardIDType",
    "cardStatusCode",
    "cardStatusName",
    "accountStatusCode",
    "accountStatusName",
    "totalRepaymentAmount",
    "pin",
    "totalPaymentAfterBilling",
    "cardLastOutstAmount",
    "cardLastMinInstAmount",
    "idInfo",
    "cardAccountStatus",
    "cardAuthenType",
    "cardPhoneNumber",
    "cardAccountNo",
    "cardEmail",
    "cardIsBasic",
    "cardSafeLimit",
    "cardAvailableBalance",
    "cardDailyLimit",
    "cardAccountID",
    "cardFeeCode",
    "cardCancelDate"
})
public class CardInfoType {

    protected String cardAccountNum;
    protected String hiddenCardNum;
    protected String cardStatus;
    protected String cardType;
    protected String cardBrand;
    protected String cardProduct;
    protected String cardDescription;
    protected String cardLimit;
    protected String cardOutstandingAmount;
    protected String cardLatestTransDate;
    protected String cardCurrency;
    protected String cardOpenBranchCode;
    protected String cardActivatedDate;
    protected String cardIssueDate;
    protected String cardProperty;
    protected String cardInstallmentAmount;
    protected String cardMinimumInstallmentAmount;
    protected String cardInstallmentDate;
    protected String cardCurrentLimit;
    protected String cardOtherAccountOutstanding;
    protected String cardCustomerTotalLimit;
    protected String cardCustomerCurrentLimit;
    protected String cardExpiredDate;
    protected String cardPaneID;
    protected String cardOwnerName;
    protected String cardLockStatus;
    protected String cardLockDate;
    protected String cardLockExpDate;
    protected String cardPaidAmount;
    protected String cardPaidAccount;
    protected String cardPaidType;
    protected String cardCasaAccount;
    protected String cardOnlineStatus;
    protected String cardDueDate;
    protected String cardNumber;
    protected String cardAmount;
    protected String cardBookingDate;
    protected String cardId;
    protected String cardOriginalAmount;
    protected String cardOriginalCurrency;
    protected String cardTransactionDate;
    protected String cardTransactionType;
    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    @XmlElement(name = "OTPData")
    protected OTPDataType otpData;
    protected String cardBillingCycle;
    protected String cardCashTransactionsInterest;
    protected String cardNonCashTransactionsInterest;
    protected String cardUnclearedRepaymentsAmount;
    protected String cardWorkingAvailableFunds;
    protected AutoRepaymentType autoRepayment;
    protected String cardRepaymentType;
    protected String cardReasonRestrictionType;
    protected String cardKey;
    protected String cardDailyAtmLimit;
    protected String cardDailyAtmUseLimit;
    protected String cardDailyPosLimit;
    protected String cardDailyPosUseLimit;
    protected String cardInternetLimit;
    protected String cardInternetUseLimit;
    protected String cardMotoLimit;
    protected String cardMotoUseLimit;
    protected String cardActive;
    protected String cardHolder;
    protected String cardEmbossedCompanyName;
    protected String cardEmbossedName;
    protected String cardLayoutId;
    protected String cardIDType;
    @XmlElement(name = "card_Status_Code")
    protected String cardStatusCode;
    @XmlElement(name = "card_Status_Name")
    protected String cardStatusName;
    @XmlElement(name = "account_Status_Code")
    protected String accountStatusCode;
    @XmlElement(name = "account_Status_Name")
    protected String accountStatusName;
    protected String totalRepaymentAmount;
    @XmlElement(name = "PIN")
    protected String pin;
    protected String totalPaymentAfterBilling;
    protected String cardLastOutstAmount;
    protected String cardLastMinInstAmount;
    @XmlElement(name = "IDInfo")
    protected IDInfoType idInfo;
    protected String cardAccountStatus;
    protected String cardAuthenType;
    protected String cardPhoneNumber;
    protected String cardAccountNo;
    protected String cardEmail;
    protected String cardIsBasic;
    protected String cardSafeLimit;
    protected String cardAvailableBalance;
    protected String cardDailyLimit;
    protected String cardAccountID;
    protected String cardFeeCode;
    protected String cardCancelDate;

    /**
     * Gets the value of the cardAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountNum() {
        return cardAccountNum;
    }

    /**
     * Sets the value of the cardAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountNum(String value) {
        this.cardAccountNum = value;
    }

    /**
     * Gets the value of the hiddenCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiddenCardNum() {
        return hiddenCardNum;
    }

    /**
     * Sets the value of the hiddenCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiddenCardNum(String value) {
        this.hiddenCardNum = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Sets the value of the cardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrand(String value) {
        this.cardBrand = value;
    }

    /**
     * Gets the value of the cardProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProduct() {
        return cardProduct;
    }

    /**
     * Sets the value of the cardProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProduct(String value) {
        this.cardProduct = value;
    }

    /**
     * Gets the value of the cardDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDescription() {
        return cardDescription;
    }

    /**
     * Sets the value of the cardDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDescription(String value) {
        this.cardDescription = value;
    }

    /**
     * Gets the value of the cardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLimit() {
        return cardLimit;
    }

    /**
     * Sets the value of the cardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLimit(String value) {
        this.cardLimit = value;
    }

    /**
     * Gets the value of the cardOutstandingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOutstandingAmount() {
        return cardOutstandingAmount;
    }

    /**
     * Sets the value of the cardOutstandingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOutstandingAmount(String value) {
        this.cardOutstandingAmount = value;
    }

    /**
     * Gets the value of the cardLatestTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLatestTransDate() {
        return cardLatestTransDate;
    }

    /**
     * Sets the value of the cardLatestTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLatestTransDate(String value) {
        this.cardLatestTransDate = value;
    }

    /**
     * Gets the value of the cardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCurrency() {
        return cardCurrency;
    }

    /**
     * Sets the value of the cardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCurrency(String value) {
        this.cardCurrency = value;
    }

    /**
     * Gets the value of the cardOpenBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOpenBranchCode() {
        return cardOpenBranchCode;
    }

    /**
     * Sets the value of the cardOpenBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOpenBranchCode(String value) {
        this.cardOpenBranchCode = value;
    }

    /**
     * Gets the value of the cardActivatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardActivatedDate() {
        return cardActivatedDate;
    }

    /**
     * Sets the value of the cardActivatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardActivatedDate(String value) {
        this.cardActivatedDate = value;
    }

    /**
     * Gets the value of the cardIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssueDate() {
        return cardIssueDate;
    }

    /**
     * Sets the value of the cardIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssueDate(String value) {
        this.cardIssueDate = value;
    }

    /**
     * Gets the value of the cardProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProperty() {
        return cardProperty;
    }

    /**
     * Sets the value of the cardProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProperty(String value) {
        this.cardProperty = value;
    }

    /**
     * Gets the value of the cardInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInstallmentAmount() {
        return cardInstallmentAmount;
    }

    /**
     * Sets the value of the cardInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInstallmentAmount(String value) {
        this.cardInstallmentAmount = value;
    }

    /**
     * Gets the value of the cardMinimumInstallmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMinimumInstallmentAmount() {
        return cardMinimumInstallmentAmount;
    }

    /**
     * Sets the value of the cardMinimumInstallmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMinimumInstallmentAmount(String value) {
        this.cardMinimumInstallmentAmount = value;
    }

    /**
     * Gets the value of the cardInstallmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInstallmentDate() {
        return cardInstallmentDate;
    }

    /**
     * Sets the value of the cardInstallmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInstallmentDate(String value) {
        this.cardInstallmentDate = value;
    }

    /**
     * Gets the value of the cardCurrentLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCurrentLimit() {
        return cardCurrentLimit;
    }

    /**
     * Sets the value of the cardCurrentLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCurrentLimit(String value) {
        this.cardCurrentLimit = value;
    }

    /**
     * Gets the value of the cardOtherAccountOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOtherAccountOutstanding() {
        return cardOtherAccountOutstanding;
    }

    /**
     * Sets the value of the cardOtherAccountOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOtherAccountOutstanding(String value) {
        this.cardOtherAccountOutstanding = value;
    }

    /**
     * Gets the value of the cardCustomerTotalLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCustomerTotalLimit() {
        return cardCustomerTotalLimit;
    }

    /**
     * Sets the value of the cardCustomerTotalLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCustomerTotalLimit(String value) {
        this.cardCustomerTotalLimit = value;
    }

    /**
     * Gets the value of the cardCustomerCurrentLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCustomerCurrentLimit() {
        return cardCustomerCurrentLimit;
    }

    /**
     * Sets the value of the cardCustomerCurrentLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCustomerCurrentLimit(String value) {
        this.cardCustomerCurrentLimit = value;
    }

    /**
     * Gets the value of the cardExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiredDate() {
        return cardExpiredDate;
    }

    /**
     * Sets the value of the cardExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiredDate(String value) {
        this.cardExpiredDate = value;
    }

    /**
     * Gets the value of the cardPaneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPaneID() {
        return cardPaneID;
    }

    /**
     * Sets the value of the cardPaneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPaneID(String value) {
        this.cardPaneID = value;
    }

    /**
     * Gets the value of the cardOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    /**
     * Sets the value of the cardOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOwnerName(String value) {
        this.cardOwnerName = value;
    }

    /**
     * Gets the value of the cardLockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLockStatus() {
        return cardLockStatus;
    }

    /**
     * Sets the value of the cardLockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLockStatus(String value) {
        this.cardLockStatus = value;
    }

    /**
     * Gets the value of the cardLockDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLockDate() {
        return cardLockDate;
    }

    /**
     * Sets the value of the cardLockDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLockDate(String value) {
        this.cardLockDate = value;
    }

    /**
     * Gets the value of the cardLockExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLockExpDate() {
        return cardLockExpDate;
    }

    /**
     * Sets the value of the cardLockExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLockExpDate(String value) {
        this.cardLockExpDate = value;
    }

    /**
     * Gets the value of the cardPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPaidAmount() {
        return cardPaidAmount;
    }

    /**
     * Sets the value of the cardPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPaidAmount(String value) {
        this.cardPaidAmount = value;
    }

    /**
     * Gets the value of the cardPaidAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPaidAccount() {
        return cardPaidAccount;
    }

    /**
     * Sets the value of the cardPaidAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPaidAccount(String value) {
        this.cardPaidAccount = value;
    }

    /**
     * Gets the value of the cardPaidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPaidType() {
        return cardPaidType;
    }

    /**
     * Sets the value of the cardPaidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPaidType(String value) {
        this.cardPaidType = value;
    }

    /**
     * Gets the value of the cardCasaAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCasaAccount() {
        return cardCasaAccount;
    }

    /**
     * Sets the value of the cardCasaAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCasaAccount(String value) {
        this.cardCasaAccount = value;
    }

    /**
     * Gets the value of the cardOnlineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOnlineStatus() {
        return cardOnlineStatus;
    }

    /**
     * Sets the value of the cardOnlineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOnlineStatus(String value) {
        this.cardOnlineStatus = value;
    }

    /**
     * Gets the value of the cardDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDueDate() {
        return cardDueDate;
    }

    /**
     * Sets the value of the cardDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDueDate(String value) {
        this.cardDueDate = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAmount() {
        return cardAmount;
    }

    /**
     * Sets the value of the cardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAmount(String value) {
        this.cardAmount = value;
    }

    /**
     * Gets the value of the cardBookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBookingDate() {
        return cardBookingDate;
    }

    /**
     * Sets the value of the cardBookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBookingDate(String value) {
        this.cardBookingDate = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the cardOriginalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOriginalAmount() {
        return cardOriginalAmount;
    }

    /**
     * Sets the value of the cardOriginalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOriginalAmount(String value) {
        this.cardOriginalAmount = value;
    }

    /**
     * Gets the value of the cardOriginalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOriginalCurrency() {
        return cardOriginalCurrency;
    }

    /**
     * Sets the value of the cardOriginalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOriginalCurrency(String value) {
        this.cardOriginalCurrency = value;
    }

    /**
     * Gets the value of the cardTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTransactionDate() {
        return cardTransactionDate;
    }

    /**
     * Sets the value of the cardTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTransactionDate(String value) {
        this.cardTransactionDate = value;
    }

    /**
     * Gets the value of the cardTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTransactionType() {
        return cardTransactionType;
    }

    /**
     * Sets the value of the cardTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTransactionType(String value) {
        this.cardTransactionType = value;
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
     * Gets the value of the otpData property.
     * 
     * @return
     *     possible object is
     *     {@link OTPDataType }
     *     
     */
    public OTPDataType getOTPData() {
        return otpData;
    }

    /**
     * Sets the value of the otpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTPDataType }
     *     
     */
    public void setOTPData(OTPDataType value) {
        this.otpData = value;
    }

    /**
     * Gets the value of the cardBillingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBillingCycle() {
        return cardBillingCycle;
    }

    /**
     * Sets the value of the cardBillingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBillingCycle(String value) {
        this.cardBillingCycle = value;
    }

    /**
     * Gets the value of the cardCashTransactionsInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCashTransactionsInterest() {
        return cardCashTransactionsInterest;
    }

    /**
     * Sets the value of the cardCashTransactionsInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCashTransactionsInterest(String value) {
        this.cardCashTransactionsInterest = value;
    }

    /**
     * Gets the value of the cardNonCashTransactionsInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNonCashTransactionsInterest() {
        return cardNonCashTransactionsInterest;
    }

    /**
     * Sets the value of the cardNonCashTransactionsInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNonCashTransactionsInterest(String value) {
        this.cardNonCashTransactionsInterest = value;
    }

    /**
     * Gets the value of the cardUnclearedRepaymentsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardUnclearedRepaymentsAmount() {
        return cardUnclearedRepaymentsAmount;
    }

    /**
     * Sets the value of the cardUnclearedRepaymentsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardUnclearedRepaymentsAmount(String value) {
        this.cardUnclearedRepaymentsAmount = value;
    }

    /**
     * Gets the value of the cardWorkingAvailableFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardWorkingAvailableFunds() {
        return cardWorkingAvailableFunds;
    }

    /**
     * Sets the value of the cardWorkingAvailableFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardWorkingAvailableFunds(String value) {
        this.cardWorkingAvailableFunds = value;
    }

    /**
     * Gets the value of the autoRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRepaymentType }
     *     
     */
    public AutoRepaymentType getAutoRepayment() {
        return autoRepayment;
    }

    /**
     * Sets the value of the autoRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRepaymentType }
     *     
     */
    public void setAutoRepayment(AutoRepaymentType value) {
        this.autoRepayment = value;
    }

    /**
     * Gets the value of the cardRepaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRepaymentType() {
        return cardRepaymentType;
    }

    /**
     * Sets the value of the cardRepaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRepaymentType(String value) {
        this.cardRepaymentType = value;
    }

    /**
     * Gets the value of the cardReasonRestrictionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReasonRestrictionType() {
        return cardReasonRestrictionType;
    }

    /**
     * Sets the value of the cardReasonRestrictionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReasonRestrictionType(String value) {
        this.cardReasonRestrictionType = value;
    }

    /**
     * Gets the value of the cardKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardKey() {
        return cardKey;
    }

    /**
     * Sets the value of the cardKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardKey(String value) {
        this.cardKey = value;
    }

    /**
     * Gets the value of the cardDailyAtmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDailyAtmLimit() {
        return cardDailyAtmLimit;
    }

    /**
     * Sets the value of the cardDailyAtmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDailyAtmLimit(String value) {
        this.cardDailyAtmLimit = value;
    }

    /**
     * Gets the value of the cardDailyAtmUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDailyAtmUseLimit() {
        return cardDailyAtmUseLimit;
    }

    /**
     * Sets the value of the cardDailyAtmUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDailyAtmUseLimit(String value) {
        this.cardDailyAtmUseLimit = value;
    }

    /**
     * Gets the value of the cardDailyPosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDailyPosLimit() {
        return cardDailyPosLimit;
    }

    /**
     * Sets the value of the cardDailyPosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDailyPosLimit(String value) {
        this.cardDailyPosLimit = value;
    }

    /**
     * Gets the value of the cardDailyPosUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDailyPosUseLimit() {
        return cardDailyPosUseLimit;
    }

    /**
     * Sets the value of the cardDailyPosUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDailyPosUseLimit(String value) {
        this.cardDailyPosUseLimit = value;
    }

    /**
     * Gets the value of the cardInternetLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInternetLimit() {
        return cardInternetLimit;
    }

    /**
     * Sets the value of the cardInternetLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInternetLimit(String value) {
        this.cardInternetLimit = value;
    }

    /**
     * Gets the value of the cardInternetUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardInternetUseLimit() {
        return cardInternetUseLimit;
    }

    /**
     * Sets the value of the cardInternetUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardInternetUseLimit(String value) {
        this.cardInternetUseLimit = value;
    }

    /**
     * Gets the value of the cardMotoLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMotoLimit() {
        return cardMotoLimit;
    }

    /**
     * Sets the value of the cardMotoLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMotoLimit(String value) {
        this.cardMotoLimit = value;
    }

    /**
     * Gets the value of the cardMotoUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardMotoUseLimit() {
        return cardMotoUseLimit;
    }

    /**
     * Sets the value of the cardMotoUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardMotoUseLimit(String value) {
        this.cardMotoUseLimit = value;
    }

    /**
     * Gets the value of the cardActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardActive() {
        return cardActive;
    }

    /**
     * Sets the value of the cardActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardActive(String value) {
        this.cardActive = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the cardEmbossedCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossedCompanyName() {
        return cardEmbossedCompanyName;
    }

    /**
     * Sets the value of the cardEmbossedCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossedCompanyName(String value) {
        this.cardEmbossedCompanyName = value;
    }

    /**
     * Gets the value of the cardEmbossedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossedName() {
        return cardEmbossedName;
    }

    /**
     * Sets the value of the cardEmbossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossedName(String value) {
        this.cardEmbossedName = value;
    }

    /**
     * Gets the value of the cardLayoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLayoutId() {
        return cardLayoutId;
    }

    /**
     * Sets the value of the cardLayoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLayoutId(String value) {
        this.cardLayoutId = value;
    }

    /**
     * Gets the value of the cardIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIDType() {
        return cardIDType;
    }

    /**
     * Sets the value of the cardIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIDType(String value) {
        this.cardIDType = value;
    }

    /**
     * Gets the value of the cardStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusCode() {
        return cardStatusCode;
    }

    /**
     * Sets the value of the cardStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusCode(String value) {
        this.cardStatusCode = value;
    }

    /**
     * Gets the value of the cardStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatusName() {
        return cardStatusName;
    }

    /**
     * Sets the value of the cardStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatusName(String value) {
        this.cardStatusName = value;
    }

    /**
     * Gets the value of the accountStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusCode() {
        return accountStatusCode;
    }

    /**
     * Sets the value of the accountStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusCode(String value) {
        this.accountStatusCode = value;
    }

    /**
     * Gets the value of the accountStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusName() {
        return accountStatusName;
    }

    /**
     * Sets the value of the accountStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusName(String value) {
        this.accountStatusName = value;
    }

    /**
     * Gets the value of the totalRepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    /**
     * Sets the value of the totalRepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRepaymentAmount(String value) {
        this.totalRepaymentAmount = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the totalPaymentAfterBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPaymentAfterBilling() {
        return totalPaymentAfterBilling;
    }

    /**
     * Sets the value of the totalPaymentAfterBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPaymentAfterBilling(String value) {
        this.totalPaymentAfterBilling = value;
    }

    /**
     * Gets the value of the cardLastOutstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastOutstAmount() {
        return cardLastOutstAmount;
    }

    /**
     * Sets the value of the cardLastOutstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastOutstAmount(String value) {
        this.cardLastOutstAmount = value;
    }

    /**
     * Gets the value of the cardLastMinInstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastMinInstAmount() {
        return cardLastMinInstAmount;
    }

    /**
     * Sets the value of the cardLastMinInstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastMinInstAmount(String value) {
        this.cardLastMinInstAmount = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IDInfoType }
     *     
     */
    public IDInfoType getIDInfo() {
        return idInfo;
    }

    /**
     * Sets the value of the idInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDInfoType }
     *     
     */
    public void setIDInfo(IDInfoType value) {
        this.idInfo = value;
    }

    /**
     * Gets the value of the cardAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountStatus() {
        return cardAccountStatus;
    }

    /**
     * Sets the value of the cardAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountStatus(String value) {
        this.cardAccountStatus = value;
    }

    /**
     * Gets the value of the cardAuthenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAuthenType() {
        return cardAuthenType;
    }

    /**
     * Sets the value of the cardAuthenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAuthenType(String value) {
        this.cardAuthenType = value;
    }

    /**
     * Gets the value of the cardPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPhoneNumber() {
        return cardPhoneNumber;
    }

    /**
     * Sets the value of the cardPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPhoneNumber(String value) {
        this.cardPhoneNumber = value;
    }

    /**
     * Gets the value of the cardAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountNo() {
        return cardAccountNo;
    }

    /**
     * Sets the value of the cardAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountNo(String value) {
        this.cardAccountNo = value;
    }

    /**
     * Gets the value of the cardEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmail() {
        return cardEmail;
    }

    /**
     * Sets the value of the cardEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmail(String value) {
        this.cardEmail = value;
    }

    /**
     * Gets the value of the cardIsBasic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIsBasic() {
        return cardIsBasic;
    }

    /**
     * Sets the value of the cardIsBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIsBasic(String value) {
        this.cardIsBasic = value;
    }

    /**
     * Gets the value of the cardSafeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSafeLimit() {
        return cardSafeLimit;
    }

    /**
     * Sets the value of the cardSafeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSafeLimit(String value) {
        this.cardSafeLimit = value;
    }

    /**
     * Gets the value of the cardAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAvailableBalance() {
        return cardAvailableBalance;
    }

    /**
     * Sets the value of the cardAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAvailableBalance(String value) {
        this.cardAvailableBalance = value;
    }

    /**
     * Gets the value of the cardDailyLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDailyLimit() {
        return cardDailyLimit;
    }

    /**
     * Sets the value of the cardDailyLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDailyLimit(String value) {
        this.cardDailyLimit = value;
    }

    /**
     * Gets the value of the cardAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountID() {
        return cardAccountID;
    }

    /**
     * Sets the value of the cardAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountID(String value) {
        this.cardAccountID = value;
    }

    /**
     * Gets the value of the cardFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardFeeCode() {
        return cardFeeCode;
    }

    /**
     * Sets the value of the cardFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardFeeCode(String value) {
        this.cardFeeCode = value;
    }

    /**
     * Gets the value of the cardCancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCancelDate() {
        return cardCancelDate;
    }

    /**
     * Sets the value of the cardCancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCancelDate(String value) {
        this.cardCancelDate = value;
    }

}
