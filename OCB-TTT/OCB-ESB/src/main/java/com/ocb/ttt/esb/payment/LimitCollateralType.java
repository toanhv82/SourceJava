
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitCollateralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitCollateralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collateralRightID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateralCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collateral" type="{bian.com.vn}CollateralInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitCollateralType", propOrder = {
    "collateralRightID",
    "collateralCode",
    "collateral"
})
public class LimitCollateralType {

    protected String collateralRightID;
    protected String collateralCode;
    protected List<CollateralInfoType> collateral;

    /**
     * Gets the value of the collateralRightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralRightID() {
        return collateralRightID;
    }

    /**
     * Sets the value of the collateralRightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralRightID(String value) {
        this.collateralRightID = value;
    }

    /**
     * Gets the value of the collateralCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralCode() {
        return collateralCode;
    }

    /**
     * Sets the value of the collateralCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralCode(String value) {
        this.collateralCode = value;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralInfoType }
     * 
     * 
     */
    public List<CollateralInfoType> getCollateral() {
        if (collateral == null) {
            collateral = new ArrayList<CollateralInfoType>();
        }
        return this.collateral;
    }

}
