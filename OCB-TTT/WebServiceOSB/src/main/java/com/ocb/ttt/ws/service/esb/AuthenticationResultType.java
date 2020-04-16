
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * tokenSynchronizationRequired
 * OMNI Channel: tokenSynchronizationRequired
 * 
 * <p>Java class for AuthenticationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentialsCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="changePasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tokenSynchronizationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accessBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changePasswordInformationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authenticationInCorrectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstLogon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="systemMigration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authMethodChoosingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="secondCredentialsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accessProfileDetails" type="{bian.com.vn}AccessProfileDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationResultType", propOrder = {
    "credentialsCorrect",
    "changePasswordRequired",
    "tokenSynchronizationRequired",
    "accessBlocked",
    "redirectUrl",
    "message",
    "changePasswordInformationRequired",
    "authenticationInCorrectReason",
    "firstLogon",
    "systemMigration",
    "language",
    "authMethodChoosingRequired",
    "secondCredentialsRequired",
    "accessProfileDetails"
})
public class AuthenticationResultType {

    protected Boolean credentialsCorrect;
    protected Boolean changePasswordRequired;
    protected Boolean tokenSynchronizationRequired;
    protected Boolean accessBlocked;
    protected String redirectUrl;
    protected String message;
    protected Boolean changePasswordInformationRequired;
    protected String authenticationInCorrectReason;
    protected Boolean firstLogon;
    protected Boolean systemMigration;
    protected String language;
    protected Boolean authMethodChoosingRequired;
    protected Boolean secondCredentialsRequired;
    protected AccessProfileDetailsType accessProfileDetails;

    /**
     * Gets the value of the credentialsCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialsCorrect() {
        return credentialsCorrect;
    }

    /**
     * Sets the value of the credentialsCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialsCorrect(Boolean value) {
        this.credentialsCorrect = value;
    }

    /**
     * Gets the value of the changePasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePasswordRequired() {
        return changePasswordRequired;
    }

    /**
     * Sets the value of the changePasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePasswordRequired(Boolean value) {
        this.changePasswordRequired = value;
    }

    /**
     * Gets the value of the tokenSynchronizationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTokenSynchronizationRequired() {
        return tokenSynchronizationRequired;
    }

    /**
     * Sets the value of the tokenSynchronizationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTokenSynchronizationRequired(Boolean value) {
        this.tokenSynchronizationRequired = value;
    }

    /**
     * Gets the value of the accessBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessBlocked() {
        return accessBlocked;
    }

    /**
     * Sets the value of the accessBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessBlocked(Boolean value) {
        this.accessBlocked = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
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
     * Gets the value of the changePasswordInformationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePasswordInformationRequired() {
        return changePasswordInformationRequired;
    }

    /**
     * Sets the value of the changePasswordInformationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePasswordInformationRequired(Boolean value) {
        this.changePasswordInformationRequired = value;
    }

    /**
     * Gets the value of the authenticationInCorrectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationInCorrectReason() {
        return authenticationInCorrectReason;
    }

    /**
     * Sets the value of the authenticationInCorrectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationInCorrectReason(String value) {
        this.authenticationInCorrectReason = value;
    }

    /**
     * Gets the value of the firstLogon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstLogon() {
        return firstLogon;
    }

    /**
     * Sets the value of the firstLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstLogon(Boolean value) {
        this.firstLogon = value;
    }

    /**
     * Gets the value of the systemMigration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSystemMigration() {
        return systemMigration;
    }

    /**
     * Sets the value of the systemMigration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSystemMigration(Boolean value) {
        this.systemMigration = value;
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
     * Gets the value of the authMethodChoosingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthMethodChoosingRequired() {
        return authMethodChoosingRequired;
    }

    /**
     * Sets the value of the authMethodChoosingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthMethodChoosingRequired(Boolean value) {
        this.authMethodChoosingRequired = value;
    }

    /**
     * Gets the value of the secondCredentialsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondCredentialsRequired() {
        return secondCredentialsRequired;
    }

    /**
     * Sets the value of the secondCredentialsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondCredentialsRequired(Boolean value) {
        this.secondCredentialsRequired = value;
    }

    /**
     * Gets the value of the accessProfileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccessProfileDetailsType }
     *     
     */
    public AccessProfileDetailsType getAccessProfileDetails() {
        return accessProfileDetails;
    }

    /**
     * Sets the value of the accessProfileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessProfileDetailsType }
     *     
     */
    public void setAccessProfileDetails(AccessProfileDetailsType value) {
        this.accessProfileDetails = value;
    }

}
