/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.mail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 *
 * @author toanhv1
 */
public class UtilEmail {

    public  String LoadFile(String fileName) {

        //String fileName="c:/cms/temp_email_flc";
            
        ClassLoader classLoader = getClass().getClassLoader();      
        String sLine = "";
        try {
            
            File file = new File(fileName);
           
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF8"));
            String line;
            while ((line = br.readLine()) != null) {
                //process the line
                sLine += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sLine;
    }

}
