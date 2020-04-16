/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet;

import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.ws.def.DEF_XML;
import com.ocb.ttt.ws.way4.soa.AbstractSOA;
import java.util.HashMap;

/**
 *
 * @author toanhv1
 */
public class ChangeStatusCard extends AbstractSOA {

    private String xmlString;
    private final String orderDprt="0168";
    private final String fileName="xml/Change_Contr_Status";
    HashMap<String,String> param=new HashMap<>();  
    @Override
    protected HashMap getParam() {
       
        return param;      
    }

    @Override
    protected String getFileName() {
        return fileName;
    }
    public  String generalXML(CardSOA cardSOA,String status)throws Exception
    {
        
        param.put(DEF_XML.ContractNumber, cardSOA.getContractNumber());
        param.put(DEF_XML.OrderDprt, orderDprt);
        param.put(DEF_XML.StatusCode, status);
        param.put(DEF_XML.messageId, getMesId());
        param.put(DEF_XML.ShortName, cardSOA.getShortName());
        param.put(DEF_XML.RegNumber,cardSOA.getRegNumber());          
        xmlString=convertData();                
        return xmlString;        
    }
}
