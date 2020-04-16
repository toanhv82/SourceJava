/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Win 10
 */
public class LoadFileClassPath {

    /*
        read file from class Path
        this file on package
     */
    public File getFile(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            // System.out.println("com.ocb.ttt.common.util.LoadFileClassPath.getFile");
            return new File(classLoader.getResource(fileName).getFile());

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }

    public InputStream getResource(String fileName){

        if (fileName.toUpperCase().indexOf("URL:") >= 0) {
            try {
                fileName = fileName.substring(fileName.indexOf("url:") + 4);
                BufferedInputStream inputStream = new BufferedInputStream(new URL(fileName).openStream());
                return inputStream;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (fileName.toUpperCase().indexOf("LOCAL:") >= 0) {
            try {
                fileName = fileName.substring(fileName.indexOf("LOCAL:") + 6);

                InputStream inputStream = new FileInputStream(new File(fileName));
                return inputStream;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                //System.out.println("com.ocb.ttt.common.util.LoadFileClassPath.getResource():"+fileName);         
                Resource resource = new ClassPathResource(fileName);
                InputStream dbAsStream = resource.getInputStream();
                return dbAsStream;
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return null;

    }

}
