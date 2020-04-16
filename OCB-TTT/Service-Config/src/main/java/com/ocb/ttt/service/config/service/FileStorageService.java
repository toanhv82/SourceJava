/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.config.service;

/**
 *
 * @author toanhv1
 */


import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import java.net.MalformedURLException;


@Service
public class FileStorageService {

    
   
    public  Resource loadFileAsResource(String fileName) {
        try {
           
            Resource resource = new UrlResource(fileName);
            if(resource.exists()) {
                return resource;
            } else {
                return null;
            }
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
           return null;
        }
    }
}