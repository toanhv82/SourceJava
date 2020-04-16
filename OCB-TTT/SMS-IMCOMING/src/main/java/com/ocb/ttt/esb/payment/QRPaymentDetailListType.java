
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRPaymentDetailListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRPaymentDetailListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="qrPaymentDetail" type="{bian.com.vn}QRPaymentDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Item" type="{bian.com.vn}QRPaymentDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRPaymentDetailListType", propOrder = {
    "qrPaymentDetail",
    "item"
})
public class QRPaymentDetailListType {

    protected List<QRPaymentDetailType> qrPaymentDetail;
    @XmlElement(name = "Item")
    protected List<QRPaymentDetailType> item;

    /**
     * Gets the value of the qrPaymentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qrPaymentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQrPaymentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QRPaymentDetailType }
     * 
     * 
     */
    public List<QRPaymentDetailType> getQrPaymentDetail() {
        if (qrPaymentDetail == null) {
            qrPaymentDetail = new ArrayList<QRPaymentDetailType>();
        }
        return this.qrPaymentDetail;
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
     * {@link QRPaymentDetailType }
     * 
     * 
     */
    public List<QRPaymentDetailType> getItem() {
        if (item == null) {
            item = new ArrayList<QRPaymentDetailType>();
        }
        return this.item;
    }

}
