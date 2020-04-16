/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.config;

import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceConfigLoader {
    
    private ConfigLoader configLoader;

    public ConfigLoader getConfigLoader() {
        return configLoader;
    }

    public void setConfigLoader(ConfigLoader configLoader) {
        this.configLoader = configLoader;
    }
    
    
    
    
}
