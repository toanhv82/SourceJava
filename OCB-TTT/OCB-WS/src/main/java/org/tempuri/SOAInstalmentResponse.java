
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
 *         &lt;element name="SOA_InstalmentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaInstalmentResult"
})
@XmlRootElement(name = "SOA_InstalmentResponse")
public class SOAInstalmentResponse {

    @XmlElement(name = "SOA_InstalmentResult")
    protected String soaInstalmentResult;

    /**
     * Gets the value of the soaInstalmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAInstalmentResult() {
        return soaInstalmentResult;
    }

    /**
     * Sets the value of the soaInstalmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAInstalmentResult(String value) {
        this.soaInstalmentResult = value;
    }

}
