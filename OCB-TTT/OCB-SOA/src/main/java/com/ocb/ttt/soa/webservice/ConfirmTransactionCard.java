
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
 *         &lt;element name="src_acc_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dst_card_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="narrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trn_ref_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "srcAccNbr",
    "dstCardNbr",
    "amount",
    "narrative",
    "trnRefNo"
})
@XmlRootElement(name = "ConfirmTransactionCard")
public class ConfirmTransactionCard {

    @XmlElement(name = "src_acc_nbr")
    protected String srcAccNbr;
    @XmlElement(name = "dst_card_nbr")
    protected String dstCardNbr;
    protected String amount;
    protected String narrative;
    @XmlElement(name = "trn_ref_no")
    protected String trnRefNo;

    /**
     * Gets the value of the srcAccNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAccNbr() {
        return srcAccNbr;
    }

    /**
     * Sets the value of the srcAccNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAccNbr(String value) {
        this.srcAccNbr = value;
    }

    /**
     * Gets the value of the dstCardNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstCardNbr() {
        return dstCardNbr;
    }

    /**
     * Sets the value of the dstCardNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstCardNbr(String value) {
        this.dstCardNbr = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the trnRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnRefNo() {
        return trnRefNo;
    }

    /**
     * Sets the value of the trnRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnRefNo(String value) {
        this.trnRefNo = value;
    }

}
