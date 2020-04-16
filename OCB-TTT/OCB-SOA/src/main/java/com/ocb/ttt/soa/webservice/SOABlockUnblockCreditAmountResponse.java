
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
 *         &lt;element name="SOA_Block_Unblock_Credit_AmountResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaBlockUnblockCreditAmountResult"
})
@XmlRootElement(name = "SOA_Block_Unblock_Credit_AmountResponse")
public class SOABlockUnblockCreditAmountResponse {

    @XmlElement(name = "SOA_Block_Unblock_Credit_AmountResult")
    protected String soaBlockUnblockCreditAmountResult;

    /**
     * Gets the value of the soaBlockUnblockCreditAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOABlockUnblockCreditAmountResult() {
        return soaBlockUnblockCreditAmountResult;
    }

    /**
     * Sets the value of the soaBlockUnblockCreditAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOABlockUnblockCreditAmountResult(String value) {
        this.soaBlockUnblockCreditAmountResult = value;
    }

}
