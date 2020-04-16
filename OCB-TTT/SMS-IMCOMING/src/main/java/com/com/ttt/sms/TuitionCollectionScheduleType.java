
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TuitionCollectionScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TuitionCollectionScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collectionScheduleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionScheduleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionTargetGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inDebtReceivable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionScheduleFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionScheduleToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isGroupPaymentAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TuitionCollectionScheduleType", propOrder = {
    "collectionScheduleNumber",
    "collectionScheduleCode",
    "collectionScheduleName",
    "collectionTargetGroup",
    "collectionMethod",
    "inDebtReceivable",
    "collectionScheduleFromDate",
    "collectionScheduleToDate",
    "isGroupPaymentAvailable"
})
public class TuitionCollectionScheduleType {

    protected String collectionScheduleNumber;
    protected String collectionScheduleCode;
    protected String collectionScheduleName;
    protected String collectionTargetGroup;
    protected String collectionMethod;
    protected String inDebtReceivable;
    protected String collectionScheduleFromDate;
    protected String collectionScheduleToDate;
    protected String isGroupPaymentAvailable;

    /**
     * Gets the value of the collectionScheduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionScheduleNumber() {
        return collectionScheduleNumber;
    }

    /**
     * Sets the value of the collectionScheduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionScheduleNumber(String value) {
        this.collectionScheduleNumber = value;
    }

    /**
     * Gets the value of the collectionScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionScheduleCode() {
        return collectionScheduleCode;
    }

    /**
     * Sets the value of the collectionScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionScheduleCode(String value) {
        this.collectionScheduleCode = value;
    }

    /**
     * Gets the value of the collectionScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionScheduleName() {
        return collectionScheduleName;
    }

    /**
     * Sets the value of the collectionScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionScheduleName(String value) {
        this.collectionScheduleName = value;
    }

    /**
     * Gets the value of the collectionTargetGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionTargetGroup() {
        return collectionTargetGroup;
    }

    /**
     * Sets the value of the collectionTargetGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionTargetGroup(String value) {
        this.collectionTargetGroup = value;
    }

    /**
     * Gets the value of the collectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Sets the value of the collectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionMethod(String value) {
        this.collectionMethod = value;
    }

    /**
     * Gets the value of the inDebtReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDebtReceivable() {
        return inDebtReceivable;
    }

    /**
     * Sets the value of the inDebtReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDebtReceivable(String value) {
        this.inDebtReceivable = value;
    }

    /**
     * Gets the value of the collectionScheduleFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionScheduleFromDate() {
        return collectionScheduleFromDate;
    }

    /**
     * Sets the value of the collectionScheduleFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionScheduleFromDate(String value) {
        this.collectionScheduleFromDate = value;
    }

    /**
     * Gets the value of the collectionScheduleToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionScheduleToDate() {
        return collectionScheduleToDate;
    }

    /**
     * Sets the value of the collectionScheduleToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionScheduleToDate(String value) {
        this.collectionScheduleToDate = value;
    }

    /**
     * Gets the value of the isGroupPaymentAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGroupPaymentAvailable() {
        return isGroupPaymentAvailable;
    }

    /**
     * Sets the value of the isGroupPaymentAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGroupPaymentAvailable(String value) {
        this.isGroupPaymentAvailable = value;
    }

}
