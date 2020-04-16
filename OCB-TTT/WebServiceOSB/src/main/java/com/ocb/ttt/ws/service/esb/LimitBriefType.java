
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitBriefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitBriefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitBriefAmountGranted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitBriefAvailableAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitBriefCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitBriefDateGranted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitBriefType", propOrder = {
    "limitBriefAmountGranted",
    "limitBriefAvailableAmount",
    "limitBriefCurrency",
    "limitBriefDateGranted",
    "limitType"
})
public class LimitBriefType {

    protected String limitBriefAmountGranted;
    protected String limitBriefAvailableAmount;
    protected String limitBriefCurrency;
    protected String limitBriefDateGranted;
    protected String limitType;

    /**
     * Gets the value of the limitBriefAmountGranted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitBriefAmountGranted() {
        return limitBriefAmountGranted;
    }

    /**
     * Sets the value of the limitBriefAmountGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitBriefAmountGranted(String value) {
        this.limitBriefAmountGranted = value;
    }

    /**
     * Gets the value of the limitBriefAvailableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitBriefAvailableAmount() {
        return limitBriefAvailableAmount;
    }

    /**
     * Sets the value of the limitBriefAvailableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitBriefAvailableAmount(String value) {
        this.limitBriefAvailableAmount = value;
    }

    /**
     * Gets the value of the limitBriefCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitBriefCurrency() {
        return limitBriefCurrency;
    }

    /**
     * Sets the value of the limitBriefCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitBriefCurrency(String value) {
        this.limitBriefCurrency = value;
    }

    /**
     * Gets the value of the limitBriefDateGranted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitBriefDateGranted() {
        return limitBriefDateGranted;
    }

    /**
     * Sets the value of the limitBriefDateGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitBriefDateGranted(String value) {
        this.limitBriefDateGranted = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

}
