
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankATMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankATMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atmAddress" type="{bian.com.vn}AddressType" minOccurs="0"/>
 *         &lt;element name="gpsCoordinates" type="{bian.com.vn}GpsCoordinatesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankATMType", propOrder = {
    "atmCode",
    "atmName",
    "atmAddress",
    "gpsCoordinates"
})
public class BankATMType {

    protected String atmCode;
    protected String atmName;
    protected AddressType atmAddress;
    protected GpsCoordinatesType gpsCoordinates;

    /**
     * Gets the value of the atmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmCode() {
        return atmCode;
    }

    /**
     * Sets the value of the atmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmCode(String value) {
        this.atmCode = value;
    }

    /**
     * Gets the value of the atmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtmName() {
        return atmName;
    }

    /**
     * Sets the value of the atmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtmName(String value) {
        this.atmName = value;
    }

    /**
     * Gets the value of the atmAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAtmAddress() {
        return atmAddress;
    }

    /**
     * Sets the value of the atmAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAtmAddress(AddressType value) {
        this.atmAddress = value;
    }

    /**
     * Gets the value of the gpsCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GpsCoordinatesType }
     *     
     */
    public GpsCoordinatesType getGpsCoordinates() {
        return gpsCoordinates;
    }

    /**
     * Sets the value of the gpsCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsCoordinatesType }
     *     
     */
    public void setGpsCoordinates(GpsCoordinatesType value) {
        this.gpsCoordinates = value;
    }

}
