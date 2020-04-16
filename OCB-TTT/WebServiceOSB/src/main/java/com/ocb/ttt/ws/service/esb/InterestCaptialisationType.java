
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestCaptialisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestCaptialisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestCaptialisationDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationNextDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationPeriodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationPeriodUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationNext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationPrevious" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestCaptialisationTotalAccrued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCaptialisationType", propOrder = {
    "interestCaptialisationDayOfMonth",
    "interestCaptialisationNextDate",
    "interestCaptialisationPeriodCount",
    "interestCaptialisationPeriodUnit",
    "interestCaptialisationType",
    "interestCaptialisationNext",
    "interestCaptialisationPrevious",
    "interestCaptialisationTotalAccrued"
})
public class InterestCaptialisationType {

    protected String interestCaptialisationDayOfMonth;
    protected String interestCaptialisationNextDate;
    protected String interestCaptialisationPeriodCount;
    protected String interestCaptialisationPeriodUnit;
    protected String interestCaptialisationType;
    protected String interestCaptialisationNext;
    protected String interestCaptialisationPrevious;
    protected String interestCaptialisationTotalAccrued;

    /**
     * Gets the value of the interestCaptialisationDayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationDayOfMonth() {
        return interestCaptialisationDayOfMonth;
    }

    /**
     * Sets the value of the interestCaptialisationDayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationDayOfMonth(String value) {
        this.interestCaptialisationDayOfMonth = value;
    }

    /**
     * Gets the value of the interestCaptialisationNextDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationNextDate() {
        return interestCaptialisationNextDate;
    }

    /**
     * Sets the value of the interestCaptialisationNextDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationNextDate(String value) {
        this.interestCaptialisationNextDate = value;
    }

    /**
     * Gets the value of the interestCaptialisationPeriodCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationPeriodCount() {
        return interestCaptialisationPeriodCount;
    }

    /**
     * Sets the value of the interestCaptialisationPeriodCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationPeriodCount(String value) {
        this.interestCaptialisationPeriodCount = value;
    }

    /**
     * Gets the value of the interestCaptialisationPeriodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationPeriodUnit() {
        return interestCaptialisationPeriodUnit;
    }

    /**
     * Sets the value of the interestCaptialisationPeriodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationPeriodUnit(String value) {
        this.interestCaptialisationPeriodUnit = value;
    }

    /**
     * Gets the value of the interestCaptialisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationType() {
        return interestCaptialisationType;
    }

    /**
     * Sets the value of the interestCaptialisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationType(String value) {
        this.interestCaptialisationType = value;
    }

    /**
     * Gets the value of the interestCaptialisationNext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationNext() {
        return interestCaptialisationNext;
    }

    /**
     * Sets the value of the interestCaptialisationNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationNext(String value) {
        this.interestCaptialisationNext = value;
    }

    /**
     * Gets the value of the interestCaptialisationPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationPrevious() {
        return interestCaptialisationPrevious;
    }

    /**
     * Sets the value of the interestCaptialisationPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationPrevious(String value) {
        this.interestCaptialisationPrevious = value;
    }

    /**
     * Gets the value of the interestCaptialisationTotalAccrued property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCaptialisationTotalAccrued() {
        return interestCaptialisationTotalAccrued;
    }

    /**
     * Sets the value of the interestCaptialisationTotalAccrued property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCaptialisationTotalAccrued(String value) {
        this.interestCaptialisationTotalAccrued = value;
    }

}
