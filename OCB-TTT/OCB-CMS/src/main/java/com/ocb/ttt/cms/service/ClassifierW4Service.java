///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ocb.ttt.cms.service;
//
//import com.ocb.ttt.ws.way4.api.PostToWay4;
//import com.ocb.ttt.ws.way4.api.ServiceCardPostWay4;
//import ocb.ttt.common.anotion.ConfigValue;
//import org.apache.log4j.Logger;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author quantm1
// */
//@Service
//public class ClassifierW4Service extends PostToWay4 {
//    private static Logger logger = Logger.getLogger(ServiceCardPostWay4.class);
//    @ConfigValue(Value = "way4gate")
//    String url;
//
//    public String UpdateClassifier(String xml) {
//        try {
//            String res = PostToWay4(xml, url);
//            return res;
//        } catch (Exception e) {
//            logger.error(e);
//        }
//
//        return "";
//    }
//    
//    @Override
//    protected String getUrl() {
//        return url;
//    }
//}
