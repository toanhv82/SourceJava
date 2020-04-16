/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.runtime;

/**
 *
 * @author toanhv1
 */
public class ContextApp {
    
    public  static  <T> T getBean(String name)
    {
        return  (T)ApplicationContextUtils.getApplicationContext().getBean(name);
       
    }
    
}
