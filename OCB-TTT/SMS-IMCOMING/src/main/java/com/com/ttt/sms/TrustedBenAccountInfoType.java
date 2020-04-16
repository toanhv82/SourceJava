
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustedBenAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedBenAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BenAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenBankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayLimitAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayLimitAmountUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayLimitRemainAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedBenAccountInfoType", propOrder = {
    "benAccountNo",
    "benAccountName",
    "benBankId",
    "cif",
    "dayLimitAmount",
    "dayLimitAmountUsed",
    "dayLimitRemainAmount"
})
public class TrustedBenAccountInfoType {

    @XmlElement(name = "BenAccountNo")
    protected String benAccountNo;
    @XmlElement(name = "BenAccountName")
    protected String benAccountName;
    @XmlElement(name = "BenBankId")
    protected String benBankId;
    @XmlElement(name = "CIF")
    protected String cif;
    @XmlElement(name = "DayLimitAmount")
    protected String dayLimitAmount;
    @XmlElement(name = "DayLimitAmountUsed")
    protected String dayLimitAmountUsed;
    @XmlElement(name = "DayLimitRemainAmount")
    protected String dayLimitRemainAmount;

    /**
     * Gets the value of the benAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenAccountNo() {
        return benAccountNo;
    }

    /**
     * Sets the value of the benAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenAccountNo(String value) {
        this.benAccountNo = value;
    }

    /**
     * Gets the value of the benAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenAccountName() {
        return benAccountName;
    }

    /**
     * Sets the value of the benAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenAccountName(String value) {
        this.benAccountName = value;
    }

    /**
     * Gets the value of the benBankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenBankId() {
        return benBankId;
    }

    /**
     * Sets the value of the benBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenBankId(String value) {
        this.benBankId = value;
    }

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIF() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIF(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the dayLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayLimitAmount() {
        return dayLimitAmount;
    }

    /**
     * Sets the value of the dayLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayLimitAmount(String value) {
        this.dayLimitAmount = value;
    }

    /**
     * Gets the value of the dayLimitAmountUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayLimitAmountUsed() {
        return dayLimitAmountUsed;
    }

    /**
     * Sets the value of the dayLimitAmountUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayLimitAmountUsed(String value) {
        this.dayLimitAmountUsed = value;
    }

    /**
     * Gets the value of the dayLimitRemainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayLimitRemainAmount() {
        return dayLimitRemainAmount;
    }

    /**
     * Sets the value of the dayLimitRemainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayLimitRemainAmount(String value) {
        this.dayLimitRemainAmount = value;
    }

}
