
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gift" type="{bian.com.vn}LoyaltyGiftType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftListType", propOrder = {
    "gift"
})
public class GiftListType {

    protected List<LoyaltyGiftType> gift;

    /**
     * Gets the value of the gift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyGiftType }
     * 
     * 
     */
    public List<LoyaltyGiftType> getGift() {
        if (gift == null) {
            gift = new ArrayList<LoyaltyGiftType>();
        }
        return this.gift;
    }

}
