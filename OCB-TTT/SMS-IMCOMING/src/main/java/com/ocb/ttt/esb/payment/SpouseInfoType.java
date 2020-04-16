
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpouseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpouseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDInfo" type="{bian.com.vn}IDInfoType" minOccurs="0"/>
 *         &lt;element name="jobInfo" type="{bian.com.vn}JobInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpouseInfoType", propOrder = {
    "fullname",
    "birthDay",
    "maritalStatus",
    "nationality",
    "idInfo",
    "jobInfo"
})
public class SpouseInfoType {

    protected String fullname;
    protected String birthDay;
    protected String maritalStatus;
    protected String nationality;
    @XmlElement(name = "IDInfo")
    protected IDInfoType idInfo;
    protected JobInfoType jobInfo;

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
     * Gets the value of the birthDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the value of the birthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDay(String value) {
        this.birthDay = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the idInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IDInfoType }
     *     
     */
    public IDInfoType getIDInfo() {
        return idInfo;
    }

    /**
     * Sets the value of the idInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDInfoType }
     *     
     */
    public void setIDInfo(IDInfoType value) {
        this.idInfo = value;
    }

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JobInfoType }
     *     
     */
    public JobInfoType getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInfoType }
     *     
     */
    public void setJobInfo(JobInfoType value) {
        this.jobInfo = value;
    }

}
