
package com.ocb.ttt.esb.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceLoginPageContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceLoginPageContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="link" type="{bian.com.vn}LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loginPageContext" type="{bian.com.vn}LoginPageContextType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceLoginPageContextType", propOrder = {
    "link",
    "loginPageContext"
})
public class ResourceLoginPageContextType {

    protected List<LinkType> link;
    @XmlElement(required = true)
    protected LoginPageContextType loginPageContext;

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
     * Gets the value of the loginPageContext property.
     * 
     * @return
     *     possible object is
     *     {@link LoginPageContextType }
     *     
     */
    public LoginPageContextType getLoginPageContext() {
        return loginPageContext;
    }

    /**
     * Sets the value of the loginPageContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginPageContextType }
     *     
     */
    public void setLoginPageContext(LoginPageContextType value) {
        this.loginPageContext = value;
    }

}
