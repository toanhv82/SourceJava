
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
 *         &lt;element name="source_chanel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_acc_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_SS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sourceChanel",
    "inAccNbr",
    "reason",
    "inSS"
})
@XmlRootElement(name = "SOA_Close_Account")
public class SOACloseAccount {

    @XmlElement(name = "source_chanel")
    protected String sourceChanel;
    @XmlElement(name = "in_acc_nbr")
    protected String inAccNbr;
    protected String reason;
    @XmlElement(name = "in_SS")
    protected String inSS;

    /**
     * Gets the value of the sourceChanel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceChanel() {
        return sourceChanel;
    }

    /**
     * Sets the value of the sourceChanel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceChanel(String value) {
        this.sourceChanel = value;
    }

    /**
     * Gets the value of the inAccNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAccNbr() {
        return inAccNbr;
    }

    /**
     * Sets the value of the inAccNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAccNbr(String value) {
        this.inAccNbr = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the inSS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSS() {
        return inSS;
    }

    /**
     * Sets the value of the inSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSS(String value) {
        this.inSS = value;
    }

}
