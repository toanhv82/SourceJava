
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salesStaffCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesStaffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffType", propOrder = {
    "salesStaffCode",
    "salesStaffName"
})
public class StaffType {

    protected String salesStaffCode;
    protected String salesStaffName;

    /**
     * Gets the value of the salesStaffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesStaffCode() {
        return salesStaffCode;
    }

    /**
     * Sets the value of the salesStaffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesStaffCode(String value) {
        this.salesStaffCode = value;
    }

    /**
     * Gets the value of the salesStaffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesStaffName() {
        return salesStaffName;
    }

    /**
     * Sets the value of the salesStaffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesStaffName(String value) {
        this.salesStaffName = value;
    }

}
