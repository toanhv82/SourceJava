
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftCartDetailInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCartDetailInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCartDetailInfoType", propOrder = {
    "giftLink",
    "giftCode",
    "codeExpired",
    "giftID"
})
public class GiftCartDetailInfoType {

    protected String giftLink;
    protected String giftCode;
    protected String codeExpired;
    protected String giftID;

    /**
     * Gets the value of the giftLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftLink() {
        return giftLink;
    }

    /**
     * Sets the value of the giftLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftLink(String value) {
        this.giftLink = value;
    }

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
     * Gets the value of the codeExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeExpired() {
        return codeExpired;
    }

    /**
     * Sets the value of the codeExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeExpired(String value) {
        this.codeExpired = value;
    }

    /**
     * Gets the value of the giftID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftID() {
        return giftID;
    }

    /**
     * Sets the value of the giftID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftID(String value) {
        this.giftID = value;
    }

}
