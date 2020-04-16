
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDEItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDEItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupDEItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDERow" type="{bian.com.vn}PaymentDERowType" maxOccurs="unbounded"/>
 *         &lt;element name="paymentDEItemResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentDEItemResultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDEXREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDEItemType", propOrder = {
    "groupDEItemID",
    "paymentDERow",
    "paymentDEItemResultCode",
    "paymentDEItemResultDesc",
    "paymentDEXREF"
})
public class PaymentDEItemType {

    protected String groupDEItemID;
    @XmlElement(name = "PaymentDERow", required = true)
    protected List<PaymentDERowType> paymentDERow;
    protected String paymentDEItemResultCode;
    protected String paymentDEItemResultDesc;
    @XmlElement(name = "PaymentDEXREF")
    protected String paymentDEXREF;

    /**
     * Gets the value of the groupDEItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDEItemID() {
        return groupDEItemID;
    }

    /**
     * Sets the value of the groupDEItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDEItemID(String value) {
        this.groupDEItemID = value;
    }

    /**
     * Gets the value of the paymentDERow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDERow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDERow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDERowType }
     * 
     * 
     */
    public List<PaymentDERowType> getPaymentDERow() {
        if (paymentDERow == null) {
            paymentDERow = new ArrayList<PaymentDERowType>();
        }
        return this.paymentDERow;
    }

    /**
     * Gets the value of the paymentDEItemResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDEItemResultCode() {
        return paymentDEItemResultCode;
    }

    /**
     * Sets the value of the paymentDEItemResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDEItemResultCode(String value) {
        this.paymentDEItemResultCode = value;
    }

    /**
     * Gets the value of the paymentDEItemResultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDEItemResultDesc() {
        return paymentDEItemResultDesc;
    }

    /**
     * Sets the value of the paymentDEItemResultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDEItemResultDesc(String value) {
        this.paymentDEItemResultDesc = value;
    }

    /**
     * Gets the value of the paymentDEXREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDEXREF() {
        return paymentDEXREF;
    }

    /**
     * Sets the value of the paymentDEXREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDEXREF(String value) {
        this.paymentDEXREF = value;
    }

}
