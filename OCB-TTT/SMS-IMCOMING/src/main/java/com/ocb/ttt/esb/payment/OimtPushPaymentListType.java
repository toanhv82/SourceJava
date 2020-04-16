
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OimtPushPaymentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OimtPushPaymentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANS_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERVICES_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RECEIVER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PHONE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISTRICT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PLACE_OF_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRTHDAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OimtPushPaymentListType", propOrder = {
    "transdate",
    "docid",
    "pinno",
    "servicestypeid",
    "sendername",
    "receivername",
    "amount",
    "currency",
    "phoneno",
    "province",
    "district",
    "idno",
    "iddate",
    "placeofid",
    "bankaccount",
    "bankcode",
    "bankbranchcode",
    "message",
    "birthday"
})
public class OimtPushPaymentListType {

    @XmlElement(name = "TRANS_DATE")
    protected String transdate;
    @XmlElement(name = "DOC_ID")
    protected String docid;
    @XmlElement(name = "PIN_NO")
    protected String pinno;
    @XmlElement(name = "SERVICES_TYPE_ID")
    protected String servicestypeid;
    @XmlElement(name = "SENDER_NAME")
    protected String sendername;
    @XmlElement(name = "RECEIVER_NAME")
    protected String receivername;
    @XmlElement(name = "AMOUNT")
    protected String amount;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "PHONE_NO")
    protected String phoneno;
    @XmlElement(name = "PROVINCE")
    protected String province;
    @XmlElement(name = "DISTRICT")
    protected String district;
    @XmlElement(name = "ID_NO")
    protected String idno;
    @XmlElement(name = "ID_DATE")
    protected String iddate;
    @XmlElement(name = "PLACE_OF_ID")
    protected String placeofid;
    @XmlElement(name = "BANK_ACCOUNT")
    protected String bankaccount;
    @XmlElement(name = "BANK_CODE")
    protected String bankcode;
    @XmlElement(name = "BANK_BRANCH_CODE")
    protected String bankbranchcode;
    @XmlElement(name = "MESSAGE")
    protected String message;
    @XmlElement(name = "BIRTHDAY")
    protected String birthday;

    /**
     * Gets the value of the transdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSDATE() {
        return transdate;
    }

    /**
     * Sets the value of the transdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSDATE(String value) {
        this.transdate = value;
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
     * Gets the value of the pinno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINNO() {
        return pinno;
    }

    /**
     * Sets the value of the pinno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINNO(String value) {
        this.pinno = value;
    }

    /**
     * Gets the value of the servicestypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICESTYPEID() {
        return servicestypeid;
    }

    /**
     * Sets the value of the servicestypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICESTYPEID(String value) {
        this.servicestypeid = value;
    }

    /**
     * Gets the value of the sendername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERNAME() {
        return sendername;
    }

    /**
     * Sets the value of the sendername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERNAME(String value) {
        this.sendername = value;
    }

    /**
     * Gets the value of the receivername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVERNAME() {
        return receivername;
    }

    /**
     * Sets the value of the receivername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVERNAME(String value) {
        this.receivername = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMOUNT(String value) {
        this.amount = value;
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
     * Gets the value of the phoneno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHONENO() {
        return phoneno;
    }

    /**
     * Sets the value of the phoneno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHONENO(String value) {
        this.phoneno = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROVINCE() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROVINCE(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISTRICT() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISTRICT(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the idno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNO() {
        return idno;
    }

    /**
     * Sets the value of the idno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNO(String value) {
        this.idno = value;
    }

    /**
     * Gets the value of the iddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDATE() {
        return iddate;
    }

    /**
     * Sets the value of the iddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDATE(String value) {
        this.iddate = value;
    }

    /**
     * Gets the value of the placeofid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLACEOFID() {
        return placeofid;
    }

    /**
     * Sets the value of the placeofid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLACEOFID(String value) {
        this.placeofid = value;
    }

    /**
     * Gets the value of the bankaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKACCOUNT() {
        return bankaccount;
    }

    /**
     * Sets the value of the bankaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKACCOUNT(String value) {
        this.bankaccount = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKCODE() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKCODE(String value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the bankbranchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKBRANCHCODE() {
        return bankbranchcode;
    }

    /**
     * Sets the value of the bankbranchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKBRANCHCODE(String value) {
        this.bankbranchcode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHDAY() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDAY(String value) {
        this.birthday = value;
    }

}
