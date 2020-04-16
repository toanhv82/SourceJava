
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptedLoanOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptedLoanOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanOtherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanOtherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestInstallmentPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openLoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanOtherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanOtherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principalInstallmentPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPMTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BPMTransStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="savingsBooksCollateral" type="{bian.com.vn}AccountInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptedLoanOfferType", propOrder = {
    "accountNumber",
    "cardType",
    "currency",
    "fee",
    "interestInstallmentPlanOtherCode",
    "interestInstallmentPlanOtherText",
    "interestInstallmentPlanPeriod",
    "interestInstallmentPlanType",
    "interestRate",
    "loanAmount",
    "loanOfferId",
    "openLoanType",
    "penaltyFee",
    "principalInstallmentPlanOtherCode",
    "principalInstallmentPlanOtherText",
    "principalInstallmentPlanPeriod",
    "principalInstallmentPlanType",
    "term",
    "termPeriodType",
    "bpmTransId",
    "bpmTransStatus",
    "savingsBooksCollateral"
})
public class AcceptedLoanOfferType {

    protected String accountNumber;
    protected String cardType;
    protected String currency;
    protected String fee;
    protected String interestInstallmentPlanOtherCode;
    protected String interestInstallmentPlanOtherText;
    protected String interestInstallmentPlanPeriod;
    protected String interestInstallmentPlanType;
    protected String interestRate;
    protected String loanAmount;
    protected String loanOfferId;
    protected String openLoanType;
    protected String penaltyFee;
    protected String principalInstallmentPlanOtherCode;
    protected String principalInstallmentPlanOtherText;
    protected String principalInstallmentPlanPeriod;
    protected String principalInstallmentPlanType;
    protected String term;
    protected String termPeriodType;
    @XmlElement(name = "BPMTransId")
    protected String bpmTransId;
    @XmlElement(name = "BPMTransStatus")
    protected String bpmTransStatus;
    protected List<AccountInfoType> savingsBooksCollateral;

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
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAmount(String value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanOfferId() {
        return loanOfferId;
    }

    /**
     * Sets the value of the loanOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanOfferId(String value) {
        this.loanOfferId = value;
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
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
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
     * Gets the value of the bpmTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPMTransId() {
        return bpmTransId;
    }

    /**
     * Sets the value of the bpmTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPMTransId(String value) {
        this.bpmTransId = value;
    }

    /**
     * Gets the value of the bpmTransStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPMTransStatus() {
        return bpmTransStatus;
    }

    /**
     * Sets the value of the bpmTransStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPMTransStatus(String value) {
        this.bpmTransStatus = value;
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

}
