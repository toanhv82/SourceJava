
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorAccountInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestorAccountInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestNav" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingBalanceUnrealizedGainLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingBalanceHistoricalCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openingBalanceRealizedGainLoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="investorPaymentItem" type="{bian.com.vn}InvestorPaymentItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorAccountInfoType", propOrder = {
    "accountNum",
    "amount",
    "investorType",
    "productName",
    "accountName",
    "productType",
    "latestNav",
    "transDate",
    "openingBalanceUnrealizedGainLoss",
    "openingBalanceHistoricalCost",
    "openingBalanceRealizedGainLoss",
    "investorPaymentItem"
})
public class InvestorAccountInfoType {

    protected String accountNum;
    protected String amount;
    protected String investorType;
    protected String productName;
    protected String accountName;
    protected String productType;
    protected String latestNav;
    protected String transDate;
    protected String openingBalanceUnrealizedGainLoss;
    protected String openingBalanceHistoricalCost;
    protected String openingBalanceRealizedGainLoss;
    protected List<InvestorPaymentItemType> investorPaymentItem;

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
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
     * Gets the value of the investorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestorType() {
        return investorType;
    }

    /**
     * Sets the value of the investorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestorType(String value) {
        this.investorType = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
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
     * Gets the value of the latestNav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestNav() {
        return latestNav;
    }

    /**
     * Sets the value of the latestNav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestNav(String value) {
        this.latestNav = value;
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
     * Gets the value of the openingBalanceUnrealizedGainLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningBalanceUnrealizedGainLoss() {
        return openingBalanceUnrealizedGainLoss;
    }

    /**
     * Sets the value of the openingBalanceUnrealizedGainLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningBalanceUnrealizedGainLoss(String value) {
        this.openingBalanceUnrealizedGainLoss = value;
    }

    /**
     * Gets the value of the openingBalanceHistoricalCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningBalanceHistoricalCost() {
        return openingBalanceHistoricalCost;
    }

    /**
     * Sets the value of the openingBalanceHistoricalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningBalanceHistoricalCost(String value) {
        this.openingBalanceHistoricalCost = value;
    }

    /**
     * Gets the value of the openingBalanceRealizedGainLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpeningBalanceRealizedGainLoss() {
        return openingBalanceRealizedGainLoss;
    }

    /**
     * Sets the value of the openingBalanceRealizedGainLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpeningBalanceRealizedGainLoss(String value) {
        this.openingBalanceRealizedGainLoss = value;
    }

    /**
     * Gets the value of the investorPaymentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investorPaymentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestorPaymentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorPaymentItemType }
     * 
     * 
     */
    public List<InvestorPaymentItemType> getInvestorPaymentItem() {
        if (investorPaymentItem == null) {
            investorPaymentItem = new ArrayList<InvestorPaymentItemType>();
        }
        return this.investorPaymentItem;
    }

}
