
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
 *         &lt;element name="ConfirmTransactionCardResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "confirmTransactionCardResult"
})
@XmlRootElement(name = "ConfirmTransactionCardResponse")
public class ConfirmTransactionCardResponse {

    @XmlElement(name = "ConfirmTransactionCardResult")
    protected String confirmTransactionCardResult;

    /**
     * Gets the value of the confirmTransactionCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmTransactionCardResult() {
        return confirmTransactionCardResult;
    }

    /**
     * Sets the value of the confirmTransactionCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmTransactionCardResult(String value) {
        this.confirmTransactionCardResult = value;
    }

}
