
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAuthorizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionAuthorizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionAuthorizeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAuthorizeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAuthorizeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAuthorizeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionAuthorizePRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transAuthorizedToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAuthorizationType", propOrder = {
    "transactionAuthorizeType",
    "transactionAuthorizeAccount",
    "transactionAuthorizeKey",
    "transactionAuthorizeValue",
    "transactionAuthorizePRef",
    "transAuthorizedToken"
})
public class TransactionAuthorizationType {

    protected String transactionAuthorizeType;
    protected String transactionAuthorizeAccount;
    protected String transactionAuthorizeKey;
    protected String transactionAuthorizeValue;
    protected String transactionAuthorizePRef;
    protected String transAuthorizedToken;

    /**
     * Gets the value of the transactionAuthorizeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAuthorizeType() {
        return transactionAuthorizeType;
    }

    /**
     * Sets the value of the transactionAuthorizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAuthorizeType(String value) {
        this.transactionAuthorizeType = value;
    }

    /**
     * Gets the value of the transactionAuthorizeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAuthorizeAccount() {
        return transactionAuthorizeAccount;
    }

    /**
     * Sets the value of the transactionAuthorizeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAuthorizeAccount(String value) {
        this.transactionAuthorizeAccount = value;
    }

    /**
     * Gets the value of the transactionAuthorizeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAuthorizeKey() {
        return transactionAuthorizeKey;
    }

    /**
     * Sets the value of the transactionAuthorizeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAuthorizeKey(String value) {
        this.transactionAuthorizeKey = value;
    }

    /**
     * Gets the value of the transactionAuthorizeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAuthorizeValue() {
        return transactionAuthorizeValue;
    }

    /**
     * Sets the value of the transactionAuthorizeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAuthorizeValue(String value) {
        this.transactionAuthorizeValue = value;
    }

    /**
     * Gets the value of the transactionAuthorizePRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionAuthorizePRef() {
        return transactionAuthorizePRef;
    }

    /**
     * Sets the value of the transactionAuthorizePRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionAuthorizePRef(String value) {
        this.transactionAuthorizePRef = value;
    }

    /**
     * Gets the value of the transAuthorizedToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransAuthorizedToken() {
        return transAuthorizedToken;
    }

    /**
     * Sets the value of the transAuthorizedToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransAuthorizedToken(String value) {
        this.transAuthorizedToken = value;
    }

}
