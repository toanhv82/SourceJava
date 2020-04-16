
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EbAccountPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EbAccountPackageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasCIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ebAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerData" type="{bian.com.vn}NewCustomerEBUserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EbAccountPackageInfoType", propOrder = {
    "hasCIF",
    "ebAccount",
    "hasBankAccount",
    "customerData"
})
public class EbAccountPackageInfoType {

    protected String hasCIF;
    protected String ebAccount;
    protected String hasBankAccount;
    protected NewCustomerEBUserType customerData;

    /**
     * Gets the value of the hasCIF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasCIF() {
        return hasCIF;
    }

    /**
     * Sets the value of the hasCIF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasCIF(String value) {
        this.hasCIF = value;
    }

    /**
     * Gets the value of the ebAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbAccount() {
        return ebAccount;
    }

    /**
     * Sets the value of the ebAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbAccount(String value) {
        this.ebAccount = value;
    }

    /**
     * Gets the value of the hasBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasBankAccount() {
        return hasBankAccount;
    }

    /**
     * Sets the value of the hasBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasBankAccount(String value) {
        this.hasBankAccount = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link NewCustomerEBUserType }
     *     
     */
    public NewCustomerEBUserType getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewCustomerEBUserType }
     *     
     */
    public void setCustomerData(NewCustomerEBUserType value) {
        this.customerData = value;
    }

}
