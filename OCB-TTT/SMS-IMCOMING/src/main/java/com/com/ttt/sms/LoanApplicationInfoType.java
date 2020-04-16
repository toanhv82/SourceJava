
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanApplicationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanApplicationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvalSpecialistName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanProposedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanApprovalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanDisbursementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanSubProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanApplicationInfoType", propOrder = {
    "loanRefId",
    "branchCode",
    "branchName",
    "accountOfficerName",
    "custName",
    "custMobileNo",
    "custIDNo",
    "custAddress",
    "loanAmount",
    "approvalOfficerName",
    "approvalSpecialistName",
    "loanProductName",
    "loanProposedAmount",
    "loanApprovalAmount",
    "loanStatus",
    "loanDisbursementStatus",
    "loanCurrency",
    "loanSubProduct",
    "loanCategory",
    "loanPartnerID"
})
public class LoanApplicationInfoType {

    protected String loanRefId;
    protected String branchCode;
    protected String branchName;
    protected String accountOfficerName;
    protected String custName;
    protected String custMobileNo;
    protected String custIDNo;
    protected String custAddress;
    protected String loanAmount;
    protected String approvalOfficerName;
    protected String approvalSpecialistName;
    protected String loanProductName;
    protected String loanProposedAmount;
    protected String loanApprovalAmount;
    protected String loanStatus;
    protected String loanDisbursementStatus;
    protected String loanCurrency;
    protected String loanSubProduct;
    protected String loanCategory;
    protected String loanPartnerID;

    /**
     * Gets the value of the loanRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanRefId() {
        return loanRefId;
    }

    /**
     * Sets the value of the loanRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanRefId(String value) {
        this.loanRefId = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
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
     * Gets the value of the accountOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficerName() {
        return accountOfficerName;
    }

    /**
     * Sets the value of the accountOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficerName(String value) {
        this.accountOfficerName = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the custMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMobileNo() {
        return custMobileNo;
    }

    /**
     * Sets the value of the custMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMobileNo(String value) {
        this.custMobileNo = value;
    }

    /**
     * Gets the value of the custIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIDNo() {
        return custIDNo;
    }

    /**
     * Sets the value of the custIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIDNo(String value) {
        this.custIDNo = value;
    }

    /**
     * Gets the value of the custAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * Sets the value of the custAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAddress(String value) {
        this.custAddress = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmount(String value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the approvalOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalOfficerName() {
        return approvalOfficerName;
    }

    /**
     * Sets the value of the approvalOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalOfficerName(String value) {
        this.approvalOfficerName = value;
    }

    /**
     * Gets the value of the approvalSpecialistName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalSpecialistName() {
        return approvalSpecialistName;
    }

    /**
     * Sets the value of the approvalSpecialistName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalSpecialistName(String value) {
        this.approvalSpecialistName = value;
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
     * Gets the value of the loanProposedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProposedAmount() {
        return loanProposedAmount;
    }

    /**
     * Sets the value of the loanProposedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProposedAmount(String value) {
        this.loanProposedAmount = value;
    }

    /**
     * Gets the value of the loanApprovalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanApprovalAmount() {
        return loanApprovalAmount;
    }

    /**
     * Sets the value of the loanApprovalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanApprovalAmount(String value) {
        this.loanApprovalAmount = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

    /**
     * Gets the value of the loanDisbursementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanDisbursementStatus() {
        return loanDisbursementStatus;
    }

    /**
     * Sets the value of the loanDisbursementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanDisbursementStatus(String value) {
        this.loanDisbursementStatus = value;
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
     * Gets the value of the loanSubProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSubProduct() {
        return loanSubProduct;
    }

    /**
     * Sets the value of the loanSubProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSubProduct(String value) {
        this.loanSubProduct = value;
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
     * Gets the value of the loanPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPartnerID() {
        return loanPartnerID;
    }

    /**
     * Sets the value of the loanPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPartnerID(String value) {
        this.loanPartnerID = value;
    }

}
