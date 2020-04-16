
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IIBEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreRefNum2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCompletedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionProcessTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxTimeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionReturn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transactionReturnMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemIdList" type="{bian.com.vn}itemStringType" minOccurs="0"/>
 *         &lt;element name="isInternalUse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parentOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *         &lt;element name="transactionValDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionReturnCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionReturnTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checksum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investorRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfoType", propOrder = {
    "schemaVersion",
    "iibEndpoint",
    "coreRefNum",
    "coreRefNum2",
    "cRefNum",
    "pRefNum",
    "userId",
    "transactionStartTime",
    "transactionCompletedTime",
    "transactionProcessTime",
    "maxTimeout",
    "transactionErrorCode",
    "transactionErrorMsg",
    "transactionReturn",
    "transactionReturnMsg",
    "clientCode",
    "systemIdList",
    "isInternalUse",
    "parentOperator",
    "transactionBatchID",
    "branchInfo",
    "transactionValDate",
    "transactionCurrency",
    "transactionValue",
    "transactionReturnCount",
    "transactionReturnTotal",
    "language",
    "checksum",
    "insuranceRefNum",
    "accountRefNum",
    "investorRefNum",
    "clientTimestamp",
    "transactionType"
})
public class TransactionInfoType {

    protected String schemaVersion;
    @XmlElement(name = "IIBEndpoint")
    protected String iibEndpoint;
    protected String coreRefNum;
    protected String coreRefNum2;
    protected String cRefNum;
    protected String pRefNum;
    protected String userId;
    protected String transactionStartTime;
    protected String transactionCompletedTime;
    protected String transactionProcessTime;
    protected String maxTimeout;
    protected String transactionErrorCode;
    protected String transactionErrorMsg;
    protected Integer transactionReturn;
    protected String transactionReturnMsg;
    protected String clientCode;
    protected ItemStringType systemIdList;
    protected Integer isInternalUse;
    protected String parentOperator;
    protected String transactionBatchID;
    protected BranchInfoType branchInfo;
    protected String transactionValDate;
    protected String transactionCurrency;
    protected String transactionValue;
    protected String transactionReturnCount;
    protected String transactionReturnTotal;
    protected String language;
    protected String checksum;
    protected String insuranceRefNum;
    protected String accountRefNum;
    protected String investorRefNum;
    protected String clientTimestamp;
    protected String transactionType;

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the iibEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIIBEndpoint() {
        return iibEndpoint;
    }

    /**
     * Sets the value of the iibEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIIBEndpoint(String value) {
        this.iibEndpoint = value;
    }

    /**
     * Gets the value of the coreRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreRefNum() {
        return coreRefNum;
    }

    /**
     * Sets the value of the coreRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreRefNum(String value) {
        this.coreRefNum = value;
    }

    /**
     * Gets the value of the coreRefNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreRefNum2() {
        return coreRefNum2;
    }

    /**
     * Sets the value of the coreRefNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreRefNum2(String value) {
        this.coreRefNum2 = value;
    }

    /**
     * Gets the value of the cRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRefNum() {
        return cRefNum;
    }

    /**
     * Sets the value of the cRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRefNum(String value) {
        this.cRefNum = value;
    }

    /**
     * Gets the value of the pRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRefNum() {
        return pRefNum;
    }

    /**
     * Sets the value of the pRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRefNum(String value) {
        this.pRefNum = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the transactionStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStartTime() {
        return transactionStartTime;
    }

    /**
     * Sets the value of the transactionStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStartTime(String value) {
        this.transactionStartTime = value;
    }

    /**
     * Gets the value of the transactionCompletedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCompletedTime() {
        return transactionCompletedTime;
    }

    /**
     * Sets the value of the transactionCompletedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCompletedTime(String value) {
        this.transactionCompletedTime = value;
    }

    /**
     * Gets the value of the transactionProcessTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionProcessTime() {
        return transactionProcessTime;
    }

    /**
     * Sets the value of the transactionProcessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionProcessTime(String value) {
        this.transactionProcessTime = value;
    }

    /**
     * Gets the value of the maxTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTimeout() {
        return maxTimeout;
    }

    /**
     * Sets the value of the maxTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTimeout(String value) {
        this.maxTimeout = value;
    }

    /**
     * Gets the value of the transactionErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionErrorCode() {
        return transactionErrorCode;
    }

    /**
     * Sets the value of the transactionErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionErrorCode(String value) {
        this.transactionErrorCode = value;
    }

    /**
     * Gets the value of the transactionErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionErrorMsg() {
        return transactionErrorMsg;
    }

    /**
     * Sets the value of the transactionErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionErrorMsg(String value) {
        this.transactionErrorMsg = value;
    }

    /**
     * Gets the value of the transactionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionReturn() {
        return transactionReturn;
    }

    /**
     * Sets the value of the transactionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionReturn(Integer value) {
        this.transactionReturn = value;
    }

    /**
     * Gets the value of the transactionReturnMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReturnMsg() {
        return transactionReturnMsg;
    }

    /**
     * Sets the value of the transactionReturnMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReturnMsg(String value) {
        this.transactionReturnMsg = value;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the systemIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemStringType }
     *     
     */
    public ItemStringType getSystemIdList() {
        return systemIdList;
    }

    /**
     * Sets the value of the systemIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStringType }
     *     
     */
    public void setSystemIdList(ItemStringType value) {
        this.systemIdList = value;
    }

    /**
     * Gets the value of the isInternalUse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInternalUse() {
        return isInternalUse;
    }

    /**
     * Sets the value of the isInternalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInternalUse(Integer value) {
        this.isInternalUse = value;
    }

    /**
     * Gets the value of the parentOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOperator() {
        return parentOperator;
    }

    /**
     * Sets the value of the parentOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOperator(String value) {
        this.parentOperator = value;
    }

    /**
     * Gets the value of the transactionBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionBatchID() {
        return transactionBatchID;
    }

    /**
     * Sets the value of the transactionBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionBatchID(String value) {
        this.transactionBatchID = value;
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
     * Gets the value of the transactionValDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionValDate() {
        return transactionValDate;
    }

    /**
     * Sets the value of the transactionValDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionValDate(String value) {
        this.transactionValDate = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the transactionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionValue() {
        return transactionValue;
    }

    /**
     * Sets the value of the transactionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionValue(String value) {
        this.transactionValue = value;
    }

    /**
     * Gets the value of the transactionReturnCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReturnCount() {
        return transactionReturnCount;
    }

    /**
     * Sets the value of the transactionReturnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReturnCount(String value) {
        this.transactionReturnCount = value;
    }

    /**
     * Gets the value of the transactionReturnTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionReturnTotal() {
        return transactionReturnTotal;
    }

    /**
     * Sets the value of the transactionReturnTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionReturnTotal(String value) {
        this.transactionReturnTotal = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the insuranceRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceRefNum() {
        return insuranceRefNum;
    }

    /**
     * Sets the value of the insuranceRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceRefNum(String value) {
        this.insuranceRefNum = value;
    }

    /**
     * Gets the value of the accountRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountRefNum() {
        return accountRefNum;
    }

    /**
     * Sets the value of the accountRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountRefNum(String value) {
        this.accountRefNum = value;
    }

    /**
     * Gets the value of the investorRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestorRefNum() {
        return investorRefNum;
    }

    /**
     * Sets the value of the investorRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestorRefNum(String value) {
        this.investorRefNum = value;
    }

    /**
     * Gets the value of the clientTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTimestamp() {
        return clientTimestamp;
    }

    /**
     * Sets the value of the clientTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTimestamp(String value) {
        this.clientTimestamp = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
