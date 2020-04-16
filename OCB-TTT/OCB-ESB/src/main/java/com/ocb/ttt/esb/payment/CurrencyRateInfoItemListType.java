
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateInfoItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateInfoItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyRateInfo" type="{bian.com.vn}CurrencyRateInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateInfoItemListType", propOrder = {
    "currencyRateInfo"
})
public class CurrencyRateInfoItemListType {

    @XmlElement(required = true)
    protected CurrencyRateInfoType currencyRateInfo;

    /**
     * Gets the value of the currencyRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRateInfoType }
     *     
     */
    public CurrencyRateInfoType getCurrencyRateInfo() {
        return currencyRateInfo;
    }

    /**
     * Sets the value of the currencyRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRateInfoType }
     *     
     */
    public void setCurrencyRateInfo(CurrencyRateInfoType value) {
        this.currencyRateInfo = value;
    }

}
