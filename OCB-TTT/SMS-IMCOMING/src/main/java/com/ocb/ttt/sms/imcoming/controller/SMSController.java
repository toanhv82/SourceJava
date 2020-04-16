/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sms.imcoming.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.anotion.PermissionSOA;
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
@RequestMapping(value = "/sms")
public class SMSController {
     private static LoggerLoader logger = new LoggerLoader(SMSController.class); 
    
    @ResponseBody
    @PermissionSOA(value = Container.ROLE_SOA)
    @RequestMapping(value = "/loadSms", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Object reSetPinSOA(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
       
        
        return 1 ;
    }
    
}
