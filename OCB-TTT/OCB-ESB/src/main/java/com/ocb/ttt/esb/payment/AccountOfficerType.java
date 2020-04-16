
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOfficerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountOfficerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountOfficerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOfficerType", propOrder = {
    "accountOfficerId",
    "accountOfficerName"
})
public class AccountOfficerType {

    protected String accountOfficerId;
    protected String accountOfficerName;

    /**
     * Gets the value of the accountOfficerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficerId() {
        return accountOfficerId;
    }

    /**
     * Sets the value of the accountOfficerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficerId(String value) {
        this.accountOfficerId = value;
    }

    /**
     * Gets the value of the accountOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficerName() {
        return accountOfficerName;
    }

    /**
     * Sets the value of the accountOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficerName(String value) {
        this.accountOfficerName = value;
    }

}
