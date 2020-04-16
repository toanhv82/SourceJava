
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
 *         &lt;element name="SOA_Reset_3d_OTPResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaReset3DOTPResult"
})
@XmlRootElement(name = "SOA_Reset_3d_OTPResponse")
public class SOAReset3DOTPResponse {

    @XmlElement(name = "SOA_Reset_3d_OTPResult")
    protected String soaReset3DOTPResult;

    /**
     * Gets the value of the soaReset3DOTPResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAReset3DOTPResult() {
        return soaReset3DOTPResult;
    }

    /**
     * Sets the value of the soaReset3DOTPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAReset3DOTPResult(String value) {
        this.soaReset3DOTPResult = value;
    }

}
