
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchPaymentItemInfoAPICType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchPaymentItemInfoAPICType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="paymentItem" type="{bian.com.vn}BatchPaymentItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Item" type="{bian.com.vn}BatchPaymentItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchPaymentItemInfoAPICType", propOrder = {
    "paymentItem",
    "item"
})
public class BatchPaymentItemInfoAPICType {

    protected List<BatchPaymentItemType> paymentItem;
    @XmlElement(name = "Item")
    protected List<BatchPaymentItemType> item;

    /**
     * Gets the value of the paymentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchPaymentItemType }
     * 
     * 
     */
    public List<BatchPaymentItemType> getPaymentItem() {
        if (paymentItem == null) {
            paymentItem = new ArrayList<BatchPaymentItemType>();
        }
        return this.paymentItem;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchPaymentItemType }
     * 
     * 
     */
    public List<BatchPaymentItemType> getItem() {
        if (item == null) {
            item = new ArrayList<BatchPaymentItemType>();
        }
        return this.item;
    }

}
