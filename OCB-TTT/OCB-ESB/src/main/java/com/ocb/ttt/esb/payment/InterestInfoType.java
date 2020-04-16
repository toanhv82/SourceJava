
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestPayoutMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestSubProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestIbOpeningPos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="relatedGlobusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoRollover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depositType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initialAmountLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodicAmontLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateInfo" type="{bian.com.vn}RateInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="depositReccuringPeriods" type="{bian.com.vn}DepositReccuringPeriodsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestInfoType", propOrder = {
    "interestCurrency",
    "interestPayoutMode",
    "interestType",
    "interestSubProductCode",
    "interestTerm",
    "interestIbOpeningPos",
    "relatedGlobusId",
    "interestValueDate",
    "depositInterestDescription",
    "depositDays",
    "autoRollover",
    "depositType",
    "initialAmountLimit",
    "periodicAmontLimit",
    "rateInfo",
    "depositReccuringPeriods"
})
public class InterestInfoType {

    protected String interestCurrency;
    protected String interestPayoutMode;
    protected String interestType;
    protected String interestSubProductCode;
    protected String interestTerm;
    protected Boolean interestIbOpeningPos;
    protected String relatedGlobusId;
    protected String interestValueDate;
    protected String depositInterestDescription;
    protected String depositDays;
    protected Boolean autoRollover;
    protected String depositType;
    protected String initialAmountLimit;
    protected String periodicAmontLimit;
    protected List<RateInfoType> rateInfo;
    protected List<DepositReccuringPeriodsType> depositReccuringPeriods;

    /**
     * Gets the value of the interestCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestCurrency() {
        return interestCurrency;
    }

    /**
     * Sets the value of the interestCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestCurrency(String value) {
        this.interestCurrency = value;
    }

    /**
     * Gets the value of the interestPayoutMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestPayoutMode() {
        return interestPayoutMode;
    }

    /**
     * Sets the value of the interestPayoutMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestPayoutMode(String value) {
        this.interestPayoutMode = value;
    }

    /**
     * Gets the value of the interestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestType() {
        return interestType;
    }

    /**
     * Sets the value of the interestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestType(String value) {
        this.interestType = value;
    }

    /**
     * Gets the value of the interestSubProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestSubProductCode() {
        return interestSubProductCode;
    }

    /**
     * Sets the value of the interestSubProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestSubProductCode(String value) {
        this.interestSubProductCode = value;
    }

    /**
     * Gets the value of the interestTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestTerm() {
        return interestTerm;
    }

    /**
     * Sets the value of the interestTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestTerm(String value) {
        this.interestTerm = value;
    }

    /**
     * Gets the value of the interestIbOpeningPos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestIbOpeningPos() {
        return interestIbOpeningPos;
    }

    /**
     * Sets the value of the interestIbOpeningPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestIbOpeningPos(Boolean value) {
        this.interestIbOpeningPos = value;
    }

    /**
     * Gets the value of the relatedGlobusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedGlobusId() {
        return relatedGlobusId;
    }

    /**
     * Sets the value of the relatedGlobusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedGlobusId(String value) {
        this.relatedGlobusId = value;
    }

    /**
     * Gets the value of the interestValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestValueDate() {
        return interestValueDate;
    }

    /**
     * Sets the value of the interestValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestValueDate(String value) {
        this.interestValueDate = value;
    }

    /**
     * Gets the value of the depositInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositInterestDescription() {
        return depositInterestDescription;
    }

    /**
     * Sets the value of the depositInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositInterestDescription(String value) {
        this.depositInterestDescription = value;
    }

    /**
     * Gets the value of the depositDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositDays() {
        return depositDays;
    }

    /**
     * Sets the value of the depositDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositDays(String value) {
        this.depositDays = value;
    }

    /**
     * Gets the value of the autoRollover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRollover() {
        return autoRollover;
    }

    /**
     * Sets the value of the autoRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRollover(Boolean value) {
        this.autoRollover = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the initialAmountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialAmountLimit() {
        return initialAmountLimit;
    }

    /**
     * Sets the value of the initialAmountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialAmountLimit(String value) {
        this.initialAmountLimit = value;
    }

    /**
     * Gets the value of the periodicAmontLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicAmontLimit() {
        return periodicAmontLimit;
    }

    /**
     * Sets the value of the periodicAmontLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicAmontLimit(String value) {
        this.periodicAmontLimit = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateInfoType }
     * 
     * 
     */
    public List<RateInfoType> getRateInfo() {
        if (rateInfo == null) {
            rateInfo = new ArrayList<RateInfoType>();
        }
        return this.rateInfo;
    }

    /**
     * Gets the value of the depositReccuringPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositReccuringPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositReccuringPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositReccuringPeriodsType }
     * 
     * 
     */
    public List<DepositReccuringPeriodsType> getDepositReccuringPeriods() {
        if (depositReccuringPeriods == null) {
            depositReccuringPeriods = new ArrayList<DepositReccuringPeriodsType>();
        }
        return this.depositReccuringPeriods;
    }

}
