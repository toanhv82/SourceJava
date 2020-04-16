
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankATMListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankATMListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankATM" type="{bian.com.vn}BankATMType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankATMListType", propOrder = {
    "bankATM"
})
public class BankATMListType {

    protected List<BankATMType> bankATM;

    /**
     * Gets the value of the bankATM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankATM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankATM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankATMType }
     * 
     * 
     */
    public List<BankATMType> getBankATM() {
        if (bankATM == null) {
            bankATM = new ArrayList<BankATMType>();
        }
        return this.bankATM;
    }

}
