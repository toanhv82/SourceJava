/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.controler;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Win 10
 */
@Controller
@RequestMapping(value = "/WS-TTT")
public class OpenAPI  {


//    @ResponseBody
//    @RequestMapping(value = "/CustomerRegister", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
//    public Object postHeader(HttpServletRequest request, @RequestBody RequestForm data) {
//        loggerRequest(data);
//        ResponseAPI responseAPI = new ResponseAPI();
//        boolean isLogin = login(request, Container.ROLE_FLC);
//        if (isLogin) {
//            return processOpenApi.responseRegister(data);
//
//        } else {
//            responseAPI.setResponseCode(CardDef.Unauthorized);
//            return responseAPI;
//        }
//
//    }
//    @ResponseBody
//    @RequestMapping(value = "/checkRegister", method = RequestMethod.POST)
//    public Object checkRegister(HttpServletRequest request, @RequestBody RequestForm data) {
//        loggerRequest(data);
//        ResponseAPI responseAPI = new ResponseAPI();
//        boolean isLogin = login(request, Container.ROLE_FLC);
//        if (isLogin) {
//            return processOpenApi.checkStatus(data);
//
//        } else {
//            responseAPI.setResponseCode(CardDef.Unauthorized);
//            return responseAPI;
//        }
//
//    }
//    @ResponseBody
//    @RequestMapping(value = "/reSendMail", method = RequestMethod.POST)
//    public Object reSendMail(HttpServletRequest request, @RequestBody RequestForm data) {
//        loggerRequest(data);
//        ResponseAPI responseAPI = new ResponseAPI();
//        boolean isLogin = login(request, Container.ROLE_FLC);
//        if (isLogin) {
//            return processOpenApi.reSendMail(data);
//
//        } else {
//            responseAPI.setResponseCode(CardDef.Unauthorized);
//            return responseAPI;
//        }
//
//    }
   

}
