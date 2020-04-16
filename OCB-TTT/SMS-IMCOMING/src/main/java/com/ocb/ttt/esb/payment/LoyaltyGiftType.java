
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyGiftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyGiftType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valuePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyGiftType", propOrder = {
    "giftCode",
    "giftName",
    "valuePoints",
    "giftImage"
})
public class LoyaltyGiftType {

    protected String giftCode;
    protected String giftName;
    protected String valuePoints;
    protected String giftImage;

    /**
     * Gets the value of the giftCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCode() {
        return giftCode;
    }

    /**
     * Sets the value of the giftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCode(String value) {
        this.giftCode = value;
    }

    /**
     * Gets the value of the giftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftName() {
        return giftName;
    }

    /**
     * Sets the value of the giftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftName(String value) {
        this.giftName = value;
    }

    /**
     * Gets the value of the valuePoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePoints() {
        return valuePoints;
    }

    /**
     * Sets the value of the valuePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuePoints(String value) {
        this.valuePoints = value;
    }

    /**
     * Gets the value of the giftImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftImage() {
        return giftImage;
    }

    /**
     * Sets the value of the giftImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftImage(String value) {
        this.giftImage = value;
    }

}
