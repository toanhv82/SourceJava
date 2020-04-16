
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="customerInfo" type="{bian.com.vn}CustomerInfoType" minOccurs="0"/>
 *         &lt;element name="loanAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceEQV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInitialBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanOutstandingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanEffectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanMaturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPrincipalPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPrincipalDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInterestPaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPernalPrinDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPernalIntDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanDisbursmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInterestDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanContractValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanContractNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanFirstDisbursmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInterestAccrual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanContractDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanFlexAgreementNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanFlexProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNextRepaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanNextRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanOutstandingInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanOutstandingPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPrincipalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanSubProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanTotalAmountDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanTotalLPFDue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanOverdueCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanProductOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanInsuranceFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanTotalInstallment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPaidInstallments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staff" type="{bian.com.vn}StaffType" minOccurs="0"/>
 *         &lt;element name="delegation" type="{bian.com.vn}DelegationType" minOccurs="0"/>
 *         &lt;element name="loanOfferRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overduePR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overduePEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountInfoType", propOrder = {
    "cifInfo",
    "customerInfo",
    "loanAccountNum",
    "accountBalanceEQV",
    "loanInitialBalance",
    "loanProductCode",
    "loanProductName",
    "loanOutstandingBalance",
    "loanInterestRate",
    "loanEffectDate",
    "loanMaturityDate",
    "loanCurrency",
    "loanBranchCode",
    "loanPrincipalPaid",
    "loanPrincipalDue",
    "loanInterestPaid",
    "loanPernalPrinDue",
    "loanPernalIntDue",
    "loanDisbursmentAmount",
    "loanInterestDue",
    "loanContract",
    "loanLimit",
    "loanContractValue",
    "loanContractNotes",
    "loanFirstDisbursmentDate",
    "loanInterestAccrual",
    "loanCategory",
    "loanContractDate",
    "loanFlexAgreementNo",
    "loanFlexProductId",
    "loanPurpose",
    "loanNextRepaymentAmount",
    "loanNextRepaymentDate",
    "loanOutstandingInterest",
    "loanOutstandingPrincipal",
    "loanPrincipalAmount",
    "loanSubProductCode",
    "loanTotalAmountDue",
    "loanTotalLPFDue",
    "loanValueDate",
    "loanOverdueCurrency",
    "loanProductOwner",
    "loanInsuranceFeeAmount",
    "loanTotalInstallment",
    "loanPaidInstallments",
    "staff",
    "delegation",
    "loanOfferRatio",
    "overduePR",
    "overdueIN",
    "overduePEPS"
})
public class LoanAccountInfoType {

    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected CustomerInfoType customerInfo;
    protected String loanAccountNum;
    protected String accountBalanceEQV;
    protected String loanInitialBalance;
    protected String loanProductCode;
    protected String loanProductName;
    protected String loanOutstandingBalance;
    protected String loanInterestRate;
    protected String loanEffectDate;
    protected String loanMaturityDate;
    protected String loanCurrency;
    protected String loanBranchCode;
    protected String loanPrincipalPaid;
    protected String loanPrincipalDue;
    protected String loanInterestPaid;
    protected String loanPernalPrinDue;
    protected String loanPernalIntDue;
    protected String loanDisbursmentAmount;
    protected String loanInterestDue;
    protected String loanContract;
    protected String loanLimit;
    protected String loanContractValue;
    protected String loanContractNotes;
    protected String loanFirstDisbursmentDate;
    protected String loanInterestAccrual;
    protected String loanCategory;
    protected String loanContractDate;
    protected String loanFlexAgreementNo;
    protected String loanFlexProductId;
    protected String loanPurpose;
    protected String loanNextRepaymentAmount;
    protected String loanNextRepaymentDate;
    protected String loanOutstandingInterest;
    protected String loanOutstandingPrincipal;
    protected String loanPrincipalAmount;
    protected String loanSubProductCode;
    protected String loanTotalAmountDue;
    protected String loanTotalLPFDue;
    protected String loanValueDate;
    protected String loanOverdueCurrency;
    protected String loanProductOwner;
    protected String loanInsuranceFeeAmount;
    protected String loanTotalInstallment;
    protected String loanPaidInstallments;
    protected StaffType staff;
    protected DelegationType delegation;
    protected String loanOfferRatio;
    protected String overduePR;
    protected String overdueIN;
    protected String overduePEPS;

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
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the loanAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAccountNum() {
        return loanAccountNum;
    }

    /**
     * Sets the value of the loanAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAccountNum(String value) {
        this.loanAccountNum = value;
    }

    /**
     * Gets the value of the accountBalanceEQV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceEQV() {
        return accountBalanceEQV;
    }

    /**
     * Sets the value of the accountBalanceEQV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceEQV(String value) {
        this.accountBalanceEQV = value;
    }

    /**
     * Gets the value of the loanInitialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInitialBalance() {
        return loanInitialBalance;
    }

    /**
     * Sets the value of the loanInitialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInitialBalance(String value) {
        this.loanInitialBalance = value;
    }

    /**
     * Gets the value of the loanProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProductCode() {
        return loanProductCode;
    }

    /**
     * Sets the value of the loanProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProductCode(String value) {
        this.loanProductCode = value;
    }

    /**
     * Gets the value of the loanProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProductName() {
        return loanProductName;
    }

    /**
     * Sets the value of the loanProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProductName(String value) {
        this.loanProductName = value;
    }

    /**
     * Gets the value of the loanOutstandingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOutstandingBalance() {
        return loanOutstandingBalance;
    }

    /**
     * Sets the value of the loanOutstandingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOutstandingBalance(String value) {
        this.loanOutstandingBalance = value;
    }

    /**
     * Gets the value of the loanInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInterestRate() {
        return loanInterestRate;
    }

    /**
     * Sets the value of the loanInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInterestRate(String value) {
        this.loanInterestRate = value;
    }

    /**
     * Gets the value of the loanEffectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanEffectDate() {
        return loanEffectDate;
    }

    /**
     * Sets the value of the loanEffectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanEffectDate(String value) {
        this.loanEffectDate = value;
    }

    /**
     * Gets the value of the loanMaturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanMaturityDate() {
        return loanMaturityDate;
    }

    /**
     * Sets the value of the loanMaturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanMaturityDate(String value) {
        this.loanMaturityDate = value;
    }

    /**
     * Gets the value of the loanCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCurrency() {
        return loanCurrency;
    }

    /**
     * Sets the value of the loanCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCurrency(String value) {
        this.loanCurrency = value;
    }

    /**
     * Gets the value of the loanBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanBranchCode() {
        return loanBranchCode;
    }

    /**
     * Sets the value of the loanBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanBranchCode(String value) {
        this.loanBranchCode = value;
    }

    /**
     * Gets the value of the loanPrincipalPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPrincipalPaid() {
        return loanPrincipalPaid;
    }

    /**
     * Sets the value of the loanPrincipalPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPrincipalPaid(String value) {
        this.loanPrincipalPaid = value;
    }

    /**
     * Gets the value of the loanPrincipalDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPrincipalDue() {
        return loanPrincipalDue;
    }

    /**
     * Sets the value of the loanPrincipalDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPrincipalDue(String value) {
        this.loanPrincipalDue = value;
    }

    /**
     * Gets the value of the loanInterestPaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInterestPaid() {
        return loanInterestPaid;
    }

    /**
     * Sets the value of the loanInterestPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInterestPaid(String value) {
        this.loanInterestPaid = value;
    }

    /**
     * Gets the value of the loanPernalPrinDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPernalPrinDue() {
        return loanPernalPrinDue;
    }

    /**
     * Sets the value of the loanPernalPrinDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPernalPrinDue(String value) {
        this.loanPernalPrinDue = value;
    }

    /**
     * Gets the value of the loanPernalIntDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPernalIntDue() {
        return loanPernalIntDue;
    }

    /**
     * Sets the value of the loanPernalIntDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPernalIntDue(String value) {
        this.loanPernalIntDue = value;
    }

    /**
     * Gets the value of the loanDisbursmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDisbursmentAmount() {
        return loanDisbursmentAmount;
    }

    /**
     * Sets the value of the loanDisbursmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDisbursmentAmount(String value) {
        this.loanDisbursmentAmount = value;
    }

    /**
     * Gets the value of the loanInterestDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInterestDue() {
        return loanInterestDue;
    }

    /**
     * Sets the value of the loanInterestDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInterestDue(String value) {
        this.loanInterestDue = value;
    }

    /**
     * Gets the value of the loanContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContract() {
        return loanContract;
    }

    /**
     * Sets the value of the loanContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContract(String value) {
        this.loanContract = value;
    }

    /**
     * Gets the value of the loanLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanLimit() {
        return loanLimit;
    }

    /**
     * Sets the value of the loanLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanLimit(String value) {
        this.loanLimit = value;
    }

    /**
     * Gets the value of the loanContractValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContractValue() {
        return loanContractValue;
    }

    /**
     * Sets the value of the loanContractValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContractValue(String value) {
        this.loanContractValue = value;
    }

    /**
     * Gets the value of the loanContractNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContractNotes() {
        return loanContractNotes;
    }

    /**
     * Sets the value of the loanContractNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContractNotes(String value) {
        this.loanContractNotes = value;
    }

    /**
     * Gets the value of the loanFirstDisbursmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanFirstDisbursmentDate() {
        return loanFirstDisbursmentDate;
    }

    /**
     * Sets the value of the loanFirstDisbursmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanFirstDisbursmentDate(String value) {
        this.loanFirstDisbursmentDate = value;
    }

    /**
     * Gets the value of the loanInterestAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInterestAccrual() {
        return loanInterestAccrual;
    }

    /**
     * Sets the value of the loanInterestAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInterestAccrual(String value) {
        this.loanInterestAccrual = value;
    }

    /**
     * Gets the value of the loanCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCategory() {
        return loanCategory;
    }

    /**
     * Sets the value of the loanCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCategory(String value) {
        this.loanCategory = value;
    }

    /**
     * Gets the value of the loanContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContractDate() {
        return loanContractDate;
    }

    /**
     * Sets the value of the loanContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContractDate(String value) {
        this.loanContractDate = value;
    }

    /**
     * Gets the value of the loanFlexAgreementNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanFlexAgreementNo() {
        return loanFlexAgreementNo;
    }

    /**
     * Sets the value of the loanFlexAgreementNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanFlexAgreementNo(String value) {
        this.loanFlexAgreementNo = value;
    }

    /**
     * Gets the value of the loanFlexProductId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanFlexProductId() {
        return loanFlexProductId;
    }

    /**
     * Sets the value of the loanFlexProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanFlexProductId(String value) {
        this.loanFlexProductId = value;
    }

    /**
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * Gets the value of the loanNextRepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNextRepaymentAmount() {
        return loanNextRepaymentAmount;
    }

    /**
     * Sets the value of the loanNextRepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNextRepaymentAmount(String value) {
        this.loanNextRepaymentAmount = value;
    }

    /**
     * Gets the value of the loanNextRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanNextRepaymentDate() {
        return loanNextRepaymentDate;
    }

    /**
     * Sets the value of the loanNextRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanNextRepaymentDate(String value) {
        this.loanNextRepaymentDate = value;
    }

    /**
     * Gets the value of the loanOutstandingInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOutstandingInterest() {
        return loanOutstandingInterest;
    }

    /**
     * Sets the value of the loanOutstandingInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOutstandingInterest(String value) {
        this.loanOutstandingInterest = value;
    }

    /**
     * Gets the value of the loanOutstandingPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOutstandingPrincipal() {
        return loanOutstandingPrincipal;
    }

    /**
     * Sets the value of the loanOutstandingPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOutstandingPrincipal(String value) {
        this.loanOutstandingPrincipal = value;
    }

    /**
     * Gets the value of the loanPrincipalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPrincipalAmount() {
        return loanPrincipalAmount;
    }

    /**
     * Sets the value of the loanPrincipalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPrincipalAmount(String value) {
        this.loanPrincipalAmount = value;
    }

    /**
     * Gets the value of the loanSubProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSubProductCode() {
        return loanSubProductCode;
    }

    /**
     * Sets the value of the loanSubProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSubProductCode(String value) {
        this.loanSubProductCode = value;
    }

    /**
     * Gets the value of the loanTotalAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTotalAmountDue() {
        return loanTotalAmountDue;
    }

    /**
     * Sets the value of the loanTotalAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTotalAmountDue(String value) {
        this.loanTotalAmountDue = value;
    }

    /**
     * Gets the value of the loanTotalLPFDue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTotalLPFDue() {
        return loanTotalLPFDue;
    }

    /**
     * Sets the value of the loanTotalLPFDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTotalLPFDue(String value) {
        this.loanTotalLPFDue = value;
    }

    /**
     * Gets the value of the loanValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanValueDate() {
        return loanValueDate;
    }

    /**
     * Sets the value of the loanValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanValueDate(String value) {
        this.loanValueDate = value;
    }

    /**
     * Gets the value of the loanOverdueCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOverdueCurrency() {
        return loanOverdueCurrency;
    }

    /**
     * Sets the value of the loanOverdueCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOverdueCurrency(String value) {
        this.loanOverdueCurrency = value;
    }

    /**
     * Gets the value of the loanProductOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProductOwner() {
        return loanProductOwner;
    }

    /**
     * Sets the value of the loanProductOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProductOwner(String value) {
        this.loanProductOwner = value;
    }

    /**
     * Gets the value of the loanInsuranceFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInsuranceFeeAmount() {
        return loanInsuranceFeeAmount;
    }

    /**
     * Sets the value of the loanInsuranceFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInsuranceFeeAmount(String value) {
        this.loanInsuranceFeeAmount = value;
    }

    /**
     * Gets the value of the loanTotalInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTotalInstallment() {
        return loanTotalInstallment;
    }

    /**
     * Sets the value of the loanTotalInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTotalInstallment(String value) {
        this.loanTotalInstallment = value;
    }

    /**
     * Gets the value of the loanPaidInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPaidInstallments() {
        return loanPaidInstallments;
    }

    /**
     * Sets the value of the loanPaidInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPaidInstallments(String value) {
        this.loanPaidInstallments = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link StaffType }
     *     
     */
    public StaffType getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffType }
     *     
     */
    public void setStaff(StaffType value) {
        this.staff = value;
    }

    /**
     * Gets the value of the delegation property.
     * 
     * @return
     *     possible object is
     *     {@link DelegationType }
     *     
     */
    public DelegationType getDelegation() {
        return delegation;
    }

    /**
     * Sets the value of the delegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegationType }
     *     
     */
    public void setDelegation(DelegationType value) {
        this.delegation = value;
    }

    /**
     * Gets the value of the loanOfferRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOfferRatio() {
        return loanOfferRatio;
    }

    /**
     * Sets the value of the loanOfferRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOfferRatio(String value) {
        this.loanOfferRatio = value;
    }

    /**
     * Gets the value of the overduePR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduePR() {
        return overduePR;
    }

    /**
     * Sets the value of the overduePR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduePR(String value) {
        this.overduePR = value;
    }

    /**
     * Gets the value of the overdueIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueIN() {
        return overdueIN;
    }

    /**
     * Sets the value of the overdueIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueIN(String value) {
        this.overdueIN = value;
    }

    /**
     * Gets the value of the overduePEPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduePEPS() {
        return overduePEPS;
    }

    /**
     * Sets the value of the overduePEPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduePEPS(String value) {
        this.overduePEPS = value;
    }

}
