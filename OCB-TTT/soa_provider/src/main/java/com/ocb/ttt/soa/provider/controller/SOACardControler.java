/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.soa.provider.templet.model.ContractClassifier;
import com.ocb.ttt.soa.provider.templet.model.ResponseSoa;
import com.ocb.ttt.soa.provider.templet.service.impl.ProviderSoa;
import com.ocb.ttt.ws.way4.api.ServiceCardPostWay4;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.anotion.PermissionSOA;
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
@RequestMapping(value = "/Card")
public class SOACardControler extends SOAControler {
    private static LoggerLoader logger = new LoggerLoader(SOACardControler.class); 
    @Autowired
    ServiceCardPostWay4 cardPostWay4;   
    @Autowired
    ProviderSoa providerSoa;        
    
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> test(HttpServletResponse response, HttpServletRequest request) {               
       
        HashMap<String, Object> p= new HashMap<String, Object>();    
        p.put("status", "OK");
        return p;
    }   
    
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/reSetPinSOA", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> reSetPinSOA(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
                    
        String token_id = data.getData();
        HashMap<String, Object> p= new HashMap<String, Object>();         
        if(!checkData(data))
        {
            logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
            return p;
        }           
        String result=   providerSoa.resetPin(token_id); 
        p.put("status",convertResult(result));
        p.put("msg", convertResult(result).getMes());
        return p;
    }   
    @ResponseBody  
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/changeStatusCard", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> changeStatusCard(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
              
        //System.out.println("com.ocb.ttt.soa.provider.controller.SOACardControler.changeStatusCard():call");        
        String json_data = data.getData();  
        HashMap<String, Object> p= new HashMap<String, Object>();
        if(!checkData(data))
        {
            logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
             return p;
        }
        String result=   providerSoa.changeStatusCard(json_data); 
        p.put("status",ProviderSoa.convertResult(result));
         p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    }   
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/closeCard", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, String> closeCard(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
        String json_data = data.getData();           
        String result=   providerSoa.changeStatusCard(json_data);           
        HashMap<String, String> p= new HashMap<String, String>();
        p.put("status", result);
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    } 
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/changeStatusContract", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> changeStatusContract(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
        String json_data = data.getData();           
        HashMap<String, Object> p= new HashMap<String, Object>();         
        if(!checkData(data))
        {
            logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
             return p;
        }          
        String result=   providerSoa.changeContractStatus(json_data);      
        p.put("status",ProviderSoa.convertResult(result));
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    }
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/updateEcom", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> updateEcom(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
        String json_data = data.getData();           
        HashMap<String, Object> p= new HashMap<String, Object>();         
        if(!checkData(data))
        {
            logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
            return p;
        }        
        String result=   providerSoa.updateEcom(json_data);      
        p.put("status", ProviderSoa.convertResult(result));
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    }
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/updateMoto", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> updateMoto(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
        String json_data = data.getData();           
        HashMap<String, Object> p= new HashMap<String, Object>();         
        if(!checkData(data))
        {
            logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
            return p;
        }        
        String result=   providerSoa.updateMoto(json_data);      
        p.put("status",ProviderSoa.convertResult(result));
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    }
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/updateVip", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> updateVip(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
        String json_data = data.getData();           
        HashMap<String, Object> p= new HashMap<String, Object>();         
        if(!checkData(data))
        {
           logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
            return p;
        }        
        String result=   providerSoa.updateVip(json_data);      
        p.put("status",ProviderSoa.convertResult(result));
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
    }
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/updateClassifier", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> updateClassifier(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data)
    {
        
        ContractClassifier rq=JsonPharse.ConvertToOjectNew(data.getData(), ContractClassifier.class);
        
        HashMap<String, Object> p= new HashMap<String, Object>();
        if(!checkData(data))
        {
           logger.info("Hash Data Incorect!");
            p.put("status", 401);
            p.put("msg", "Hash Data Incorect!");
            return p;
        }        
        String result=   providerSoa.updateClassifierForCard(rq);
        p.put("status",ProviderSoa.convertResult(result));
        p.put("msg", ProviderSoa.convertResult(result).getMes());
        return p;
        
    }
    private ResponseSoa convertResult(String result)
    {        
        ResponseSoa responseSoa=new ResponseSoa();
        try
        {
         String r=result.substring(result.indexOf("<RespCode>")+10,result.indexOf("</RespCode>"));             
         responseSoa.setResult(r);
         if(r.equals("0")||r.equals("00"))
         {
             logger.warn("CALL SOA OK");
              responseSoa.setMes("OK");
         }else
         {
             logger.info("CALL SOA OK");
              responseSoa.setMes("FAIL");
         }
        
         return responseSoa;
        }catch(Exception e)
        {
            responseSoa.setResult("-1");
            responseSoa.setMes("NOT DEFINE");
            logger.error(e);
        }
        return responseSoa; 
    }
}
