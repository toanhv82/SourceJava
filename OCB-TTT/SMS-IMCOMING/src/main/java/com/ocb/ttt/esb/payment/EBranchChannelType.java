
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EBranchChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EBranchChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateLastStatusChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationMethodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EBranchChannelType", propOrder = {
    "channelType",
    "status",
    "loginMethod",
    "authorizationMethod",
    "dateLastStatusChange",
    "authenticationMethodType"
})
public class EBranchChannelType {

    protected String channelType;
    protected String status;
    protected String loginMethod;
    protected String authorizationMethod;
    protected String dateLastStatusChange;
    protected String authenticationMethodType;

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the loginMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginMethod() {
        return loginMethod;
    }

    /**
     * Sets the value of the loginMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginMethod(String value) {
        this.loginMethod = value;
    }

    /**
     * Gets the value of the authorizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationMethod() {
        return authorizationMethod;
    }

    /**
     * Sets the value of the authorizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationMethod(String value) {
        this.authorizationMethod = value;
    }

    /**
     * Gets the value of the dateLastStatusChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastStatusChange() {
        return dateLastStatusChange;
    }

    /**
     * Sets the value of the dateLastStatusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastStatusChange(String value) {
        this.dateLastStatusChange = value;
    }

    /**
     * Gets the value of the authenticationMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMethodType() {
        return authenticationMethodType;
    }

    /**
     * Sets the value of the authenticationMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationMethodType(String value) {
        this.authenticationMethodType = value;
    }

}
