/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.controller;

import com.ocb.ttt.anotaion.Permission;
import com.ocb.ttt.comb.response.ResponseCustomerCard;
import com.ocb.ttt.comb.response.request.RequestDataCardInquiry;
import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.def.Container;

import com.ocb.ttt.comb.service.ProcessComBAPI;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.service.model.RequestInput;
import com.ocb.ttt.service.model.ResponseAPI;
import com.ocb.ttt.sevice.dao.CheckAuthorization;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.convert.JsonPharse;
import ocb.ttt.obj.def.CardDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Win 10
 */
@Controller
@RequestMapping(value = "/WS-COMB")
public class ControlerComB extends MainControler {

    @Autowired
    ProcessComBAPI processComBAPI;

    @Autowired
    CheckAuthorization authorization;

    @ResponseBody
    @RequestMapping(value = "/header", method = RequestMethod.GET)
    @com.ocb.ttt.anotaion.Permission(Value = Container.ROLE_COMB)
    public Map<String, String> header(HttpServletResponse response, HttpServletRequest request, String card) {
        Map<String, String> map = new HashMap<>();
        map = this.getHeadersInfo(request);
        String user = map.get("user");
        String pw = map.get("pw");
        boolean isLogin = authorization.checkAuthorization(user, pw, Container.ROLE_COMB);
        if (isLogin) {

        }
        return null;

    }
    @ResponseBody
    @RequestMapping(value = "/CardInquiry", method = RequestMethod.POST)
    @com.ocb.ttt.anotaion.Permission(Value = Container.ROLE_COMB)
    public Object CardInquiry(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        Map<String, String> map = new HashMap<>();
        map = this.getHeadersInfo(request);
        String user = map.get(Container.user_login_api);
        String pw = map.get(Container.pw_login_api);
        boolean isLogin = authorization.checkAuthorization(user, pw, Container.ROLE_COMB);
        ResponseAPI responseAPI = new ResponseAPI();
        if (isLogin) {

            JsonPharse<RequestDataCardInquiry> jsonPharse = new JsonPharse<>();
            if (data.getData().isEmpty()) {
                responseAPI.setResponseCode(CardDef.CardNotExist);
                return responseAPI;
            } else {
                /**
                 * convert data Json to Object card
                 */
                RequestDataCardInquiry card = jsonPharse.ConvertToObject(data.getData(), RequestDataCardInquiry.class);
                if (card == null) {
                    responseAPI.setResponseCode(CardDef.BAD_REQUEST);
                    return responseAPI;
                }
                return processComBAPI.getResponseCardInquiry(card.getCardNumber());
            }

        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }

    }

    @ResponseBody
    @RequestMapping(value = "/DataCardLastTranx", method = RequestMethod.POST)
    @Permission(Value = Container.ROLE_COMB)
    public Object getDataCardLastTranx(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        Map<String, String> map = new HashMap<>();
        map = this.getHeadersInfo(request);
        String user = map.get(Container.user_login_api);
        String pw = map.get(Container.pw_login_api);
        boolean isLogin = authorization.checkAuthorization(user, pw, Container.ROLE_COMB);
        ResponseAPI responseAPI = new ResponseAPI();
        if (isLogin) {

            JsonPharse<RequestDataCardInquiry> jsonPharse = new JsonPharse<>();
            if (data.getData().isEmpty()) {

                responseAPI.setResponseCode(CardDef.CardNotExist);
                return responseAPI;
            } else {
                /**
                 * convert data Json to Object card
                 */
                RequestDataCardInquiry card = jsonPharse.ConvertToObject(data.getData(), RequestDataCardInquiry.class);
                if (card == null) {
                    responseAPI.setResponseCode(CardDef.BAD_REQUEST);
                    return responseAPI;
                }
                return processComBAPI.getResponseCardLastTranx(card.getCardNumber());

            }

        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }

    }

    @ResponseBody
    @RequestMapping(value = "/CheckCardInfo", method = RequestMethod.POST)
    @Permission(Value = Container.ROLE_COMB)
    public Object getCustomerCard(HttpServletRequest request, @RequestBody RequestForm data) {
        loggerRequest(data);
        ResponseAPI responseAPI = new ResponseAPI();
        boolean isLogin = login(request, Container.ROLE_COMB);
        if (isLogin) {
            JsonPharse<RequestInput> jsonPharse = new JsonPharse<>();
            RequestInput cusId = jsonPharse.ConvertToObject(data.getData(), RequestInput.class);
                if (cusId == null) {
                    responseAPI.setResponseCode(CardDef.BAD_REQUEST);
                    return responseAPI;
                }
               ResponseCustomerCard card=processComBAPI.getResponseCustomerCard(cusId.getInput());
               card.setFunction("CheckCardInfo");
                return card;
        } else {
            responseAPI.setResponseCode(CardDef.Unauthorized);
            return responseAPI;
        }
    }

}
