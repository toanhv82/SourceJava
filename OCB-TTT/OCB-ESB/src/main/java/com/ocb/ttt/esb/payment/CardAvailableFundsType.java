
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardAvailableFundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAvailableFundsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bonusExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cardOTBAmounts" type="{bian.com.vn}CardAvailableAmountsType" minOccurs="0"/>
 *         &lt;element name="availableFunds" type="{bian.com.vn}CardAvailableAmountsType" minOccurs="0"/>
 *         &lt;element name="cardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOTBAmounts" type="{bian.com.vn}CardAvailableAmountsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAvailableFundsType", propOrder = {
    "bonus",
    "bonusExpiryDate",
    "cardOTBAmounts",
    "availableFunds",
    "cardStatus",
    "accountOTBAmounts"
})
public class CardAvailableFundsType {

    protected String bonus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bonusExpiryDate;
    protected CardAvailableAmountsType cardOTBAmounts;
    protected CardAvailableAmountsType availableFunds;
    protected String cardStatus;
    protected CardAvailableAmountsType accountOTBAmounts;

    /**
     * Gets the value of the bonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonus() {
        return bonus;
    }

    /**
     * Sets the value of the bonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonus(String value) {
        this.bonus = value;
    }

    /**
     * Gets the value of the bonusExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBonusExpiryDate() {
        return bonusExpiryDate;
    }

    /**
     * Sets the value of the bonusExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBonusExpiryDate(XMLGregorianCalendar value) {
        this.bonusExpiryDate = value;
    }

    /**
     * Gets the value of the cardOTBAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public CardAvailableAmountsType getCardOTBAmounts() {
        return cardOTBAmounts;
    }

    /**
     * Sets the value of the cardOTBAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public void setCardOTBAmounts(CardAvailableAmountsType value) {
        this.cardOTBAmounts = value;
    }

    /**
     * Gets the value of the availableFunds property.
     * 
     * @return
     *     possible object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public CardAvailableAmountsType getAvailableFunds() {
        return availableFunds;
    }

    /**
     * Sets the value of the availableFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public void setAvailableFunds(CardAvailableAmountsType value) {
        this.availableFunds = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the accountOTBAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public CardAvailableAmountsType getAccountOTBAmounts() {
        return accountOTBAmounts;
    }

    /**
     * Sets the value of the accountOTBAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAvailableAmountsType }
     *     
     */
    public void setAccountOTBAmounts(CardAvailableAmountsType value) {
        this.accountOTBAmounts = value;
    }

}
