
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverdraftOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverdraftOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overdraftOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverdraftOfferType", propOrder = {
    "overdraftOfferId"
})
public class OverdraftOfferType {

    protected String overdraftOfferId;

    /**
     * Gets the value of the overdraftOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdraftOfferId() {
        return overdraftOfferId;
    }

    /**
     * Sets the value of the overdraftOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdraftOfferId(String value) {
        this.overdraftOfferId = value;
    }

}
