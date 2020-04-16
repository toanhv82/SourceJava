
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentOrderItemItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentOrderItemItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentOrderItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentOrderItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benificialInfo" type="{bian.com.vn}BeneficialInfoType"/>
 *         &lt;element name="fundTransferInfo" type="{bian.com.vn}FundTransferInfoType"/>
 *         &lt;element name="transactionInfo" type="{bian.com.vn}TransactionInfoType" minOccurs="0"/>
 *         &lt;element name="paymentOrderItemResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentOrderItemResultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentOrderItemItemType", propOrder = {
    "paymentOrderItemID",
    "itemIndex",
    "paymentOrderItemStatus",
    "benificialInfo",
    "fundTransferInfo",
    "transactionInfo",
    "paymentOrderItemResultCode",
    "paymentOrderItemResultDesc"
})
public class PaymentOrderItemItemType {

    protected String paymentOrderItemID;
    protected Integer itemIndex;
    protected String paymentOrderItemStatus;
    @XmlElement(required = true)
    protected BeneficialInfoType benificialInfo;
    @XmlElement(required = true)
    protected FundTransferInfoType fundTransferInfo;
    protected TransactionInfoType transactionInfo;
    protected String paymentOrderItemResultCode;
    protected String paymentOrderItemResultDesc;

    /**
     * Gets the value of the paymentOrderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderItemID() {
        return paymentOrderItemID;
    }

    /**
     * Sets the value of the paymentOrderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderItemID(String value) {
        this.paymentOrderItemID = value;
    }

    /**
     * Gets the value of the itemIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemIndex() {
        return itemIndex;
    }

    /**
     * Sets the value of the itemIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemIndex(Integer value) {
        this.itemIndex = value;
    }

    /**
     * Gets the value of the paymentOrderItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderItemStatus() {
        return paymentOrderItemStatus;
    }

    /**
     * Sets the value of the paymentOrderItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderItemStatus(String value) {
        this.paymentOrderItemStatus = value;
    }

    /**
     * Gets the value of the benificialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficialInfoType }
     *     
     */
    public BeneficialInfoType getBenificialInfo() {
        return benificialInfo;
    }

    /**
     * Sets the value of the benificialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficialInfoType }
     *     
     */
    public void setBenificialInfo(BeneficialInfoType value) {
        this.benificialInfo = value;
    }

    /**
     * Gets the value of the fundTransferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundTransferInfoType }
     *     
     */
    public FundTransferInfoType getFundTransferInfo() {
        return fundTransferInfo;
    }

    /**
     * Sets the value of the fundTransferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundTransferInfoType }
     *     
     */
    public void setFundTransferInfo(FundTransferInfoType value) {
        this.fundTransferInfo = value;
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
     * Gets the value of the paymentOrderItemResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderItemResultCode() {
        return paymentOrderItemResultCode;
    }

    /**
     * Sets the value of the paymentOrderItemResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderItemResultCode(String value) {
        this.paymentOrderItemResultCode = value;
    }

    /**
     * Gets the value of the paymentOrderItemResultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderItemResultDesc() {
        return paymentOrderItemResultDesc;
    }

    /**
     * Sets the value of the paymentOrderItemResultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderItemResultDesc(String value) {
        this.paymentOrderItemResultDesc = value;
    }

}
