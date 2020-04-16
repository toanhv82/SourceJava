
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mortgageDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latePaymentPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataRetrievalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionInfoType", propOrder = {
    "productType",
    "mortgageDeposit",
    "debtAmount",
    "latePaymentPenaltyAmount",
    "dataRetrievalDate",
    "overdueDays"
})
public class CollectionInfoType {

    protected String productType;
    protected String mortgageDeposit;
    protected String debtAmount;
    protected String latePaymentPenaltyAmount;
    protected String dataRetrievalDate;
    protected String overdueDays;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the mortgageDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgageDeposit() {
        return mortgageDeposit;
    }

    /**
     * Sets the value of the mortgageDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgageDeposit(String value) {
        this.mortgageDeposit = value;
    }

    /**
     * Gets the value of the debtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtAmount() {
        return debtAmount;
    }

    /**
     * Sets the value of the debtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtAmount(String value) {
        this.debtAmount = value;
    }

    /**
     * Gets the value of the latePaymentPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatePaymentPenaltyAmount() {
        return latePaymentPenaltyAmount;
    }

    /**
     * Sets the value of the latePaymentPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatePaymentPenaltyAmount(String value) {
        this.latePaymentPenaltyAmount = value;
    }

    /**
     * Gets the value of the dataRetrievalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataRetrievalDate() {
        return dataRetrievalDate;
    }

    /**
     * Sets the value of the dataRetrievalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRetrievalDate(String value) {
        this.dataRetrievalDate = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueDays(String value) {
        this.overdueDays = value;
    }

}
