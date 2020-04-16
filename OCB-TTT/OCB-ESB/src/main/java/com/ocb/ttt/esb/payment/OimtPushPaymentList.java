
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OimtPushPaymentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OimtPushPaymentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oimtPushPaymentList" type="{bian.com.vn}OimtPushPaymentListType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OimtPushPaymentList", propOrder = {
    "oimtPushPaymentList"
})
public class OimtPushPaymentList {

    @XmlElement(required = true)
    protected List<OimtPushPaymentListType> oimtPushPaymentList;

    /**
     * Gets the value of the oimtPushPaymentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oimtPushPaymentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOimtPushPaymentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OimtPushPaymentListType }
     * 
     * 
     */
    public List<OimtPushPaymentListType> getOimtPushPaymentList() {
        if (oimtPushPaymentList == null) {
            oimtPushPaymentList = new ArrayList<OimtPushPaymentListType>();
        }
        return this.oimtPushPaymentList;
    }

}
