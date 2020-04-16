
package com.ocb.ttt.soa.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="in_param" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inParam"
})
@XmlRootElement(name = "Fast_Card_Issue")
public class FastCardIssue {

    @XmlElement(name = "in_param")
    protected String inParam;

    /**
     * Gets the value of the inParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParam() {
        return inParam;
    }

    /**
     * Sets the value of the inParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParam(String value) {
        this.inParam = value;
    }

}
