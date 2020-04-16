
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchPaymentItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchPaymentItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentItem" type="{bian.com.vn}BatchPaymentItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchPaymentItemListType", propOrder = {
    "paymentItem"
})
public class BatchPaymentItemListType {

    protected BatchPaymentItemType paymentItem;

    /**
     * Gets the value of the paymentItem property.
     * 
     * @return
     *     possible object is
     *     {@link BatchPaymentItemType }
     *     
     */
    public BatchPaymentItemType getPaymentItem() {
        return paymentItem;
    }

    /**
     * Sets the value of the paymentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchPaymentItemType }
     *     
     */
    public void setPaymentItem(BatchPaymentItemType value) {
        this.paymentItem = value;
    }

}
