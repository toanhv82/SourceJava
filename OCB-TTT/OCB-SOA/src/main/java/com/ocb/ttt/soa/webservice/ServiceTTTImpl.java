/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.webservice;


import com.ocb.ttt.common.log.LoggerLoader;
import org.springframework.stereotype.Service;
import com.ocb.ttt.sevice.soa.ServiceTTT;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.PostConstruct;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component(value = "ServiceTTT")
public class ServiceTTTImpl implements ServiceTTT {   
    
   @ConfigValue(Value = "sourceService")
   private String sourceService="82"; 
   @ConfigValue(Value = "URL_WS_TTT")
   private String URL_WS_TTT=""; 
   private static LoggerLoader logger = new LoggerLoader(ServiceTTTImpl.class);    
   TrungTamThe service;  
   TrungTamTheSoap soap;  
   @PostConstruct
   public void getTrungTamTheSoap()
   {      
        URL url = null;
        try {
            QName TRUNGTAMTHE_QNAME = new QName("http://tempuri.org/", "TrungTamThe");
            url = new URL(URL_WS_TTT);
             service=new TrungTamThe(url,TRUNGTAMTHE_QNAME);  
             
             soap=service.getTrungTamTheSoap(); 
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
        }
        
   }
    @Override
    public String SOA_Update_Autopayment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SOA_Delivery_Card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String soa_Change_Contr_Status(String source, String contract_number, String status,String resason) {
        logger.info("Begin change status contract");
        String result=  soap.soaChangeContrStatus(source, contract_number, status, resason,sourceService);
        logger.info("result:"+result);
        return result;
    }

    @Override
    public String soaChangeStatusCard(String source, String contract_number, String status, String resason) {
        
        logger.info("Begin change status card");
        String result=  soap.soaChangeContrStatus(source, contract_number, status, resason, sourceService);
        logger.info("result:"+result);
        return result;
        
    }
    @Override
    public String soaUpdateEComFlag(String source, String card_number, String status) {
        
        logger.info("Begin update status ECOM");
        String result=  soap.soaUpdateEComFlag(source, card_number, status,  sourceService);
        logger.info("result:"+result);
        return result;
        
    }
    @Override
    public String soaUpdateMotoFlag(String source, String card_number, String status,String reason) {
        logger.info("Begin update status MOTO");
        String result=  soap.soaUpdateMotoFlag(source, card_number, status,sourceService,reason);
        logger.info("result:"+result);
        return result;
    }
    @Override
    public String soaUpdateVIP(String source, String card_number, String status) {
        logger.info("Begin update status VIP");
        String result=  soap.soaUpdateVipFlag(source, card_number, status,sourceService);
        logger.info("result:"+result);
        return result;
    }
    
}
