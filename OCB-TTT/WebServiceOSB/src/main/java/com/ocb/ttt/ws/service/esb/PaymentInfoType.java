
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountBankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billSourceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCardAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eWalletPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCodeItemNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentItemStudentFee" type="{bian.com.vn}TuitionFeePaymentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addtionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financeInsurance" type="{bian.com.vn}FinanceInsuranceBillType" minOccurs="0"/>
 *         &lt;element name="financeInsurancePaymentInfo" type="{bian.com.vn}FinanceInsurancePaymentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="investorInfo" type="{bian.com.vn}InvestorInfoType" minOccurs="0"/>
 *         &lt;element name="investorAccountInfo" type="{bian.com.vn}InvestorAccountInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exRateValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telcoProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "bookingDate",
    "debitAccount",
    "creditAccount",
    "customerId",
    "originalCustomerId",
    "cRefNum",
    "amount",
    "currency",
    "sender",
    "recipient",
    "remarks",
    "ebUserId",
    "creditAccountBankCode",
    "creditAccountBankBranchCode",
    "creditAccountProvinceCode",
    "clearingNetwork",
    "serviceCode",
    "serviceProviderCode",
    "billCode",
    "qty",
    "billSourceData",
    "mobilePhoneNumber",
    "parValue",
    "studentCode",
    "universityCode",
    "courseType",
    "sourceData",
    "partnerId",
    "recipientCardAccount",
    "recipientCardName",
    "recipientCardNumber",
    "eWalletPhoneNumber",
    "billCodeItemNo",
    "paymentCode",
    "paymentItemStudentFee",
    "promotionCode",
    "realAmount",
    "addtionalData",
    "financeInsurance",
    "financeInsurancePaymentInfo",
    "investorInfo",
    "investorAccountInfo",
    "transDate",
    "exchangedAmount",
    "exchangedCurrency",
    "exRateValue",
    "studentName",
    "telcoProvider",
    "discountAmount",
    "departmentName"
})
public class PaymentInfoType {

    protected String bookingDate;
    protected String debitAccount;
    protected String creditAccount;
    protected String customerId;
    protected String originalCustomerId;
    protected String cRefNum;
    protected String amount;
    protected String currency;
    protected String sender;
    protected String recipient;
    protected String remarks;
    protected String ebUserId;
    protected String creditAccountBankCode;
    protected String creditAccountBankBranchCode;
    protected String creditAccountProvinceCode;
    protected String clearingNetwork;
    protected String serviceCode;
    protected String serviceProviderCode;
    protected String billCode;
    protected String qty;
    protected String billSourceData;
    protected String mobilePhoneNumber;
    protected String parValue;
    protected String studentCode;
    protected String universityCode;
    protected String courseType;
    protected String sourceData;
    protected String partnerId;
    protected String recipientCardAccount;
    protected String recipientCardName;
    protected String recipientCardNumber;
    protected String eWalletPhoneNumber;
    protected List<String> billCodeItemNo;
    protected List<String> paymentCode;
    protected List<TuitionFeePaymentInfoType> paymentItemStudentFee;
    protected String promotionCode;
    protected String realAmount;
    protected String addtionalData;
    protected FinanceInsuranceBillType financeInsurance;
    protected List<FinanceInsurancePaymentInfoType> financeInsurancePaymentInfo;
    protected InvestorInfoType investorInfo;
    protected List<InvestorAccountInfoType> investorAccountInfo;
    protected String transDate;
    protected String exchangedAmount;
    protected String exchangedCurrency;
    protected String exRateValue;
    protected String studentName;
    protected String telcoProvider;
    protected String discountAmount;
    protected String departmentName;

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccount(String value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the originalCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCustomerId() {
        return originalCustomerId;
    }

    /**
     * Sets the value of the originalCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCustomerId(String value) {
        this.originalCustomerId = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the ebUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbUserId() {
        return ebUserId;
    }

    /**
     * Sets the value of the ebUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbUserId(String value) {
        this.ebUserId = value;
    }

    /**
     * Gets the value of the creditAccountBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountBankCode() {
        return creditAccountBankCode;
    }

    /**
     * Sets the value of the creditAccountBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountBankCode(String value) {
        this.creditAccountBankCode = value;
    }

    /**
     * Gets the value of the creditAccountBankBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountBankBranchCode() {
        return creditAccountBankBranchCode;
    }

    /**
     * Sets the value of the creditAccountBankBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountBankBranchCode(String value) {
        this.creditAccountBankBranchCode = value;
    }

    /**
     * Gets the value of the creditAccountProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountProvinceCode() {
        return creditAccountProvinceCode;
    }

    /**
     * Sets the value of the creditAccountProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountProvinceCode(String value) {
        this.creditAccountProvinceCode = value;
    }

    /**
     * Gets the value of the clearingNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingNetwork() {
        return clearingNetwork;
    }

    /**
     * Sets the value of the clearingNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingNetwork(String value) {
        this.clearingNetwork = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceProviderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderCode() {
        return serviceProviderCode;
    }

    /**
     * Sets the value of the serviceProviderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderCode(String value) {
        this.serviceProviderCode = value;
    }

    /**
     * Gets the value of the billCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * Sets the value of the billCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCode(String value) {
        this.billCode = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the billSourceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSourceData() {
        return billSourceData;
    }

    /**
     * Sets the value of the billSourceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSourceData(String value) {
        this.billSourceData = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the parValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParValue() {
        return parValue;
    }

    /**
     * Sets the value of the parValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParValue(String value) {
        this.parValue = value;
    }

    /**
     * Gets the value of the studentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * Sets the value of the studentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCode(String value) {
        this.studentCode = value;
    }

    /**
     * Gets the value of the universityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCode() {
        return universityCode;
    }

    /**
     * Sets the value of the universityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCode(String value) {
        this.universityCode = value;
    }

    /**
     * Gets the value of the courseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * Sets the value of the courseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseType(String value) {
        this.courseType = value;
    }

    /**
     * Gets the value of the sourceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceData() {
        return sourceData;
    }

    /**
     * Sets the value of the sourceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceData(String value) {
        this.sourceData = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the recipientCardAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCardAccount() {
        return recipientCardAccount;
    }

    /**
     * Sets the value of the recipientCardAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCardAccount(String value) {
        this.recipientCardAccount = value;
    }

    /**
     * Gets the value of the recipientCardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCardName() {
        return recipientCardName;
    }

    /**
     * Sets the value of the recipientCardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCardName(String value) {
        this.recipientCardName = value;
    }

    /**
     * Gets the value of the recipientCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCardNumber() {
        return recipientCardNumber;
    }

    /**
     * Sets the value of the recipientCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCardNumber(String value) {
        this.recipientCardNumber = value;
    }

    /**
     * Gets the value of the eWalletPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWalletPhoneNumber() {
        return eWalletPhoneNumber;
    }

    /**
     * Sets the value of the eWalletPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWalletPhoneNumber(String value) {
        this.eWalletPhoneNumber = value;
    }

    /**
     * Gets the value of the billCodeItemNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billCodeItemNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCodeItemNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillCodeItemNo() {
        if (billCodeItemNo == null) {
            billCodeItemNo = new ArrayList<String>();
        }
        return this.billCodeItemNo;
    }

    /**
     * Gets the value of the paymentCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaymentCode() {
        if (paymentCode == null) {
            paymentCode = new ArrayList<String>();
        }
        return this.paymentCode;
    }

    /**
     * Gets the value of the paymentItemStudentFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentItemStudentFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentItemStudentFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TuitionFeePaymentInfoType }
     * 
     * 
     */
    public List<TuitionFeePaymentInfoType> getPaymentItemStudentFee() {
        if (paymentItemStudentFee == null) {
            paymentItemStudentFee = new ArrayList<TuitionFeePaymentInfoType>();
        }
        return this.paymentItemStudentFee;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the realAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealAmount() {
        return realAmount;
    }

    /**
     * Sets the value of the realAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealAmount(String value) {
        this.realAmount = value;
    }

    /**
     * Gets the value of the addtionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtionalData() {
        return addtionalData;
    }

    /**
     * Sets the value of the addtionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtionalData(String value) {
        this.addtionalData = value;
    }

    /**
     * Gets the value of the financeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceInsuranceBillType }
     *     
     */
    public FinanceInsuranceBillType getFinanceInsurance() {
        return financeInsurance;
    }

    /**
     * Sets the value of the financeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceInsuranceBillType }
     *     
     */
    public void setFinanceInsurance(FinanceInsuranceBillType value) {
        this.financeInsurance = value;
    }

    /**
     * Gets the value of the financeInsurancePaymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financeInsurancePaymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinanceInsurancePaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinanceInsurancePaymentInfoType }
     * 
     * 
     */
    public List<FinanceInsurancePaymentInfoType> getFinanceInsurancePaymentInfo() {
        if (financeInsurancePaymentInfo == null) {
            financeInsurancePaymentInfo = new ArrayList<FinanceInsurancePaymentInfoType>();
        }
        return this.financeInsurancePaymentInfo;
    }

    /**
     * Gets the value of the investorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorInfoType }
     *     
     */
    public InvestorInfoType getInvestorInfo() {
        return investorInfo;
    }

    /**
     * Sets the value of the investorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorInfoType }
     *     
     */
    public void setInvestorInfo(InvestorInfoType value) {
        this.investorInfo = value;
    }

    /**
     * Gets the value of the investorAccountInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investorAccountInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestorAccountInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorAccountInfoType }
     * 
     * 
     */
    public List<InvestorAccountInfoType> getInvestorAccountInfo() {
        if (investorAccountInfo == null) {
            investorAccountInfo = new ArrayList<InvestorAccountInfoType>();
        }
        return this.investorAccountInfo;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the exchangedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangedAmount() {
        return exchangedAmount;
    }

    /**
     * Sets the value of the exchangedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangedAmount(String value) {
        this.exchangedAmount = value;
    }

    /**
     * Gets the value of the exchangedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangedCurrency() {
        return exchangedCurrency;
    }

    /**
     * Sets the value of the exchangedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangedCurrency(String value) {
        this.exchangedCurrency = value;
    }

    /**
     * Gets the value of the exRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExRateValue() {
        return exRateValue;
    }

    /**
     * Sets the value of the exRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExRateValue(String value) {
        this.exRateValue = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the telcoProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelcoProvider() {
        return telcoProvider;
    }

    /**
     * Sets the value of the telcoProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelcoProvider(String value) {
        this.telcoProvider = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

}
