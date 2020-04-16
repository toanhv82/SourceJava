
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyRegionalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyContactDetails" type="{bian.com.vn}AgencyContactDetailType" minOccurs="0"/>
 *         &lt;element name="agencyCreditDetails" type="{bian.com.vn}AgencyCreditDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyProfileType", propOrder = {
    "agencyCode",
    "agencyName",
    "agencyRegionalName",
    "agencyContactDetails",
    "agencyCreditDetails"
})
public class AgencyProfileType {

    protected String agencyCode;
    protected String agencyName;
    protected String agencyRegionalName;
    protected AgencyContactDetailType agencyContactDetails;
    protected AgencyCreditDetailType agencyCreditDetails;

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyRegionalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyRegionalName() {
        return agencyRegionalName;
    }

    /**
     * Sets the value of the agencyRegionalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyRegionalName(String value) {
        this.agencyRegionalName = value;
    }

    /**
     * Gets the value of the agencyContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactDetailType }
     *     
     */
    public AgencyContactDetailType getAgencyContactDetails() {
        return agencyContactDetails;
    }

    /**
     * Sets the value of the agencyContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactDetailType }
     *     
     */
    public void setAgencyContactDetails(AgencyContactDetailType value) {
        this.agencyContactDetails = value;
    }

    /**
     * Gets the value of the agencyCreditDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCreditDetailType }
     *     
     */
    public AgencyCreditDetailType getAgencyCreditDetails() {
        return agencyCreditDetails;
    }

    /**
     * Sets the value of the agencyCreditDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCreditDetailType }
     *     
     */
    public void setAgencyCreditDetails(AgencyCreditDetailType value) {
        this.agencyCreditDetails = value;
    }

}
