
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerVIPType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manageStaffID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryMethod" type="{bian.com.vn}StatementDeliveryType" minOccurs="0"/>
 *         &lt;element name="customerAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOwnerShip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerDefinedIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monitoringResultRDto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobInfo" type="{bian.com.vn}JobInfoType" minOccurs="0"/>
 *         &lt;element name="IDInfo" type="{bian.com.vn}IDInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{bian.com.vn}ContactInfoType" minOccurs="0"/>
 *         &lt;element name="taxInfo" type="{bian.com.vn}TaxInfoType" minOccurs="0"/>
 *         &lt;element name="corporateInfo" type="{bian.com.vn}CorporateInfoType" minOccurs="0"/>
 *         &lt;element name="residentialAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="deliveryAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="permanentAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="ebankingInfo" type="{bian.com.vn}EbankingInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mnemonic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onlineService" type="{bian.com.vn}OnlineServiceType" minOccurs="0"/>
 *         &lt;element name="registerResult" type="{bian.com.vn}RegisterResultType" minOccurs="0"/>
 *         &lt;element name="accountOfficer" type="{bian.com.vn}AccountOfficerType" minOccurs="0"/>
 *         &lt;element name="custPkg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custPkgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custPkgPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custPkgPartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseInfo" type="{bian.com.vn}SpouseInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoType", propOrder = {
    "fullname",
    "birthDay",
    "gender",
    "customerVIPType",
    "manageStaffID",
    "rowOrder",
    "deliveryMethod",
    "customerAreaCode",
    "sector",
    "target",
    "birthPlace",
    "customerType",
    "operationStatus",
    "maritalStatus",
    "nationality",
    "branchCode",
    "productOwnerShip",
    "customerDefinedIcon",
    "customerSegment",
    "monitoringResultRDto",
    "operationAttributes",
    "branch",
    "jobInfo",
    "idInfo",
    "address",
    "contactInfo",
    "taxInfo",
    "corporateInfo",
    "residentialAddress",
    "deliveryAddress",
    "permanentAddress",
    "cifInfo",
    "ebankingInfo",
    "shortName",
    "mnemonic",
    "onlineService",
    "registerResult",
    "accountOfficer",
    "custPkg",
    "custPkgName",
    "custPkgPartner",
    "custPkgPartnerName",
    "displayName",
    "languageCode",
    "race",
    "customerId",
    "logMessage",
    "logUserID",
    "classLevel",
    "function",
    "spouseInfo"
})
public class CustomerInfoType {

    protected String fullname;
    protected String birthDay;
    protected String gender;
    protected String customerVIPType;
    protected String manageStaffID;
    protected String rowOrder;
    protected StatementDeliveryType deliveryMethod;
    protected String customerAreaCode;
    protected String sector;
    protected String target;
    protected String birthPlace;
    protected String customerType;
    protected String operationStatus;
    protected String maritalStatus;
    protected String nationality;
    protected String branchCode;
    protected String productOwnerShip;
    protected String customerDefinedIcon;
    protected String customerSegment;
    protected String monitoringResultRDto;
    protected String operationAttributes;
    protected String branch;
    protected JobInfoType jobInfo;
    @XmlElement(name = "IDInfo")
    protected List<IDInfoType> idInfo;
    protected AddressType address;
    protected ContactInfoType contactInfo;
    protected TaxInfoType taxInfo;
    protected CorporateInfoType corporateInfo;
    protected AddressType residentialAddress;
    protected AddressType deliveryAddress;
    protected AddressType permanentAddress;
    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected List<EbankingInfoType> ebankingInfo;
    protected String shortName;
    protected String mnemonic;
    protected OnlineServiceType onlineService;
    protected RegisterResultType registerResult;
    protected AccountOfficerType accountOfficer;
    protected String custPkg;
    protected String custPkgName;
    protected String custPkgPartner;
    protected String custPkgPartnerName;
    protected String displayName;
    protected String languageCode;
    protected String race;
    protected String customerId;
    protected String logMessage;
    protected String logUserID;
    protected String classLevel;
    protected String function;
    protected SpouseInfoType spouseInfo;

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the birthDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the value of the birthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDay(String value) {
        this.birthDay = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the customerVIPType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerVIPType() {
        return customerVIPType;
    }

    /**
     * Sets the value of the customerVIPType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerVIPType(String value) {
        this.customerVIPType = value;
    }

    /**
     * Gets the value of the manageStaffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageStaffID() {
        return manageStaffID;
    }

    /**
     * Sets the value of the manageStaffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageStaffID(String value) {
        this.manageStaffID = value;
    }

    /**
     * Gets the value of the rowOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowOrder() {
        return rowOrder;
    }

    /**
     * Sets the value of the rowOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowOrder(String value) {
        this.rowOrder = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDeliveryType }
     *     
     */
    public StatementDeliveryType getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDeliveryType }
     *     
     */
    public void setDeliveryMethod(StatementDeliveryType value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the customerAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAreaCode() {
        return customerAreaCode;
    }

    /**
     * Sets the value of the customerAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAreaCode(String value) {
        this.customerAreaCode = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
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
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
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
     * Gets the value of the productOwnerShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOwnerShip() {
        return productOwnerShip;
    }

    /**
     * Sets the value of the productOwnerShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOwnerShip(String value) {
        this.productOwnerShip = value;
    }

    /**
     * Gets the value of the customerDefinedIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDefinedIcon() {
        return customerDefinedIcon;
    }

    /**
     * Sets the value of the customerDefinedIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDefinedIcon(String value) {
        this.customerDefinedIcon = value;
    }

    /**
     * Gets the value of the customerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Sets the value of the customerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSegment(String value) {
        this.customerSegment = value;
    }

    /**
     * Gets the value of the monitoringResultRDto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringResultRDto() {
        return monitoringResultRDto;
    }

    /**
     * Sets the value of the monitoringResultRDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringResultRDto(String value) {
        this.monitoringResultRDto = value;
    }

    /**
     * Gets the value of the operationAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationAttributes() {
        return operationAttributes;
    }

    /**
     * Sets the value of the operationAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationAttributes(String value) {
        this.operationAttributes = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfoType }
     *     
     */
    public JobInfoType getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfoType }
     *     
     */
    public void setJobInfo(JobInfoType value) {
        this.jobInfo = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDInfoType }
     * 
     * 
     */
    public List<IDInfoType> getIDInfo() {
        if (idInfo == null) {
            idInfo = new ArrayList<IDInfoType>();
        }
        return this.idInfo;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfoType }
     *     
     */
    public TaxInfoType getTaxInfo() {
        return taxInfo;
    }

    /**
     * Sets the value of the taxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfoType }
     *     
     */
    public void setTaxInfo(TaxInfoType value) {
        this.taxInfo = value;
    }

    /**
     * Gets the value of the corporateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateInfoType }
     *     
     */
    public CorporateInfoType getCorporateInfo() {
        return corporateInfo;
    }

    /**
     * Sets the value of the corporateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateInfoType }
     *     
     */
    public void setCorporateInfo(CorporateInfoType value) {
        this.corporateInfo = value;
    }

    /**
     * Gets the value of the residentialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * Sets the value of the residentialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setResidentialAddress(AddressType value) {
        this.residentialAddress = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the permanentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPermanentAddress() {
        return permanentAddress;
    }

    /**
     * Sets the value of the permanentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPermanentAddress(AddressType value) {
        this.permanentAddress = value;
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
     * Gets the value of the ebankingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebankingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEbankingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EbankingInfoType }
     * 
     * 
     */
    public List<EbankingInfoType> getEbankingInfo() {
        if (ebankingInfo == null) {
            ebankingInfo = new ArrayList<EbankingInfoType>();
        }
        return this.ebankingInfo;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonic(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the onlineService property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineServiceType }
     *     
     */
    public OnlineServiceType getOnlineService() {
        return onlineService;
    }

    /**
     * Sets the value of the onlineService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineServiceType }
     *     
     */
    public void setOnlineService(OnlineServiceType value) {
        this.onlineService = value;
    }

    /**
     * Gets the value of the registerResult property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterResultType }
     *     
     */
    public RegisterResultType getRegisterResult() {
        return registerResult;
    }

    /**
     * Sets the value of the registerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterResultType }
     *     
     */
    public void setRegisterResult(RegisterResultType value) {
        this.registerResult = value;
    }

    /**
     * Gets the value of the accountOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOfficerType }
     *     
     */
    public AccountOfficerType getAccountOfficer() {
        return accountOfficer;
    }

    /**
     * Sets the value of the accountOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOfficerType }
     *     
     */
    public void setAccountOfficer(AccountOfficerType value) {
        this.accountOfficer = value;
    }

    /**
     * Gets the value of the custPkg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPkg() {
        return custPkg;
    }

    /**
     * Sets the value of the custPkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPkg(String value) {
        this.custPkg = value;
    }

    /**
     * Gets the value of the custPkgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPkgName() {
        return custPkgName;
    }

    /**
     * Sets the value of the custPkgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPkgName(String value) {
        this.custPkgName = value;
    }

    /**
     * Gets the value of the custPkgPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPkgPartner() {
        return custPkgPartner;
    }

    /**
     * Sets the value of the custPkgPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPkgPartner(String value) {
        this.custPkgPartner = value;
    }

    /**
     * Gets the value of the custPkgPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPkgPartnerName() {
        return custPkgPartnerName;
    }

    /**
     * Sets the value of the custPkgPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPkgPartnerName(String value) {
        this.custPkgPartnerName = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
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
     * Gets the value of the logMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * Sets the value of the logMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogMessage(String value) {
        this.logMessage = value;
    }

    /**
     * Gets the value of the logUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogUserID() {
        return logUserID;
    }

    /**
     * Sets the value of the logUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogUserID(String value) {
        this.logUserID = value;
    }

    /**
     * Gets the value of the classLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassLevel() {
        return classLevel;
    }

    /**
     * Sets the value of the classLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassLevel(String value) {
        this.classLevel = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the spouseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpouseInfoType }
     *     
     */
    public SpouseInfoType getSpouseInfo() {
        return spouseInfo;
    }

    /**
     * Sets the value of the spouseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpouseInfoType }
     *     
     */
    public void setSpouseInfo(SpouseInfoType value) {
        this.spouseInfo = value;
    }

}
