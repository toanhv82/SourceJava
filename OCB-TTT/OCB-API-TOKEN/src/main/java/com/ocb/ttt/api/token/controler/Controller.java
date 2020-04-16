/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.token.controler;

import com.ocb.ttt.api.token.model.ReqCif;
import com.ocb.ttt.api.token.service.ServiceToken;
import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.convert.JsonPharse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author toanhv1
 */
@org.springframework.stereotype.Controller
@RequestMapping(value = "/TOKEN")
public class Controller extends MainControler{
    
    @Autowired
    ServiceToken serviceToken;
    
    @ResponseBody
    @RequestMapping(value = "/BY_CARD_CIF", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Object requestSOA(HttpServletResponse response, HttpServletRequest request,@RequestBody RequestForm data) {
        
        boolean isLogin = login(request, Container.ROLE_TTT);
        if (isLogin) {     
            
           ReqCif obj=JsonPharse.ConvertToObj(data.getData(), ReqCif.class);
          return  serviceToken.getInfoCardByCif(obj.getPan(), obj.getCif());
        }     
        return new ReqCif();
       
    }
    
    
}
