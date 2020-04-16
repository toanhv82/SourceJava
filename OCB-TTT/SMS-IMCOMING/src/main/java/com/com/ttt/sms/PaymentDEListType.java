
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDEListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDEListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDEListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDEItem" type="{bian.com.vn}PaymentDEItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDEListType", propOrder = {
    "paymentDEListID",
    "paymentDEItem"
})
public class PaymentDEListType {

    protected String paymentDEListID;
    @XmlElement(name = "PaymentDEItem", required = true)
    protected List<PaymentDEItemType> paymentDEItem;

    /**
     * Gets the value of the paymentDEListID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDEListID() {
        return paymentDEListID;
    }

    /**
     * Sets the value of the paymentDEListID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDEListID(String value) {
        this.paymentDEListID = value;
    }

    /**
     * Gets the value of the paymentDEItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDEItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDEItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDEItemType }
     * 
     * 
     */
    public List<PaymentDEItemType> getPaymentDEItem() {
        if (paymentDEItem == null) {
            paymentDEItem = new ArrayList<PaymentDEItemType>();
        }
        return this.paymentDEItem;
    }

}
