/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.api;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author Win 10
 */
public abstract class PostToWay4 {
    
    private static final Logger logger = Logger.getLogger(PostToWay4.class);
    protected abstract String getUrl();
    protected String PostToWay4(String xml)
    {  
        
        String url=getUrl();        
        return PostToWay4(xml,url);
    }
    public String PostToWay4(String xml,String url)
    {             
        try
        {
           String res=  HttpWriteXML.postXmlHttps(xml, url);
           logger.info(res);
           return res;
        }catch(Exception e)
        {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return "";
    }
    
    public boolean checkResponse(String res) throws Exception
    {
        try
        {                       
            Document doc = convertStringToXMLDocument(res);           
            NodeList nList = doc.getElementsByTagName("UFXMsg");
             Node nNode = nList.item(0);
             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;                 
                 NodeList nlRegNumber = eElement.getElementsByTagName("RegNumber");
                 NodeList nlMsgData = eElement.getElementsByTagName("RespCode");
                 if(nlMsgData.getLength()>0)
                 {
                    String code=nlMsgData.item(0).getTextContent();        
                    String regNumber=nlRegNumber.item(0).getTextContent();
                    if(code.endsWith("0"))
                    {
                        logger.info("Response from way4 Success-->code:"+code+" ->regNumber:"+regNumber);
                        return true;
                    }else
                    {
                        logger.error("Response from way4 unSuccess-->"+code+" ->regNumber:"+regNumber);
                    }                    
                 }else
                 {
                     logger.error("Response from way4 not RespCode-->"+res);
                     return false;
                 }
                
             }else
             {
                 logger.error("Response from way4 not xml-->"+res);
                 return false;
             }
             
            
        }catch(Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        return false;
    }
    private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
             
            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        return null;
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
