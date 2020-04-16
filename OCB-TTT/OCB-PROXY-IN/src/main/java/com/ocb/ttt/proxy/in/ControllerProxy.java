/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.proxy.in;

import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.sevice.dao.CheckAuthorization;
import com.ocb.ttt.sevice.security.ServiceUserLogin;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author toanhv1
 */
@Controller
@RequestMapping(value = "/PROXY-IN")
public class ControllerProxy extends MainControler{
    
    @Autowired
    private ServiceUserLogin serviceUserLogin;
   
    
    @ResponseBody
    @RequestMapping(value = "/RequestIn", method = RequestMethod.POST)
    public Object RequestInPost(HttpServletResponse response, HttpServletRequest request) {
        
        if(login(request, 0))
        {
            
        }       
      
      return 2;
    }    
      
    
}
