/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.common.util.Xmlphasre;
import com.ocb.ttt.dto.UFXMsg;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.soa.provider.templet.model.ContractClassifier;
import com.ocb.ttt.soa.provider.templet.model.ResponseSoa;
import com.ocb.ttt.soa.provider.templet.service.impl.ProviderSoa;
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
@RequestMapping(value = "/Contract")
public class SOAContractControler extends SOAControler {
    
    @Autowired
    ProviderSoa providerSoa;   
    private static LoggerLoader logger = new LoggerLoader(SOAContractControler.class); 
    
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/updateClassifier", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> updateClassifier(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data)
    {
        ContractClassifier rq=JsonPharse.ConvertToOjectNew(data.getData(), ContractClassifier.class);        
        HashMap<String, Object> p= new HashMap<String, Object>();
//        if(!checkData(data))
//        {
//            logger.info("Hash Data Incorect!");
//            p.put("status", 401);
//            p.put("msg", "Hash Data Incorect!");
//            return p;
//        }        
        String result=   providerSoa.updateClassifierForContract(rq);
        p.put("status",ProviderSoa.convertResult(result));
        p.put("msg", SOAContractControler.convertResultToObj(result));
        return p;
    }
  
    public static UFXMsg convertResultToObj(String result) {
        
         UFXMsg r=  Xmlphasre.converXMLToObject(result, UFXMsg.class);
         return r;
    }
    
    
}
