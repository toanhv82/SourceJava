
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIFInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIFInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIFNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFIssuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFDebitClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasLoan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIFCreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIFInfoType", propOrder = {
    "cifNum",
    "cifIssuedDate",
    "branchCode",
    "customerType",
    "cifDebitClass",
    "hasLoan",
    "cifCreateDate"
})
public class CIFInfoType {

    @XmlElement(name = "CIFNum")
    protected String cifNum;
    @XmlElement(name = "CIFIssuedDate")
    protected String cifIssuedDate;
    protected String branchCode;
    protected String customerType;
    @XmlElement(name = "CIFDebitClass")
    protected String cifDebitClass;
    protected String hasLoan;
    @XmlElement(name = "CIFCreateDate")
    protected String cifCreateDate;

    /**
     * Gets the value of the cifNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFNum() {
        return cifNum;
    }

    /**
     * Sets the value of the cifNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFNum(String value) {
        this.cifNum = value;
    }

    /**
     * Gets the value of the cifIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFIssuedDate() {
        return cifIssuedDate;
    }

    /**
     * Sets the value of the cifIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFIssuedDate(String value) {
        this.cifIssuedDate = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the cifDebitClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFDebitClass() {
        return cifDebitClass;
    }

    /**
     * Sets the value of the cifDebitClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFDebitClass(String value) {
        this.cifDebitClass = value;
    }

    /**
     * Gets the value of the hasLoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasLoan() {
        return hasLoan;
    }

    /**
     * Sets the value of the hasLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasLoan(String value) {
        this.hasLoan = value;
    }

    /**
     * Gets the value of the cifCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIFCreateDate() {
        return cifCreateDate;
    }

    /**
     * Sets the value of the cifCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIFCreateDate(String value) {
        this.cifCreateDate = value;
    }

}
