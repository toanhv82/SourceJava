
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
 *         &lt;element name="SOA_Update_OVDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaUpdateOVDResult"
})
@XmlRootElement(name = "SOA_Update_OVDResponse")
public class SOAUpdateOVDResponse {

    @XmlElement(name = "SOA_Update_OVDResult")
    protected String soaUpdateOVDResult;

    /**
     * Gets the value of the soaUpdateOVDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAUpdateOVDResult() {
        return soaUpdateOVDResult;
    }

    /**
     * Sets the value of the soaUpdateOVDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAUpdateOVDResult(String value) {
        this.soaUpdateOVDResult = value;
    }

}
