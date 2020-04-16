
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountLedgerBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountAvailableFundDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceType", propOrder = {
    "accountLedgerBalance",
    "accountAvailableFundDate"
})
public class BalanceType {

    protected String accountLedgerBalance;
    protected String accountAvailableFundDate;

    /**
     * Gets the value of the accountLedgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLedgerBalance() {
        return accountLedgerBalance;
    }

    /**
     * Sets the value of the accountLedgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLedgerBalance(String value) {
        this.accountLedgerBalance = value;
    }

    /**
     * Gets the value of the accountAvailableFundDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAvailableFundDate() {
        return accountAvailableFundDate;
    }

    /**
     * Sets the value of the accountAvailableFundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAvailableFundDate(String value) {
        this.accountAvailableFundDate = value;
    }

}
