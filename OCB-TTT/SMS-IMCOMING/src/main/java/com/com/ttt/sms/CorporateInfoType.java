
package com.com.ttt.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizLicenseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizLicensePlaceOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizLicenseExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bizLicenseDateOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredBizLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalRepresentativeInfo" type="{bian.com.vn}LegalRepresentativeInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateInfoType", propOrder = {
    "companyId",
    "companyName",
    "companyAddress",
    "bizLicenseNum",
    "bizLicensePlaceOfIssue",
    "bizLicenseExpireDate",
    "bizLicenseDateOfIssue",
    "registeredBizLine",
    "authorizedCapital",
    "cif",
    "openedDate",
    "taxNumber",
    "legalRepresentativeInfo"
})
public class CorporateInfoType {

    protected String companyId;
    protected String companyName;
    protected String companyAddress;
    protected String bizLicenseNum;
    protected String bizLicensePlaceOfIssue;
    protected String bizLicenseExpireDate;
    protected String bizLicenseDateOfIssue;
    protected String registeredBizLine;
    protected String authorizedCapital;
    protected String cif;
    protected String openedDate;
    protected String taxNumber;
    protected LegalRepresentativeInfoType legalRepresentativeInfo;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * Sets the value of the companyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddress(String value) {
        this.companyAddress = value;
    }

    /**
     * Gets the value of the bizLicenseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizLicenseNum() {
        return bizLicenseNum;
    }

    /**
     * Sets the value of the bizLicenseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizLicenseNum(String value) {
        this.bizLicenseNum = value;
    }

    /**
     * Gets the value of the bizLicensePlaceOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizLicensePlaceOfIssue() {
        return bizLicensePlaceOfIssue;
    }

    /**
     * Sets the value of the bizLicensePlaceOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizLicensePlaceOfIssue(String value) {
        this.bizLicensePlaceOfIssue = value;
    }

    /**
     * Gets the value of the bizLicenseExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizLicenseExpireDate() {
        return bizLicenseExpireDate;
    }

    /**
     * Sets the value of the bizLicenseExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizLicenseExpireDate(String value) {
        this.bizLicenseExpireDate = value;
    }

    /**
     * Gets the value of the bizLicenseDateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizLicenseDateOfIssue() {
        return bizLicenseDateOfIssue;
    }

    /**
     * Sets the value of the bizLicenseDateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizLicenseDateOfIssue(String value) {
        this.bizLicenseDateOfIssue = value;
    }

    /**
     * Gets the value of the registeredBizLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredBizLine() {
        return registeredBizLine;
    }

    /**
     * Sets the value of the registeredBizLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredBizLine(String value) {
        this.registeredBizLine = value;
    }

    /**
     * Gets the value of the authorizedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedCapital() {
        return authorizedCapital;
    }

    /**
     * Sets the value of the authorizedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedCapital(String value) {
        this.authorizedCapital = value;
    }

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
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
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the openedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenedDate() {
        return openedDate;
    }

    /**
     * Sets the value of the openedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenedDate(String value) {
        this.openedDate = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the legalRepresentativeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRepresentativeInfoType }
     *     
     */
    public LegalRepresentativeInfoType getLegalRepresentativeInfo() {
        return legalRepresentativeInfo;
    }

    /**
     * Sets the value of the legalRepresentativeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRepresentativeInfoType }
     *     
     */
    public void setLegalRepresentativeInfo(LegalRepresentativeInfoType value) {
        this.legalRepresentativeInfo = value;
    }

}
