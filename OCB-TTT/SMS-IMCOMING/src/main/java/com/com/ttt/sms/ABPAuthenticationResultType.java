
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ABPAuthenticationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ABPAuthenticationResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessBlocked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialsCorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationResult" type="{bian.com.vn}ABPAccessProfileDetailsType" minOccurs="0"/>
 *         &lt;element name="authenticationInCorrectReason" type="{bian.com.vn}AuthenticationInCorrectReasonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ABPAuthenticationResultType", propOrder = {
    "accessBlocked",
    "credentialsCorrect",
    "language",
    "message",
    "authenticationResult",
    "authenticationInCorrectReason"
})
public class ABPAuthenticationResultType {

    protected String accessBlocked;
    protected String credentialsCorrect;
    protected String language;
    protected String message;
    protected ABPAccessProfileDetailsType authenticationResult;
    protected AuthenticationInCorrectReasonType authenticationInCorrectReason;

    /**
     * Gets the value of the accessBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessBlocked() {
        return accessBlocked;
    }

    /**
     * Sets the value of the accessBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessBlocked(String value) {
        this.accessBlocked = value;
    }

    /**
     * Gets the value of the credentialsCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialsCorrect() {
        return credentialsCorrect;
    }

    /**
     * Sets the value of the credentialsCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialsCorrect(String value) {
        this.credentialsCorrect = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the authenticationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ABPAccessProfileDetailsType }
     *     
     */
    public ABPAccessProfileDetailsType getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Sets the value of the authenticationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABPAccessProfileDetailsType }
     *     
     */
    public void setAuthenticationResult(ABPAccessProfileDetailsType value) {
        this.authenticationResult = value;
    }

    /**
     * Gets the value of the authenticationInCorrectReason property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationInCorrectReasonType }
     *     
     */
    public AuthenticationInCorrectReasonType getAuthenticationInCorrectReason() {
        return authenticationInCorrectReason;
    }

    /**
     * Sets the value of the authenticationInCorrectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationInCorrectReasonType }
     *     
     */
    public void setAuthenticationInCorrectReason(AuthenticationInCorrectReasonType value) {
        this.authenticationInCorrectReason = value;
    }

}
