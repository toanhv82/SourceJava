
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
 *         &lt;element name="contract_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contract_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "contractNbr",
    "contractType",
    "mobileNbr",
    "type",
    "inSS"
})
@XmlRootElement(name = "SOA_Update_SMS_Flag")
public class SOAUpdateSMSFlag {

    @XmlElement(name = "source_chanel")
    protected String sourceChanel;
    @XmlElement(name = "contract_nbr")
    protected String contractNbr;
    @XmlElement(name = "contract_type")
    protected String contractType;
    @XmlElement(name = "mobile_nbr")
    protected String mobileNbr;
    protected String type;
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
     * Gets the value of the contractNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNbr() {
        return contractNbr;
    }

    /**
     * Sets the value of the contractNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNbr(String value) {
        this.contractNbr = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the mobileNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNbr() {
        return mobileNbr;
    }

    /**
     * Sets the value of the mobileNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNbr(String value) {
        this.mobileNbr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
