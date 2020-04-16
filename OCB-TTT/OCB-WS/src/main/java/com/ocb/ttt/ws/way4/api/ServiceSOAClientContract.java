/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import com.ocb.ttt.ws.service.WSCustomerClassifiers;
import com.ocb.ttt.ws.way4.model.ClientW4;
import ocb.ttt.common.anotion.ConfigValue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceSOAClientContract extends PostToWay4 {

    private static Logger logger = Logger.getLogger(ServiceCardPostWay4.class);
    private SOA_Create_Client_W4 create_Client_W4;
    @Autowired
    private WSCustomerClassifiers classifiersDao;

    @ConfigValue(Value = "way4gate")
    String url;
    public String addClientContractCredit( ClientW4 client) {
           try
            {
                create_Client_W4=new SOA_Create_Client_W4();           
                String xml=create_Client_W4.Credit_addclient_liaby_issu_card_Scard(client, getRegNumber(),getRegNumber()+"1",getMesId());
                System.out.println("XML:"+xml);            
                String res= PostToWay4(xml,url);
                System.out.println("RES:"+res);

            }catch(Exception e)
            {
                e.printStackTrace();
                logger.error(e);
            }      
        
        return "";
    }
    
    public String addClientContractDebit( ClientW4 client) {
        try
        {
                create_Client_W4=new SOA_Create_Client_W4();           
                String xml=create_Client_W4.Debit_Prepaid_addclient_issu_card_Scard(client, getRegNumber(),getRegNumber()+"1",getMesId());
                System.out.println("XML:"+xml);            
                String res= PostToWay4(xml,url);
                System.out.println("RES:"+res);

            }catch(Exception e)
            {
                e.printStackTrace();
                logger.error(e);
            }     
        return "";
    }
    
    protected String getRegNumber() {
        return classifiersDao.getSQ();
    }
    protected String getCLientNumber() {
         return classifiersDao.getSQ();
        // return  classifiersDao.getRRN();
    }
    protected String getContractNumber() {
        return  classifiersDao.getRRN();
    }
    
    public static void main(String[] args) {
        
        ServiceSOAClientContract aClientContract=new ServiceSOAClientContract();
      //  aClientContract.addClientContract();
        
        
    }

    @Override
    protected String getUrl() {
        return url;
    }

}
