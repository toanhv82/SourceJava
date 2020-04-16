
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanParamChangesAndRepaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanParamChangesAndRepaymentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterChanges" type="{bian.com.vn}LoanChangeParamType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="repayments" type="{bian.com.vn}RepaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanParamChangesAndRepaymentsType", propOrder = {
    "parameterChanges",
    "repayments"
})
public class LoanParamChangesAndRepaymentsType {

    protected List<LoanChangeParamType> parameterChanges;
    protected List<RepaymentType> repayments;

    /**
     * Gets the value of the parameterChanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterChanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterChanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanChangeParamType }
     * 
     * 
     */
    public List<LoanChangeParamType> getParameterChanges() {
        if (parameterChanges == null) {
            parameterChanges = new ArrayList<LoanChangeParamType>();
        }
        return this.parameterChanges;
    }

    /**
     * Gets the value of the repayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentType }
     * 
     * 
     */
    public List<RepaymentType> getRepayments() {
        if (repayments == null) {
            repayments = new ArrayList<RepaymentType>();
        }
        return this.repayments;
    }

}
