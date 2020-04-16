
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanAccountListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="loanAccountInfo" type="{bian.com.vn}LoanAccountInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Item" type="{bian.com.vn}LoanAccountItemListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountListType", propOrder = {
    "loanAccountInfo",
    "item"
})
public class LoanAccountListType {

    protected List<LoanAccountInfoType> loanAccountInfo;
    @XmlElement(name = "Item")
    protected List<LoanAccountItemListType> item;

    /**
     * Gets the value of the loanAccountInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanAccountInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanAccountInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAccountInfoType }
     * 
     * 
     */
    public List<LoanAccountInfoType> getLoanAccountInfo() {
        if (loanAccountInfo == null) {
            loanAccountInfo = new ArrayList<LoanAccountInfoType>();
        }
        return this.loanAccountInfo;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAccountItemListType }
     * 
     * 
     */
    public List<LoanAccountItemListType> getItem() {
        if (item == null) {
            item = new ArrayList<LoanAccountItemListType>();
        }
        return this.item;
    }

}
