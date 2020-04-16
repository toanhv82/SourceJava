
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IDInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IDInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDIssuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDIssuedLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origLegalIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDInfoType", propOrder = {
    "idNum",
    "idIssuedDate",
    "idIssuedLocation",
    "idType",
    "origLegalIDType",
    "nationality",
    "religion"
})
public class IDInfoType {

    @XmlElement(name = "IDNum")
    protected String idNum;
    @XmlElement(name = "IDIssuedDate")
    protected String idIssuedDate;
    @XmlElement(name = "IDIssuedLocation")
    protected String idIssuedLocation;
    @XmlElement(name = "IDType")
    protected String idType;
    protected String origLegalIDType;
    protected String nationality;
    protected String religion;

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNum(String value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the idIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIssuedDate() {
        return idIssuedDate;
    }

    /**
     * Sets the value of the idIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIssuedDate(String value) {
        this.idIssuedDate = value;
    }

    /**
     * Gets the value of the idIssuedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIssuedLocation() {
        return idIssuedLocation;
    }

    /**
     * Sets the value of the idIssuedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIssuedLocation(String value) {
        this.idIssuedLocation = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the origLegalIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigLegalIDType() {
        return origLegalIDType;
    }

    /**
     * Sets the value of the origLegalIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigLegalIDType(String value) {
        this.origLegalIDType = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

}
