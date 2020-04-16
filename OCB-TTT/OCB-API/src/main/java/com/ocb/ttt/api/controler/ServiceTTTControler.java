/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.controler;

import com.ocb.ttt.api.model.RequestSOA;
import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.anotion.PermissionApi;
import ocb.ttt.common.hash.SHAHashing;
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
@RequestMapping(value = "/WS-TTT")
public class ServiceTTTControler {

    @ConfigValue(Value = "URL_SOA_PROXY")
    String url = "";
    @ConfigValue(Value = "USER_API_SOA")
    String userAPI="soa";
    @ConfigValue(Value = "PASS_API_SOA")
    String passApi="Ttt@1234";
    @ResponseBody
    @PermissionApi(Value = Container.ROLE_API)
    @RequestMapping(value = "/call-soa", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public Object omni_active_card(HttpServletRequest request, @RequestBody RequestSOA data) {
        return processRequest(data);
    }
    private String processRequest(RequestSOA form) {
        String path=form.getPath();              
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", userAPI);
        header.put("pw",SHAHashing.bytesToHex(passApi.trim()));
        header.put("Content-Type", "application/json");
        try {
            String content = ConnectionAPI.postJsonObjectHttp(url.trim() + path, header,(RequestForm)form);
            return content;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL";
    }
    
    

}
