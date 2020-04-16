
package com.ocb.ttt.soa.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source_channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_param" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourceChannel",
    "inParam",
    "inType"
})
@XmlRootElement(name = "SOA_Issuing_Card")
public class SOAIssuingCard {

    @XmlElement(name = "source_channel")
    protected String sourceChannel;
    @XmlElement(name = "in_param")
    protected String inParam;
    @XmlElement(name = "in_type")
    protected String inType;

    /**
     * Gets the value of the sourceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceChannel() {
        return sourceChannel;
    }

    /**
     * Sets the value of the sourceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceChannel(String value) {
        this.sourceChannel = value;
    }

    /**
     * Gets the value of the inParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParam() {
        return inParam;
    }

    /**
     * Sets the value of the inParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParam(String value) {
        this.inParam = value;
    }

    /**
     * Gets the value of the inType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInType() {
        return inType;
    }

    /**
     * Sets the value of the inType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInType(String value) {
        this.inType = value;
    }

}
