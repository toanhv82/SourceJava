
package com.com.ttt.sms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceChangePasswordResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceChangePasswordResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="link" type="{bian.com.vn}LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changePasswordResult" type="{bian.com.vn}ChangePasswordResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceChangePasswordResultType", propOrder = {
    "link",
    "changePasswordResult"
})
public class ResourceChangePasswordResultType {

    protected List<LinkType> link;
    @XmlElement(required = true)
    protected ChangePasswordResultType changePasswordResult;

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkType }
     * 
     * 
     */
    public List<LinkType> getLink() {
        if (link == null) {
            link = new ArrayList<LinkType>();
        }
        return this.link;
    }

    /**
     * Gets the value of the changePasswordResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordResultType }
     *     
     */
    public ChangePasswordResultType getChangePasswordResult() {
        return changePasswordResult;
    }

    /**
     * Sets the value of the changePasswordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordResultType }
     *     
     */
    public void setChangePasswordResult(ChangePasswordResultType value) {
        this.changePasswordResult = value;
    }

}
