
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchPaymentItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchPaymentItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountBankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAccountProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="batchItemUniqueNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentBatchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="creditAccountBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="t24TransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentBatchStatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerValidateReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerValdateMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerRecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerQueryErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerQueryErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerPaymentBatchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerPaymentErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerPaymentErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchPaymentItemType", propOrder = {
    "batchItemId",
    "debitAccount",
    "creditAccount",
    "amount",
    "status",
    "transactionFee",
    "creditAccountBankCode",
    "recipient",
    "remarks",
    "creditAccountBankBranchCode",
    "creditAccountProvinceCode",
    "error",
    "validationStatusName",
    "validationStatus",
    "priority",
    "batchId",
    "paymenType",
    "batchItemUniqueNo",
    "currency",
    "cif",
    "sender",
    "validateReturn",
    "validateMsg",
    "paymentBatchStatus",
    "transactionInfo",
    "creditAccountBankName",
    "t24TransNo",
    "paymentBatchStatusDesc",
    "createdDate",
    "updatedDate",
    "partnerValidateReturn",
    "partnerValdateMsg",
    "partnerRecipientName",
    "partnerQueryErrorCode",
    "partnerQueryErrorMsg",
    "partnerPaymentBatchStatus",
    "partnerPaymentErrorCode",
    "partnerPaymentErrorMsg"
})
public class BatchPaymentItemType {

    protected String batchItemId;
    protected String debitAccount;
    protected String creditAccount;
    protected String amount;
    protected String status;
    protected String transactionFee;
    protected String creditAccountBankCode;
    protected String recipient;
    protected String remarks;
    protected String creditAccountBankBranchCode;
    protected String creditAccountProvinceCode;
    protected String error;
    protected String validationStatusName;
    protected String validationStatus;
    protected String priority;
    protected String batchId;
    protected String paymenType;
    protected String batchItemUniqueNo;
    protected String currency;
    @XmlElement(name = "CIF")
    protected String cif;
    protected String sender;
    protected String validateReturn;
    protected String validateMsg;
    protected String paymentBatchStatus;
    protected TransactionInfoType transactionInfo;
    protected String creditAccountBankName;
    protected String t24TransNo;
    protected String paymentBatchStatusDesc;
    protected String createdDate;
    protected String updatedDate;
    protected String partnerValidateReturn;
    protected String partnerValdateMsg;
    protected String partnerRecipientName;
    protected String partnerQueryErrorCode;
    protected String partnerQueryErrorMsg;
    protected String partnerPaymentBatchStatus;
    protected String partnerPaymentErrorCode;
    protected String partnerPaymentErrorMsg;

    /**
     * Gets the value of the batchItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchItemId() {
        return batchItemId;
    }

    /**
     * Sets the value of the batchItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchItemId(String value) {
        this.batchItemId = value;
    }

    /**
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccount(String value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccount(String value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the transactionFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionFee() {
        return transactionFee;
    }

    /**
     * Sets the value of the transactionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionFee(String value) {
        this.transactionFee = value;
    }

    /**
     * Gets the value of the creditAccountBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountBankCode() {
        return creditAccountBankCode;
    }

    /**
     * Sets the value of the creditAccountBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountBankCode(String value) {
        this.creditAccountBankCode = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the creditAccountBankBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountBankBranchCode() {
        return creditAccountBankBranchCode;
    }

    /**
     * Sets the value of the creditAccountBankBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountBankBranchCode(String value) {
        this.creditAccountBankBranchCode = value;
    }

    /**
     * Gets the value of the creditAccountProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountProvinceCode() {
        return creditAccountProvinceCode;
    }

    /**
     * Sets the value of the creditAccountProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountProvinceCode(String value) {
        this.creditAccountProvinceCode = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the validationStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatusName() {
        return validationStatusName;
    }

    /**
     * Sets the value of the validationStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatusName(String value) {
        this.validationStatusName = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatus(String value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the paymenType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenType() {
        return paymenType;
    }

    /**
     * Sets the value of the paymenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenType(String value) {
        this.paymenType = value;
    }

    /**
     * Gets the value of the batchItemUniqueNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchItemUniqueNo() {
        return batchItemUniqueNo;
    }

    /**
     * Sets the value of the batchItemUniqueNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchItemUniqueNo(String value) {
        this.batchItemUniqueNo = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the validateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateReturn() {
        return validateReturn;
    }

    /**
     * Sets the value of the validateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateReturn(String value) {
        this.validateReturn = value;
    }

    /**
     * Gets the value of the validateMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateMsg() {
        return validateMsg;
    }

    /**
     * Sets the value of the validateMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateMsg(String value) {
        this.validateMsg = value;
    }

    /**
     * Gets the value of the paymentBatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBatchStatus() {
        return paymentBatchStatus;
    }

    /**
     * Sets the value of the paymentBatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBatchStatus(String value) {
        this.paymentBatchStatus = value;
    }

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
     * Gets the value of the creditAccountBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAccountBankName() {
        return creditAccountBankName;
    }

    /**
     * Sets the value of the creditAccountBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAccountBankName(String value) {
        this.creditAccountBankName = value;
    }

    /**
     * Gets the value of the t24TransNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT24TransNo() {
        return t24TransNo;
    }

    /**
     * Sets the value of the t24TransNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT24TransNo(String value) {
        this.t24TransNo = value;
    }

    /**
     * Gets the value of the paymentBatchStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBatchStatusDesc() {
        return paymentBatchStatusDesc;
    }

    /**
     * Sets the value of the paymentBatchStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBatchStatusDesc(String value) {
        this.paymentBatchStatusDesc = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the partnerValidateReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerValidateReturn() {
        return partnerValidateReturn;
    }

    /**
     * Sets the value of the partnerValidateReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerValidateReturn(String value) {
        this.partnerValidateReturn = value;
    }

    /**
     * Gets the value of the partnerValdateMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerValdateMsg() {
        return partnerValdateMsg;
    }

    /**
     * Sets the value of the partnerValdateMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerValdateMsg(String value) {
        this.partnerValdateMsg = value;
    }

    /**
     * Gets the value of the partnerRecipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerRecipientName() {
        return partnerRecipientName;
    }

    /**
     * Sets the value of the partnerRecipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerRecipientName(String value) {
        this.partnerRecipientName = value;
    }

    /**
     * Gets the value of the partnerQueryErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerQueryErrorCode() {
        return partnerQueryErrorCode;
    }

    /**
     * Sets the value of the partnerQueryErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerQueryErrorCode(String value) {
        this.partnerQueryErrorCode = value;
    }

    /**
     * Gets the value of the partnerQueryErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerQueryErrorMsg() {
        return partnerQueryErrorMsg;
    }

    /**
     * Sets the value of the partnerQueryErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerQueryErrorMsg(String value) {
        this.partnerQueryErrorMsg = value;
    }

    /**
     * Gets the value of the partnerPaymentBatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPaymentBatchStatus() {
        return partnerPaymentBatchStatus;
    }

    /**
     * Sets the value of the partnerPaymentBatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPaymentBatchStatus(String value) {
        this.partnerPaymentBatchStatus = value;
    }

    /**
     * Gets the value of the partnerPaymentErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPaymentErrorCode() {
        return partnerPaymentErrorCode;
    }

    /**
     * Sets the value of the partnerPaymentErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPaymentErrorCode(String value) {
        this.partnerPaymentErrorCode = value;
    }

    /**
     * Gets the value of the partnerPaymentErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerPaymentErrorMsg() {
        return partnerPaymentErrorMsg;
    }

    /**
     * Sets the value of the partnerPaymentErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerPaymentErrorMsg(String value) {
        this.partnerPaymentErrorMsg = value;
    }

}
