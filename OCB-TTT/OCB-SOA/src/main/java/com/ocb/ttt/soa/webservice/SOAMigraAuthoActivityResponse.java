
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
 *         &lt;element name="SOA_Migra_Autho_ActivityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaMigraAuthoActivityResult"
})
@XmlRootElement(name = "SOA_Migra_Autho_ActivityResponse")
public class SOAMigraAuthoActivityResponse {

    @XmlElement(name = "SOA_Migra_Autho_ActivityResult")
    protected String soaMigraAuthoActivityResult;

    /**
     * Gets the value of the soaMigraAuthoActivityResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAMigraAuthoActivityResult() {
        return soaMigraAuthoActivityResult;
    }

    /**
     * Sets the value of the soaMigraAuthoActivityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAMigraAuthoActivityResult(String value) {
        this.soaMigraAuthoActivityResult = value;
    }

}
