/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.controller;

import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.model.RequestForm;

import com.ocb.ttt.soa.cclient.model.ReqClient;
import com.ocb.ttt.soa.cclient.model.RequestSOA;

import com.ocb.ttt.ws.way4.api.ServiceSOAClientContract;

import com.ocb.ttt.ws.way4.model.ClientW4;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.convert.JsonPharse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author toanhv1
 */
@Controller
@RequestMapping(value = "/WS-SOA")
public class SOAController extends MainControler {

    @Autowired
    ServiceSOAClientContract aClientContract;
   
    @ResponseBody
    @RequestMapping(value = "/requestSOA", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, String> requestSOA(HttpServletResponse response, HttpServletRequest request, String card) {

                      
        return null;
    }
    /*
    @ResponseBody
    @RequestMapping(value = "/requestSOA", method = RequestMethod.GET)
    public Object getrequestSOA(HttpServletResponse response, HttpServletRequest request, String card) {

                      
        return 1;
    }
    */
    @ResponseBody
    @RequestMapping(value = "/clientCardSOA", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> clientCardSOA(HttpServletResponse response, HttpServletRequest request,@RequestBody RequestSOA data) {
        
           // ReqClient rclient=JsonPharse.ConvertToObj( data.getData(),ReqClient.class);            
            String jsonData =data.getData();
                                
           ClientW4 client=JsonPharse.ConvertToOjectNew(jsonData, ClientW4.class);
//            
           // client.setRegNumber(rq.g);
          //  client.setClientNumber(data.getData().getClientNumber());
//            client.setContractNumber("");
//            client.setShortName(client.getShortName());
//            aClientContract.addClientContractDebit(client);       
            
        Map<String, Object> map = new HashMap<>();
        return map;
    }
        
    @ResponseBody
    @RequestMapping(value = "/clientCreditCardSOA", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> getClientCardSOA(HttpServletResponse response, HttpServletRequest request,@RequestBody ReqClient data) {       
                           
            ClientW4 client = data.getData();
            client.setRegNumber(client.getRegNumber());
            client.setClientNumber(client.getClientNumber());          
            client.setFirstName(client.getFirstName());
            aClientContract.addClientContractCredit(client);
      
        Map<String, Object> map = new HashMap<>();
        return map;
    }
//    @ResponseBody
//    @RequestMapping(value = "/getInfoClientSOA", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
//    public Map<String, Object> getInfoClientSOA(HttpServletResponse response, HttpServletRequest request,@RequestBody RequestForm data) {       
//            
//      
//        Map<String, Object> map = new HashMap<>();
//        return map;
//    }
    /*
    @ResponseBody
    @RequestMapping(value = "/AddRelaticardCardSOA", method = RequestMethod.GET)
    public Map<String, Object> AddRelaticardCardSOA(HttpServletResponse response, HttpServletRequest request) {
       
        String CardcontractNum="9704480366567802";
        String clientNum="2132709";
        String ShortName="LUONG THI MINH ANH";
        String rbsNumber="00004456";
        String issContractNumber="10168C000180001";    
        
        CardContract cardContract=new CardContract();
        cardContract.setCardContractNumber(CardcontractNum);
        cardContract.setClientNumberl(clientNum);
        cardContract.setIssContractNumber(issContractNumber);
        cardContract.setrBSNumber(rbsNumber);
        cardContract.setShortName(ShortName);
        cardPostWay4.addRelationCard(cardContract);
        
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/updateAddressCardSOA", method = RequestMethod.GET)
    public Map<String, Object> updateAddressCardSOA(HttpServletResponse response, HttpServletRequest request) {
       
        String CardcontractNum="9704480366567802";
        String clientNum="2132709";
        String ShortName="LUONG THI MINH ANH";
        String rbsNumber="00004456";
        String issContractNumber="10168C000180001";    
        String address="HCM";
        String phone="123";
        String firstName="LUONG";
        String lastName="ANH";
        CardContract cardContract=new CardContract();
        cardContract.setCardContractNumber(CardcontractNum);
        cardContract.setClientNumberl(clientNum);
        cardContract.setIssContractNumber(issContractNumber);
        cardContract.setrBSNumber(rbsNumber);
        cardContract.setShortName(ShortName);
        cardContract.setAddressLine1(address);
        cardContract.setPhoneNumber(phone);
        cardContract.setFirstName(firstName);
        cardContract.setLastName(lastName);
        cardPostWay4.updateAddressCard(cardContract);
        
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/updateRelaticardCardSOA", method = RequestMethod.GET)
    public Map<String, Object> updateRelaticardCardSOA(HttpServletResponse response, HttpServletRequest request) {
       
        String CardcontractNum="9704480366567802";
        String clientNum="2132709";
        String ShortName="LUONG THI MINH ANH";
        String rbsNumber="00004456";
        String issContractNumber="10168C000190001";     
        
        CardContract cardContract=new CardContract();
        cardContract.setCardContractNumber(CardcontractNum);
        cardContract.setClientNumberl(clientNum);
        cardContract.setIssContractNumber(issContractNumber);
        cardContract.setrBSNumber(rbsNumber);
        cardContract.setShortName(ShortName);
        cardPostWay4.updateRelationCard(cardContract);
        
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/updateInfoCardSOA", method = RequestMethod.GET)
    public Map<String, Object> updateInfoCardSOA(HttpServletResponse response, HttpServletRequest request) {
       
        String CardcontractNum="9704480982344529";
        String clientNum="2137041";
        String ShortName="CAO KHANH VU";
        String rbsNumber="00004456";
        String issContractNumber="10036PKT100030001";      
        String firstName="CAO";
        String lastName="VU";
        CardContract cardContract=new CardContract();
        cardContract.setCardContractNumber(CardcontractNum);
        cardContract.setClientNumberl(clientNum);
        cardContract.setIssContractNumber(issContractNumber);
        cardContract.setrBSNumber(rbsNumber);
        cardContract.setShortName(ShortName);
        cardContract.setFirstName(firstName);
        cardContract.setLastName(lastName);
        cardContract.setPhoneNumber("099");       
        cardPostWay4.updateInfoCard(cardContract);
        
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/ModifyInfoClient", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, String> ModifyInfoClient(HttpServletResponse response, HttpServletRequest request) {
        
        return null;
    }
    */
}
