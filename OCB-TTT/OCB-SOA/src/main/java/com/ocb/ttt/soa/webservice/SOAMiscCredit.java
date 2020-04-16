
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
 *         &lt;element name="in_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inAmount",
    "inDesc",
    "inSS"
})
@XmlRootElement(name = "SOA_Misc_Credit")
public class SOAMiscCredit {

    @XmlElement(name = "source_chanel")
    protected String sourceChanel;
    @XmlElement(name = "in_acc_nbr")
    protected String inAccNbr;
    @XmlElement(name = "in_amount")
    protected String inAmount;
    @XmlElement(name = "in_desc")
    protected String inDesc;
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
     * Gets the value of the inAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAmount() {
        return inAmount;
    }

    /**
     * Sets the value of the inAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAmount(String value) {
        this.inAmount = value;
    }

    /**
     * Gets the value of the inDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDesc() {
        return inDesc;
    }

    /**
     * Sets the value of the inDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDesc(String value) {
        this.inDesc = value;
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
