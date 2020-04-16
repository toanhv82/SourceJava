
package org.tempuri;

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
 *         &lt;element name="in_cr_account_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_autopayment_acc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_autopayment_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inCrAccountNbr",
    "inAutopaymentAcc",
    "inAutopaymentFlag",
    "inSS"
})
@XmlRootElement(name = "SOA_Update_Autopayment")
public class SOAUpdateAutopayment {

    @XmlElement(name = "source_chanel")
    protected String sourceChanel;
    @XmlElement(name = "in_cr_account_nbr")
    protected String inCrAccountNbr;
    @XmlElement(name = "in_autopayment_acc")
    protected String inAutopaymentAcc;
    @XmlElement(name = "in_autopayment_flag")
    protected String inAutopaymentFlag;
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
     * Gets the value of the inCrAccountNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCrAccountNbr() {
        return inCrAccountNbr;
    }

    /**
     * Sets the value of the inCrAccountNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCrAccountNbr(String value) {
        this.inCrAccountNbr = value;
    }

    /**
     * Gets the value of the inAutopaymentAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAutopaymentAcc() {
        return inAutopaymentAcc;
    }

    /**
     * Sets the value of the inAutopaymentAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAutopaymentAcc(String value) {
        this.inAutopaymentAcc = value;
    }

    /**
     * Gets the value of the inAutopaymentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAutopaymentFlag() {
        return inAutopaymentFlag;
    }

    /**
     * Sets the value of the inAutopaymentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAutopaymentFlag(String value) {
        this.inAutopaymentFlag = value;
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
