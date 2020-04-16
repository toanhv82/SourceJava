
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internetLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internetUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyPosUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyPosLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyAtmUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyAtmLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyPosUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyPosLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyAtmUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxDailyAtmLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motoLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motoUseLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardInfo" type="{bian.com.vn}CardInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetailType", propOrder = {
    "accountNumber",
    "cardLimit",
    "internetLimit",
    "internetUseLimit",
    "dailyPosUseLimit",
    "dailyPosLimit",
    "dailyAtmUseLimit",
    "dailyAtmLimit",
    "maxDailyPosUseLimit",
    "maxDailyPosLimit",
    "maxDailyAtmUseLimit",
    "maxDailyAtmLimit",
    "mainCard",
    "motoLimit",
    "motoUseLimit",
    "name",
    "previousCardNumber",
    "cardInfo"
})
public class CardDetailType {

    protected String accountNumber;
    protected String cardLimit;
    protected String internetLimit;
    protected String internetUseLimit;
    protected String dailyPosUseLimit;
    protected String dailyPosLimit;
    protected String dailyAtmUseLimit;
    protected String dailyAtmLimit;
    protected String maxDailyPosUseLimit;
    protected String maxDailyPosLimit;
    protected String maxDailyAtmUseLimit;
    protected String maxDailyAtmLimit;
    protected String mainCard;
    protected String motoLimit;
    protected String motoUseLimit;
    protected String name;
    protected String previousCardNumber;
    protected CardInfoType cardInfo;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLimit() {
        return cardLimit;
    }

    /**
     * Sets the value of the cardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLimit(String value) {
        this.cardLimit = value;
    }

    /**
     * Gets the value of the internetLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetLimit() {
        return internetLimit;
    }

    /**
     * Sets the value of the internetLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetLimit(String value) {
        this.internetLimit = value;
    }

    /**
     * Gets the value of the internetUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetUseLimit() {
        return internetUseLimit;
    }

    /**
     * Sets the value of the internetUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetUseLimit(String value) {
        this.internetUseLimit = value;
    }

    /**
     * Gets the value of the dailyPosUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyPosUseLimit() {
        return dailyPosUseLimit;
    }

    /**
     * Sets the value of the dailyPosUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyPosUseLimit(String value) {
        this.dailyPosUseLimit = value;
    }

    /**
     * Gets the value of the dailyPosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyPosLimit() {
        return dailyPosLimit;
    }

    /**
     * Sets the value of the dailyPosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyPosLimit(String value) {
        this.dailyPosLimit = value;
    }

    /**
     * Gets the value of the dailyAtmUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyAtmUseLimit() {
        return dailyAtmUseLimit;
    }

    /**
     * Sets the value of the dailyAtmUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyAtmUseLimit(String value) {
        this.dailyAtmUseLimit = value;
    }

    /**
     * Gets the value of the dailyAtmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDailyAtmLimit() {
        return dailyAtmLimit;
    }

    /**
     * Sets the value of the dailyAtmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDailyAtmLimit(String value) {
        this.dailyAtmLimit = value;
    }

    /**
     * Gets the value of the maxDailyPosUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyPosUseLimit() {
        return maxDailyPosUseLimit;
    }

    /**
     * Sets the value of the maxDailyPosUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyPosUseLimit(String value) {
        this.maxDailyPosUseLimit = value;
    }

    /**
     * Gets the value of the maxDailyPosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyPosLimit() {
        return maxDailyPosLimit;
    }

    /**
     * Sets the value of the maxDailyPosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyPosLimit(String value) {
        this.maxDailyPosLimit = value;
    }

    /**
     * Gets the value of the maxDailyAtmUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyAtmUseLimit() {
        return maxDailyAtmUseLimit;
    }

    /**
     * Sets the value of the maxDailyAtmUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyAtmUseLimit(String value) {
        this.maxDailyAtmUseLimit = value;
    }

    /**
     * Gets the value of the maxDailyAtmLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDailyAtmLimit() {
        return maxDailyAtmLimit;
    }

    /**
     * Sets the value of the maxDailyAtmLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDailyAtmLimit(String value) {
        this.maxDailyAtmLimit = value;
    }

    /**
     * Gets the value of the mainCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCard() {
        return mainCard;
    }

    /**
     * Sets the value of the mainCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCard(String value) {
        this.mainCard = value;
    }

    /**
     * Gets the value of the motoLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotoLimit() {
        return motoLimit;
    }

    /**
     * Sets the value of the motoLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotoLimit(String value) {
        this.motoLimit = value;
    }

    /**
     * Gets the value of the motoUseLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotoUseLimit() {
        return motoUseLimit;
    }

    /**
     * Sets the value of the motoUseLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotoUseLimit(String value) {
        this.motoUseLimit = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the previousCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCardNumber() {
        return previousCardNumber;
    }

    /**
     * Sets the value of the previousCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCardNumber(String value) {
        this.previousCardNumber = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCardInfo(CardInfoType value) {
        this.cardInfo = value;
    }

}
