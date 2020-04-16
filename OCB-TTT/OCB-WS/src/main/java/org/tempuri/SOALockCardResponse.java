
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
 *         &lt;element name="SOA_Lock_CardResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaLockCardResult"
})
@XmlRootElement(name = "SOA_Lock_CardResponse")
public class SOALockCardResponse {

    @XmlElement(name = "SOA_Lock_CardResult")
    protected String soaLockCardResult;

    /**
     * Gets the value of the soaLockCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOALockCardResult() {
        return soaLockCardResult;
    }

    /**
     * Sets the value of the soaLockCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOALockCardResult(String value) {
        this.soaLockCardResult = value;
    }

}
