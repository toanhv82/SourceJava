
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="redemption" type="{bian.com.vn}LoyaltyRedemptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionListType", propOrder = {
    "redemption"
})
public class RedemptionListType {

    protected List<LoyaltyRedemptionType> redemption;

    /**
     * Gets the value of the redemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRedemptionType }
     * 
     * 
     */
    public List<LoyaltyRedemptionType> getRedemption() {
        if (redemption == null) {
            redemption = new ArrayList<LoyaltyRedemptionType>();
        }
        return this.redemption;
    }

}
