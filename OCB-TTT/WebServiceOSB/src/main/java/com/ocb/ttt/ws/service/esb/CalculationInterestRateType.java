
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationInterestRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculationInterestRateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestCalculationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationMargin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationMinimumBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationInterestRateType", propOrder = {
    "interestCalculationKey",
    "interestCalculationMargin",
    "interestCalculationMinimumBalance",
    "interestCalculationRate"
})
public class CalculationInterestRateType {

    protected String interestCalculationKey;
    protected String interestCalculationMargin;
    protected String interestCalculationMinimumBalance;
    protected String interestCalculationRate;

    /**
     * Gets the value of the interestCalculationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationKey() {
        return interestCalculationKey;
    }

    /**
     * Sets the value of the interestCalculationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationKey(String value) {
        this.interestCalculationKey = value;
    }

    /**
     * Gets the value of the interestCalculationMargin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationMargin() {
        return interestCalculationMargin;
    }

    /**
     * Sets the value of the interestCalculationMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationMargin(String value) {
        this.interestCalculationMargin = value;
    }

    /**
     * Gets the value of the interestCalculationMinimumBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationMinimumBalance() {
        return interestCalculationMinimumBalance;
    }

    /**
     * Sets the value of the interestCalculationMinimumBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationMinimumBalance(String value) {
        this.interestCalculationMinimumBalance = value;
    }

    /**
     * Gets the value of the interestCalculationRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationRate() {
        return interestCalculationRate;
    }

    /**
     * Sets the value of the interestCalculationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationRate(String value) {
        this.interestCalculationRate = value;
    }

}
