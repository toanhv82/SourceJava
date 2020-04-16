/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 *
 * @author Win 10
 */
public class ResponseAPI {
   
    private String ResponseID;
    private String function;
    private String responseDateTime;
    private int responseCode;
    private String description;
    private String hashKey;
    public ResponseAPI()
    {
        this.responseDateTime=createTime();
        this.ResponseID=createRequestID();
    }

    public String getResponseID() {
        return ResponseID;
    }

    public void setResponseID(String ResponseID) {
        this.ResponseID = ResponseID;
    }
    
    
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public int getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String createTime()
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
        ms=dateStr+h+m+s;
        return ms;
    }
    
    public String createRequestID()
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

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }
    
}
