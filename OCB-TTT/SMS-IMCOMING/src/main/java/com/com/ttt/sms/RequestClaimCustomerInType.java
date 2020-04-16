
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestClaimCustomer_in_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestClaimCustomer_in_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="userProfile" type="{bian.com.vn}EBranchUserInfoType" minOccurs="0"/>
 *         &lt;element name="claimInfo" type="{bian.com.vn}ClaimInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestClaimCustomer_in_type", namespace = "http://bian.com.vn/Correspondence/", propOrder = {
    "transactionInfo",
    "userProfile",
    "claimInfo"
})
public class RequestClaimCustomerInType {

    protected TransactionInfoType transactionInfo;
    protected EBranchUserInfoType userProfile;
    protected ClaimInfoType claimInfo;

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
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EBranchUserInfoType }
     *     
     */
    public EBranchUserInfoType getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBranchUserInfoType }
     *     
     */
    public void setUserProfile(EBranchUserInfoType value) {
        this.userProfile = value;
    }

    /**
     * Gets the value of the claimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInfoType }
     *     
     */
    public ClaimInfoType getClaimInfo() {
        return claimInfo;
    }

    /**
     * Sets the value of the claimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInfoType }
     *     
     */
    public void setClaimInfo(ClaimInfoType value) {
        this.claimInfo = value;
    }

}
