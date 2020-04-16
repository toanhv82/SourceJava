
package com.ocb.ttt.soa.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Loyalty_Exchange_GiftResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyExchangeGiftResult"
})
@XmlRootElement(name = "Loyalty_Exchange_GiftResponse")
public class LoyaltyExchangeGiftResponse {

    @XmlElement(name = "Loyalty_Exchange_GiftResult")
    protected String loyaltyExchangeGiftResult;

    /**
     * Gets the value of the loyaltyExchangeGiftResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyExchangeGiftResult() {
        return loyaltyExchangeGiftResult;
    }

    /**
     * Sets the value of the loyaltyExchangeGiftResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyExchangeGiftResult(String value) {
        this.loyaltyExchangeGiftResult = value;
    }

}
