
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiftInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftInfoItem" type="{bian.com.vn}GiftInfoItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isShortenURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftDataBuy" type="{bian.com.vn}GiftDataBuyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCartInfo" type="{bian.com.vn}GiftCartInfoType" minOccurs="0"/>
 *         &lt;element name="giftCartListInfo" type="{bian.com.vn}GiftCartInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftInfoType", propOrder = {
    "language",
    "brandID",
    "cityID",
    "categoryID",
    "giftInfoItem",
    "giftID",
    "phone",
    "email",
    "fullname",
    "isShortenURL",
    "giftDataBuy",
    "giftCartInfo",
    "giftCartListInfo"
})
public class GiftInfoType {

    protected String language;
    protected String brandID;
    protected String cityID;
    protected String categoryID;
    protected List<GiftInfoItemType> giftInfoItem;
    protected String giftID;
    protected String phone;
    protected String email;
    protected String fullname;
    protected String isShortenURL;
    protected List<GiftDataBuyType> giftDataBuy;
    protected GiftCartInfoType giftCartInfo;
    protected List<GiftCartInfoType> giftCartListInfo;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the brandID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandID() {
        return brandID;
    }

    /**
     * Sets the value of the brandID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandID(String value) {
        this.brandID = value;
    }

    /**
     * Gets the value of the cityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityID() {
        return cityID;
    }

    /**
     * Sets the value of the cityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityID(String value) {
        this.cityID = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the giftInfoItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftInfoItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftInfoItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftInfoItemType }
     * 
     * 
     */
    public List<GiftInfoItemType> getGiftInfoItem() {
        if (giftInfoItem == null) {
            giftInfoItem = new ArrayList<GiftInfoItemType>();
        }
        return this.giftInfoItem;
    }

    /**
     * Gets the value of the giftID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftID() {
        return giftID;
    }

    /**
     * Sets the value of the giftID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftID(String value) {
        this.giftID = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the isShortenURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsShortenURL() {
        return isShortenURL;
    }

    /**
     * Sets the value of the isShortenURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsShortenURL(String value) {
        this.isShortenURL = value;
    }

    /**
     * Gets the value of the giftDataBuy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftDataBuy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftDataBuy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftDataBuyType }
     * 
     * 
     */
    public List<GiftDataBuyType> getGiftDataBuy() {
        if (giftDataBuy == null) {
            giftDataBuy = new ArrayList<GiftDataBuyType>();
        }
        return this.giftDataBuy;
    }

    /**
     * Gets the value of the giftCartInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GiftCartInfoType }
     *     
     */
    public GiftCartInfoType getGiftCartInfo() {
        return giftCartInfo;
    }

    /**
     * Sets the value of the giftCartInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCartInfoType }
     *     
     */
    public void setGiftCartInfo(GiftCartInfoType value) {
        this.giftCartInfo = value;
    }

    /**
     * Gets the value of the giftCartListInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCartListInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCartListInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiftCartInfoType }
     * 
     * 
     */
    public List<GiftCartInfoType> getGiftCartListInfo() {
        if (giftCartListInfo == null) {
            giftCartListInfo = new ArrayList<GiftCartInfoType>();
        }
        return this.giftCartListInfo;
    }

}
