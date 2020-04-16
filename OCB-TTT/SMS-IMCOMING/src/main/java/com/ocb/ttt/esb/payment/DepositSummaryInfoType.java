
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositSummaryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositSummaryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDepositNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositSummaryList" type="{bian.com.vn}DepositSummaryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositSummaryInfoType", propOrder = {
    "totalDepositNum",
    "depositSummaryList"
})
public class DepositSummaryInfoType {

    protected String totalDepositNum;
    protected DepositSummaryListType depositSummaryList;

    /**
     * Gets the value of the totalDepositNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDepositNum() {
        return totalDepositNum;
    }

    /**
     * Sets the value of the totalDepositNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDepositNum(String value) {
        this.totalDepositNum = value;
    }

    /**
     * Gets the value of the depositSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link DepositSummaryListType }
     *     
     */
    public DepositSummaryListType getDepositSummaryList() {
        return depositSummaryList;
    }

    /**
     * Sets the value of the depositSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositSummaryListType }
     *     
     */
    public void setDepositSummaryList(DepositSummaryListType value) {
        this.depositSummaryList = value;
    }

}
