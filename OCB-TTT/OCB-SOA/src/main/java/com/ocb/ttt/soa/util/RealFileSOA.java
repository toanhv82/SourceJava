/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.util;

import com.ocb.ttt.common.util.Xmlphasre;

/**
 *
 * @author toanhv1
 */
public class RealFileSOA {
    
   public static String getFile(String fileName)throws Exception
   {   
              
        Xmlphasre xmlphasre=new Xmlphasre();           
        String xml=xmlphasre.convertFileXMLToStraing(fileName);            
        return xml;    
       
   }
    
}
