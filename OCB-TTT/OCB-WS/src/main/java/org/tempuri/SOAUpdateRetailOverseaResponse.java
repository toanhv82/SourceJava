
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
 *         &lt;element name="SOA_Update_Retail_OverseaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaUpdateRetailOverseaResult"
})
@XmlRootElement(name = "SOA_Update_Retail_OverseaResponse")
public class SOAUpdateRetailOverseaResponse {

    @XmlElement(name = "SOA_Update_Retail_OverseaResult")
    protected String soaUpdateRetailOverseaResult;

    /**
     * Gets the value of the soaUpdateRetailOverseaResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAUpdateRetailOverseaResult() {
        return soaUpdateRetailOverseaResult;
    }

    /**
     * Sets the value of the soaUpdateRetailOverseaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAUpdateRetailOverseaResult(String value) {
        this.soaUpdateRetailOverseaResult = value;
    }

}
