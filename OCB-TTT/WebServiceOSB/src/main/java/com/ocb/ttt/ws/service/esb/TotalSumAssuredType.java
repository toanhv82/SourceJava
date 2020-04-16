
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalSumAssuredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalSumAssuredType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumAssured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalSumAssuredType", propOrder = {
    "requestType",
    "requestValue",
    "sumAssured",
    "responseValue"
})
public class TotalSumAssuredType {

    protected String requestType;
    protected String requestValue;
    protected String sumAssured;
    protected String responseValue;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the requestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestValue() {
        return requestValue;
    }

    /**
     * Sets the value of the requestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestValue(String value) {
        this.requestValue = value;
    }

    /**
     * Gets the value of the sumAssured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumAssured() {
        return sumAssured;
    }

    /**
     * Sets the value of the sumAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumAssured(String value) {
        this.sumAssured = value;
    }

    /**
     * Gets the value of the responseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseValue() {
        return responseValue;
    }

    /**
     * Sets the value of the responseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseValue(String value) {
        this.responseValue = value;
    }

}
