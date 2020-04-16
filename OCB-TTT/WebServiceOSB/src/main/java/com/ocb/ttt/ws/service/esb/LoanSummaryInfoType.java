
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanSummaryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanSummaryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalLoanNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanSummaryList" type="{bian.com.vn}LoanSummaryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanSummaryInfoType", propOrder = {
    "totalLoanNum",
    "loanSummaryList"
})
public class LoanSummaryInfoType {

    protected String totalLoanNum;
    protected LoanSummaryListType loanSummaryList;

    /**
     * Gets the value of the totalLoanNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalLoanNum() {
        return totalLoanNum;
    }

    /**
     * Sets the value of the totalLoanNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalLoanNum(String value) {
        this.totalLoanNum = value;
    }

    /**
     * Gets the value of the loanSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link LoanSummaryListType }
     *     
     */
    public LoanSummaryListType getLoanSummaryList() {
        return loanSummaryList;
    }

    /**
     * Sets the value of the loanSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanSummaryListType }
     *     
     */
    public void setLoanSummaryList(LoanSummaryListType value) {
        this.loanSummaryList = value;
    }

}
