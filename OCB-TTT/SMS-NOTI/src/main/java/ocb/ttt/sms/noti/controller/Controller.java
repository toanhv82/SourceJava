/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.sms.noti.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author toanhv1
 */
@org.springframework.stereotype.Controller
public class Controller {
    
    @ResponseBody
    @RequestMapping(value = "/post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Object requestSOA(HttpServletResponse response, HttpServletRequest request, String card) {

        System.out.println("ocb.ttt.sms.noti.controller.Controller.requestSOA()");
                      
        return 1;
    }
    
    
}
