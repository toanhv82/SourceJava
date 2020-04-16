
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
 *         &lt;element name="in_card_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inCardNbr",
    "type",
    "inSS"
})
@XmlRootElement(name = "SOA_Update_Vip_Flag")
public class SOAUpdateVipFlag {

    @XmlElement(name = "source_chanel")
    protected String sourceChanel;
    @XmlElement(name = "in_card_nbr")
    protected String inCardNbr;
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
     * Gets the value of the inCardNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCardNbr() {
        return inCardNbr;
    }

    /**
     * Sets the value of the inCardNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCardNbr(String value) {
        this.inCardNbr = value;
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
