
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationInCorrectReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationInCorrectReasonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationInCorrectReasonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationInCorrectReasonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationInCorrectReasonType", propOrder = {
    "authenticationInCorrectReasonTypeCode",
    "authenticationInCorrectReasonTypeName"
})
public class AuthenticationInCorrectReasonType {

    @XmlElement(name = "AuthenticationInCorrectReasonTypeCode")
    protected String authenticationInCorrectReasonTypeCode;
    @XmlElement(name = "AuthenticationInCorrectReasonTypeName")
    protected String authenticationInCorrectReasonTypeName;

    /**
     * Gets the value of the authenticationInCorrectReasonTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationInCorrectReasonTypeCode() {
        return authenticationInCorrectReasonTypeCode;
    }

    /**
     * Sets the value of the authenticationInCorrectReasonTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationInCorrectReasonTypeCode(String value) {
        this.authenticationInCorrectReasonTypeCode = value;
    }

    /**
     * Gets the value of the authenticationInCorrectReasonTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationInCorrectReasonTypeName() {
        return authenticationInCorrectReasonTypeName;
    }

    /**
     * Sets the value of the authenticationInCorrectReasonTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationInCorrectReasonTypeName(String value) {
        this.authenticationInCorrectReasonTypeName = value;
    }

}
