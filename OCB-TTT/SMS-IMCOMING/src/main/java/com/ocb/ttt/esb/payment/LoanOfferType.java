
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * OmniChannel: other interest installment plan - code - language independent , not changeable , for example for text "Base on Statement" here will be some code BaseStatement - same for all languages
 * 
 * <p>Java class for LoanOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanModify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanOtherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanOtherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmountFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmountTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preApprovedOfferValidFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preApprovedOfferValidTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanModify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanOtherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanOtherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="savingsBooksCollateral" type="{bian.com.vn}AccountInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loanAmountDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanOfferType", propOrder = {
    "accountNumber",
    "cardType",
    "currency",
    "fee",
    "interestInstallmentPlanModify",
    "interestInstallmentPlanOtherCode",
    "interestInstallmentPlanOtherText",
    "interestInstallmentPlanPeriod",
    "interestInstallmentPlanType",
    "interestRate",
    "loanAmountFrom",
    "loanAmountTo",
    "openLoanType",
    "penaltyFee",
    "preApprovedOfferValidFrom",
    "preApprovedOfferValidTo",
    "principalInstallmentPlanModify",
    "principalInstallmentPlanOtherCode",
    "principalInstallmentPlanOtherText",
    "principalInstallmentPlanPeriod",
    "principalInstallmentPlanType",
    "termFrom",
    "termPeriodType",
    "termTo",
    "validOffer",
    "savingsBooksCollateral",
    "loanAmountDefault"
})
public class LoanOfferType {

    protected String accountNumber;
    protected String cardType;
    protected String currency;
    protected String fee;
    protected String interestInstallmentPlanModify;
    protected String interestInstallmentPlanOtherCode;
    protected String interestInstallmentPlanOtherText;
    protected String interestInstallmentPlanPeriod;
    protected String interestInstallmentPlanType;
    protected String interestRate;
    protected String loanAmountFrom;
    protected String loanAmountTo;
    protected String openLoanType;
    protected String penaltyFee;
    protected String preApprovedOfferValidFrom;
    protected String preApprovedOfferValidTo;
    protected String principalInstallmentPlanModify;
    protected String principalInstallmentPlanOtherCode;
    protected String principalInstallmentPlanOtherText;
    protected String principalInstallmentPlanPeriod;
    protected String principalInstallmentPlanType;
    protected String termFrom;
    protected String termPeriodType;
    protected String termTo;
    protected String validOffer;
    protected List<AccountInfoType> savingsBooksCollateral;
    protected String loanAmountDefault;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFee(String value) {
        this.fee = value;
    }

    /**
     * Gets the value of the interestInstallmentPlanModify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInstallmentPlanModify() {
        return interestInstallmentPlanModify;
    }

    /**
     * Sets the value of the interestInstallmentPlanModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInstallmentPlanModify(String value) {
        this.interestInstallmentPlanModify = value;
    }

    /**
     * Gets the value of the interestInstallmentPlanOtherCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInstallmentPlanOtherCode() {
        return interestInstallmentPlanOtherCode;
    }

    /**
     * Sets the value of the interestInstallmentPlanOtherCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInstallmentPlanOtherCode(String value) {
        this.interestInstallmentPlanOtherCode = value;
    }

    /**
     * Gets the value of the interestInstallmentPlanOtherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInstallmentPlanOtherText() {
        return interestInstallmentPlanOtherText;
    }

    /**
     * Sets the value of the interestInstallmentPlanOtherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInstallmentPlanOtherText(String value) {
        this.interestInstallmentPlanOtherText = value;
    }

    /**
     * Gets the value of the interestInstallmentPlanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInstallmentPlanPeriod() {
        return interestInstallmentPlanPeriod;
    }

    /**
     * Sets the value of the interestInstallmentPlanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInstallmentPlanPeriod(String value) {
        this.interestInstallmentPlanPeriod = value;
    }

    /**
     * Gets the value of the interestInstallmentPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestInstallmentPlanType() {
        return interestInstallmentPlanType;
    }

    /**
     * Sets the value of the interestInstallmentPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestInstallmentPlanType(String value) {
        this.interestInstallmentPlanType = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRate(String value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the loanAmountFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmountFrom() {
        return loanAmountFrom;
    }

    /**
     * Sets the value of the loanAmountFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmountFrom(String value) {
        this.loanAmountFrom = value;
    }

    /**
     * Gets the value of the loanAmountTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmountTo() {
        return loanAmountTo;
    }

    /**
     * Sets the value of the loanAmountTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmountTo(String value) {
        this.loanAmountTo = value;
    }

    /**
     * Gets the value of the openLoanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenLoanType() {
        return openLoanType;
    }

    /**
     * Sets the value of the openLoanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenLoanType(String value) {
        this.openLoanType = value;
    }

    /**
     * Gets the value of the penaltyFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyFee() {
        return penaltyFee;
    }

    /**
     * Sets the value of the penaltyFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyFee(String value) {
        this.penaltyFee = value;
    }

    /**
     * Gets the value of the preApprovedOfferValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreApprovedOfferValidFrom() {
        return preApprovedOfferValidFrom;
    }

    /**
     * Sets the value of the preApprovedOfferValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreApprovedOfferValidFrom(String value) {
        this.preApprovedOfferValidFrom = value;
    }

    /**
     * Gets the value of the preApprovedOfferValidTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreApprovedOfferValidTo() {
        return preApprovedOfferValidTo;
    }

    /**
     * Sets the value of the preApprovedOfferValidTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreApprovedOfferValidTo(String value) {
        this.preApprovedOfferValidTo = value;
    }

    /**
     * Gets the value of the principalInstallmentPlanModify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInstallmentPlanModify() {
        return principalInstallmentPlanModify;
    }

    /**
     * Sets the value of the principalInstallmentPlanModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInstallmentPlanModify(String value) {
        this.principalInstallmentPlanModify = value;
    }

    /**
     * Gets the value of the principalInstallmentPlanOtherCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInstallmentPlanOtherCode() {
        return principalInstallmentPlanOtherCode;
    }

    /**
     * Sets the value of the principalInstallmentPlanOtherCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInstallmentPlanOtherCode(String value) {
        this.principalInstallmentPlanOtherCode = value;
    }

    /**
     * Gets the value of the principalInstallmentPlanOtherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInstallmentPlanOtherText() {
        return principalInstallmentPlanOtherText;
    }

    /**
     * Sets the value of the principalInstallmentPlanOtherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInstallmentPlanOtherText(String value) {
        this.principalInstallmentPlanOtherText = value;
    }

    /**
     * Gets the value of the principalInstallmentPlanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInstallmentPlanPeriod() {
        return principalInstallmentPlanPeriod;
    }

    /**
     * Sets the value of the principalInstallmentPlanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInstallmentPlanPeriod(String value) {
        this.principalInstallmentPlanPeriod = value;
    }

    /**
     * Gets the value of the principalInstallmentPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInstallmentPlanType() {
        return principalInstallmentPlanType;
    }

    /**
     * Sets the value of the principalInstallmentPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInstallmentPlanType(String value) {
        this.principalInstallmentPlanType = value;
    }

    /**
     * Gets the value of the termFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermFrom() {
        return termFrom;
    }

    /**
     * Sets the value of the termFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermFrom(String value) {
        this.termFrom = value;
    }

    /**
     * Gets the value of the termPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermPeriodType() {
        return termPeriodType;
    }

    /**
     * Sets the value of the termPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermPeriodType(String value) {
        this.termPeriodType = value;
    }

    /**
     * Gets the value of the termTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermTo() {
        return termTo;
    }

    /**
     * Sets the value of the termTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermTo(String value) {
        this.termTo = value;
    }

    /**
     * Gets the value of the validOffer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidOffer() {
        return validOffer;
    }

    /**
     * Sets the value of the validOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidOffer(String value) {
        this.validOffer = value;
    }

    /**
     * Gets the value of the savingsBooksCollateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savingsBooksCollateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavingsBooksCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInfoType }
     * 
     * 
     */
    public List<AccountInfoType> getSavingsBooksCollateral() {
        if (savingsBooksCollateral == null) {
            savingsBooksCollateral = new ArrayList<AccountInfoType>();
        }
        return this.savingsBooksCollateral;
    }

    /**
     * Gets the value of the loanAmountDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmountDefault() {
        return loanAmountDefault;
    }

    /**
     * Sets the value of the loanAmountDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmountDefault(String value) {
        this.loanAmountDefault = value;
    }

}
