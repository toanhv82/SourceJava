/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.controller;

import com.ocb.ttt.service.controler.MainControler;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.sevice.security.ServiceProcessKey;
import java.util.HashMap;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author toanhv1
 */
public class SOAControler  extends MainControler{
    
    @ConfigValue(Value = "alias_keys_soa")
    private String keyEncryptData;
    @Autowired
    ServiceProcessKey serviceProcessKey;
    
    protected String getHash(String data)
    {
        String hash=serviceProcessKey.getKey(keyEncryptData);
        
        return SHAHashing.bytesToHex(data+hash);
       
    }
    protected boolean checkData(RequestForm data)
    {
        String json_data = data.getData();       
        String hashData= getHash(json_data);
        String hash=data.getHash();
       // HashMap<String, Object> p= new HashMap<String, Object>();
        return true; //hashData.equals(hashData);
       
    }
    
}
