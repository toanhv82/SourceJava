
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerResultInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerResultInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partnerResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerResultInfoType", propOrder = {
    "partnerResultCode",
    "partnerResultMsg"
})
public class PartnerResultInfoType {

    protected String partnerResultCode;
    protected String partnerResultMsg;

    /**
     * Gets the value of the partnerResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerResultCode() {
        return partnerResultCode;
    }

    /**
     * Sets the value of the partnerResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerResultCode(String value) {
        this.partnerResultCode = value;
    }

    /**
     * Gets the value of the partnerResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerResultMsg() {
        return partnerResultMsg;
    }

    /**
     * Sets the value of the partnerResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerResultMsg(String value) {
        this.partnerResultMsg = value;
    }

}
