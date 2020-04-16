
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagePropertiesNewAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagePropertiesNewAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageFeature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageFeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagePropertiesNewAccountType", propOrder = {
    "lineNr",
    "packageFeature",
    "packageFeatureType",
    "transactionLimit"
})
public class PackagePropertiesNewAccountType {

    protected String lineNr;
    protected String packageFeature;
    protected String packageFeatureType;
    protected String transactionLimit;

    /**
     * Gets the value of the lineNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNr() {
        return lineNr;
    }

    /**
     * Sets the value of the lineNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNr(String value) {
        this.lineNr = value;
    }

    /**
     * Gets the value of the packageFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFeature() {
        return packageFeature;
    }

    /**
     * Sets the value of the packageFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFeature(String value) {
        this.packageFeature = value;
    }

    /**
     * Gets the value of the packageFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFeatureType() {
        return packageFeatureType;
    }

    /**
     * Sets the value of the packageFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFeatureType(String value) {
        this.packageFeatureType = value;
    }

    /**
     * Gets the value of the transactionLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionLimit() {
        return transactionLimit;
    }

    /**
     * Sets the value of the transactionLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionLimit(String value) {
        this.transactionLimit = value;
    }

}
