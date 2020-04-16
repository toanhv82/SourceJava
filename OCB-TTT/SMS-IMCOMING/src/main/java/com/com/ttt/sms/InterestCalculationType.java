
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestCalculationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestCalculationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestCalculationBalanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationOrigination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationMinimumBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCalculationRate" type="{bian.com.vn}CalculationInterestRateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculationType", propOrder = {
    "interestCalculationBalanceType",
    "interestCalculationType",
    "interestCalculationOrigination",
    "interestCalculationMinimumBalance",
    "interestCalculationStartDate",
    "interestCalculationEndDate",
    "interestCalculationRate"
})
public class InterestCalculationType {

    protected String interestCalculationBalanceType;
    protected String interestCalculationType;
    protected String interestCalculationOrigination;
    protected String interestCalculationMinimumBalance;
    protected String interestCalculationStartDate;
    protected String interestCalculationEndDate;
    protected List<CalculationInterestRateType> interestCalculationRate;

    /**
     * Gets the value of the interestCalculationBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationBalanceType() {
        return interestCalculationBalanceType;
    }

    /**
     * Sets the value of the interestCalculationBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationBalanceType(String value) {
        this.interestCalculationBalanceType = value;
    }

    /**
     * Gets the value of the interestCalculationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationType() {
        return interestCalculationType;
    }

    /**
     * Sets the value of the interestCalculationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationType(String value) {
        this.interestCalculationType = value;
    }

    /**
     * Gets the value of the interestCalculationOrigination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationOrigination() {
        return interestCalculationOrigination;
    }

    /**
     * Sets the value of the interestCalculationOrigination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationOrigination(String value) {
        this.interestCalculationOrigination = value;
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
     * Gets the value of the interestCalculationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationStartDate() {
        return interestCalculationStartDate;
    }

    /**
     * Sets the value of the interestCalculationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationStartDate(String value) {
        this.interestCalculationStartDate = value;
    }

    /**
     * Gets the value of the interestCalculationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCalculationEndDate() {
        return interestCalculationEndDate;
    }

    /**
     * Sets the value of the interestCalculationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCalculationEndDate(String value) {
        this.interestCalculationEndDate = value;
    }

    /**
     * Gets the value of the interestCalculationRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestCalculationRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestCalculationRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationInterestRateType }
     * 
     * 
     */
    public List<CalculationInterestRateType> getInterestCalculationRate() {
        if (interestCalculationRate == null) {
            interestCalculationRate = new ArrayList<CalculationInterestRateType>();
        }
        return this.interestCalculationRate;
    }

}
