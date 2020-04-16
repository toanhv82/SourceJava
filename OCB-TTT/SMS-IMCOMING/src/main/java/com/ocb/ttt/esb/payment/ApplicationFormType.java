
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumAssured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationFormType", propOrder = {
    "orderId",
    "sumAssured",
    "premiumTotal",
    "statusPayment",
    "channelSource"
})
public class ApplicationFormType {

    protected String orderId;
    protected String sumAssured;
    protected String premiumTotal;
    protected String statusPayment;
    protected String channelSource;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the sumAssured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumAssured() {
        return sumAssured;
    }

    /**
     * Sets the value of the sumAssured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumAssured(String value) {
        this.sumAssured = value;
    }

    /**
     * Gets the value of the premiumTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumTotal() {
        return premiumTotal;
    }

    /**
     * Sets the value of the premiumTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumTotal(String value) {
        this.premiumTotal = value;
    }

    /**
     * Gets the value of the statusPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPayment() {
        return statusPayment;
    }

    /**
     * Sets the value of the statusPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPayment(String value) {
        this.statusPayment = value;
    }

    /**
     * Gets the value of the channelSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSource() {
        return channelSource;
    }

    /**
     * Sets the value of the channelSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSource(String value) {
        this.channelSource = value;
    }

}
