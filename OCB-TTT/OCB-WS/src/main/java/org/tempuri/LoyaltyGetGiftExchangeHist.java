
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
 *         &lt;element name="in_parameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inParameter"
})
@XmlRootElement(name = "Loyalty_Get_Gift_Exchange_Hist")
public class LoyaltyGetGiftExchangeHist {

    @XmlElement(name = "in_parameter")
    protected String inParameter;

    /**
     * Gets the value of the inParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParameter() {
        return inParameter;
    }

    /**
     * Sets the value of the inParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParameter(String value) {
        this.inParameter = value;
    }

}
