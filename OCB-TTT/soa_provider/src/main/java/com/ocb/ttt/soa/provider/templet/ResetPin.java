/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet;


import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.way4.soa.AbstractSOA;
import java.util.HashMap;
import java.util.Set;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author toanhv1
 */

public class ResetPin  extends AbstractSOA{   
    private String xmlString;
    private final String orderDprt="0168";
    private final String fileName="xml/Clear_PIN_Attempts.xml";
    private HashMap<String,String> param=new HashMap<>();   
    @Override
    protected HashMap getParam() {
       
        return param;         
        
    }
    @Override
    protected String getFileName() {
        return fileName;
    }    
    public  String generalXML(String cardNumber,String clientId,String reg_num)throws Exception
    {
        
        param.put(DEF_XML.ContractNumber, cardNumber);
        param.put(DEF_XML.ClientNumber, clientId);
        param.put(DEF_XML.messageId, getMesId());
        param.put(DEF_XML.ClientNumber, clientId);
        param.put(DEF_XML.RegNumber,reg_num);  
        
        xmlString=convertData();                
        return xmlString;        
    }
    
}
