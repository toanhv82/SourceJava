
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="averageRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sellRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validStartingFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyPairCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashSellRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferSellRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashBuyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferBuyRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateInfoType", propOrder = {
    "currencyCode",
    "averageRate",
    "buyRate",
    "exchangeQuantity",
    "sellRate",
    "validStartingFrom",
    "market",
    "currencyPairCode",
    "cashSellRate",
    "transferSellRate",
    "cashBuyRate",
    "transferBuyRate",
    "lastUpdatedDateTime"
})
public class CurrencyRateInfoType {

    protected String currencyCode;
    protected String averageRate;
    protected String buyRate;
    protected String exchangeQuantity;
    protected String sellRate;
    protected String validStartingFrom;
    protected String market;
    protected String currencyPairCode;
    protected String cashSellRate;
    protected String transferSellRate;
    protected String cashBuyRate;
    protected String transferBuyRate;
    protected String lastUpdatedDateTime;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageRate(String value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the buyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyRate() {
        return buyRate;
    }

    /**
     * Sets the value of the buyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyRate(String value) {
        this.buyRate = value;
    }

    /**
     * Gets the value of the exchangeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeQuantity() {
        return exchangeQuantity;
    }

    /**
     * Sets the value of the exchangeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeQuantity(String value) {
        this.exchangeQuantity = value;
    }

    /**
     * Gets the value of the sellRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellRate() {
        return sellRate;
    }

    /**
     * Sets the value of the sellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellRate(String value) {
        this.sellRate = value;
    }

    /**
     * Gets the value of the validStartingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidStartingFrom() {
        return validStartingFrom;
    }

    /**
     * Sets the value of the validStartingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidStartingFrom(String value) {
        this.validStartingFrom = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the currencyPairCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyPairCode() {
        return currencyPairCode;
    }

    /**
     * Sets the value of the currencyPairCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyPairCode(String value) {
        this.currencyPairCode = value;
    }

    /**
     * Gets the value of the cashSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashSellRate() {
        return cashSellRate;
    }

    /**
     * Sets the value of the cashSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashSellRate(String value) {
        this.cashSellRate = value;
    }

    /**
     * Gets the value of the transferSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferSellRate() {
        return transferSellRate;
    }

    /**
     * Sets the value of the transferSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferSellRate(String value) {
        this.transferSellRate = value;
    }

    /**
     * Gets the value of the cashBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashBuyRate() {
        return cashBuyRate;
    }

    /**
     * Sets the value of the cashBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashBuyRate(String value) {
        this.cashBuyRate = value;
    }

    /**
     * Gets the value of the transferBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferBuyRate() {
        return transferBuyRate;
    }

    /**
     * Sets the value of the transferBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferBuyRate(String value) {
        this.transferBuyRate = value;
    }

    /**
     * Gets the value of the lastUpdatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * Sets the value of the lastUpdatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedDateTime(String value) {
        this.lastUpdatedDateTime = value;
    }

}
