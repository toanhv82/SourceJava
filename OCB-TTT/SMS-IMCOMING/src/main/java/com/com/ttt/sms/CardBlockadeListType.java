
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardBlockadeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBlockadeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardBlockade" type="{bian.com.vn}CardBlockadeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBlockadeListType", propOrder = {
    "cardBlockade"
})
public class CardBlockadeListType {

    protected List<CardBlockadeType> cardBlockade;

    /**
     * Gets the value of the cardBlockade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardBlockade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardBlockade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardBlockadeType }
     * 
     * 
     */
    public List<CardBlockadeType> getCardBlockade() {
        if (cardBlockade == null) {
            cardBlockade = new ArrayList<CardBlockadeType>();
        }
        return this.cardBlockade;
    }

}
