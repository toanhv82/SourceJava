
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billSourceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{bian.com.vn}ServiceProviderForBillPaymentType" minOccurs="0"/>
 *         &lt;element name="GKId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billItem" type="{bian.com.vn}DetailItemBillType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addtionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyProfile" type="{bian.com.vn}AgencyProfileType" minOccurs="0"/>
 *         &lt;element name="custIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custIdIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isExistCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPartnerType", propOrder = {
    "billCode",
    "billType",
    "customerName",
    "customerCode",
    "address",
    "phoneNumber",
    "meterNumber",
    "amount",
    "billPaymentType",
    "billSourceData",
    "serviceProvider",
    "gkId",
    "billItem",
    "promotionValue",
    "addtionalData",
    "promotionCode",
    "realAmount",
    "agencyProfile",
    "custIdIssueDate",
    "custIdIssuePlace",
    "isExistCustomer"
})
public class BillPartnerType {

    protected String billCode;
    protected String billType;
    protected String customerName;
    protected String customerCode;
    protected String address;
    protected String phoneNumber;
    protected String meterNumber;
    protected String amount;
    protected String billPaymentType;
    protected String billSourceData;
    protected ServiceProviderForBillPaymentType serviceProvider;
    @XmlElement(name = "GKId")
    protected String gkId;
    protected List<DetailItemBillType> billItem;
    protected String promotionValue;
    protected String addtionalData;
    protected String promotionCode;
    protected String realAmount;
    protected AgencyProfileType agencyProfile;
    protected String custIdIssueDate;
    protected String custIdIssuePlace;
    protected String isExistCustomer;

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
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

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
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
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
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNumber(String value) {
        this.meterNumber = value;
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
     * Gets the value of the billPaymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPaymentType() {
        return billPaymentType;
    }

    /**
     * Sets the value of the billPaymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPaymentType(String value) {
        this.billPaymentType = value;
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
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderForBillPaymentType }
     *     
     */
    public ServiceProviderForBillPaymentType getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderForBillPaymentType }
     *     
     */
    public void setServiceProvider(ServiceProviderForBillPaymentType value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the gkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGKId() {
        return gkId;
    }

    /**
     * Sets the value of the gkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGKId(String value) {
        this.gkId = value;
    }

    /**
     * Gets the value of the billItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailItemBillType }
     * 
     * 
     */
    public List<DetailItemBillType> getBillItem() {
        if (billItem == null) {
            billItem = new ArrayList<DetailItemBillType>();
        }
        return this.billItem;
    }

    /**
     * Gets the value of the promotionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionValue() {
        return promotionValue;
    }

    /**
     * Sets the value of the promotionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionValue(String value) {
        this.promotionValue = value;
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
     * Gets the value of the agencyProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyProfileType }
     *     
     */
    public AgencyProfileType getAgencyProfile() {
        return agencyProfile;
    }

    /**
     * Sets the value of the agencyProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyProfileType }
     *     
     */
    public void setAgencyProfile(AgencyProfileType value) {
        this.agencyProfile = value;
    }

    /**
     * Gets the value of the custIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIdIssueDate() {
        return custIdIssueDate;
    }

    /**
     * Sets the value of the custIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIdIssueDate(String value) {
        this.custIdIssueDate = value;
    }

    /**
     * Gets the value of the custIdIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIdIssuePlace() {
        return custIdIssuePlace;
    }

    /**
     * Sets the value of the custIdIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIdIssuePlace(String value) {
        this.custIdIssuePlace = value;
    }

    /**
     * Gets the value of the isExistCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsExistCustomer() {
        return isExistCustomer;
    }

    /**
     * Sets the value of the isExistCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsExistCustomer(String value) {
        this.isExistCustomer = value;
    }

}
