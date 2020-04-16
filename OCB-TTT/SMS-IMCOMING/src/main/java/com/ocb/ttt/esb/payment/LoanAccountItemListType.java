
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanAccountItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanAccountInfo" type="{bian.com.vn}LoanAccountInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountItemListType", propOrder = {
    "loanAccountInfo"
})
public class LoanAccountItemListType {

    @XmlElement(required = true)
    protected LoanAccountInfoType loanAccountInfo;

    /**
     * Gets the value of the loanAccountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountInfoType }
     *     
     */
    public LoanAccountInfoType getLoanAccountInfo() {
        return loanAccountInfo;
    }

    /**
     * Sets the value of the loanAccountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountInfoType }
     *     
     */
    public void setLoanAccountInfo(LoanAccountInfoType value) {
        this.loanAccountInfo = value;
    }

}
