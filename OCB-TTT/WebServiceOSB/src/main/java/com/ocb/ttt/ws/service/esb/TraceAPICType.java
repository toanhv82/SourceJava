
package com.ocb.ttt.ws.service.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for traceAPICType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="traceAPICType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traceAPICType", propOrder = {
    "clientTransId",
    "bankRefNo",
    "clientTimestamp"
})
public class TraceAPICType {

    protected String clientTransId;
    protected String bankRefNo;
    protected String clientTimestamp;

    /**
     * Gets the value of the clientTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTransId() {
        return clientTransId;
    }

    /**
     * Sets the value of the clientTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTransId(String value) {
        this.clientTransId = value;
    }

    /**
     * Gets the value of the bankRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRefNo() {
        return bankRefNo;
    }

    /**
     * Sets the value of the bankRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRefNo(String value) {
        this.bankRefNo = value;
    }

    /**
     * Gets the value of the clientTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTimestamp() {
        return clientTimestamp;
    }

    /**
     * Sets the value of the clientTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTimestamp(String value) {
        this.clientTimestamp = value;
    }

}
