
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyRateInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRateInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="currencyRateInfo" type="{bian.com.vn}CurrencyRateInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Item" type="{bian.com.vn}CurrencyRateInfoItemListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRateInfoListType", propOrder = {
    "currencyRateInfo",
    "item"
})
public class CurrencyRateInfoListType {

    protected List<CurrencyRateInfoType> currencyRateInfo;
    @XmlElement(name = "Item")
    protected List<CurrencyRateInfoItemListType> item;

    /**
     * Gets the value of the currencyRateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyRateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyRateInfoType }
     * 
     * 
     */
    public List<CurrencyRateInfoType> getCurrencyRateInfo() {
        if (currencyRateInfo == null) {
            currencyRateInfo = new ArrayList<CurrencyRateInfoType>();
        }
        return this.currencyRateInfo;
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
     * {@link CurrencyRateInfoItemListType }
     * 
     * 
     */
    public List<CurrencyRateInfoItemListType> getItem() {
        if (item == null) {
            item = new ArrayList<CurrencyRateInfoItemListType>();
        }
        return this.item;
    }

}
