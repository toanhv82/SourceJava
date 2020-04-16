
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDERowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDERowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DERowValDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountInfo" type="{bian.com.vn}AccountInfoType" minOccurs="0"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType" minOccurs="0"/>
 *         &lt;element name="udfString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDERowType", propOrder = {
    "deRowValDate",
    "accountInfo",
    "fundTransferInfo",
    "udfString"
})
public class PaymentDERowType {

    @XmlElement(name = "DERowValDate")
    protected String deRowValDate;
    protected AccountInfoType accountInfo;
    protected FundTransferInfoType fundTransferInfo;
    protected String udfString;

    /**
     * Gets the value of the deRowValDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDERowValDate() {
        return deRowValDate;
    }

    /**
     * Sets the value of the deRowValDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDERowValDate(String value) {
        this.deRowValDate = value;
    }

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfo(AccountInfoType value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the fundTransferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundTransferInfoType }
     *     
     */
    public FundTransferInfoType getFundTransferInfo() {
        return fundTransferInfo;
    }

    /**
     * Sets the value of the fundTransferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransferInfoType }
     *     
     */
    public void setFundTransferInfo(FundTransferInfoType value) {
        this.fundTransferInfo = value;
    }

    /**
     * Gets the value of the udfString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdfString() {
        return udfString;
    }

    /**
     * Sets the value of the udfString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdfString(String value) {
        this.udfString = value;
    }

}
