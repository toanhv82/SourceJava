
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachedCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachedCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedCardEmbossedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachedCardExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachedCardLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachedCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachedCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedCardType", propOrder = {
    "attachedCardEmbossedName",
    "attachedCardExpiryDate",
    "attachedCardLayout",
    "attachedCardNumber",
    "attachedCardType"
})
public class AttachedCardType {

    protected String attachedCardEmbossedName;
    protected String attachedCardExpiryDate;
    protected String attachedCardLayout;
    protected String attachedCardNumber;
    protected String attachedCardType;

    /**
     * Gets the value of the attachedCardEmbossedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedCardEmbossedName() {
        return attachedCardEmbossedName;
    }

    /**
     * Sets the value of the attachedCardEmbossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedCardEmbossedName(String value) {
        this.attachedCardEmbossedName = value;
    }

    /**
     * Gets the value of the attachedCardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedCardExpiryDate() {
        return attachedCardExpiryDate;
    }

    /**
     * Sets the value of the attachedCardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedCardExpiryDate(String value) {
        this.attachedCardExpiryDate = value;
    }

    /**
     * Gets the value of the attachedCardLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedCardLayout() {
        return attachedCardLayout;
    }

    /**
     * Sets the value of the attachedCardLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedCardLayout(String value) {
        this.attachedCardLayout = value;
    }

    /**
     * Gets the value of the attachedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedCardNumber() {
        return attachedCardNumber;
    }

    /**
     * Sets the value of the attachedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedCardNumber(String value) {
        this.attachedCardNumber = value;
    }

    /**
     * Gets the value of the attachedCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedCardType() {
        return attachedCardType;
    }

    /**
     * Sets the value of the attachedCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedCardType(String value) {
        this.attachedCardType = value;
    }

}
