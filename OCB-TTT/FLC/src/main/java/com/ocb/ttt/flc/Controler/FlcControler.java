/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.Controler;

import com.ocb.ttt.flc.model.request.RegisterCustomerForm;
import com.ocb.ttt.flc.service.ProcessFlcServiceImpl;
import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.service.model.ResponseAPI;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import ocb.ttt.obj.def.CardDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author toanhv1
 */
@Controller
@RequestMapping(value = "/WS-TTT-FLC")
public class FlcControler extends MainControler {
    
    @Autowired
    ProcessFlcServiceImpl processOpenApi;

    @ResponseBody
    @RequestMapping(value = "/CustomerRegister", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Object postHeader(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        ResponseAPI responseAPI = new ResponseAPI();
        boolean isLogin = login(request, Container.ROLE_FLC);
        if (isLogin) {
            return processOpenApi.responseRegister(data);

        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }

    }
    @ResponseBody
    @RequestMapping(value = "/checkRegister", method = RequestMethod.POST)
    public Object checkRegister(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        ResponseAPI responseAPI = new ResponseAPI();
        boolean isLogin = login(request, Container.ROLE_FLC);
        if (isLogin) {
            return processOpenApi.checkStatus(data);

        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }

    }
    @ResponseBody
    @RequestMapping(value = "/reSendMail", method = RequestMethod.POST)
    public Object reSendMail(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        ResponseAPI responseAPI = new ResponseAPI();
        boolean isLogin = login(request, Container.ROLE_FLC);
        if (isLogin) {
            return processOpenApi.reSendMail(data);

        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }

    }
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object sigin() {
       
        String hash="";        
        return "ok";
                
    }
 
    @RequestMapping(value = "/sign/{ID}", method = RequestMethod.GET)
    public String test(HttpServletRequest request, @PathVariable(value="ID") final String id,Model model) {
        RegisterCustomerForm result = new RegisterCustomerForm();
        result = processOpenApi.getInfo(id);
       
        model.addAttribute("Name",result.getFullName());
        model.addAttribute("id", result.getRequestId());
        model.addAttribute("result", "");
        String hash="";        
        return "page/cus_register";
                
    }
    @RequestMapping(value = "/updateStatus", method = RequestMethod.POST)
    public String updateStatus(@FormParam(value="requestId") final String requestId,Model model) {
        int result = 0;
        String test = "";
        if (requestId!=null && !requestId.equals("")) {
            result = processOpenApi.UpdateStatusCustomerFLCByRequest(requestId);
        }
        if (result!=0) {
            test = "ĐĂNG KÝ THÀNH CÔNG !!!";
        }else{
            test = "ĐĂNG KÝ KHÔNG THÀNH CÔNG !!!";
        }
        model.addAttribute("result", test);
//        model.addAttribute("Name",name);
        String hash="";        
        return "page/cus_register";
                
    }
    
}
