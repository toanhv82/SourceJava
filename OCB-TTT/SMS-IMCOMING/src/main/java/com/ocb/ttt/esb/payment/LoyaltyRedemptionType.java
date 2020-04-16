
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyRedemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyRedemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="redeemDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redeemPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redeemChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRedemptionType", propOrder = {
    "redeemDate",
    "giftCode",
    "giftName",
    "redeemPoints",
    "quantity",
    "mailingAddress",
    "phoneNumber",
    "redeemChannel"
})
public class LoyaltyRedemptionType {

    protected String redeemDate;
    protected String giftCode;
    protected String giftName;
    protected String redeemPoints;
    protected String quantity;
    protected String mailingAddress;
    protected String phoneNumber;
    protected String redeemChannel;

    /**
     * Gets the value of the redeemDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemDate() {
        return redeemDate;
    }

    /**
     * Sets the value of the redeemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemDate(String value) {
        this.redeemDate = value;
    }

    /**
     * Gets the value of the giftCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCode() {
        return giftCode;
    }

    /**
     * Sets the value of the giftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCode(String value) {
        this.giftCode = value;
    }

    /**
     * Gets the value of the giftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftName() {
        return giftName;
    }

    /**
     * Sets the value of the giftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftName(String value) {
        this.giftName = value;
    }

    /**
     * Gets the value of the redeemPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemPoints() {
        return redeemPoints;
    }

    /**
     * Sets the value of the redeemPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemPoints(String value) {
        this.redeemPoints = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddress(String value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the redeemChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemChannel() {
        return redeemChannel;
    }

    /**
     * Sets the value of the redeemChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemChannel(String value) {
        this.redeemChannel = value;
    }

}
