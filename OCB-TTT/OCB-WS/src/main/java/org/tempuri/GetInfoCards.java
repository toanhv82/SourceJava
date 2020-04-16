
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
 *         &lt;element name="src_card_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dst_card_nbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "srcCardNbr",
    "dstCardNbr"
})
@XmlRootElement(name = "GetInfoCards")
public class GetInfoCards {

    @XmlElement(name = "src_card_nbr")
    protected String srcCardNbr;
    @XmlElement(name = "dst_card_nbr")
    protected String dstCardNbr;

    /**
     * Gets the value of the srcCardNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCardNbr() {
        return srcCardNbr;
    }

    /**
     * Sets the value of the srcCardNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCardNbr(String value) {
        this.srcCardNbr = value;
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

}
