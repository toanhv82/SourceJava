
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OimtPushPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OimtPushPaymentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUMBER_OF_TRANS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DATE_REQUEST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYMENT_LIST" type="{bian.com.vn}OimtPushPaymentListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OimtPushPaymentRequestType", propOrder = {
    "ssid",
    "ipid",
    "numberoftrans",
    "daterequest",
    "docid",
    "currency",
    "paymentlist"
})
public class OimtPushPaymentRequestType {

    @XmlElement(name = "SSID")
    protected String ssid;
    @XmlElement(name = "IP_ID")
    protected String ipid;
    @XmlElement(name = "NUMBER_OF_TRANS")
    protected String numberoftrans;
    @XmlElement(name = "DATE_REQUEST")
    protected String daterequest;
    @XmlElement(name = "DOC_ID")
    protected String docid;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "PAYMENT_LIST")
    protected List<OimtPushPaymentListType> paymentlist;

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSID() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the ipid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPID() {
        return ipid;
    }

    /**
     * Sets the value of the ipid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPID(String value) {
        this.ipid = value;
    }

    /**
     * Gets the value of the numberoftrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMBEROFTRANS() {
        return numberoftrans;
    }

    /**
     * Sets the value of the numberoftrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMBEROFTRANS(String value) {
        this.numberoftrans = value;
    }

    /**
     * Gets the value of the daterequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEREQUEST() {
        return daterequest;
    }

    /**
     * Sets the value of the daterequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEREQUEST(String value) {
        this.daterequest = value;
    }

    /**
     * Gets the value of the docid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCID() {
        return docid;
    }

    /**
     * Sets the value of the docid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCID(String value) {
        this.docid = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAYMENTLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OimtPushPaymentListType }
     * 
     * 
     */
    public List<OimtPushPaymentListType> getPAYMENTLIST() {
        if (paymentlist == null) {
            paymentlist = new ArrayList<OimtPushPaymentListType>();
        }
        return this.paymentlist;
    }

}
