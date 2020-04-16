
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meetingBankBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingBankProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingOtherDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingOtherTimeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingOtherTimeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meetingOtherAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInformationType", propOrder = {
    "meetingBankBranch",
    "meetingBankProvince",
    "meetingOtherDate",
    "meetingOtherTimeFrom",
    "meetingOtherTimeTo",
    "meetingType",
    "meetingOtherAddress"
})
public class MeetingInformationType {

    protected String meetingBankBranch;
    protected String meetingBankProvince;
    protected String meetingOtherDate;
    protected String meetingOtherTimeFrom;
    protected String meetingOtherTimeTo;
    protected String meetingType;
    protected AddressType meetingOtherAddress;

    /**
     * Gets the value of the meetingBankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingBankBranch() {
        return meetingBankBranch;
    }

    /**
     * Sets the value of the meetingBankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingBankBranch(String value) {
        this.meetingBankBranch = value;
    }

    /**
     * Gets the value of the meetingBankProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingBankProvince() {
        return meetingBankProvince;
    }

    /**
     * Sets the value of the meetingBankProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingBankProvince(String value) {
        this.meetingBankProvince = value;
    }

    /**
     * Gets the value of the meetingOtherDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingOtherDate() {
        return meetingOtherDate;
    }

    /**
     * Sets the value of the meetingOtherDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingOtherDate(String value) {
        this.meetingOtherDate = value;
    }

    /**
     * Gets the value of the meetingOtherTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingOtherTimeFrom() {
        return meetingOtherTimeFrom;
    }

    /**
     * Sets the value of the meetingOtherTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingOtherTimeFrom(String value) {
        this.meetingOtherTimeFrom = value;
    }

    /**
     * Gets the value of the meetingOtherTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingOtherTimeTo() {
        return meetingOtherTimeTo;
    }

    /**
     * Sets the value of the meetingOtherTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingOtherTimeTo(String value) {
        this.meetingOtherTimeTo = value;
    }

    /**
     * Gets the value of the meetingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the value of the meetingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingType(String value) {
        this.meetingType = value;
    }

    /**
     * Gets the value of the meetingOtherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getMeetingOtherAddress() {
        return meetingOtherAddress;
    }

    /**
     * Sets the value of the meetingOtherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setMeetingOtherAddress(AddressType value) {
        this.meetingOtherAddress = value;
    }

}
