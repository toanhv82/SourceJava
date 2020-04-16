
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
 *         &lt;element name="Loyalty_Get_Gift_Exchange_HistResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "loyaltyGetGiftExchangeHistResult"
})
@XmlRootElement(name = "Loyalty_Get_Gift_Exchange_HistResponse")
public class LoyaltyGetGiftExchangeHistResponse {

    @XmlElement(name = "Loyalty_Get_Gift_Exchange_HistResult")
    protected String loyaltyGetGiftExchangeHistResult;

    /**
     * Gets the value of the loyaltyGetGiftExchangeHistResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyGetGiftExchangeHistResult() {
        return loyaltyGetGiftExchangeHistResult;
    }

    /**
     * Sets the value of the loyaltyGetGiftExchangeHistResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyGetGiftExchangeHistResult(String value) {
        this.loyaltyGetGiftExchangeHistResult = value;
    }

}
