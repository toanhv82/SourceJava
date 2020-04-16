
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
 *         &lt;element name="Promotion_Get_BHD_CodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "promotionGetBHDCodeResult"
})
@XmlRootElement(name = "Promotion_Get_BHD_CodeResponse")
public class PromotionGetBHDCodeResponse {

    @XmlElement(name = "Promotion_Get_BHD_CodeResult")
    protected String promotionGetBHDCodeResult;

    /**
     * Gets the value of the promotionGetBHDCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionGetBHDCodeResult() {
        return promotionGetBHDCodeResult;
    }

    /**
     * Sets the value of the promotionGetBHDCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionGetBHDCodeResult(String value) {
        this.promotionGetBHDCodeResult = value;
    }

}
