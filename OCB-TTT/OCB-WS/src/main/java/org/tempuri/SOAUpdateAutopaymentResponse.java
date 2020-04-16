
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
 *         &lt;element name="SOA_Update_AutopaymentResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaUpdateAutopaymentResult"
})
@XmlRootElement(name = "SOA_Update_AutopaymentResponse")
public class SOAUpdateAutopaymentResponse {

    @XmlElement(name = "SOA_Update_AutopaymentResult")
    protected String soaUpdateAutopaymentResult;

    /**
     * Gets the value of the soaUpdateAutopaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAUpdateAutopaymentResult() {
        return soaUpdateAutopaymentResult;
    }

    /**
     * Sets the value of the soaUpdateAutopaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAUpdateAutopaymentResult(String value) {
        this.soaUpdateAutopaymentResult = value;
    }

}
