/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.controler;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.dhkt.model.RequestDataCard;
import com.ocb.ttt.dhkt.model.ResponseDataOpenAPI;
import com.ocb.ttt.dhkt.model.ResponseOpenAPI;
import com.ocb.ttt.dhkt.respository.ImportFileDao;
import com.ocb.ttt.dhkt.service.PaymentService;
import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.sevice.runtime.ApplicationContextUtils;
import com.ocb.ttt.sevice.soa.ServiceSOA;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.convert.JsonPharse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
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
@RequestMapping(value = "/DHKT")
public class ControlerDHKT extends MainControler {

     private  LoggerLoader logger = new LoggerLoader(ControlerDHKT.class);
    
    @Autowired
    PaymentService paymentService;

    @ResponseBody
    @com.ocb.ttt.anotaion.Permission(Value = Container.ROLE_API)
    @RequestMapping(value = "/CardInquiry", method = RequestMethod.POST)
    public Object CardInquiry(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm requestForm) {

        try {
            
            JsonPharse<RequestDataCard> jsonPharse = new JsonPharse<>();           
            String id = jsonPharse.ConvertToObject(requestForm.getData(), RequestDataCard.class).getCardNumber();
            logger.info(id);
            
            return paymentService.getCardInfo(id);
        } catch (Exception e) {

            logger.error(e);
            e.printStackTrace();;
        }
        ResponseOpenAPI openAPI = new ResponseOpenAPI();
        openAPI.setResponseCode(400);
        openAPI.setDescription("INVALID FORMAT JSON");
        logger.info(JsonPharse.ConvertToString1(openAPI));
        return openAPI;
    }

}
