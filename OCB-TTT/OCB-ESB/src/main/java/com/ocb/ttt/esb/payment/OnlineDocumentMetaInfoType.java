
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineDocumentMetaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineDocumentMetaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signatureImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signaturePageNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signatureCoordinate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowVisualStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowImageAndText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowSignerInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signerInfoPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTimePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signReasonPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShowLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineDocumentMetaInfoType", propOrder = {
    "signatureImage",
    "signaturePageNo",
    "signatureCoordinate",
    "isShowSignature",
    "isShowVisualStatus",
    "isShowImageAndText",
    "textDirection",
    "isShowSignerInfo",
    "signerInfoPrefix",
    "isShowDateTime",
    "dateTimePrefix",
    "isShowReason",
    "signReasonPrefix",
    "signReason",
    "isShowLocation",
    "location",
    "locationPrefix",
    "textColor",
    "customerUser",
    "customerPassword",
    "forceValid"
})
public class OnlineDocumentMetaInfoType {

    protected String signatureImage;
    protected String signaturePageNo;
    protected String signatureCoordinate;
    protected String isShowSignature;
    protected String isShowVisualStatus;
    protected String isShowImageAndText;
    protected String textDirection;
    protected String isShowSignerInfo;
    protected String signerInfoPrefix;
    protected String isShowDateTime;
    protected String dateTimePrefix;
    protected String isShowReason;
    protected String signReasonPrefix;
    protected String signReason;
    protected String isShowLocation;
    protected String location;
    protected String locationPrefix;
    protected String textColor;
    protected String customerUser;
    protected String customerPassword;
    protected String forceValid;

    /**
     * Gets the value of the signatureImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureImage() {
        return signatureImage;
    }

    /**
     * Sets the value of the signatureImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureImage(String value) {
        this.signatureImage = value;
    }

    /**
     * Gets the value of the signaturePageNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignaturePageNo() {
        return signaturePageNo;
    }

    /**
     * Sets the value of the signaturePageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignaturePageNo(String value) {
        this.signaturePageNo = value;
    }

    /**
     * Gets the value of the signatureCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureCoordinate() {
        return signatureCoordinate;
    }

    /**
     * Sets the value of the signatureCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureCoordinate(String value) {
        this.signatureCoordinate = value;
    }

    /**
     * Gets the value of the isShowSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowSignature() {
        return isShowSignature;
    }

    /**
     * Sets the value of the isShowSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowSignature(String value) {
        this.isShowSignature = value;
    }

    /**
     * Gets the value of the isShowVisualStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowVisualStatus() {
        return isShowVisualStatus;
    }

    /**
     * Sets the value of the isShowVisualStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowVisualStatus(String value) {
        this.isShowVisualStatus = value;
    }

    /**
     * Gets the value of the isShowImageAndText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowImageAndText() {
        return isShowImageAndText;
    }

    /**
     * Sets the value of the isShowImageAndText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowImageAndText(String value) {
        this.isShowImageAndText = value;
    }

    /**
     * Gets the value of the textDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDirection() {
        return textDirection;
    }

    /**
     * Sets the value of the textDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDirection(String value) {
        this.textDirection = value;
    }

    /**
     * Gets the value of the isShowSignerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowSignerInfo() {
        return isShowSignerInfo;
    }

    /**
     * Sets the value of the isShowSignerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowSignerInfo(String value) {
        this.isShowSignerInfo = value;
    }

    /**
     * Gets the value of the signerInfoPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerInfoPrefix() {
        return signerInfoPrefix;
    }

    /**
     * Sets the value of the signerInfoPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerInfoPrefix(String value) {
        this.signerInfoPrefix = value;
    }

    /**
     * Gets the value of the isShowDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowDateTime() {
        return isShowDateTime;
    }

    /**
     * Sets the value of the isShowDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowDateTime(String value) {
        this.isShowDateTime = value;
    }

    /**
     * Gets the value of the dateTimePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimePrefix() {
        return dateTimePrefix;
    }

    /**
     * Sets the value of the dateTimePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimePrefix(String value) {
        this.dateTimePrefix = value;
    }

    /**
     * Gets the value of the isShowReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowReason() {
        return isShowReason;
    }

    /**
     * Sets the value of the isShowReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowReason(String value) {
        this.isShowReason = value;
    }

    /**
     * Gets the value of the signReasonPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignReasonPrefix() {
        return signReasonPrefix;
    }

    /**
     * Sets the value of the signReasonPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignReasonPrefix(String value) {
        this.signReasonPrefix = value;
    }

    /**
     * Gets the value of the signReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignReason() {
        return signReason;
    }

    /**
     * Sets the value of the signReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignReason(String value) {
        this.signReason = value;
    }

    /**
     * Gets the value of the isShowLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShowLocation() {
        return isShowLocation;
    }

    /**
     * Sets the value of the isShowLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShowLocation(String value) {
        this.isShowLocation = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationPrefix() {
        return locationPrefix;
    }

    /**
     * Sets the value of the locationPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationPrefix(String value) {
        this.locationPrefix = value;
    }

    /**
     * Gets the value of the textColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * Sets the value of the textColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextColor(String value) {
        this.textColor = value;
    }

    /**
     * Gets the value of the customerUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUser() {
        return customerUser;
    }

    /**
     * Sets the value of the customerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUser(String value) {
        this.customerUser = value;
    }

    /**
     * Gets the value of the customerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * Sets the value of the customerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPassword(String value) {
        this.customerPassword = value;
    }

    /**
     * Gets the value of the forceValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceValid() {
        return forceValid;
    }

    /**
     * Sets the value of the forceValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceValid(String value) {
        this.forceValid = value;
    }

}
