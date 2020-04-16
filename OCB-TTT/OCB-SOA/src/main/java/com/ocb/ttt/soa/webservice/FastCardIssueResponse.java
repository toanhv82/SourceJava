
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
 *         &lt;element name="Fast_Card_IssueResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fastCardIssueResult"
})
@XmlRootElement(name = "Fast_Card_IssueResponse")
public class FastCardIssueResponse {

    @XmlElement(name = "Fast_Card_IssueResult")
    protected String fastCardIssueResult;

    /**
     * Gets the value of the fastCardIssueResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastCardIssueResult() {
        return fastCardIssueResult;
    }

    /**
     * Sets the value of the fastCardIssueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastCardIssueResult(String value) {
        this.fastCardIssueResult = value;
    }

}
