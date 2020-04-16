
package com.ocb.ttt.esb.payment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnswerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chosenOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerInfoType", propOrder = {
    "criteriaCode",
    "chosenOption",
    "inputValue"
})
public class AnswerInfoType {

    protected String criteriaCode;
    protected String chosenOption;
    protected String inputValue;

    /**
     * Gets the value of the criteriaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaCode() {
        return criteriaCode;
    }

    /**
     * Sets the value of the criteriaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaCode(String value) {
        this.criteriaCode = value;
    }

    /**
     * Gets the value of the chosenOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChosenOption() {
        return chosenOption;
    }

    /**
     * Sets the value of the chosenOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChosenOption(String value) {
        this.chosenOption = value;
    }

    /**
     * Gets the value of the inputValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputValue() {
        return inputValue;
    }

    /**
     * Sets the value of the inputValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputValue(String value) {
        this.inputValue = value;
    }

}
