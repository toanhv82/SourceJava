/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.service.model.RequestForm;
import java.util.HashMap;
import java.util.Map;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServicePostSOA {
    
    private String userAPI;
    private String passApi;
    private String url;
    
    public String postSoa(RequestForm form)
    {
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", userAPI);
        header.put("pw",SHAHashing.bytesToHex(passApi.trim()));
        header.put("Content-Type", "application/json");
        try {
            String content = ConnectionAPI.postJsonObjectHttp(url.trim(), header,(RequestForm)form);
            return content;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL";
    }
    
}
