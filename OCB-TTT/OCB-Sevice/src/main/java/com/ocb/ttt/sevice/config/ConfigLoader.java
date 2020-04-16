/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.config;

import java.util.Properties;
import javax.annotation.PostConstruct;
import com.ocb.ttt.common.util.LoadConfigFile;

/**
 *
 * @author Win 10
 */
public class ConfigLoader {
    
    /**
     * file config propertie
     */
    private String fileName;
    private Properties prop;
    
    @PostConstruct
    public void init() {
       LoadConfigFile configFile=new LoadConfigFile(fileName);
       prop=configFile.getProperties();  
    }
    
   public ConfigLoader()
   {         
               
   }   
   public String getValue(String key)
   {
       return prop.getProperty(key);
   }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
    
    
}
