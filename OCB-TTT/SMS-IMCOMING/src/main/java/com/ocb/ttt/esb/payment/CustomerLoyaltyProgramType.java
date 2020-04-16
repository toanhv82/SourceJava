
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerLoyaltyProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerLoyaltyProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loyaltyProgramId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earnedPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerLoyaltyProgramType", propOrder = {
    "loyaltyProgramId",
    "customerId",
    "earnedPoints",
    "usedPoints",
    "remainPoints"
})
public class CustomerLoyaltyProgramType {

    protected String loyaltyProgramId;
    protected String customerId;
    protected String earnedPoints;
    protected String usedPoints;
    protected String remainPoints;

    /**
     * Gets the value of the loyaltyProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyProgramId() {
        return loyaltyProgramId;
    }

    /**
     * Sets the value of the loyaltyProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyProgramId(String value) {
        this.loyaltyProgramId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the earnedPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnedPoints() {
        return earnedPoints;
    }

    /**
     * Sets the value of the earnedPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnedPoints(String value) {
        this.earnedPoints = value;
    }

    /**
     * Gets the value of the usedPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedPoints() {
        return usedPoints;
    }

    /**
     * Sets the value of the usedPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedPoints(String value) {
        this.usedPoints = value;
    }

    /**
     * Gets the value of the remainPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainPoints() {
        return remainPoints;
    }

    /**
     * Sets the value of the remainPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainPoints(String value) {
        this.remainPoints = value;
    }

}
