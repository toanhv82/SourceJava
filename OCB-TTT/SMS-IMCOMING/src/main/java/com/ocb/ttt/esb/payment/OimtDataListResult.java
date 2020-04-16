
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OimtDataListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OimtDataListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oimtDataListResult" type="{bian.com.vn}OimtDataListResultType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OimtDataListResult", propOrder = {
    "oimtDataListResult"
})
public class OimtDataListResult {

    @XmlElement(required = true)
    protected List<OimtDataListResultType> oimtDataListResult;

    /**
     * Gets the value of the oimtDataListResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oimtDataListResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOimtDataListResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OimtDataListResultType }
     * 
     * 
     */
    public List<OimtDataListResultType> getOimtDataListResult() {
        if (oimtDataListResult == null) {
            oimtDataListResult = new ArrayList<OimtDataListResultType>();
        }
        return this.oimtDataListResult;
    }

}
