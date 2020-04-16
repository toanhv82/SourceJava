/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet;



import com.ocb.ttt.model.Classifier;
import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractBaseSOA;
import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.way4.soa.AbstractSOA;
import java.util.HashMap;

/**
 *
 * @author toanhv1
 */
public class ChangeClassifer extends AbstractSOA {

    private String xmlString;
    private final String orderDprt="0168";
    private  String fileName="xml/Change_Classifier.xml";
    HashMap<String,String> param=new HashMap<>();  
    
    public ChangeClassifer(String file)
    {
        this.fileName=file;
    }   
    public ChangeClassifer(){};
    
    @Override
    protected HashMap getParam() {
       return param; 
    }

    @Override
    protected String getFileName() {
         return fileName;
    }
    
    public  String generalXML(ContractBaseSOA cardSOA,Classifier classifier,String reason)throws Exception
    {
        param.put(DEF_XML.ContractNumber, cardSOA.getContractNumber());
        param.put(DEF_XML.OrderDprt, orderDprt);
        param.put(DEF_XML.messageId, getMesId());
        param.put(DEF_XML.ShortName, cardSOA.getShortName());
        param.put(DEF_XML.RegNumber,cardSOA.getRegNumber());
        param.put(DEF_XML.Code,classifier.getName());      
        param.put(DEF_XML.Value,classifier.getValue());
        param.put(DEF_XML.reasonDetails, reason);
        xmlString=convertData();                
        return xmlString;  
    }
    
}
