
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcPayinType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcAccountBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcAccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountOpeningAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcPayinPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayinType", propOrder = {
    "srcPayinType",
    "srcAccountBranch",
    "srcAccountNum",
    "accountOpeningAmount",
    "srcPayinPercentage"
})
public class PayinType {

    protected String srcPayinType;
    protected String srcAccountBranch;
    protected String srcAccountNum;
    protected String accountOpeningAmount;
    protected String srcPayinPercentage;

    /**
     * Gets the value of the srcPayinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPayinType() {
        return srcPayinType;
    }

    /**
     * Sets the value of the srcPayinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPayinType(String value) {
        this.srcPayinType = value;
    }

    /**
     * Gets the value of the srcAccountBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAccountBranch() {
        return srcAccountBranch;
    }

    /**
     * Sets the value of the srcAccountBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAccountBranch(String value) {
        this.srcAccountBranch = value;
    }

    /**
     * Gets the value of the srcAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAccountNum() {
        return srcAccountNum;
    }

    /**
     * Sets the value of the srcAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAccountNum(String value) {
        this.srcAccountNum = value;
    }

    /**
     * Gets the value of the accountOpeningAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountOpeningAmount() {
        return accountOpeningAmount;
    }

    /**
     * Sets the value of the accountOpeningAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountOpeningAmount(String value) {
        this.accountOpeningAmount = value;
    }

    /**
     * Gets the value of the srcPayinPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPayinPercentage() {
        return srcPayinPercentage;
    }

    /**
     * Sets the value of the srcPayinPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPayinPercentage(String value) {
        this.srcPayinPercentage = value;
    }

}
