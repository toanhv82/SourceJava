
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanPolicyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanPolicyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerPolicyDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanPolicyInfoType", propOrder = {
    "offerPolicyDetails"
})
public class LoanPolicyInfoType {

    protected String offerPolicyDetails;

    /**
     * Gets the value of the offerPolicyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPolicyDetails() {
        return offerPolicyDetails;
    }

    /**
     * Sets the value of the offerPolicyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPolicyDetails(String value) {
        this.offerPolicyDetails = value;
    }

}
