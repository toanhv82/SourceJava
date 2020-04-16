
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatementHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatementHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycleEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycleStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumRepaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overDueAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRepaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="downloadLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatementHeaderType", propOrder = {
    "cardAccountNumber",
    "cycleEnd",
    "cycleStart",
    "id",
    "minimumRepaymentAmount",
    "nextPaymentDate",
    "overDueAmount",
    "totalRepaymentAmount",
    "downloadLink"
})
public class CardStatementHeaderType {

    protected String cardAccountNumber;
    protected String cycleEnd;
    protected String cycleStart;
    protected String id;
    protected String minimumRepaymentAmount;
    protected String nextPaymentDate;
    protected String overDueAmount;
    protected String totalRepaymentAmount;
    protected String downloadLink;

    /**
     * Gets the value of the cardAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAccountNumber() {
        return cardAccountNumber;
    }

    /**
     * Sets the value of the cardAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAccountNumber(String value) {
        this.cardAccountNumber = value;
    }

    /**
     * Gets the value of the cycleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleEnd() {
        return cycleEnd;
    }

    /**
     * Sets the value of the cycleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleEnd(String value) {
        this.cycleEnd = value;
    }

    /**
     * Gets the value of the cycleStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleStart() {
        return cycleStart;
    }

    /**
     * Sets the value of the cycleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleStart(String value) {
        this.cycleStart = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the minimumRepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumRepaymentAmount() {
        return minimumRepaymentAmount;
    }

    /**
     * Sets the value of the minimumRepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumRepaymentAmount(String value) {
        this.minimumRepaymentAmount = value;
    }

    /**
     * Gets the value of the nextPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    /**
     * Sets the value of the nextPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPaymentDate(String value) {
        this.nextPaymentDate = value;
    }

    /**
     * Gets the value of the overDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverDueAmount() {
        return overDueAmount;
    }

    /**
     * Sets the value of the overDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverDueAmount(String value) {
        this.overDueAmount = value;
    }

    /**
     * Gets the value of the totalRepaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    /**
     * Sets the value of the totalRepaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRepaymentAmount(String value) {
        this.totalRepaymentAmount = value;
    }

    /**
     * Gets the value of the downloadLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * Sets the value of the downloadLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadLink(String value) {
        this.downloadLink = value;
    }

}
