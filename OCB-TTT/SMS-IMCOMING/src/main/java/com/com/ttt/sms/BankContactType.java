
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankContactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankContactPhoneNumberFromVietnam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankContactPhoneNumberFromAbroad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankContactEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankContactWorkingHours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankContactType", propOrder = {
    "bankContactType",
    "bankContactPhoneNumberFromVietnam",
    "bankContactPhoneNumberFromAbroad",
    "bankContactEmail",
    "bankContactWorkingHours"
})
public class BankContactType {

    @XmlElement(required = true)
    protected String bankContactType;
    @XmlElement(required = true)
    protected String bankContactPhoneNumberFromVietnam;
    @XmlElement(required = true)
    protected String bankContactPhoneNumberFromAbroad;
    @XmlElement(required = true)
    protected String bankContactEmail;
    @XmlElement(required = true)
    protected String bankContactWorkingHours;

    /**
     * Gets the value of the bankContactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankContactType() {
        return bankContactType;
    }

    /**
     * Sets the value of the bankContactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankContactType(String value) {
        this.bankContactType = value;
    }

    /**
     * Gets the value of the bankContactPhoneNumberFromVietnam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankContactPhoneNumberFromVietnam() {
        return bankContactPhoneNumberFromVietnam;
    }

    /**
     * Sets the value of the bankContactPhoneNumberFromVietnam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankContactPhoneNumberFromVietnam(String value) {
        this.bankContactPhoneNumberFromVietnam = value;
    }

    /**
     * Gets the value of the bankContactPhoneNumberFromAbroad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankContactPhoneNumberFromAbroad() {
        return bankContactPhoneNumberFromAbroad;
    }

    /**
     * Sets the value of the bankContactPhoneNumberFromAbroad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankContactPhoneNumberFromAbroad(String value) {
        this.bankContactPhoneNumberFromAbroad = value;
    }

    /**
     * Gets the value of the bankContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankContactEmail() {
        return bankContactEmail;
    }

    /**
     * Sets the value of the bankContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankContactEmail(String value) {
        this.bankContactEmail = value;
    }

    /**
     * Gets the value of the bankContactWorkingHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankContactWorkingHours() {
        return bankContactWorkingHours;
    }

    /**
     * Sets the value of the bankContactWorkingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankContactWorkingHours(String value) {
        this.bankContactWorkingHours = value;
    }

}
