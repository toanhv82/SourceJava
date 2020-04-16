
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FilterInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterAbsoluteAmountFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterAbsoluteAmountTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterAmountFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterAmountTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterTransactionDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterTransactionDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterBookingDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterBookingDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterPageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterPageOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterPostingDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="filterPostingDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="filterProcessingDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="filterProcessingDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="operationCategory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountNum" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="T24TransNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="universityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanSubProduct" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currencyPairCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterInfoType", propOrder = {
    "filterAbsoluteAmountFrom",
    "filterAbsoluteAmountTo",
    "filterAmountFrom",
    "filterAmountTo",
    "filterFromDate",
    "filterToDate",
    "filterType",
    "filterTransactionDateFrom",
    "filterTransactionDateTo",
    "filterBookingDateFrom",
    "filterBookingDateTo",
    "filterPageSize",
    "filterPageOffset",
    "operator",
    "searchedValue",
    "filterPostingDateFrom",
    "filterPostingDateTo",
    "filterProcessingDateFrom",
    "filterProcessingDateTo",
    "operationCategory",
    "operationStatus",
    "accountNum",
    "currencyCode",
    "market",
    "countryCode",
    "t24TransNo",
    "universityCode",
    "studentCode",
    "serviceCode",
    "providerCode",
    "loanSubProduct",
    "currencyPairCode"
})
public class FilterInfoType {

    protected String filterAbsoluteAmountFrom;
    protected String filterAbsoluteAmountTo;
    protected String filterAmountFrom;
    protected String filterAmountTo;
    protected String filterFromDate;
    protected String filterToDate;
    protected String filterType;
    protected String filterTransactionDateFrom;
    protected String filterTransactionDateTo;
    protected String filterBookingDateFrom;
    protected String filterBookingDateTo;
    protected String filterPageSize;
    protected String filterPageOffset;
    protected String operator;
    protected String searchedValue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterPostingDateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterPostingDateTo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterProcessingDateFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterProcessingDateTo;
    protected List<String> operationCategory;
    protected List<String> operationStatus;
    @XmlElement(name = "AccountNum")
    protected List<String> accountNum;
    protected List<String> currencyCode;
    protected List<String> market;
    protected String countryCode;
    @XmlElement(name = "T24TransNo")
    protected String t24TransNo;
    protected String universityCode;
    protected String studentCode;
    protected String serviceCode;
    protected String providerCode;
    protected List<String> loanSubProduct;
    protected List<String> currencyPairCode;

    /**
     * Gets the value of the filterAbsoluteAmountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAbsoluteAmountFrom() {
        return filterAbsoluteAmountFrom;
    }

    /**
     * Sets the value of the filterAbsoluteAmountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAbsoluteAmountFrom(String value) {
        this.filterAbsoluteAmountFrom = value;
    }

    /**
     * Gets the value of the filterAbsoluteAmountTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAbsoluteAmountTo() {
        return filterAbsoluteAmountTo;
    }

    /**
     * Sets the value of the filterAbsoluteAmountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAbsoluteAmountTo(String value) {
        this.filterAbsoluteAmountTo = value;
    }

    /**
     * Gets the value of the filterAmountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAmountFrom() {
        return filterAmountFrom;
    }

    /**
     * Sets the value of the filterAmountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAmountFrom(String value) {
        this.filterAmountFrom = value;
    }

    /**
     * Gets the value of the filterAmountTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAmountTo() {
        return filterAmountTo;
    }

    /**
     * Sets the value of the filterAmountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAmountTo(String value) {
        this.filterAmountTo = value;
    }

    /**
     * Gets the value of the filterFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterFromDate() {
        return filterFromDate;
    }

    /**
     * Sets the value of the filterFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterFromDate(String value) {
        this.filterFromDate = value;
    }

    /**
     * Gets the value of the filterToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterToDate() {
        return filterToDate;
    }

    /**
     * Sets the value of the filterToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterToDate(String value) {
        this.filterToDate = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterType(String value) {
        this.filterType = value;
    }

    /**
     * Gets the value of the filterTransactionDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterTransactionDateFrom() {
        return filterTransactionDateFrom;
    }

    /**
     * Sets the value of the filterTransactionDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterTransactionDateFrom(String value) {
        this.filterTransactionDateFrom = value;
    }

    /**
     * Gets the value of the filterTransactionDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterTransactionDateTo() {
        return filterTransactionDateTo;
    }

    /**
     * Sets the value of the filterTransactionDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterTransactionDateTo(String value) {
        this.filterTransactionDateTo = value;
    }

    /**
     * Gets the value of the filterBookingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterBookingDateFrom() {
        return filterBookingDateFrom;
    }

    /**
     * Sets the value of the filterBookingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterBookingDateFrom(String value) {
        this.filterBookingDateFrom = value;
    }

    /**
     * Gets the value of the filterBookingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterBookingDateTo() {
        return filterBookingDateTo;
    }

    /**
     * Sets the value of the filterBookingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterBookingDateTo(String value) {
        this.filterBookingDateTo = value;
    }

    /**
     * Gets the value of the filterPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPageSize() {
        return filterPageSize;
    }

    /**
     * Sets the value of the filterPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPageSize(String value) {
        this.filterPageSize = value;
    }

    /**
     * Gets the value of the filterPageOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterPageOffset() {
        return filterPageOffset;
    }

    /**
     * Sets the value of the filterPageOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterPageOffset(String value) {
        this.filterPageOffset = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the searchedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchedValue() {
        return searchedValue;
    }

    /**
     * Sets the value of the searchedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchedValue(String value) {
        this.searchedValue = value;
    }

    /**
     * Gets the value of the filterPostingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterPostingDateFrom() {
        return filterPostingDateFrom;
    }

    /**
     * Sets the value of the filterPostingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterPostingDateFrom(XMLGregorianCalendar value) {
        this.filterPostingDateFrom = value;
    }

    /**
     * Gets the value of the filterPostingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterPostingDateTo() {
        return filterPostingDateTo;
    }

    /**
     * Sets the value of the filterPostingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterPostingDateTo(XMLGregorianCalendar value) {
        this.filterPostingDateTo = value;
    }

    /**
     * Gets the value of the filterProcessingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterProcessingDateFrom() {
        return filterProcessingDateFrom;
    }

    /**
     * Sets the value of the filterProcessingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterProcessingDateFrom(XMLGregorianCalendar value) {
        this.filterProcessingDateFrom = value;
    }

    /**
     * Gets the value of the filterProcessingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterProcessingDateTo() {
        return filterProcessingDateTo;
    }

    /**
     * Sets the value of the filterProcessingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterProcessingDateTo(XMLGregorianCalendar value) {
        this.filterProcessingDateTo = value;
    }

    /**
     * Gets the value of the operationCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationCategory() {
        if (operationCategory == null) {
            operationCategory = new ArrayList<String>();
        }
        return this.operationCategory;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperationStatus() {
        if (operationStatus == null) {
            operationStatus = new ArrayList<String>();
        }
        return this.operationStatus;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccountNum() {
        if (accountNum == null) {
            accountNum = new ArrayList<String>();
        }
        return this.accountNum;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurrencyCode() {
        if (currencyCode == null) {
            currencyCode = new ArrayList<String>();
        }
        return this.currencyCode;
    }

    /**
     * Gets the value of the market property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the market property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarket() {
        if (market == null) {
            market = new ArrayList<String>();
        }
        return this.market;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
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
     * Gets the value of the universityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCode() {
        return universityCode;
    }

    /**
     * Sets the value of the universityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCode(String value) {
        this.universityCode = value;
    }

    /**
     * Gets the value of the studentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentCode() {
        return studentCode;
    }

    /**
     * Sets the value of the studentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentCode(String value) {
        this.studentCode = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the loanSubProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanSubProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanSubProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLoanSubProduct() {
        if (loanSubProduct == null) {
            loanSubProduct = new ArrayList<String>();
        }
        return this.loanSubProduct;
    }

    /**
     * Gets the value of the currencyPairCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyPairCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyPairCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCurrencyPairCode() {
        if (currencyPairCode == null) {
            currencyPairCode = new ArrayList<String>();
        }
        return this.currencyPairCode;
    }

}
