/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.login.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.login.model.UserLogin;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
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
import com.ocb.ttt.login.service.LDAPAuthenService;
import com.ocb.ttt.login.service.LdapAuthen;


/**
 *
 * @author toanhv1
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    
    private static final LoggerLoader logger = new LoggerLoader(LoginController.class);
    @Autowired
    LDAPAuthenService authenService;
    
    @ResponseBody  
    @RequestMapping(value = "/loginLDAP", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Map<String, Object> loginLDAP(HttpServletResponse response, HttpServletRequest request, @RequestBody RequestForm data) {
                            
        HashMap<String, Object> p= new HashMap<String, Object>();    
        UserLogin login= JsonPharse.ConvertToObj(data.getData(),UserLogin.class);        
        boolean check= authenService.loginLDAP(login.getUser().trim(), login.getPassword().trim());
        if(check)
        {
             logger.info("succesful:"+login.getUser());
             p.put("status",0);
             p.put("msg","succesful");
        }else
        {
             logger.info("login fail:"+login.getUser());
             p.put("status",401);
             p.put("msg","login fail");
        }                
        return p;
    } 
    
}
