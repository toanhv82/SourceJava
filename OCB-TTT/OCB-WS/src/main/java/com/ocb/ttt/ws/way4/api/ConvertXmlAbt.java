/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import java.io.File;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.xml.crypto.Data;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Win 10
 */
public abstract class ConvertXmlAbt {
    
    private static final Logger logger = Logger.getLogger(ConvertXmlAbt.class);
    public String readXml(String contractNum,String regNumber,String ShortName,String feeCode,String feeValue,String reason) {
        try {
            /**
             * get url from resources
             */
            ClassLoader classLoader = getClass().getClassLoader();
            File fXmlFile = new File(classLoader.getResource(getFileName()).getFile());
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            NodeList nList = doc.getElementsByTagName("UFXMsg");
            Node nNode = nList.item(0);           
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                NodeList nlMsgId = eElement.getElementsByTagName("MsgId");                 
                nlMsgId.item(0).setTextContent(getMesId());
                 
                NodeList nlMsgData = eElement.getElementsByTagName("MsgData");
                /*
                    
                */
                Node nNodeA = nlMsgData.item(0);

                if (nNodeA.getNodeType() == Node.ELEMENT_NODE) {
                    Element eApplication = (Element) nNode;
                    NodeList nlRegNumber= eApplication.getElementsByTagName("RegNumber");                  
                    nlRegNumber.item(0).setTextContent(regNumber); 
                    
                   
                    
                    NodeList nlObjectFor= eApplication.getElementsByTagName("ObjectFor"); 
                    
                    
                    
                    if(nlObjectFor.item(0).getNodeType()==Node.ELEMENT_NODE)
                    {
                      NodeList nlShortName= ((Element)nlObjectFor.item(0)).getElementsByTagName("ShortName");                      
                      nlShortName.item(0).setTextContent(ShortName);
                      
                      /*set ContractNumber */
                      ((Element)nlObjectFor.item(0)).getElementsByTagName("ContractNumber").item(0).setTextContent(contractNum);    
                      
                    }
                   
                    NodeList nlData= eApplication.getElementsByTagName("Data");        
                    
                    if(nlData.item(0).getNodeType()==Node.ELEMENT_NODE)
                    {
                       ((Element)nlData.item(0)).getElementsByTagName("Code").item(0).setTextContent(feeCode); 
                       ((Element)nlData.item(0)).getElementsByTagName("Value").item(0).setTextContent(feeValue); 
                       ((Element)nlData.item(0)).getElementsByTagName("ReasonDetails").item(0).setTextContent(reason); 
                    }                    
                    
                    
                }

            }            
           // System.out.println(toXmlString(doc));
            return toXmlString(doc);
        } catch (Exception e) {
            logger.error("ERROR:"+e);
            e.printStackTrace();
        }
        
        return  "";
    }
    private  String toXmlString(Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StringWriter strWriter = new StringWriter();
        StreamResult result = new StreamResult(strWriter);
    
        transformer.transform(source, result);
        
        return strWriter.getBuffer().toString();
        
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
    protected abstract String getFileName();
    
   
}
