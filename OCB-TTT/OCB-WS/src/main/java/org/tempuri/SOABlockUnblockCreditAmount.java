
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in_string" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_transcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_value_ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_value_autho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_cr_account_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_member_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_current" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_sourcechanel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inString",
    "inTranscode",
    "inValueRef",
    "inValueAutho",
    "inCrAccountNumber",
    "inMemberId",
    "inCurrent",
    "inAmount",
    "inSourcechanel"
})
@XmlRootElement(name = "SOA_Block_Unblock_Credit_Amount")
public class SOABlockUnblockCreditAmount {

    @XmlElement(name = "in_string")
    protected String inString;
    @XmlElement(name = "in_transcode")
    protected String inTranscode;
    @XmlElement(name = "in_value_ref")
    protected String inValueRef;
    @XmlElement(name = "in_value_autho")
    protected String inValueAutho;
    @XmlElement(name = "in_cr_account_number")
    protected String inCrAccountNumber;
    @XmlElement(name = "in_member_id")
    protected String inMemberId;
    @XmlElement(name = "in_current")
    protected String inCurrent;
    @XmlElement(name = "in_amount")
    protected String inAmount;
    @XmlElement(name = "in_sourcechanel")
    protected String inSourcechanel;

    /**
     * Gets the value of the inString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInString() {
        return inString;
    }

    /**
     * Sets the value of the inString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInString(String value) {
        this.inString = value;
    }

    /**
     * Gets the value of the inTranscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTranscode() {
        return inTranscode;
    }

    /**
     * Sets the value of the inTranscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTranscode(String value) {
        this.inTranscode = value;
    }

    /**
     * Gets the value of the inValueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValueRef() {
        return inValueRef;
    }

    /**
     * Sets the value of the inValueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValueRef(String value) {
        this.inValueRef = value;
    }

    /**
     * Gets the value of the inValueAutho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInValueAutho() {
        return inValueAutho;
    }

    /**
     * Sets the value of the inValueAutho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInValueAutho(String value) {
        this.inValueAutho = value;
    }

    /**
     * Gets the value of the inCrAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrAccountNumber() {
        return inCrAccountNumber;
    }

    /**
     * Sets the value of the inCrAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrAccountNumber(String value) {
        this.inCrAccountNumber = value;
    }

    /**
     * Gets the value of the inMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMemberId() {
        return inMemberId;
    }

    /**
     * Sets the value of the inMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMemberId(String value) {
        this.inMemberId = value;
    }

    /**
     * Gets the value of the inCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrent() {
        return inCurrent;
    }

    /**
     * Sets the value of the inCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrent(String value) {
        this.inCurrent = value;
    }

    /**
     * Gets the value of the inAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAmount() {
        return inAmount;
    }

    /**
     * Sets the value of the inAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAmount(String value) {
        this.inAmount = value;
    }

    /**
     * Gets the value of the inSourcechanel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSourcechanel() {
        return inSourcechanel;
    }

    /**
     * Sets the value of the inSourcechanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSourcechanel(String value) {
        this.inSourcechanel = value;
    }

}
