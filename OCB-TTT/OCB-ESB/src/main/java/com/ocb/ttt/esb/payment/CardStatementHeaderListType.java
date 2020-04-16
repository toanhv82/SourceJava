
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatementHeaderListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatementHeaderListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardStatementHeader" type="{bian.com.vn}CardStatementHeaderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatementHeaderListType", propOrder = {
    "cardStatementHeader"
})
public class CardStatementHeaderListType {

    protected List<CardStatementHeaderType> cardStatementHeader;

    /**
     * Gets the value of the cardStatementHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardStatementHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardStatementHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardStatementHeaderType }
     * 
     * 
     */
    public List<CardStatementHeaderType> getCardStatementHeader() {
        if (cardStatementHeader == null) {
            cardStatementHeader = new ArrayList<CardStatementHeaderType>();
        }
        return this.cardStatementHeader;
    }

}
