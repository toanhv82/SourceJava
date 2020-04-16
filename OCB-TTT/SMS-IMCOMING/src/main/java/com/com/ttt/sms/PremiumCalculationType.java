
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumCalculationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumCalculationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumBasicPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumCIC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumCTL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumCalculationType", propOrder = {
    "premiumBasicPlan",
    "premiumCIC1",
    "premiumCTL1",
    "stepCode"
})
public class PremiumCalculationType {

    protected String premiumBasicPlan;
    protected String premiumCIC1;
    protected String premiumCTL1;
    protected String stepCode;

    /**
     * Gets the value of the premiumBasicPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumBasicPlan() {
        return premiumBasicPlan;
    }

    /**
     * Sets the value of the premiumBasicPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumBasicPlan(String value) {
        this.premiumBasicPlan = value;
    }

    /**
     * Gets the value of the premiumCIC1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumCIC1() {
        return premiumCIC1;
    }

    /**
     * Sets the value of the premiumCIC1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumCIC1(String value) {
        this.premiumCIC1 = value;
    }

    /**
     * Gets the value of the premiumCTL1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumCTL1() {
        return premiumCTL1;
    }

    /**
     * Sets the value of the premiumCTL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumCTL1(String value) {
        this.premiumCTL1 = value;
    }

    /**
     * Gets the value of the stepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepCode() {
        return stepCode;
    }

    /**
     * Sets the value of the stepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepCode(String value) {
        this.stepCode = value;
    }

}
