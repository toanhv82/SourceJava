
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoreBankAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreBankAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="makerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkerAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchInfo" type="{bian.com.vn}BranchInfoType"/>
 *         &lt;element name="userFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreBankAccountType", propOrder = {
    "makerAccount",
    "checkerAccount",
    "branchInfo",
    "userFullName",
    "userAccount",
    "userType",
    "sourceHeader"
})
public class CoreBankAccountType {

    protected String makerAccount;
    protected String checkerAccount;
    @XmlElement(required = true)
    protected BranchInfoType branchInfo;
    protected String userFullName;
    protected String userAccount;
    protected String userType;
    protected String sourceHeader;

    /**
     * Gets the value of the makerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakerAccount() {
        return makerAccount;
    }

    /**
     * Sets the value of the makerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakerAccount(String value) {
        this.makerAccount = value;
    }

    /**
     * Gets the value of the checkerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckerAccount() {
        return checkerAccount;
    }

    /**
     * Sets the value of the checkerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckerAccount(String value) {
        this.checkerAccount = value;
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
     * Gets the value of the userFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * Sets the value of the userFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullName(String value) {
        this.userFullName = value;
    }

    /**
     * Gets the value of the userAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * Sets the value of the userAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccount(String value) {
        this.userAccount = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the sourceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceHeader() {
        return sourceHeader;
    }

    /**
     * Sets the value of the sourceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceHeader(String value) {
        this.sourceHeader = value;
    }

}
