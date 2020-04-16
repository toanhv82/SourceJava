
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnlineServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlineServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isOpenAtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="houseOwnership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stayInMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasCreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardIssBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isPlatinum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasLifeInsu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeInsuBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomePerMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="professionalClassify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monthOfLabour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labourContractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expensePerMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageOnCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardExpectedLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardReceivePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardReceiveAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secureAnwser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPersonInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPersonRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPersonMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialProfile4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialProfile5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurProfileLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanCollateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOfficer" type="{bian.com.vn}AccountOfficerType" minOccurs="0"/>
 *         &lt;element name="refCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDebit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incomeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="realEstateProject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineServiceType", propOrder = {
    "transId",
    "source",
    "registerDate",
    "isOpenAtm",
    "houseOwnership",
    "stayInMonth",
    "hasCreditCard",
    "creditCardIssBy",
    "creditCardLimit",
    "isPlatinum",
    "hasLifeInsu",
    "lifeInsuBy",
    "incomePerMonth",
    "incomeSource",
    "professionalClassify",
    "department",
    "companyName",
    "domain",
    "position",
    "monthOfLabour",
    "labourContractType",
    "expensePerMonth",
    "netIncome",
    "cardType",
    "imageOnCard",
    "cardExpectedLimit",
    "cardReceivePlace",
    "cardReceiveAddress",
    "secureQuestion",
    "secureAnwser",
    "contactPersonInfo",
    "contactPersonRel",
    "contactPersonMobile",
    "personalProfile1",
    "personalProfile2",
    "personalProfile3",
    "residentProfile1",
    "residentProfile2",
    "residentProfile3",
    "financialProfile1",
    "financialProfile2",
    "financialProfile3",
    "financialProfile4",
    "financialProfile5",
    "custRequirement",
    "insurProfileLink",
    "loanPurpose",
    "loanCollateralType",
    "productType",
    "sourceRefId",
    "loanAmount",
    "loanTerm",
    "accountOfficer",
    "refCode",
    "isDebit",
    "campaignSource",
    "campaignName",
    "status",
    "notes",
    "incomeBank",
    "departmentType",
    "cardID",
    "realEstateProject",
    "collateralAmount"
})
public class OnlineServiceType {

    protected String transId;
    protected String source;
    protected String registerDate;
    protected String isOpenAtm;
    protected String houseOwnership;
    protected String stayInMonth;
    protected String hasCreditCard;
    protected String creditCardIssBy;
    protected String creditCardLimit;
    protected String isPlatinum;
    protected String hasLifeInsu;
    protected String lifeInsuBy;
    protected String incomePerMonth;
    protected String incomeSource;
    protected String professionalClassify;
    protected String department;
    protected String companyName;
    protected String domain;
    protected String position;
    protected String monthOfLabour;
    protected String labourContractType;
    protected String expensePerMonth;
    protected String netIncome;
    protected String cardType;
    protected String imageOnCard;
    protected String cardExpectedLimit;
    protected String cardReceivePlace;
    protected String cardReceiveAddress;
    protected String secureQuestion;
    protected String secureAnwser;
    protected String contactPersonInfo;
    protected String contactPersonRel;
    protected String contactPersonMobile;
    protected String personalProfile1;
    protected String personalProfile2;
    protected String personalProfile3;
    protected String residentProfile1;
    protected String residentProfile2;
    protected String residentProfile3;
    protected String financialProfile1;
    protected String financialProfile2;
    protected String financialProfile3;
    protected String financialProfile4;
    protected String financialProfile5;
    protected String custRequirement;
    protected String insurProfileLink;
    protected String loanPurpose;
    protected String loanCollateralType;
    protected String productType;
    protected String sourceRefId;
    protected String loanAmount;
    protected String loanTerm;
    protected AccountOfficerType accountOfficer;
    protected String refCode;
    protected String isDebit;
    protected String campaignSource;
    protected String campaignName;
    protected String status;
    protected String notes;
    protected String incomeBank;
    protected String departmentType;
    protected String cardID;
    protected String realEstateProject;
    protected String collateralAmount;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDate(String value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the isOpenAtm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOpenAtm() {
        return isOpenAtm;
    }

    /**
     * Sets the value of the isOpenAtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOpenAtm(String value) {
        this.isOpenAtm = value;
    }

    /**
     * Gets the value of the houseOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseOwnership() {
        return houseOwnership;
    }

    /**
     * Sets the value of the houseOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseOwnership(String value) {
        this.houseOwnership = value;
    }

    /**
     * Gets the value of the stayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayInMonth() {
        return stayInMonth;
    }

    /**
     * Sets the value of the stayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayInMonth(String value) {
        this.stayInMonth = value;
    }

    /**
     * Gets the value of the hasCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasCreditCard() {
        return hasCreditCard;
    }

    /**
     * Sets the value of the hasCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasCreditCard(String value) {
        this.hasCreditCard = value;
    }

    /**
     * Gets the value of the creditCardIssBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIssBy() {
        return creditCardIssBy;
    }

    /**
     * Sets the value of the creditCardIssBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardIssBy(String value) {
        this.creditCardIssBy = value;
    }

    /**
     * Gets the value of the creditCardLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardLimit() {
        return creditCardLimit;
    }

    /**
     * Sets the value of the creditCardLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardLimit(String value) {
        this.creditCardLimit = value;
    }

    /**
     * Gets the value of the isPlatinum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPlatinum() {
        return isPlatinum;
    }

    /**
     * Sets the value of the isPlatinum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPlatinum(String value) {
        this.isPlatinum = value;
    }

    /**
     * Gets the value of the hasLifeInsu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasLifeInsu() {
        return hasLifeInsu;
    }

    /**
     * Sets the value of the hasLifeInsu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasLifeInsu(String value) {
        this.hasLifeInsu = value;
    }

    /**
     * Gets the value of the lifeInsuBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeInsuBy() {
        return lifeInsuBy;
    }

    /**
     * Sets the value of the lifeInsuBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeInsuBy(String value) {
        this.lifeInsuBy = value;
    }

    /**
     * Gets the value of the incomePerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomePerMonth() {
        return incomePerMonth;
    }

    /**
     * Sets the value of the incomePerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomePerMonth(String value) {
        this.incomePerMonth = value;
    }

    /**
     * Gets the value of the incomeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeSource() {
        return incomeSource;
    }

    /**
     * Sets the value of the incomeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeSource(String value) {
        this.incomeSource = value;
    }

    /**
     * Gets the value of the professionalClassify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalClassify() {
        return professionalClassify;
    }

    /**
     * Sets the value of the professionalClassify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalClassify(String value) {
        this.professionalClassify = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
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
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the monthOfLabour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthOfLabour() {
        return monthOfLabour;
    }

    /**
     * Sets the value of the monthOfLabour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthOfLabour(String value) {
        this.monthOfLabour = value;
    }

    /**
     * Gets the value of the labourContractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabourContractType() {
        return labourContractType;
    }

    /**
     * Sets the value of the labourContractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabourContractType(String value) {
        this.labourContractType = value;
    }

    /**
     * Gets the value of the expensePerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpensePerMonth() {
        return expensePerMonth;
    }

    /**
     * Sets the value of the expensePerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpensePerMonth(String value) {
        this.expensePerMonth = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetIncome(String value) {
        this.netIncome = value;
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
     * Gets the value of the imageOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageOnCard() {
        return imageOnCard;
    }

    /**
     * Sets the value of the imageOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageOnCard(String value) {
        this.imageOnCard = value;
    }

    /**
     * Gets the value of the cardExpectedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpectedLimit() {
        return cardExpectedLimit;
    }

    /**
     * Sets the value of the cardExpectedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpectedLimit(String value) {
        this.cardExpectedLimit = value;
    }

    /**
     * Gets the value of the cardReceivePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReceivePlace() {
        return cardReceivePlace;
    }

    /**
     * Sets the value of the cardReceivePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReceivePlace(String value) {
        this.cardReceivePlace = value;
    }

    /**
     * Gets the value of the cardReceiveAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardReceiveAddress() {
        return cardReceiveAddress;
    }

    /**
     * Sets the value of the cardReceiveAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardReceiveAddress(String value) {
        this.cardReceiveAddress = value;
    }

    /**
     * Gets the value of the secureQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureQuestion() {
        return secureQuestion;
    }

    /**
     * Sets the value of the secureQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureQuestion(String value) {
        this.secureQuestion = value;
    }

    /**
     * Gets the value of the secureAnwser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureAnwser() {
        return secureAnwser;
    }

    /**
     * Sets the value of the secureAnwser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureAnwser(String value) {
        this.secureAnwser = value;
    }

    /**
     * Gets the value of the contactPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonInfo() {
        return contactPersonInfo;
    }

    /**
     * Sets the value of the contactPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonInfo(String value) {
        this.contactPersonInfo = value;
    }

    /**
     * Gets the value of the contactPersonRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonRel() {
        return contactPersonRel;
    }

    /**
     * Sets the value of the contactPersonRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonRel(String value) {
        this.contactPersonRel = value;
    }

    /**
     * Gets the value of the contactPersonMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonMobile() {
        return contactPersonMobile;
    }

    /**
     * Sets the value of the contactPersonMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonMobile(String value) {
        this.contactPersonMobile = value;
    }

    /**
     * Gets the value of the personalProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalProfile1() {
        return personalProfile1;
    }

    /**
     * Sets the value of the personalProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalProfile1(String value) {
        this.personalProfile1 = value;
    }

    /**
     * Gets the value of the personalProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalProfile2() {
        return personalProfile2;
    }

    /**
     * Sets the value of the personalProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalProfile2(String value) {
        this.personalProfile2 = value;
    }

    /**
     * Gets the value of the personalProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalProfile3() {
        return personalProfile3;
    }

    /**
     * Sets the value of the personalProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalProfile3(String value) {
        this.personalProfile3 = value;
    }

    /**
     * Gets the value of the residentProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentProfile1() {
        return residentProfile1;
    }

    /**
     * Sets the value of the residentProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentProfile1(String value) {
        this.residentProfile1 = value;
    }

    /**
     * Gets the value of the residentProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentProfile2() {
        return residentProfile2;
    }

    /**
     * Sets the value of the residentProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentProfile2(String value) {
        this.residentProfile2 = value;
    }

    /**
     * Gets the value of the residentProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentProfile3() {
        return residentProfile3;
    }

    /**
     * Sets the value of the residentProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentProfile3(String value) {
        this.residentProfile3 = value;
    }

    /**
     * Gets the value of the financialProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialProfile1() {
        return financialProfile1;
    }

    /**
     * Sets the value of the financialProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialProfile1(String value) {
        this.financialProfile1 = value;
    }

    /**
     * Gets the value of the financialProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialProfile2() {
        return financialProfile2;
    }

    /**
     * Sets the value of the financialProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialProfile2(String value) {
        this.financialProfile2 = value;
    }

    /**
     * Gets the value of the financialProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialProfile3() {
        return financialProfile3;
    }

    /**
     * Sets the value of the financialProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialProfile3(String value) {
        this.financialProfile3 = value;
    }

    /**
     * Gets the value of the financialProfile4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialProfile4() {
        return financialProfile4;
    }

    /**
     * Sets the value of the financialProfile4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialProfile4(String value) {
        this.financialProfile4 = value;
    }

    /**
     * Gets the value of the financialProfile5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialProfile5() {
        return financialProfile5;
    }

    /**
     * Sets the value of the financialProfile5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialProfile5(String value) {
        this.financialProfile5 = value;
    }

    /**
     * Gets the value of the custRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustRequirement() {
        return custRequirement;
    }

    /**
     * Sets the value of the custRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustRequirement(String value) {
        this.custRequirement = value;
    }

    /**
     * Gets the value of the insurProfileLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurProfileLink() {
        return insurProfileLink;
    }

    /**
     * Sets the value of the insurProfileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurProfileLink(String value) {
        this.insurProfileLink = value;
    }

    /**
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * Gets the value of the loanCollateralType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCollateralType() {
        return loanCollateralType;
    }

    /**
     * Sets the value of the loanCollateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCollateralType(String value) {
        this.loanCollateralType = value;
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
     * Gets the value of the sourceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceRefId() {
        return sourceRefId;
    }

    /**
     * Sets the value of the sourceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRefId(String value) {
        this.sourceRefId = value;
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
     * Gets the value of the loanTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTerm() {
        return loanTerm;
    }

    /**
     * Sets the value of the loanTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTerm(String value) {
        this.loanTerm = value;
    }

    /**
     * Gets the value of the accountOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOfficerType }
     *     
     */
    public AccountOfficerType getAccountOfficer() {
        return accountOfficer;
    }

    /**
     * Sets the value of the accountOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOfficerType }
     *     
     */
    public void setAccountOfficer(AccountOfficerType value) {
        this.accountOfficer = value;
    }

    /**
     * Gets the value of the refCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCode() {
        return refCode;
    }

    /**
     * Sets the value of the refCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCode(String value) {
        this.refCode = value;
    }

    /**
     * Gets the value of the isDebit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDebit() {
        return isDebit;
    }

    /**
     * Sets the value of the isDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDebit(String value) {
        this.isDebit = value;
    }

    /**
     * Gets the value of the campaignSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignSource() {
        return campaignSource;
    }

    /**
     * Sets the value of the campaignSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignSource(String value) {
        this.campaignSource = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
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
     * Gets the value of the incomeBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeBank() {
        return incomeBank;
    }

    /**
     * Sets the value of the incomeBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeBank(String value) {
        this.incomeBank = value;
    }

    /**
     * Gets the value of the departmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentType() {
        return departmentType;
    }

    /**
     * Sets the value of the departmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentType(String value) {
        this.departmentType = value;
    }

    /**
     * Gets the value of the cardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardID(String value) {
        this.cardID = value;
    }

    /**
     * Gets the value of the realEstateProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealEstateProject() {
        return realEstateProject;
    }

    /**
     * Sets the value of the realEstateProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealEstateProject(String value) {
        this.realEstateProject = value;
    }

    /**
     * Gets the value of the collateralAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralAmount() {
        return collateralAmount;
    }

    /**
     * Sets the value of the collateralAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralAmount(String value) {
        this.collateralAmount = value;
    }

}
