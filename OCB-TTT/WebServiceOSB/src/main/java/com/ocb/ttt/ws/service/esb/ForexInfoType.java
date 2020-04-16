
package com.ocb.ttt.ws.service.esb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForexInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForexInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealDate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueDateBuy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueDateBuy2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerDesk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyBought" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyBought2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountBought" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountBought2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencySold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencySold2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountSold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountSold2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="exchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="exchRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hoPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="custCrossSell1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="custCrossSell2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoCrossSell1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ourAccountPay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ourAccountPay2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ourAccountRec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ourAccountRec2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spotRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyFcyPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coCodeINP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userApproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fxoRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchPNL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitReferenceNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FXID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swapRefNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="swapRefNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trsrcomid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForexInfoType", propOrder = {
    "countryParty",
    "dealType",
    "nationalId",
    "address",
    "dealMarket",
    "dealDate",
    "dealDate2",
    "valueDateBuy",
    "valueDateBuy2",
    "dealerDesk",
    "groupPartner",
    "accountOfficer",
    "currencyMarket",
    "currencyBought",
    "currencyBought2",
    "amountBought",
    "amountBought2",
    "currencySold",
    "currencySold2",
    "amountSold",
    "amountSold2",
    "exchRate",
    "exchRate2",
    "hoPrice",
    "custCrossSell1",
    "custCrossSell2",
    "hoCrossSell1",
    "notes",
    "notes2",
    "ourAccountPay",
    "ourAccountPay2",
    "ourAccountRec",
    "ourAccountRec2",
    "spotRate",
    "buyFcyPurpose",
    "coCodeINP",
    "userInput",
    "userApproved",
    "fxoRef",
    "branchId",
    "custName",
    "branchPNL",
    "fxType",
    "transactionId",
    "limitReferenceNo",
    "limitReferenceNo2",
    "currency",
    "baseCurrency",
    "fxid",
    "swapRefNo1",
    "swapRefNo2",
    "recordStatus",
    "trsrcomid",
    "command"
})
public class ForexInfoType {

    protected String countryParty;
    protected String dealType;
    protected String nationalId;
    protected String address;
    protected String dealMarket;
    protected String dealDate;
    protected String dealDate2;
    protected String valueDateBuy;
    protected String valueDateBuy2;
    protected String dealerDesk;
    protected String groupPartner;
    protected String accountOfficer;
    protected String currencyMarket;
    protected String currencyBought;
    protected String currencyBought2;
    protected String amountBought;
    protected BigDecimal amountBought2;
    protected String currencySold;
    protected String currencySold2;
    protected String amountSold;
    protected BigDecimal amountSold2;
    protected BigDecimal exchRate;
    protected BigDecimal exchRate2;
    protected BigDecimal hoPrice;
    protected BigDecimal custCrossSell1;
    protected String custCrossSell2;
    protected BigDecimal hoCrossSell1;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Notes2")
    protected String notes2;
    protected String ourAccountPay;
    protected String ourAccountPay2;
    protected String ourAccountRec;
    protected String ourAccountRec2;
    protected String spotRate;
    protected String buyFcyPurpose;
    protected String coCodeINP;
    protected String userInput;
    protected String userApproved;
    protected String fxoRef;
    protected String branchId;
    protected String custName;
    protected BigDecimal branchPNL;
    protected String fxType;
    protected String transactionId;
    protected String limitReferenceNo;
    protected String limitReferenceNo2;
    protected String currency;
    protected String baseCurrency;
    @XmlElement(name = "FXID")
    protected String fxid;
    protected String swapRefNo1;
    protected String swapRefNo2;
    protected String recordStatus;
    protected String trsrcomid;
    protected String command;

    /**
     * Gets the value of the countryParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryParty() {
        return countryParty;
    }

    /**
     * Sets the value of the countryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryParty(String value) {
        this.countryParty = value;
    }

    /**
     * Gets the value of the dealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealType(String value) {
        this.dealType = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the dealMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealMarket() {
        return dealMarket;
    }

    /**
     * Sets the value of the dealMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealMarket(String value) {
        this.dealMarket = value;
    }

    /**
     * Gets the value of the dealDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealDate() {
        return dealDate;
    }

    /**
     * Sets the value of the dealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealDate(String value) {
        this.dealDate = value;
    }

    /**
     * Gets the value of the dealDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealDate2() {
        return dealDate2;
    }

    /**
     * Sets the value of the dealDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealDate2(String value) {
        this.dealDate2 = value;
    }

    /**
     * Gets the value of the valueDateBuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDateBuy() {
        return valueDateBuy;
    }

    /**
     * Sets the value of the valueDateBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDateBuy(String value) {
        this.valueDateBuy = value;
    }

    /**
     * Gets the value of the valueDateBuy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDateBuy2() {
        return valueDateBuy2;
    }

    /**
     * Sets the value of the valueDateBuy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDateBuy2(String value) {
        this.valueDateBuy2 = value;
    }

    /**
     * Gets the value of the dealerDesk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerDesk() {
        return dealerDesk;
    }

    /**
     * Sets the value of the dealerDesk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerDesk(String value) {
        this.dealerDesk = value;
    }

    /**
     * Gets the value of the groupPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupPartner() {
        return groupPartner;
    }

    /**
     * Sets the value of the groupPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupPartner(String value) {
        this.groupPartner = value;
    }

    /**
     * Gets the value of the accountOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOfficer() {
        return accountOfficer;
    }

    /**
     * Sets the value of the accountOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOfficer(String value) {
        this.accountOfficer = value;
    }

    /**
     * Gets the value of the currencyMarket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyMarket() {
        return currencyMarket;
    }

    /**
     * Sets the value of the currencyMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyMarket(String value) {
        this.currencyMarket = value;
    }

    /**
     * Gets the value of the currencyBought property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyBought() {
        return currencyBought;
    }

    /**
     * Sets the value of the currencyBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyBought(String value) {
        this.currencyBought = value;
    }

    /**
     * Gets the value of the currencyBought2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyBought2() {
        return currencyBought2;
    }

    /**
     * Sets the value of the currencyBought2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyBought2(String value) {
        this.currencyBought2 = value;
    }

    /**
     * Gets the value of the amountBought property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountBought() {
        return amountBought;
    }

    /**
     * Sets the value of the amountBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountBought(String value) {
        this.amountBought = value;
    }

    /**
     * Gets the value of the amountBought2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountBought2() {
        return amountBought2;
    }

    /**
     * Sets the value of the amountBought2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountBought2(BigDecimal value) {
        this.amountBought2 = value;
    }

    /**
     * Gets the value of the currencySold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySold() {
        return currencySold;
    }

    /**
     * Sets the value of the currencySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySold(String value) {
        this.currencySold = value;
    }

    /**
     * Gets the value of the currencySold2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySold2() {
        return currencySold2;
    }

    /**
     * Sets the value of the currencySold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySold2(String value) {
        this.currencySold2 = value;
    }

    /**
     * Gets the value of the amountSold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSold() {
        return amountSold;
    }

    /**
     * Sets the value of the amountSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSold(String value) {
        this.amountSold = value;
    }

    /**
     * Gets the value of the amountSold2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountSold2() {
        return amountSold2;
    }

    /**
     * Sets the value of the amountSold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountSold2(BigDecimal value) {
        this.amountSold2 = value;
    }

    /**
     * Gets the value of the exchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRate() {
        return exchRate;
    }

    /**
     * Sets the value of the exchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRate(BigDecimal value) {
        this.exchRate = value;
    }

    /**
     * Gets the value of the exchRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRate2() {
        return exchRate2;
    }

    /**
     * Sets the value of the exchRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRate2(BigDecimal value) {
        this.exchRate2 = value;
    }

    /**
     * Gets the value of the hoPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoPrice() {
        return hoPrice;
    }

    /**
     * Sets the value of the hoPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoPrice(BigDecimal value) {
        this.hoPrice = value;
    }

    /**
     * Gets the value of the custCrossSell1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustCrossSell1() {
        return custCrossSell1;
    }

    /**
     * Sets the value of the custCrossSell1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustCrossSell1(BigDecimal value) {
        this.custCrossSell1 = value;
    }

    /**
     * Gets the value of the custCrossSell2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCrossSell2() {
        return custCrossSell2;
    }

    /**
     * Sets the value of the custCrossSell2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCrossSell2(String value) {
        this.custCrossSell2 = value;
    }

    /**
     * Gets the value of the hoCrossSell1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoCrossSell1() {
        return hoCrossSell1;
    }

    /**
     * Sets the value of the hoCrossSell1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoCrossSell1(BigDecimal value) {
        this.hoCrossSell1 = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the notes2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes2() {
        return notes2;
    }

    /**
     * Sets the value of the notes2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes2(String value) {
        this.notes2 = value;
    }

    /**
     * Gets the value of the ourAccountPay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurAccountPay() {
        return ourAccountPay;
    }

    /**
     * Sets the value of the ourAccountPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurAccountPay(String value) {
        this.ourAccountPay = value;
    }

    /**
     * Gets the value of the ourAccountPay2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurAccountPay2() {
        return ourAccountPay2;
    }

    /**
     * Sets the value of the ourAccountPay2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurAccountPay2(String value) {
        this.ourAccountPay2 = value;
    }

    /**
     * Gets the value of the ourAccountRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurAccountRec() {
        return ourAccountRec;
    }

    /**
     * Sets the value of the ourAccountRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurAccountRec(String value) {
        this.ourAccountRec = value;
    }

    /**
     * Gets the value of the ourAccountRec2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOurAccountRec2() {
        return ourAccountRec2;
    }

    /**
     * Sets the value of the ourAccountRec2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOurAccountRec2(String value) {
        this.ourAccountRec2 = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpotRate(String value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the buyFcyPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyFcyPurpose() {
        return buyFcyPurpose;
    }

    /**
     * Sets the value of the buyFcyPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyFcyPurpose(String value) {
        this.buyFcyPurpose = value;
    }

    /**
     * Gets the value of the coCodeINP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoCodeINP() {
        return coCodeINP;
    }

    /**
     * Sets the value of the coCodeINP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoCodeINP(String value) {
        this.coCodeINP = value;
    }

    /**
     * Gets the value of the userInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInput() {
        return userInput;
    }

    /**
     * Sets the value of the userInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInput(String value) {
        this.userInput = value;
    }

    /**
     * Gets the value of the userApproved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserApproved() {
        return userApproved;
    }

    /**
     * Sets the value of the userApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserApproved(String value) {
        this.userApproved = value;
    }

    /**
     * Gets the value of the fxoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxoRef() {
        return fxoRef;
    }

    /**
     * Sets the value of the fxoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxoRef(String value) {
        this.fxoRef = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the branchPNL property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBranchPNL() {
        return branchPNL;
    }

    /**
     * Sets the value of the branchPNL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBranchPNL(BigDecimal value) {
        this.branchPNL = value;
    }

    /**
     * Gets the value of the fxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxType() {
        return fxType;
    }

    /**
     * Sets the value of the fxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxType(String value) {
        this.fxType = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the limitReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitReferenceNo() {
        return limitReferenceNo;
    }

    /**
     * Sets the value of the limitReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitReferenceNo(String value) {
        this.limitReferenceNo = value;
    }

    /**
     * Gets the value of the limitReferenceNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitReferenceNo2() {
        return limitReferenceNo2;
    }

    /**
     * Sets the value of the limitReferenceNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitReferenceNo2(String value) {
        this.limitReferenceNo2 = value;
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
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the fxid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXID() {
        return fxid;
    }

    /**
     * Sets the value of the fxid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXID(String value) {
        this.fxid = value;
    }

    /**
     * Gets the value of the swapRefNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapRefNo1() {
        return swapRefNo1;
    }

    /**
     * Sets the value of the swapRefNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapRefNo1(String value) {
        this.swapRefNo1 = value;
    }

    /**
     * Gets the value of the swapRefNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapRefNo2() {
        return swapRefNo2;
    }

    /**
     * Sets the value of the swapRefNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapRefNo2(String value) {
        this.swapRefNo2 = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordStatus(String value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the trsrcomid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrsrcomid() {
        return trsrcomid;
    }

    /**
     * Sets the value of the trsrcomid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrsrcomid(String value) {
        this.trsrcomid = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

}
