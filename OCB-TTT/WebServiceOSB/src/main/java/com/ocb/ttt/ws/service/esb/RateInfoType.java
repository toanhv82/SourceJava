
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateMaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateMinAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratePeriodUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rangeOpeningValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInfoType", propOrder = {
    "rate",
    "rateMaxAmount",
    "rateMinAmount",
    "rateTerm",
    "ratePeriodUnit",
    "campaignId",
    "rangeOpeningValue"
})
public class RateInfoType {

    protected String rate;
    protected String rateMaxAmount;
    protected String rateMinAmount;
    protected String rateTerm;
    protected String ratePeriodUnit;
    protected String campaignId;
    protected String rangeOpeningValue;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rateMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateMaxAmount() {
        return rateMaxAmount;
    }

    /**
     * Sets the value of the rateMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateMaxAmount(String value) {
        this.rateMaxAmount = value;
    }

    /**
     * Gets the value of the rateMinAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateMinAmount() {
        return rateMinAmount;
    }

    /**
     * Sets the value of the rateMinAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateMinAmount(String value) {
        this.rateMinAmount = value;
    }

    /**
     * Gets the value of the rateTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTerm() {
        return rateTerm;
    }

    /**
     * Sets the value of the rateTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTerm(String value) {
        this.rateTerm = value;
    }

    /**
     * Gets the value of the ratePeriodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePeriodUnit() {
        return ratePeriodUnit;
    }

    /**
     * Sets the value of the ratePeriodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePeriodUnit(String value) {
        this.ratePeriodUnit = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignId(String value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the rangeOpeningValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeOpeningValue() {
        return rangeOpeningValue;
    }

    /**
     * Sets the value of the rangeOpeningValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeOpeningValue(String value) {
        this.rangeOpeningValue = value;
    }

}
