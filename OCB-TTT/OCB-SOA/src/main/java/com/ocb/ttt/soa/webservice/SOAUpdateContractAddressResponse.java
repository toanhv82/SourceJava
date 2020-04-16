
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
 *         &lt;element name="SOA_Update_Contract_AddressResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaUpdateContractAddressResult"
})
@XmlRootElement(name = "SOA_Update_Contract_AddressResponse")
public class SOAUpdateContractAddressResponse {

    @XmlElement(name = "SOA_Update_Contract_AddressResult")
    protected String soaUpdateContractAddressResult;

    /**
     * Gets the value of the soaUpdateContractAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAUpdateContractAddressResult() {
        return soaUpdateContractAddressResult;
    }

    /**
     * Sets the value of the soaUpdateContractAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAUpdateContractAddressResult(String value) {
        this.soaUpdateContractAddressResult = value;
    }

}
