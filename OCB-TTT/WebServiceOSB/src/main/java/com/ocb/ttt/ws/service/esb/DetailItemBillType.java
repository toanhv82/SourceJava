
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailItemBillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailItemBillType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formulaRates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCodeItemNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transRefPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GKId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auditNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaDL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillIdInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillIdDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSDTieuThu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CSDTieuThuChiTiet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trandsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pointOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderIdReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailItemBillType", propOrder = {
    "orderId",
    "description",
    "amount",
    "fromDate",
    "toDate",
    "formulaRates",
    "billCodeItemNo",
    "amountMonth",
    "productType",
    "qty",
    "customerId",
    "customerName",
    "amountYear",
    "status",
    "transRefPartner",
    "managementId",
    "gkId",
    "receiveDate",
    "customerAddress",
    "customerPhoneNumber",
    "customerBankCode",
    "customerBankName",
    "customerBankAccount",
    "auditNumber",
    "messageDate",
    "transDate",
    "transType",
    "bankId",
    "returnCode",
    "maDL",
    "billIdInfo",
    "billIdDetail",
    "csdTieuThu",
    "csdTieuThuChiTiet",
    "trandsId",
    "pointOfServiceCode",
    "orderIdReport"
})
public class DetailItemBillType {

    @XmlElement(name = "OrderId")
    protected String orderId;
    protected String description;
    protected String amount;
    protected String fromDate;
    protected String toDate;
    protected String formulaRates;
    protected String billCodeItemNo;
    protected String amountMonth;
    protected String productType;
    @XmlElement(name = "Qty")
    protected String qty;
    protected String customerId;
    protected String customerName;
    protected String amountYear;
    protected String status;
    protected String transRefPartner;
    protected String managementId;
    @XmlElement(name = "GKId")
    protected String gkId;
    protected String receiveDate;
    protected String customerAddress;
    protected String customerPhoneNumber;
    protected String customerBankCode;
    protected String customerBankName;
    protected String customerBankAccount;
    protected String auditNumber;
    protected String messageDate;
    protected String transDate;
    protected String transType;
    protected String bankId;
    protected String returnCode;
    @XmlElement(name = "MaDL")
    protected String maDL;
    @XmlElement(name = "BillIdInfo")
    protected String billIdInfo;
    @XmlElement(name = "BillIdDetail")
    protected String billIdDetail;
    @XmlElement(name = "CSDTieuThu")
    protected String csdTieuThu;
    @XmlElement(name = "CSDTieuThuChiTiet")
    protected String csdTieuThuChiTiet;
    protected String trandsId;
    protected String pointOfServiceCode;
    @XmlElement(name = "OrderIdReport")
    protected String orderIdReport;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the formulaRates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaRates() {
        return formulaRates;
    }

    /**
     * Sets the value of the formulaRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaRates(String value) {
        this.formulaRates = value;
    }

    /**
     * Gets the value of the billCodeItemNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCodeItemNo() {
        return billCodeItemNo;
    }

    /**
     * Sets the value of the billCodeItemNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCodeItemNo(String value) {
        this.billCodeItemNo = value;
    }

    /**
     * Gets the value of the amountMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountMonth() {
        return amountMonth;
    }

    /**
     * Sets the value of the amountMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountMonth(String value) {
        this.amountMonth = value;
    }

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
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the amountYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountYear() {
        return amountYear;
    }

    /**
     * Sets the value of the amountYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountYear(String value) {
        this.amountYear = value;
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
     * Gets the value of the transRefPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRefPartner() {
        return transRefPartner;
    }

    /**
     * Sets the value of the transRefPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRefPartner(String value) {
        this.transRefPartner = value;
    }

    /**
     * Gets the value of the managementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementId() {
        return managementId;
    }

    /**
     * Sets the value of the managementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementId(String value) {
        this.managementId = value;
    }

    /**
     * Gets the value of the gkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGKId() {
        return gkId;
    }

    /**
     * Sets the value of the gkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGKId(String value) {
        this.gkId = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * Sets the value of the customerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneNumber(String value) {
        this.customerPhoneNumber = value;
    }

    /**
     * Gets the value of the customerBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBankCode() {
        return customerBankCode;
    }

    /**
     * Sets the value of the customerBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBankCode(String value) {
        this.customerBankCode = value;
    }

    /**
     * Gets the value of the customerBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBankName() {
        return customerBankName;
    }

    /**
     * Sets the value of the customerBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBankName(String value) {
        this.customerBankName = value;
    }

    /**
     * Gets the value of the customerBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerBankAccount() {
        return customerBankAccount;
    }

    /**
     * Sets the value of the customerBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerBankAccount(String value) {
        this.customerBankAccount = value;
    }

    /**
     * Gets the value of the auditNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditNumber() {
        return auditNumber;
    }

    /**
     * Sets the value of the auditNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditNumber(String value) {
        this.auditNumber = value;
    }

    /**
     * Gets the value of the messageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDate() {
        return messageDate;
    }

    /**
     * Sets the value of the messageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDate(String value) {
        this.messageDate = value;
    }

    /**
     * Gets the value of the transDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * Sets the value of the transDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the maDL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaDL() {
        return maDL;
    }

    /**
     * Sets the value of the maDL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaDL(String value) {
        this.maDL = value;
    }

    /**
     * Gets the value of the billIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillIdInfo() {
        return billIdInfo;
    }

    /**
     * Sets the value of the billIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillIdInfo(String value) {
        this.billIdInfo = value;
    }

    /**
     * Gets the value of the billIdDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillIdDetail() {
        return billIdDetail;
    }

    /**
     * Sets the value of the billIdDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillIdDetail(String value) {
        this.billIdDetail = value;
    }

    /**
     * Gets the value of the csdTieuThu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDTieuThu() {
        return csdTieuThu;
    }

    /**
     * Sets the value of the csdTieuThu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDTieuThu(String value) {
        this.csdTieuThu = value;
    }

    /**
     * Gets the value of the csdTieuThuChiTiet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDTieuThuChiTiet() {
        return csdTieuThuChiTiet;
    }

    /**
     * Sets the value of the csdTieuThuChiTiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSDTieuThuChiTiet(String value) {
        this.csdTieuThuChiTiet = value;
    }

    /**
     * Gets the value of the trandsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrandsId() {
        return trandsId;
    }

    /**
     * Sets the value of the trandsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrandsId(String value) {
        this.trandsId = value;
    }

    /**
     * Gets the value of the pointOfServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfServiceCode() {
        return pointOfServiceCode;
    }

    /**
     * Sets the value of the pointOfServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfServiceCode(String value) {
        this.pointOfServiceCode = value;
    }

    /**
     * Gets the value of the orderIdReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdReport() {
        return orderIdReport;
    }

    /**
     * Sets the value of the orderIdReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdReport(String value) {
        this.orderIdReport = value;
    }

}
