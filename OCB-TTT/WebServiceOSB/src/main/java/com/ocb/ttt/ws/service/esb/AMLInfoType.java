
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMLInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blacklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RtnScanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLInfoType", propOrder = {
    "blacklist",
    "rtnScanID"
})
public class AMLInfoType {

    protected String blacklist;
    @XmlElement(name = "RtnScanID")
    protected String rtnScanID;

    /**
     * Gets the value of the blacklist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklist() {
        return blacklist;
    }

    /**
     * Sets the value of the blacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklist(String value) {
        this.blacklist = value;
    }

    /**
     * Gets the value of the rtnScanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtnScanID() {
        return rtnScanID;
    }

    /**
     * Sets the value of the rtnScanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtnScanID(String value) {
        this.rtnScanID = value;
    }

}
