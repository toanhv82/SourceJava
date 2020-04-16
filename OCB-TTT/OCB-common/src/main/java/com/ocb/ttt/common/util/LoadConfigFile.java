/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Win 10
 */
public class LoadConfigFile {

    private String file;
    private String listFile;
    private Properties prop;

    
    
    public LoadConfigFile(String f) {
        this.file = f;
        try {
           // ClassLoader classLoader = getClass().getClassLoader();
            InputStream inputStream = new FileInputStream(new File(f));
            prop = new Properties();
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LoadConfigFile(File file) {

        try {
            InputStream inputStream = new FileInputStream(file);
            prop = new Properties();
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public LoadConfigFile(List<File> files) {

        try {
             prop = new Properties();
             for(File item: files)
             {
                 InputStream inputStream = new FileInputStream(item);
                 prop.load(inputStream);
             }             
            
           
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     *
     * @return propertyName
     */
    public String getName(String proName) {
        return prop.getProperty(proName);
    }

    public HashMap<String, String> getAll() {

        HashMap<String, String> has = new HashMap<String, String>();

        Set<Object> keys = prop.keySet();

        for (Object k : keys) {
            String key = (String) k;

            has.put(key, getName(key));

        };
        return has;

    }
    public  Properties getProperties()            
    {
        return prop;
    }

    public String getListFile() {
        return listFile;
    }

    public void setListFile(String listFile) {
        this.listFile = listFile;
    }
    
    public  static  Properties getFromFile(String filePath)
    {
        Properties prop=new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return prop;
    }

}
