///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ocb.ttt.dhkt.service;
//
//import com.ocb.ttt.dhkt.def.DEF_XML;
//import com.ocb.ttt.dhkt.model.Student_TMP;
//import com.ocb.ttt.dhkt.respository.ProcessDataDao;
//import com.ocb.ttt.sevice.runtime.ApplicationContextUtils;
//import com.ocb.ttt.sevice.soa.ServiceAplication;
//import com.ocb.ttt.sevice.soa.ServiceSOA;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Random;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author toanhv1
// */
//@Service
//public class ProcessDHKT {
//    
//    @Autowired
//    ProcessDataDao processDataDao;   
//    @Autowired
//    ClientXmlService clientXmlService;
//    @Autowired
//    ServiceAplication aplication;
//    
//    public String updateCLient(String batch_id)
//    {        
//        ApplicationContext appCtx = ApplicationContextUtils
//				.getApplicationContext();
//	ServiceSOA soa = (ServiceSOA) appCtx.getBean(serviveBean);     
//
//        List<Student_TMP> listCLient=getData(batch_id);
//        String xmls ="";
//        for (Student_TMP item : listCLient) {
//            xmls=convertXML(item);
//            String st= soa.postData(xmls);
//            System.out.println("XML:"+st);
//        }
////       String xml=convertXML(listCLient.get(0));
////        
//       
//        
//        return "";
//        
//    }   
//    private List<Student_TMP> getData(String batch_id)
//    {      
//       List<Student_TMP> list=  processDataDao.getAll(batch_id);          
//       return list;
//        
//    }    
//    private String convertXML(Student_TMP std)
//    {        
//        String xml=clientXmlService.importParamUpdate(getParam(std));        
//        return xml;
//    }
//    private HashMap<String, String> getParam(Student_TMP student)
//    {
//         HashMap<String, String> param=new HashMap<String, String>();
//         param.put(DEF_XML.messageId, getMesId());
//         param.put(DEF_XML.RegNumber, aplication.getSQN());
//         param.put(DEF_XML.ClientNumber, student.getBASIC_CARD_NUMBER()); 
//         param.put(DEF_XML.Title, student.getTITLE());
//         param.put(DEF_XML.FirstName, student.getFULL_NAME());
//         param.put(DEF_XML.MiddleName, "");
//         param.put(DEF_XML.LastName, "");
//         param.put(DEF_XML.ShortName, "TEST CREDIT");    
//        try { 
//            param.put(DEF_XML.BirthDate, convertDate(student.getBIRTH_DATE()));
//        } catch (ParseException ex) {
//            Logger.getLogger(ProcessDHKT.class.getName()).log(Level.SEVERE, null, ex);
//        }
//         param.put(DEF_XML.BirthPlace, student.getBIRTH_CITY());
//         param.put(DEF_XML.PhoneNumber, student.getMOBILE_PHONE());       
//         param.put(DEF_XML.City, "TP HO CHI MINH");
//                 
//         return param;
//    }
//       
//    private String convertDate(String date) throws ParseException
//    {    
//        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
//        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");
//        Date dt = f.parse(date);
//        String datestr = f2.format(dt);
//        return datestr;
//    }
//    
//   
//    protected String getMesId()
//    {
//        Date date=new Date();
//        
//        String ms="";
//        Random ran=new Random();        
//        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
//        String dateStr = f.format(date);        
//        String h=date.getHours()>=10?String.valueOf(date.getHours()):"0"+String.valueOf(date.getHours());
//        String m=date.getMinutes()>=10?String.valueOf(date.getMinutes()):"0"+String.valueOf(date.getMinutes());
//        String s=date.getSeconds()>=10?String.valueOf(date.getSeconds()):"0"+String.valueOf(date.getSeconds());
//        String mil=String.valueOf(date.getTime()).substring(0,5);
//        ms=dateStr+h+m+s+mil;
//        return ms;
//    }
//    
//}
