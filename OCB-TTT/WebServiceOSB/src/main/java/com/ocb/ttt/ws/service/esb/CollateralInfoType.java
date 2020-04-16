
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collateralDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralPricingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralPricingValueDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralGuaranteedApprovalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralExecutionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impStoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralInfoType", propOrder = {
    "collateralDescription",
    "collateralCode",
    "collateralType",
    "collateralPricingValue",
    "collateralPricingValueDueDate",
    "collateralGuaranteedApprovalAmount",
    "collateralCompany",
    "collateralExecutionValue",
    "transId",
    "impStoreId",
    "status",
    "collateralId"
})
public class CollateralInfoType {

    protected String collateralDescription;
    protected String collateralCode;
    protected String collateralType;
    protected String collateralPricingValue;
    protected String collateralPricingValueDueDate;
    protected String collateralGuaranteedApprovalAmount;
    protected String collateralCompany;
    protected String collateralExecutionValue;
    protected String transId;
    protected String impStoreId;
    protected String status;
    protected String collateralId;

    /**
     * Gets the value of the collateralDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralDescription() {
        return collateralDescription;
    }

    /**
     * Sets the value of the collateralDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralDescription(String value) {
        this.collateralDescription = value;
    }

    /**
     * Gets the value of the collateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralCode() {
        return collateralCode;
    }

    /**
     * Sets the value of the collateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralCode(String value) {
        this.collateralCode = value;
    }

    /**
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralType(String value) {
        this.collateralType = value;
    }

    /**
     * Gets the value of the collateralPricingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralPricingValue() {
        return collateralPricingValue;
    }

    /**
     * Sets the value of the collateralPricingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralPricingValue(String value) {
        this.collateralPricingValue = value;
    }

    /**
     * Gets the value of the collateralPricingValueDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralPricingValueDueDate() {
        return collateralPricingValueDueDate;
    }

    /**
     * Sets the value of the collateralPricingValueDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralPricingValueDueDate(String value) {
        this.collateralPricingValueDueDate = value;
    }

    /**
     * Gets the value of the collateralGuaranteedApprovalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralGuaranteedApprovalAmount() {
        return collateralGuaranteedApprovalAmount;
    }

    /**
     * Sets the value of the collateralGuaranteedApprovalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralGuaranteedApprovalAmount(String value) {
        this.collateralGuaranteedApprovalAmount = value;
    }

    /**
     * Gets the value of the collateralCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralCompany() {
        return collateralCompany;
    }

    /**
     * Sets the value of the collateralCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralCompany(String value) {
        this.collateralCompany = value;
    }

    /**
     * Gets the value of the collateralExecutionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralExecutionValue() {
        return collateralExecutionValue;
    }

    /**
     * Sets the value of the collateralExecutionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralExecutionValue(String value) {
        this.collateralExecutionValue = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the impStoreId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpStoreId() {
        return impStoreId;
    }

    /**
     * Sets the value of the impStoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpStoreId(String value) {
        this.impStoreId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the collateralId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralId() {
        return collateralId;
    }

    /**
     * Sets the value of the collateralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralId(String value) {
        this.collateralId = value;
    }

}
