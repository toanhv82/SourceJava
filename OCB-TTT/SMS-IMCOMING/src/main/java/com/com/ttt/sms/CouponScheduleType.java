
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponInterestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbParValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbCleanPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbTransAmount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbInterestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositoryCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxbTransAmount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponScheduleType", propOrder = {
    "couponStartDate",
    "couponInterestRate",
    "bondCode",
    "rxbParValue",
    "rxbCleanPrice",
    "rxbTransAmount1",
    "rxbDirtyPrice",
    "rxbInterestAmount",
    "depositoryCompanyCode",
    "rxbTransAmount2"
})
public class CouponScheduleType {

    protected String couponStartDate;
    protected String couponInterestRate;
    protected String bondCode;
    protected String rxbParValue;
    protected String rxbCleanPrice;
    protected String rxbTransAmount1;
    protected String rxbDirtyPrice;
    protected String rxbInterestAmount;
    protected String depositoryCompanyCode;
    protected String rxbTransAmount2;

    /**
     * Gets the value of the couponStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponStartDate() {
        return couponStartDate;
    }

    /**
     * Sets the value of the couponStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponStartDate(String value) {
        this.couponStartDate = value;
    }

    /**
     * Gets the value of the couponInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponInterestRate() {
        return couponInterestRate;
    }

    /**
     * Sets the value of the couponInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponInterestRate(String value) {
        this.couponInterestRate = value;
    }

    /**
     * Gets the value of the bondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondCode() {
        return bondCode;
    }

    /**
     * Sets the value of the bondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondCode(String value) {
        this.bondCode = value;
    }

    /**
     * Gets the value of the rxbParValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbParValue() {
        return rxbParValue;
    }

    /**
     * Sets the value of the rxbParValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbParValue(String value) {
        this.rxbParValue = value;
    }

    /**
     * Gets the value of the rxbCleanPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbCleanPrice() {
        return rxbCleanPrice;
    }

    /**
     * Sets the value of the rxbCleanPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbCleanPrice(String value) {
        this.rxbCleanPrice = value;
    }

    /**
     * Gets the value of the rxbTransAmount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbTransAmount1() {
        return rxbTransAmount1;
    }

    /**
     * Sets the value of the rxbTransAmount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbTransAmount1(String value) {
        this.rxbTransAmount1 = value;
    }

    /**
     * Gets the value of the rxbDirtyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbDirtyPrice() {
        return rxbDirtyPrice;
    }

    /**
     * Sets the value of the rxbDirtyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbDirtyPrice(String value) {
        this.rxbDirtyPrice = value;
    }

    /**
     * Gets the value of the rxbInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbInterestAmount() {
        return rxbInterestAmount;
    }

    /**
     * Sets the value of the rxbInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbInterestAmount(String value) {
        this.rxbInterestAmount = value;
    }

    /**
     * Gets the value of the depositoryCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositoryCompanyCode() {
        return depositoryCompanyCode;
    }

    /**
     * Sets the value of the depositoryCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositoryCompanyCode(String value) {
        this.depositoryCompanyCode = value;
    }

    /**
     * Gets the value of the rxbTransAmount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxbTransAmount2() {
        return rxbTransAmount2;
    }

    /**
     * Sets the value of the rxbTransAmount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxbTransAmount2(String value) {
        this.rxbTransAmount2 = value;
    }

}
