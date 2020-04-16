
package com.ocb.ttt.ws.service.esb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanStatementsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanStatementsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanStatements" type="{bian.com.vn}LoanStatementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanStatementsList", propOrder = {
    "loanStatements"
})
public class LoanStatementsList {

    protected List<LoanStatementType> loanStatements;

    /**
     * Gets the value of the loanStatements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanStatements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanStatementType }
     * 
     * 
     */
    public List<LoanStatementType> getLoanStatements() {
        if (loanStatements == null) {
            loanStatements = new ArrayList<LoanStatementType>();
        }
        return this.loanStatements;
    }

}
