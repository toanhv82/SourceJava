
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelServiceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelServiceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIFInfo" type="{bian.com.vn}CIFInfoType" minOccurs="0"/>
 *         &lt;element name="channelServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebankingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelServiceCloseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelServiceCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelServiceAccDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OTPData" type="{bian.com.vn}OTPDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelServiceInfoType", propOrder = {
    "cifInfo",
    "channelServiceType",
    "username",
    "channelServiceStatus",
    "ebankingNotes",
    "channelServiceCloseDate",
    "channelServiceCustType",
    "channelServiceAccDefault",
    "otpData"
})
public class ChannelServiceInfoType {

    @XmlElement(name = "CIFInfo")
    protected CIFInfoType cifInfo;
    protected String channelServiceType;
    protected String username;
    protected String channelServiceStatus;
    protected String ebankingNotes;
    protected String channelServiceCloseDate;
    protected String channelServiceCustType;
    protected String channelServiceAccDefault;
    @XmlElement(name = "OTPData")
    protected OTPDataType otpData;

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
     * Gets the value of the channelServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelServiceType() {
        return channelServiceType;
    }

    /**
     * Sets the value of the channelServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelServiceType(String value) {
        this.channelServiceType = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the channelServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelServiceStatus() {
        return channelServiceStatus;
    }

    /**
     * Sets the value of the channelServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelServiceStatus(String value) {
        this.channelServiceStatus = value;
    }

    /**
     * Gets the value of the ebankingNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbankingNotes() {
        return ebankingNotes;
    }

    /**
     * Sets the value of the ebankingNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbankingNotes(String value) {
        this.ebankingNotes = value;
    }

    /**
     * Gets the value of the channelServiceCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelServiceCloseDate() {
        return channelServiceCloseDate;
    }

    /**
     * Sets the value of the channelServiceCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelServiceCloseDate(String value) {
        this.channelServiceCloseDate = value;
    }

    /**
     * Gets the value of the channelServiceCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelServiceCustType() {
        return channelServiceCustType;
    }

    /**
     * Sets the value of the channelServiceCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelServiceCustType(String value) {
        this.channelServiceCustType = value;
    }

    /**
     * Gets the value of the channelServiceAccDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelServiceAccDefault() {
        return channelServiceAccDefault;
    }

    /**
     * Sets the value of the channelServiceAccDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelServiceAccDefault(String value) {
        this.channelServiceAccDefault = value;
    }

    /**
     * Gets the value of the otpData property.
     * 
     * @return
     *     possible object is
     *     {@link OTPDataType }
     *     
     */
    public OTPDataType getOTPData() {
        return otpData;
    }

    /**
     * Sets the value of the otpData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTPDataType }
     *     
     */
    public void setOTPData(OTPDataType value) {
        this.otpData = value;
    }

}
