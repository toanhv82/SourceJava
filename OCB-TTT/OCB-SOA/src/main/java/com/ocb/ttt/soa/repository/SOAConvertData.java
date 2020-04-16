/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author toanhv1
 */
public abstract class SOAConvertData {
    
        
    public String process(String xml,HashMap<String, String> data )
    {                      
        for (Map.Entry<String, String> entry : data.entrySet()) {
           String key=entry.getKey();
           String value=entry.getValue();
           xml.replace(key, value);           
        }      
        return xml;
    }       
    protected String getMesId()
    {
        Date date=new Date();        
        String ms="";
        Random ran=new Random();        
        SimpleDateFormat f = new SimpleDateFormat("yyyMMdd");
        String dateStr = f.format(date);        
        String h=date.getHours()>=10?String.valueOf(date.getHours()):"0"+String.valueOf(date.getHours());
        String m=date.getMinutes()>=10?String.valueOf(date.getMinutes()):"0"+String.valueOf(date.getMinutes());
        String s=date.getSeconds()>=10?String.valueOf(date.getSeconds()):"0"+String.valueOf(date.getSeconds());
        String mil=String.valueOf(date.getTime()).substring(0,5);
        ms=dateStr+h+m+s+mil;
        return ms;
    }
  
}
