
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notifyCorrespondenceSMS_in_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notifyCorrespondenceSMS_in_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType"/>
 *         &lt;element name="SMSNotification" type="{bian.com.vn}SMSNotificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifyCorrespondenceSMS_in_Type", namespace = "http://bian.com.vn/Correspondence/", propOrder = {
    "transactionInfo",
    "smsNotification"
})
public class NotifyCorrespondenceSMSInType {

    @XmlElement(required = true)
    protected TransactionInfoType transactionInfo;
    @XmlElement(name = "SMSNotification", required = true)
    protected SMSNotificationType smsNotification;

    /**
     * Gets the value of the transactionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInfoType }
     *     
     */
    public TransactionInfoType getTransactionInfo() {
        return transactionInfo;
    }

    /**
     * Sets the value of the transactionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInfoType }
     *     
     */
    public void setTransactionInfo(TransactionInfoType value) {
        this.transactionInfo = value;
    }

    /**
     * Gets the value of the smsNotification property.
     * 
     * @return
     *     possible object is
     *     {@link SMSNotificationType }
     *     
     */
    public SMSNotificationType getSMSNotification() {
        return smsNotification;
    }

    /**
     * Sets the value of the smsNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSNotificationType }
     *     
     */
    public void setSMSNotification(SMSNotificationType value) {
        this.smsNotification = value;
    }

}
