
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApportionAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApportionAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApportionAccountInfoType", propOrder = {
    "accountNumber",
    "accountName",
    "line",
    "level3",
    "internalCategory",
    "plCategory",
    "categoryType",
    "status",
    "parentAccount",
    "fromDate"
})
public class ApportionAccountInfoType {

    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String accountName;
    @XmlElement(required = true)
    protected String line;
    @XmlElement(required = true)
    protected String level3;
    @XmlElement(required = true)
    protected String internalCategory;
    @XmlElement(required = true)
    protected String plCategory;
    @XmlElement(required = true)
    protected String categoryType;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String parentAccount;
    @XmlElement(required = true)
    protected String fromDate;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the level3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3() {
        return level3;
    }

    /**
     * Sets the value of the level3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3(String value) {
        this.level3 = value;
    }

    /**
     * Gets the value of the internalCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCategory() {
        return internalCategory;
    }

    /**
     * Sets the value of the internalCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCategory(String value) {
        this.internalCategory = value;
    }

    /**
     * Gets the value of the plCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlCategory() {
        return plCategory;
    }

    /**
     * Sets the value of the plCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlCategory(String value) {
        this.plCategory = value;
    }

    /**
     * Gets the value of the categoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the value of the categoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryType(String value) {
        this.categoryType = value;
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
     * Gets the value of the parentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAccount() {
        return parentAccount;
    }

    /**
     * Sets the value of the parentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAccount(String value) {
        this.parentAccount = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

}
