
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentAccountStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentAccountStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closingActualBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingActualBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downloadLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitAmountGranted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimalAmountDue" type="{bian.com.vn}LastMinimalAmountDueType" minOccurs="0"/>
 *         &lt;element name="closingValueDatedBalance" type="{bian.com.vn}BalanceType" minOccurs="0"/>
 *         &lt;element name="rateInfo" type="{bian.com.vn}RateInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transactionItem" type="{bian.com.vn}TransactionHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentAccountStatementType", propOrder = {
    "accountNumber",
    "branchName",
    "closingActualBalance",
    "currency",
    "endDate",
    "generationDate",
    "id",
    "interestDate",
    "openingActualBalance",
    "penaltyInterestRate",
    "previousEndDate",
    "interestRates",
    "startDate",
    "downloadLink",
    "limitAmountGranted",
    "swift",
    "totalDebt",
    "statementId",
    "minimalAmountDue",
    "closingValueDatedBalance",
    "rateInfo",
    "transactionItem"
})
public class CurrentAccountStatementType {

    protected String accountNumber;
    protected String branchName;
    protected String closingActualBalance;
    protected String currency;
    protected String endDate;
    protected String generationDate;
    protected String id;
    protected String interestDate;
    protected String openingActualBalance;
    protected String penaltyInterestRate;
    protected String previousEndDate;
    protected String interestRates;
    protected String startDate;
    protected String downloadLink;
    protected String limitAmountGranted;
    protected String swift;
    protected String totalDebt;
    protected String statementId;
    protected LastMinimalAmountDueType minimalAmountDue;
    protected BalanceType closingValueDatedBalance;
    protected List<RateInfoType> rateInfo;
    protected List<TransactionHistoryType> transactionItem;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the closingActualBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingActualBalance() {
        return closingActualBalance;
    }

    /**
     * Sets the value of the closingActualBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingActualBalance(String value) {
        this.closingActualBalance = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the generationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationDate() {
        return generationDate;
    }

    /**
     * Sets the value of the generationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationDate(String value) {
        this.generationDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the interestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestDate() {
        return interestDate;
    }

    /**
     * Sets the value of the interestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestDate(String value) {
        this.interestDate = value;
    }

    /**
     * Gets the value of the openingActualBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningActualBalance() {
        return openingActualBalance;
    }

    /**
     * Sets the value of the openingActualBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningActualBalance(String value) {
        this.openingActualBalance = value;
    }

    /**
     * Gets the value of the penaltyInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyInterestRate() {
        return penaltyInterestRate;
    }

    /**
     * Sets the value of the penaltyInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyInterestRate(String value) {
        this.penaltyInterestRate = value;
    }

    /**
     * Gets the value of the previousEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousEndDate() {
        return previousEndDate;
    }

    /**
     * Sets the value of the previousEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousEndDate(String value) {
        this.previousEndDate = value;
    }

    /**
     * Gets the value of the interestRates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRates() {
        return interestRates;
    }

    /**
     * Sets the value of the interestRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRates(String value) {
        this.interestRates = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the downloadLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * Sets the value of the downloadLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadLink(String value) {
        this.downloadLink = value;
    }

    /**
     * Gets the value of the limitAmountGranted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitAmountGranted() {
        return limitAmountGranted;
    }

    /**
     * Sets the value of the limitAmountGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitAmountGranted(String value) {
        this.limitAmountGranted = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwift() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwift(String value) {
        this.swift = value;
    }

    /**
     * Gets the value of the totalDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDebt() {
        return totalDebt;
    }

    /**
     * Sets the value of the totalDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDebt(String value) {
        this.totalDebt = value;
    }

    /**
     * Gets the value of the statementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementId(String value) {
        this.statementId = value;
    }

    /**
     * Gets the value of the minimalAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link LastMinimalAmountDueType }
     *     
     */
    public LastMinimalAmountDueType getMinimalAmountDue() {
        return minimalAmountDue;
    }

    /**
     * Sets the value of the minimalAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastMinimalAmountDueType }
     *     
     */
    public void setMinimalAmountDue(LastMinimalAmountDueType value) {
        this.minimalAmountDue = value;
    }

    /**
     * Gets the value of the closingValueDatedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType }
     *     
     */
    public BalanceType getClosingValueDatedBalance() {
        return closingValueDatedBalance;
    }

    /**
     * Sets the value of the closingValueDatedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType }
     *     
     */
    public void setClosingValueDatedBalance(BalanceType value) {
        this.closingValueDatedBalance = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateInfoType }
     * 
     * 
     */
    public List<RateInfoType> getRateInfo() {
        if (rateInfo == null) {
            rateInfo = new ArrayList<RateInfoType>();
        }
        return this.rateInfo;
    }

    /**
     * Gets the value of the transactionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionHistoryType }
     * 
     * 
     */
    public List<TransactionHistoryType> getTransactionItem() {
        if (transactionItem == null) {
            transactionItem = new ArrayList<TransactionHistoryType>();
        }
        return this.transactionItem;
    }

}
