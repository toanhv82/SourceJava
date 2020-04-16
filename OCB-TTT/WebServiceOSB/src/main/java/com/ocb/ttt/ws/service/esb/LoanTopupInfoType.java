
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanTopupInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTopupInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanTopupAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPMTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *         &lt;element name="approvedBranchInfo" type="{bian.com.vn}BranchInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanTopupInfoType", propOrder = {
    "transId",
    "cif",
    "loanTopupAmount",
    "customerClass",
    "customerType",
    "dataDate",
    "confirmedBy",
    "confirmedDate",
    "approvedBy",
    "approvedDate",
    "approvedAmount",
    "bpmTransId",
    "branchInfo",
    "approvedBranchInfo"
})
public class LoanTopupInfoType {

    protected String transId;
    @XmlElement(name = "CIF")
    protected String cif;
    protected String loanTopupAmount;
    protected String customerClass;
    protected String customerType;
    protected String dataDate;
    protected String confirmedBy;
    protected String confirmedDate;
    protected String approvedBy;
    protected String approvedDate;
    protected String approvedAmount;
    @XmlElement(name = "BPMTransId")
    protected String bpmTransId;
    protected BranchInfoType branchInfo;
    protected BranchInfoType approvedBranchInfo;

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
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIF() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIF(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the loanTopupAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTopupAmount() {
        return loanTopupAmount;
    }

    /**
     * Sets the value of the loanTopupAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTopupAmount(String value) {
        this.loanTopupAmount = value;
    }

    /**
     * Gets the value of the customerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerClass() {
        return customerClass;
    }

    /**
     * Sets the value of the customerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerClass(String value) {
        this.customerClass = value;
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
     * Gets the value of the dataDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDate() {
        return dataDate;
    }

    /**
     * Sets the value of the dataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDate(String value) {
        this.dataDate = value;
    }

    /**
     * Gets the value of the confirmedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedBy() {
        return confirmedBy;
    }

    /**
     * Sets the value of the confirmedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedBy(String value) {
        this.confirmedBy = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedDate(String value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedBy(String value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedDate(String value) {
        this.approvedDate = value;
    }

    /**
     * Gets the value of the approvedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Sets the value of the approvedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedAmount(String value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the bpmTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPMTransId() {
        return bpmTransId;
    }

    /**
     * Sets the value of the bpmTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPMTransId(String value) {
        this.bpmTransId = value;
    }

    /**
     * Gets the value of the branchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BranchInfoType }
     *     
     */
    public BranchInfoType getBranchInfo() {
        return branchInfo;
    }

    /**
     * Sets the value of the branchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchInfoType }
     *     
     */
    public void setBranchInfo(BranchInfoType value) {
        this.branchInfo = value;
    }

    /**
     * Gets the value of the approvedBranchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BranchInfoType }
     *     
     */
    public BranchInfoType getApprovedBranchInfo() {
        return approvedBranchInfo;
    }

    /**
     * Sets the value of the approvedBranchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchInfoType }
     *     
     */
    public void setApprovedBranchInfo(BranchInfoType value) {
        this.approvedBranchInfo = value;
    }

}
