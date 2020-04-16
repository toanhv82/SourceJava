
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TuitionFeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TuitionFeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studyForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuitionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuitionDebtAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tuitionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowPartialPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TuitionFeeType", propOrder = {
    "studyForm",
    "sourceData",
    "courseType",
    "tuitionAmount",
    "tuitionDebtAmount",
    "tuitionDescription",
    "allowPartialPayment"
})
public class TuitionFeeType {

    protected String studyForm;
    protected String sourceData;
    protected String courseType;
    protected String tuitionAmount;
    protected String tuitionDebtAmount;
    protected String tuitionDescription;
    protected String allowPartialPayment;

    /**
     * Gets the value of the studyForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyForm() {
        return studyForm;
    }

    /**
     * Sets the value of the studyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyForm(String value) {
        this.studyForm = value;
    }

    /**
     * Gets the value of the sourceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceData() {
        return sourceData;
    }

    /**
     * Sets the value of the sourceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceData(String value) {
        this.sourceData = value;
    }

    /**
     * Gets the value of the courseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     * Sets the value of the courseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseType(String value) {
        this.courseType = value;
    }

    /**
     * Gets the value of the tuitionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuitionAmount() {
        return tuitionAmount;
    }

    /**
     * Sets the value of the tuitionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuitionAmount(String value) {
        this.tuitionAmount = value;
    }

    /**
     * Gets the value of the tuitionDebtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuitionDebtAmount() {
        return tuitionDebtAmount;
    }

    /**
     * Sets the value of the tuitionDebtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuitionDebtAmount(String value) {
        this.tuitionDebtAmount = value;
    }

    /**
     * Gets the value of the tuitionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuitionDescription() {
        return tuitionDescription;
    }

    /**
     * Sets the value of the tuitionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuitionDescription(String value) {
        this.tuitionDescription = value;
    }

    /**
     * Gets the value of the allowPartialPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowPartialPayment() {
        return allowPartialPayment;
    }

    /**
     * Sets the value of the allowPartialPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowPartialPayment(String value) {
        this.allowPartialPayment = value;
    }

}
