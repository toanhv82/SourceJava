
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrievePaymentExecutionApprovalRoles_out_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrievePaymentExecutionApprovalRoles_out_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="approvalRoles" type="{bian.com.vn}CBApprovalRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrievePaymentExecutionApprovalRoles_out_Type", namespace = "http://bian.com.vn/PaymentExecution/", propOrder = {
    "transactionInfo",
    "approvalRoles"
})
public class RetrievePaymentExecutionApprovalRolesOutType {

    protected TransactionInfoType transactionInfo;
    protected List<CBApprovalRoleType> approvalRoles;

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
     * Gets the value of the approvalRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBApprovalRoleType }
     * 
     * 
     */
    public List<CBApprovalRoleType> getApprovalRoles() {
        if (approvalRoles == null) {
            approvalRoles = new ArrayList<CBApprovalRoleType>();
        }
        return this.approvalRoles;
    }

}
