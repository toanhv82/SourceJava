
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockadeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockadeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockadeAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeValueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockadeEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockadeInfoType", propOrder = {
    "blockadeAccountNum",
    "blockadeAmount",
    "blockadeAccountName",
    "blockadeCurrencyCode",
    "blockadeComment",
    "blockadeValueDate",
    "blockadeEndDate",
    "transactionCode",
    "transactionType"
})
public class BlockadeInfoType {

    protected String blockadeAccountNum;
    protected String blockadeAmount;
    protected String blockadeAccountName;
    protected String blockadeCurrencyCode;
    protected String blockadeComment;
    protected String blockadeValueDate;
    protected String blockadeEndDate;
    protected String transactionCode;
    protected String transactionType;

    /**
     * Gets the value of the blockadeAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeAccountNum() {
        return blockadeAccountNum;
    }

    /**
     * Sets the value of the blockadeAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeAccountNum(String value) {
        this.blockadeAccountNum = value;
    }

    /**
     * Gets the value of the blockadeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeAmount() {
        return blockadeAmount;
    }

    /**
     * Sets the value of the blockadeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeAmount(String value) {
        this.blockadeAmount = value;
    }

    /**
     * Gets the value of the blockadeAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeAccountName() {
        return blockadeAccountName;
    }

    /**
     * Sets the value of the blockadeAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeAccountName(String value) {
        this.blockadeAccountName = value;
    }

    /**
     * Gets the value of the blockadeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeCurrencyCode() {
        return blockadeCurrencyCode;
    }

    /**
     * Sets the value of the blockadeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeCurrencyCode(String value) {
        this.blockadeCurrencyCode = value;
    }

    /**
     * Gets the value of the blockadeComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeComment() {
        return blockadeComment;
    }

    /**
     * Sets the value of the blockadeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeComment(String value) {
        this.blockadeComment = value;
    }

    /**
     * Gets the value of the blockadeValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeValueDate() {
        return blockadeValueDate;
    }

    /**
     * Sets the value of the blockadeValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeValueDate(String value) {
        this.blockadeValueDate = value;
    }

    /**
     * Gets the value of the blockadeEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockadeEndDate() {
        return blockadeEndDate;
    }

    /**
     * Sets the value of the blockadeEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockadeEndDate(String value) {
        this.blockadeEndDate = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
