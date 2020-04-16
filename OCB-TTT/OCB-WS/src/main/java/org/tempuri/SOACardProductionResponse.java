
package org.tempuri;

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
 *         &lt;element name="SOA_Card_ProductionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaCardProductionResult"
})
@XmlRootElement(name = "SOA_Card_ProductionResponse")
public class SOACardProductionResponse {

    @XmlElement(name = "SOA_Card_ProductionResult")
    protected String soaCardProductionResult;

    /**
     * Gets the value of the soaCardProductionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOACardProductionResult() {
        return soaCardProductionResult;
    }

    /**
     * Sets the value of the soaCardProductionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOACardProductionResult(String value) {
        this.soaCardProductionResult = value;
    }

}
