
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatementSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionStatementSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startingBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endingBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endingBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatementSummaryType", propOrder = {
    "startingBalance",
    "startingBalanceCurrency",
    "endingBalance",
    "endingBalanceCurrency"
})
public class TransactionStatementSummaryType {

    protected String startingBalance;
    protected String startingBalanceCurrency;
    protected String endingBalance;
    protected String endingBalanceCurrency;

    /**
     * Gets the value of the startingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingBalance() {
        return startingBalance;
    }

    /**
     * Sets the value of the startingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingBalance(String value) {
        this.startingBalance = value;
    }

    /**
     * Gets the value of the startingBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingBalanceCurrency() {
        return startingBalanceCurrency;
    }

    /**
     * Sets the value of the startingBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingBalanceCurrency(String value) {
        this.startingBalanceCurrency = value;
    }

    /**
     * Gets the value of the endingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingBalance() {
        return endingBalance;
    }

    /**
     * Sets the value of the endingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingBalance(String value) {
        this.endingBalance = value;
    }

    /**
     * Gets the value of the endingBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndingBalanceCurrency() {
        return endingBalanceCurrency;
    }

    /**
     * Sets the value of the endingBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndingBalanceCurrency(String value) {
        this.endingBalanceCurrency = value;
    }

}
