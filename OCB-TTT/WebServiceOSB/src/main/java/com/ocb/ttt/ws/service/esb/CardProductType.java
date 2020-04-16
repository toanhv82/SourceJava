
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardProductLimitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardProductLimitOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardProductLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardProductType", propOrder = {
    "cardProductLimitCode",
    "cardProductLimitOption",
    "cardProductLimit"
})
public class CardProductType {

    protected String cardProductLimitCode;
    protected String cardProductLimitOption;
    protected String cardProductLimit;

    /**
     * Gets the value of the cardProductLimitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductLimitCode() {
        return cardProductLimitCode;
    }

    /**
     * Sets the value of the cardProductLimitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductLimitCode(String value) {
        this.cardProductLimitCode = value;
    }

    /**
     * Gets the value of the cardProductLimitOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductLimitOption() {
        return cardProductLimitOption;
    }

    /**
     * Sets the value of the cardProductLimitOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductLimitOption(String value) {
        this.cardProductLimitOption = value;
    }

    /**
     * Gets the value of the cardProductLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductLimit() {
        return cardProductLimit;
    }

    /**
     * Sets the value of the cardProductLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductLimit(String value) {
        this.cardProductLimit = value;
    }

}
