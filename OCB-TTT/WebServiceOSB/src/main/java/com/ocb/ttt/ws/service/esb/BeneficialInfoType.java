
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficialInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficialInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCustomerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCustomerTEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCitadCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benefitCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDInfo" type="{bian.com.vn}IDInfoType" minOccurs="0"/>
 *         &lt;element name="benefitProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficialInfoType", propOrder = {
    "beneficialType",
    "benefitCustomerName",
    "benefitCustomerAddress",
    "benefitCustomerTEL",
    "benefitCityCode",
    "benefitBranchName",
    "benefitBranchCode",
    "benefitAccountNum",
    "benefitCitadCode",
    "benefitBankCode",
    "benefitBankName",
    "benefitCurrency",
    "benefitCity",
    "benefitCountryCode",
    "idInfo",
    "benefitProvince"
})
public class BeneficialInfoType {

    protected String beneficialType;
    protected String benefitCustomerName;
    protected String benefitCustomerAddress;
    protected String benefitCustomerTEL;
    protected String benefitCityCode;
    protected String benefitBranchName;
    protected String benefitBranchCode;
    protected String benefitAccountNum;
    protected String benefitCitadCode;
    protected String benefitBankCode;
    protected String benefitBankName;
    protected String benefitCurrency;
    protected String benefitCity;
    protected String benefitCountryCode;
    @XmlElement(name = "IDInfo")
    protected IDInfoType idInfo;
    protected String benefitProvince;

    /**
     * Gets the value of the beneficialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficialType() {
        return beneficialType;
    }

    /**
     * Sets the value of the beneficialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficialType(String value) {
        this.beneficialType = value;
    }

    /**
     * Gets the value of the benefitCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCustomerName() {
        return benefitCustomerName;
    }

    /**
     * Sets the value of the benefitCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCustomerName(String value) {
        this.benefitCustomerName = value;
    }

    /**
     * Gets the value of the benefitCustomerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCustomerAddress() {
        return benefitCustomerAddress;
    }

    /**
     * Sets the value of the benefitCustomerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCustomerAddress(String value) {
        this.benefitCustomerAddress = value;
    }

    /**
     * Gets the value of the benefitCustomerTEL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCustomerTEL() {
        return benefitCustomerTEL;
    }

    /**
     * Sets the value of the benefitCustomerTEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCustomerTEL(String value) {
        this.benefitCustomerTEL = value;
    }

    /**
     * Gets the value of the benefitCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCityCode() {
        return benefitCityCode;
    }

    /**
     * Sets the value of the benefitCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCityCode(String value) {
        this.benefitCityCode = value;
    }

    /**
     * Gets the value of the benefitBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBranchName() {
        return benefitBranchName;
    }

    /**
     * Sets the value of the benefitBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBranchName(String value) {
        this.benefitBranchName = value;
    }

    /**
     * Gets the value of the benefitBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBranchCode() {
        return benefitBranchCode;
    }

    /**
     * Sets the value of the benefitBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBranchCode(String value) {
        this.benefitBranchCode = value;
    }

    /**
     * Gets the value of the benefitAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitAccountNum() {
        return benefitAccountNum;
    }

    /**
     * Sets the value of the benefitAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitAccountNum(String value) {
        this.benefitAccountNum = value;
    }

    /**
     * Gets the value of the benefitCitadCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCitadCode() {
        return benefitCitadCode;
    }

    /**
     * Sets the value of the benefitCitadCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCitadCode(String value) {
        this.benefitCitadCode = value;
    }

    /**
     * Gets the value of the benefitBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBankCode() {
        return benefitBankCode;
    }

    /**
     * Sets the value of the benefitBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBankCode(String value) {
        this.benefitBankCode = value;
    }

    /**
     * Gets the value of the benefitBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitBankName() {
        return benefitBankName;
    }

    /**
     * Sets the value of the benefitBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitBankName(String value) {
        this.benefitBankName = value;
    }

    /**
     * Gets the value of the benefitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCurrency() {
        return benefitCurrency;
    }

    /**
     * Sets the value of the benefitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCurrency(String value) {
        this.benefitCurrency = value;
    }

    /**
     * Gets the value of the benefitCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCity() {
        return benefitCity;
    }

    /**
     * Sets the value of the benefitCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCity(String value) {
        this.benefitCity = value;
    }

    /**
     * Gets the value of the benefitCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitCountryCode() {
        return benefitCountryCode;
    }

    /**
     * Sets the value of the benefitCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitCountryCode(String value) {
        this.benefitCountryCode = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IDInfoType }
     *     
     */
    public IDInfoType getIDInfo() {
        return idInfo;
    }

    /**
     * Sets the value of the idInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDInfoType }
     *     
     */
    public void setIDInfo(IDInfoType value) {
        this.idInfo = value;
    }

    /**
     * Gets the value of the benefitProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitProvince() {
        return benefitProvince;
    }

    /**
     * Sets the value of the benefitProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitProvince(String value) {
        this.benefitProvince = value;
    }

}
