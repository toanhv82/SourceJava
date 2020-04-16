/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.way4.model.ClassifierModel;

/**
 *
 * @author quantm1
 */
public class UpdateClassifierCardInfo extends XmlToString {

    private String fileName = "xml/Change_Classifier_Related_Card.xml";
    private String xmlString;
    private final String orderDprt = "0101";
    private final String ObjectType = "ContractClassifier";
    private final String ActionType = "AddOrUpdate";
    private final String Relation = "01";
    private final String ReasonDetails = "THAY DOI";
    private final String RegNumber = "9JUL045148";

    public UpdateClassifierCardInfo() throws Exception {
        xmlString = getFile(fileName);
    }
    public UpdateClassifierCardInfo(String file) throws Exception
    {
         xmlString= getFile(file); 
    }

    public String convertToData(ClassifierModel model) throws Exception {
        String xml = xmlString;
        xml = xml.replace(DEF_XML.RegNumber, RegNumber)
                .replace(DEF_XML.OrderDprt, orderDprt)
                .replace(DEF_XML.ObjectType, ObjectType)
                .replace(DEF_XML.ActionType, ActionType)
                .replace(DEF_XML.ContractNumber, model.getContractNumber())
                .replace(DEF_XML.Relation, Relation)
                .replace(DEF_XML.ShortName, model.getShortName())
                .replace(DEF_XML.Code, model.getCode())
                .replace(DEF_XML.Value, model.getValue())
                .replace(DEF_XML.ReasonDetails, ReasonDetails);

        return xml;
    }
}
