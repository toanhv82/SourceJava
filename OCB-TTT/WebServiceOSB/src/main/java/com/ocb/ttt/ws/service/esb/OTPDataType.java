
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTPDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTPDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtpPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtpToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optSmsTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextOtpToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsParameters" type="{bian.com.vn}SmsParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cRefNumPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpSmsTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otpChallenge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTPDataType", propOrder = {
    "otpPhone",
    "otpToken",
    "id",
    "otpChannel",
    "optSmsTemplate",
    "phoneNumber",
    "expiryTime",
    "language",
    "smsId",
    "authId",
    "value",
    "status",
    "signature",
    "transactionData",
    "tokenSerialNumber",
    "nextOtpToken",
    "smsParameters",
    "cRefNumPayment",
    "otpSmsTemplate",
    "otpChallenge"
})
public class OTPDataType {

    @XmlElement(name = "OtpPhone")
    protected String otpPhone;
    @XmlElement(name = "OtpToken")
    protected String otpToken;
    protected String id;
    protected String otpChannel;
    protected String optSmsTemplate;
    protected String phoneNumber;
    protected String expiryTime;
    protected String language;
    protected String smsId;
    protected Integer authId;
    protected String value;
    protected String status;
    protected String signature;
    protected String transactionData;
    protected String tokenSerialNumber;
    protected String nextOtpToken;
    protected List<SmsParameterType> smsParameters;
    protected String cRefNumPayment;
    protected String otpSmsTemplate;
    protected String otpChallenge;

    /**
     * Gets the value of the otpPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpPhone() {
        return otpPhone;
    }

    /**
     * Sets the value of the otpPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpPhone(String value) {
        this.otpPhone = value;
    }

    /**
     * Gets the value of the otpToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpToken() {
        return otpToken;
    }

    /**
     * Sets the value of the otpToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpToken(String value) {
        this.otpToken = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the otpChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpChannel() {
        return otpChannel;
    }

    /**
     * Sets the value of the otpChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpChannel(String value) {
        this.otpChannel = value;
    }

    /**
     * Gets the value of the optSmsTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptSmsTemplate() {
        return optSmsTemplate;
    }

    /**
     * Sets the value of the optSmsTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptSmsTemplate(String value) {
        this.optSmsTemplate = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryTime(String value) {
        this.expiryTime = value;
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
     * Gets the value of the smsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsId() {
        return smsId;
    }

    /**
     * Sets the value of the smsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsId(String value) {
        this.smsId = value;
    }

    /**
     * Gets the value of the authId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * Sets the value of the authId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthId(Integer value) {
        this.authId = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionData(String value) {
        this.transactionData = value;
    }

    /**
     * Gets the value of the tokenSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenSerialNumber() {
        return tokenSerialNumber;
    }

    /**
     * Sets the value of the tokenSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenSerialNumber(String value) {
        this.tokenSerialNumber = value;
    }

    /**
     * Gets the value of the nextOtpToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextOtpToken() {
        return nextOtpToken;
    }

    /**
     * Sets the value of the nextOtpToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextOtpToken(String value) {
        this.nextOtpToken = value;
    }

    /**
     * Gets the value of the smsParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsParameterType }
     * 
     * 
     */
    public List<SmsParameterType> getSmsParameters() {
        if (smsParameters == null) {
            smsParameters = new ArrayList<SmsParameterType>();
        }
        return this.smsParameters;
    }

    /**
     * Gets the value of the cRefNumPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRefNumPayment() {
        return cRefNumPayment;
    }

    /**
     * Sets the value of the cRefNumPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRefNumPayment(String value) {
        this.cRefNumPayment = value;
    }

    /**
     * Gets the value of the otpSmsTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpSmsTemplate() {
        return otpSmsTemplate;
    }

    /**
     * Sets the value of the otpSmsTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpSmsTemplate(String value) {
        this.otpSmsTemplate = value;
    }

    /**
     * Gets the value of the otpChallenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtpChallenge() {
        return otpChallenge;
    }

    /**
     * Sets the value of the otpChallenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtpChallenge(String value) {
        this.otpChallenge = value;
    }

}
