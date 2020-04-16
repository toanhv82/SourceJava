
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementGenerationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementScheduleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementScheduleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatementDownloadLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanStatementType", propOrder = {
    "loanContract",
    "loanStatementEndDate",
    "loanStatementGenerationDate",
    "loanStatementScheduleNumber",
    "loanStatementScheduleType",
    "loanStatementStartDate",
    "loanStatementDownloadLink"
})
public class LoanStatementType {

    protected String loanContract;
    protected String loanStatementEndDate;
    protected String loanStatementGenerationDate;
    protected String loanStatementScheduleNumber;
    protected String loanStatementScheduleType;
    protected String loanStatementStartDate;
    protected String loanStatementDownloadLink;

    /**
     * Gets the value of the loanContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanContract() {
        return loanContract;
    }

    /**
     * Sets the value of the loanContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanContract(String value) {
        this.loanContract = value;
    }

    /**
     * Gets the value of the loanStatementEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementEndDate() {
        return loanStatementEndDate;
    }

    /**
     * Sets the value of the loanStatementEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementEndDate(String value) {
        this.loanStatementEndDate = value;
    }

    /**
     * Gets the value of the loanStatementGenerationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementGenerationDate() {
        return loanStatementGenerationDate;
    }

    /**
     * Sets the value of the loanStatementGenerationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementGenerationDate(String value) {
        this.loanStatementGenerationDate = value;
    }

    /**
     * Gets the value of the loanStatementScheduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementScheduleNumber() {
        return loanStatementScheduleNumber;
    }

    /**
     * Sets the value of the loanStatementScheduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementScheduleNumber(String value) {
        this.loanStatementScheduleNumber = value;
    }

    /**
     * Gets the value of the loanStatementScheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementScheduleType() {
        return loanStatementScheduleType;
    }

    /**
     * Sets the value of the loanStatementScheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementScheduleType(String value) {
        this.loanStatementScheduleType = value;
    }

    /**
     * Gets the value of the loanStatementStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementStartDate() {
        return loanStatementStartDate;
    }

    /**
     * Sets the value of the loanStatementStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementStartDate(String value) {
        this.loanStatementStartDate = value;
    }

    /**
     * Gets the value of the loanStatementDownloadLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatementDownloadLink() {
        return loanStatementDownloadLink;
    }

    /**
     * Sets the value of the loanStatementDownloadLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatementDownloadLink(String value) {
        this.loanStatementDownloadLink = value;
    }

}
