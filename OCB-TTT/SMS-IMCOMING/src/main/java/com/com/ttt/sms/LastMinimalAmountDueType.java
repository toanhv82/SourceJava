
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LastMinimalAmountDueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastMinimalAmountDueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastMinimalAmountDueFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastMinimalAmountDueInterestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastMinimalAmountDueMonthlyFeeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastMinimalAmountDuePaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastMinimalAmountDueTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastMinimalAmountDueType", propOrder = {
    "lastMinimalAmountDueFeeAmount",
    "lastMinimalAmountDueInterestAmount",
    "lastMinimalAmountDueMonthlyFeeAmount",
    "lastMinimalAmountDuePaymentDate",
    "lastMinimalAmountDueTotalAmount"
})
public class LastMinimalAmountDueType {

    protected String lastMinimalAmountDueFeeAmount;
    protected String lastMinimalAmountDueInterestAmount;
    protected String lastMinimalAmountDueMonthlyFeeAmount;
    protected String lastMinimalAmountDuePaymentDate;
    protected String lastMinimalAmountDueTotalAmount;

    /**
     * Gets the value of the lastMinimalAmountDueFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMinimalAmountDueFeeAmount() {
        return lastMinimalAmountDueFeeAmount;
    }

    /**
     * Sets the value of the lastMinimalAmountDueFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMinimalAmountDueFeeAmount(String value) {
        this.lastMinimalAmountDueFeeAmount = value;
    }

    /**
     * Gets the value of the lastMinimalAmountDueInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMinimalAmountDueInterestAmount() {
        return lastMinimalAmountDueInterestAmount;
    }

    /**
     * Sets the value of the lastMinimalAmountDueInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMinimalAmountDueInterestAmount(String value) {
        this.lastMinimalAmountDueInterestAmount = value;
    }

    /**
     * Gets the value of the lastMinimalAmountDueMonthlyFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMinimalAmountDueMonthlyFeeAmount() {
        return lastMinimalAmountDueMonthlyFeeAmount;
    }

    /**
     * Sets the value of the lastMinimalAmountDueMonthlyFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMinimalAmountDueMonthlyFeeAmount(String value) {
        this.lastMinimalAmountDueMonthlyFeeAmount = value;
    }

    /**
     * Gets the value of the lastMinimalAmountDuePaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMinimalAmountDuePaymentDate() {
        return lastMinimalAmountDuePaymentDate;
    }

    /**
     * Sets the value of the lastMinimalAmountDuePaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMinimalAmountDuePaymentDate(String value) {
        this.lastMinimalAmountDuePaymentDate = value;
    }

    /**
     * Gets the value of the lastMinimalAmountDueTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastMinimalAmountDueTotalAmount() {
        return lastMinimalAmountDueTotalAmount;
    }

    /**
     * Sets the value of the lastMinimalAmountDueTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastMinimalAmountDueTotalAmount(String value) {
        this.lastMinimalAmountDueTotalAmount = value;
    }

}
