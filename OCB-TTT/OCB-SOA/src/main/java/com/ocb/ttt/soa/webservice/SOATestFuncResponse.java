
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
 *         &lt;element name="SOA_Test_FuncResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "soaTestFuncResult"
})
@XmlRootElement(name = "SOA_Test_FuncResponse")
public class SOATestFuncResponse {

    @XmlElement(name = "SOA_Test_FuncResult")
    protected String soaTestFuncResult;

    /**
     * Gets the value of the soaTestFuncResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOATestFuncResult() {
        return soaTestFuncResult;
    }

    /**
     * Sets the value of the soaTestFuncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOATestFuncResult(String value) {
        this.soaTestFuncResult = value;
    }

}
