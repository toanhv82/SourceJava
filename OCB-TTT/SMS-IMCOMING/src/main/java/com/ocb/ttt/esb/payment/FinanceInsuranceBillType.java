
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinanceInsuranceBillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinanceInsuranceBillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBirthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerJob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLegalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerResponsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transIdConfirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beneficiaryPerson" type="{bian.com.vn}PersonalInfoType" minOccurs="0"/>
 *         &lt;element name="insuredPerson" type="{bian.com.vn}PersonalInfoType" minOccurs="0"/>
 *         &lt;element name="disciplinary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRelationshipInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transIdPartnerConfirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relativeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mortalityClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assuredPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalSumAssured" type="{bian.com.vn}TotalSumAssuredType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premiumCalculation" type="{bian.com.vn}PremiumCalculationType" minOccurs="0"/>
 *         &lt;element name="uploadFile" type="{bian.com.vn}UploadFileType" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partner" type="{bian.com.vn}PartnerType" minOccurs="0"/>
 *         &lt;element name="applicationForm" type="{bian.com.vn}ApplicationFormType" minOccurs="0"/>
 *         &lt;element name="applicationFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uwQuestion" type="{bian.com.vn}UwQuestionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productRiderList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinanceInsuranceBillType", propOrder = {
    "customerName",
    "customerId",
    "address",
    "phoneNumber",
    "customerEmail",
    "customerBirthDay",
    "customerGender",
    "customerAddress",
    "customerCity",
    "customerJob",
    "customerLegalId",
    "customerRelationship",
    "customerResponsibility",
    "amount",
    "productType",
    "packageType",
    "feeType",
    "groupType",
    "nationalId",
    "fromDate",
    "toDate",
    "numberInsured",
    "totalAmount",
    "transIdConfirm",
    "areaCode",
    "beneficiaryPerson",
    "insuredPerson",
    "disciplinary",
    "customerRelationshipInsured",
    "transIdPartnerConfirm",
    "relativeId",
    "mortalityClass",
    "assuredPackage",
    "policyTerm",
    "premTerm",
    "billingFrequency",
    "totalSumAssured",
    "premiumCalculation",
    "uploadFile",
    "customerType",
    "paymentStatus",
    "partner",
    "applicationForm",
    "applicationFormId",
    "applicationCode",
    "uwQuestion",
    "productRiderList"
})
public class FinanceInsuranceBillType {

    protected String customerName;
    protected String customerId;
    protected String address;
    protected String phoneNumber;
    protected String customerEmail;
    protected String customerBirthDay;
    protected String customerGender;
    protected String customerAddress;
    protected String customerCity;
    protected String customerJob;
    protected String customerLegalId;
    protected String customerRelationship;
    protected String customerResponsibility;
    protected String amount;
    protected String productType;
    protected String packageType;
    protected String feeType;
    protected String groupType;
    protected String nationalId;
    protected String fromDate;
    protected String toDate;
    protected String numberInsured;
    protected String totalAmount;
    protected String transIdConfirm;
    protected String areaCode;
    protected PersonalInfoType beneficiaryPerson;
    protected PersonalInfoType insuredPerson;
    protected String disciplinary;
    protected String customerRelationshipInsured;
    protected String transIdPartnerConfirm;
    protected String relativeId;
    protected String mortalityClass;
    protected String assuredPackage;
    protected String policyTerm;
    protected String premTerm;
    protected String billingFrequency;
    protected List<TotalSumAssuredType> totalSumAssured;
    protected PremiumCalculationType premiumCalculation;
    protected UploadFileType uploadFile;
    protected String customerType;
    protected String paymentStatus;
    protected PartnerType partner;
    protected ApplicationFormType applicationForm;
    protected String applicationFormId;
    protected String applicationCode;
    protected List<UwQuestionType> uwQuestion;
    protected List<String> productRiderList;

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerBirthDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBirthDay() {
        return customerBirthDay;
    }

    /**
     * Sets the value of the customerBirthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBirthDay(String value) {
        this.customerBirthDay = value;
    }

    /**
     * Gets the value of the customerGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * Sets the value of the customerGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGender(String value) {
        this.customerGender = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Gets the value of the customerJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerJob() {
        return customerJob;
    }

    /**
     * Sets the value of the customerJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerJob(String value) {
        this.customerJob = value;
    }

    /**
     * Gets the value of the customerLegalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLegalId() {
        return customerLegalId;
    }

    /**
     * Sets the value of the customerLegalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLegalId(String value) {
        this.customerLegalId = value;
    }

    /**
     * Gets the value of the customerRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRelationship() {
        return customerRelationship;
    }

    /**
     * Sets the value of the customerRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRelationship(String value) {
        this.customerRelationship = value;
    }

    /**
     * Gets the value of the customerResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerResponsibility() {
        return customerResponsibility;
    }

    /**
     * Sets the value of the customerResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerResponsibility(String value) {
        this.customerResponsibility = value;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the numberInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInsured() {
        return numberInsured;
    }

    /**
     * Sets the value of the numberInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInsured(String value) {
        this.numberInsured = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the transIdConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransIdConfirm() {
        return transIdConfirm;
    }

    /**
     * Sets the value of the transIdConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransIdConfirm(String value) {
        this.transIdConfirm = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the beneficiaryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoType }
     *     
     */
    public PersonalInfoType getBeneficiaryPerson() {
        return beneficiaryPerson;
    }

    /**
     * Sets the value of the beneficiaryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoType }
     *     
     */
    public void setBeneficiaryPerson(PersonalInfoType value) {
        this.beneficiaryPerson = value;
    }

    /**
     * Gets the value of the insuredPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoType }
     *     
     */
    public PersonalInfoType getInsuredPerson() {
        return insuredPerson;
    }

    /**
     * Sets the value of the insuredPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoType }
     *     
     */
    public void setInsuredPerson(PersonalInfoType value) {
        this.insuredPerson = value;
    }

    /**
     * Gets the value of the disciplinary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinary() {
        return disciplinary;
    }

    /**
     * Sets the value of the disciplinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinary(String value) {
        this.disciplinary = value;
    }

    /**
     * Gets the value of the customerRelationshipInsured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRelationshipInsured() {
        return customerRelationshipInsured;
    }

    /**
     * Sets the value of the customerRelationshipInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRelationshipInsured(String value) {
        this.customerRelationshipInsured = value;
    }

    /**
     * Gets the value of the transIdPartnerConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransIdPartnerConfirm() {
        return transIdPartnerConfirm;
    }

    /**
     * Sets the value of the transIdPartnerConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransIdPartnerConfirm(String value) {
        this.transIdPartnerConfirm = value;
    }

    /**
     * Gets the value of the relativeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeId() {
        return relativeId;
    }

    /**
     * Sets the value of the relativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeId(String value) {
        this.relativeId = value;
    }

    /**
     * Gets the value of the mortalityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortalityClass() {
        return mortalityClass;
    }

    /**
     * Sets the value of the mortalityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortalityClass(String value) {
        this.mortalityClass = value;
    }

    /**
     * Gets the value of the assuredPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssuredPackage() {
        return assuredPackage;
    }

    /**
     * Sets the value of the assuredPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssuredPackage(String value) {
        this.assuredPackage = value;
    }

    /**
     * Gets the value of the policyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTerm() {
        return policyTerm;
    }

    /**
     * Sets the value of the policyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyTerm(String value) {
        this.policyTerm = value;
    }

    /**
     * Gets the value of the premTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremTerm() {
        return premTerm;
    }

    /**
     * Sets the value of the premTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremTerm(String value) {
        this.premTerm = value;
    }

    /**
     * Gets the value of the billingFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Sets the value of the billingFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingFrequency(String value) {
        this.billingFrequency = value;
    }

    /**
     * Gets the value of the totalSumAssured property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalSumAssured property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalSumAssured().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalSumAssuredType }
     * 
     * 
     */
    public List<TotalSumAssuredType> getTotalSumAssured() {
        if (totalSumAssured == null) {
            totalSumAssured = new ArrayList<TotalSumAssuredType>();
        }
        return this.totalSumAssured;
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
     * Gets the value of the uploadFile property.
     * 
     * @return
     *     possible object is
     *     {@link UploadFileType }
     *     
     */
    public UploadFileType getUploadFile() {
        return uploadFile;
    }

    /**
     * Sets the value of the uploadFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadFileType }
     *     
     */
    public void setUploadFile(UploadFileType value) {
        this.uploadFile = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerType }
     *     
     */
    public PartnerType getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerType }
     *     
     */
    public void setPartner(PartnerType value) {
        this.partner = value;
    }

    /**
     * Gets the value of the applicationForm property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationFormType }
     *     
     */
    public ApplicationFormType getApplicationForm() {
        return applicationForm;
    }

    /**
     * Sets the value of the applicationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationFormType }
     *     
     */
    public void setApplicationForm(ApplicationFormType value) {
        this.applicationForm = value;
    }

    /**
     * Gets the value of the applicationFormId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationFormId() {
        return applicationFormId;
    }

    /**
     * Sets the value of the applicationFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationFormId(String value) {
        this.applicationFormId = value;
    }

    /**
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
    }

    /**
     * Gets the value of the uwQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uwQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUwQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UwQuestionType }
     * 
     * 
     */
    public List<UwQuestionType> getUwQuestion() {
        if (uwQuestion == null) {
            uwQuestion = new ArrayList<UwQuestionType>();
        }
        return this.uwQuestion;
    }

    /**
     * Gets the value of the productRiderList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRiderList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRiderList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductRiderList() {
        if (productRiderList == null) {
            productRiderList = new ArrayList<String>();
        }
        return this.productRiderList;
    }

}
