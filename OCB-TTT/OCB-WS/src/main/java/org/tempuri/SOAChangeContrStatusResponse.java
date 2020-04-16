
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
 *         &lt;element name="SOA_Change_Contr_StatusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaChangeContrStatusResult"
})
@XmlRootElement(name = "SOA_Change_Contr_StatusResponse")
public class SOAChangeContrStatusResponse {

    @XmlElement(name = "SOA_Change_Contr_StatusResult")
    protected String soaChangeContrStatusResult;

    /**
     * Gets the value of the soaChangeContrStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAChangeContrStatusResult() {
        return soaChangeContrStatusResult;
    }

    /**
     * Sets the value of the soaChangeContrStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAChangeContrStatusResult(String value) {
        this.soaChangeContrStatusResult = value;
    }

}
