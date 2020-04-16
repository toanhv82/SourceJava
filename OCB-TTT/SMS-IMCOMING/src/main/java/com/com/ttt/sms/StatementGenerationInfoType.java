
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementGenerationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementGenerationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delivery" type="{bian.com.vn}StatementDeliveryType" minOccurs="0"/>
 *         &lt;element name="frequency" type="{bian.com.vn}StatementFrequencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementGenerationInfoType", propOrder = {
    "delivery",
    "frequency"
})
public class StatementGenerationInfoType {

    protected StatementDeliveryType delivery;
    protected StatementFrequencyType frequency;

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDeliveryType }
     *     
     */
    public StatementDeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDeliveryType }
     *     
     */
    public void setDelivery(StatementDeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link StatementFrequencyType }
     *     
     */
    public StatementFrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementFrequencyType }
     *     
     */
    public void setFrequency(StatementFrequencyType value) {
        this.frequency = value;
    }

}
