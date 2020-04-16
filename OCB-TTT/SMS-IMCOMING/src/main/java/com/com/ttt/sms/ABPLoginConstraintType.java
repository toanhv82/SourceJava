
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ABPLoginConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ABPLoginConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accept-Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userNameMaxLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABPLoginConstraintType", propOrder = {
    "acceptLanguage",
    "userNameMaxLength"
})
public class ABPLoginConstraintType {

    @XmlElement(name = "Accept-Language")
    protected String acceptLanguage;
    protected String userNameMaxLength;

    /**
     * Gets the value of the acceptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    /**
     * Sets the value of the acceptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptLanguage(String value) {
        this.acceptLanguage = value;
    }

    /**
     * Gets the value of the userNameMaxLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameMaxLength() {
        return userNameMaxLength;
    }

    /**
     * Sets the value of the userNameMaxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameMaxLength(String value) {
        this.userNameMaxLength = value;
    }

}
