
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="gpsCoordinates" type="{bian.com.vn}GpsCoordinatesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchDetailType", propOrder = {
    "branchCode",
    "branchName",
    "province",
    "phoneContact",
    "operatingHours",
    "branchAddress",
    "gpsCoordinates"
})
public class BranchDetailType {

    protected String branchCode;
    protected String branchName;
    protected String province;
    protected String phoneContact;
    protected String operatingHours;
    protected AddressType branchAddress;
    protected GpsCoordinatesType gpsCoordinates;

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
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the phoneContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneContact() {
        return phoneContact;
    }

    /**
     * Sets the value of the phoneContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneContact(String value) {
        this.phoneContact = value;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the value of the operatingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingHours(String value) {
        this.operatingHours = value;
    }

    /**
     * Gets the value of the branchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBranchAddress() {
        return branchAddress;
    }

    /**
     * Sets the value of the branchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBranchAddress(AddressType value) {
        this.branchAddress = value;
    }

    /**
     * Gets the value of the gpsCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GpsCoordinatesType }
     *     
     */
    public GpsCoordinatesType getGpsCoordinates() {
        return gpsCoordinates;
    }

    /**
     * Sets the value of the gpsCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsCoordinatesType }
     *     
     */
    public void setGpsCoordinates(GpsCoordinatesType value) {
        this.gpsCoordinates = value;
    }

}
