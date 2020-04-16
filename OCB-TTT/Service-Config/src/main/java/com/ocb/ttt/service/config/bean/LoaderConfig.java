/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.config.bean;

import java.util.List;

/**
 *
 * @author toanhv1
 */
public class LoaderConfig {
    
    private String folder;    
    private List<String> listFile;

    public String getFolder() {
        return folder;
    }
    public void setFolder(String folder) {
        this.folder = folder;
    }

    public List<String> getListFile() {
        return listFile;
    }

    public void setListFile(List<String> listFile) {
        this.listFile = listFile;
    }
    
    
    
    
}
