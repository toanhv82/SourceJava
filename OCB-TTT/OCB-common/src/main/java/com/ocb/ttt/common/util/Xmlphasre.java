/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.util;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author toanhv1
 */
public class Xmlphasre {
    
    public String convertFileXMLToStraing(String fileName) throws Exception
    {
            ClassLoader classLoader = getClass().getClassLoader();
            
            File fXmlFile = new File(classLoader.getResource(fileName).getFile());
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);            
            String xml=Xmlphasre.toXmlString(doc);           
            return xml;           
            
    }
    public static String toXmlString(Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StringWriter strWriter = new StringWriter();
        StreamResult result = new StreamResult(strWriter);    
        transformer.transform(source, result);        
        return strWriter.getBuffer().toString();
        
    }
    public static <T> T converXMLToObject(String xml,Class<T> className)
    {
        try
        {
            JAXBContext jc = JAXBContext.newInstance(className);
          
            StreamSource streamSource = new StreamSource(new StringReader(xml));
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            
            JAXBElement<T> je = unmarshaller.unmarshal(streamSource,className);            
            return  (T)je.getValue();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
