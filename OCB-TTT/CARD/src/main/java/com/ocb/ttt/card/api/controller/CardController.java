/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.card.api.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.def.ResponseCode;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.service.model.RequestInput;
import java.util.List;
import com.ocb.ttt.card.api.model.CardInfo;
import com.ocb.ttt.card.api.model.ResponseInforCard;
import com.ocb.ttt.card.api.service.ServiceCardInfo;
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
public class CardController {
    
    @Autowired
    ServiceCardInfo serviceCardInfo;
    
    private static LoggerLoader logger = new LoggerLoader(CardController.class);
    
    
    @ResponseBody
    @RequestMapping(value = "/CheckCardInfo", method = RequestMethod.GET)
    public Object index1() {
        
        return "a";
    }
    
    
    @ResponseBody
    @RequestMapping(value = "/CheckCardInfo", method = RequestMethod.POST)
    public Object index(@RequestBody RequestForm requestForm) {
        
    //    System.out.println("com.ocb.ttt.card.controller.CardController.index()"+appProperties.getPort());
    
        
    
        JsonPharse<RequestInput> jsonPharse = new JsonPharse<>();
        //RequestInput cusId = "111";
        ResponseInforCard openAPI = new ResponseInforCard();
        openAPI.setFunction("INQUERY-CARD");
         try {
            logger.info(requestForm);
            String id = jsonPharse.ConvertToObject(requestForm.getData(), RequestInput.class).getInput();            
            List<CardInfo> cards=  serviceCardInfo.getcardInfo(id);
            if(cards.size()==1)
            {
                 openAPI.setCardInfo(cards.get(0));
                 openAPI.setResponseCode(200);
            }else
            {
                 openAPI.setResponseCode(ResponseCode.CardNotExist);
            }
           
        } catch (Exception e) {

            logger.error(e);
            openAPI.setResponseCode(400);
            openAPI.setDescription("INVALID FORMAT JSON");
            e.printStackTrace();
        }
             
        return openAPI;
    }
    
    
}
