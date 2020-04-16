/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service;

import com.ocb.ttt.sevice.runtime.ApplicationContextUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author toanhv1
 */
public class ContextApp {
   
   
    protected <T> T getBean(String name)
    {
        return  (T)ApplicationContextUtils.getApplicationContext().getBean(name);
       
    }
    
}
