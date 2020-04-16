
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelegationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DelegationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delegationNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegationFullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelegationType", propOrder = {
    "delegationNum",
    "delegationDate",
    "delegationLocation",
    "delegationFullname"
})
public class DelegationType {

    protected String delegationNum;
    protected String delegationDate;
    protected String delegationLocation;
    protected String delegationFullname;

    /**
     * Gets the value of the delegationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationNum() {
        return delegationNum;
    }

    /**
     * Sets the value of the delegationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationNum(String value) {
        this.delegationNum = value;
    }

    /**
     * Gets the value of the delegationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationDate() {
        return delegationDate;
    }

    /**
     * Sets the value of the delegationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationDate(String value) {
        this.delegationDate = value;
    }

    /**
     * Gets the value of the delegationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationLocation() {
        return delegationLocation;
    }

    /**
     * Sets the value of the delegationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationLocation(String value) {
        this.delegationLocation = value;
    }

    /**
     * Gets the value of the delegationFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegationFullname() {
        return delegationFullname;
    }

    /**
     * Sets the value of the delegationFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegationFullname(String value) {
        this.delegationFullname = value;
    }

}
