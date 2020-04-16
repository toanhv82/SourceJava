
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalPaymentBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fastTransferBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOCB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankBranch" type="{bian.com.vn}BankBranchType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfoType", propOrder = {
    "bankCode",
    "bankName",
    "externalPaymentBankCode",
    "fastTransferBankCode",
    "isOCB",
    "bankBranch"
})
public class BankInfoType {

    protected String bankCode;
    protected String bankName;
    protected String externalPaymentBankCode;
    protected String fastTransferBankCode;
    protected String isOCB;
    protected List<BankBranchType> bankBranch;

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the externalPaymentBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPaymentBankCode() {
        return externalPaymentBankCode;
    }

    /**
     * Sets the value of the externalPaymentBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPaymentBankCode(String value) {
        this.externalPaymentBankCode = value;
    }

    /**
     * Gets the value of the fastTransferBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastTransferBankCode() {
        return fastTransferBankCode;
    }

    /**
     * Sets the value of the fastTransferBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastTransferBankCode(String value) {
        this.fastTransferBankCode = value;
    }

    /**
     * Gets the value of the isOCB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOCB() {
        return isOCB;
    }

    /**
     * Sets the value of the isOCB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOCB(String value) {
        this.isOCB = value;
    }

    /**
     * Gets the value of the bankBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankBranchType }
     * 
     * 
     */
    public List<BankBranchType> getBankBranch() {
        if (bankBranch == null) {
            bankBranch = new ArrayList<BankBranchType>();
        }
        return this.bankBranch;
    }

}
