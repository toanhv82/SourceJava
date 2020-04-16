/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service;

import java.io.IOException;

/**
 *
 * @author toanhv1
 */
public interface ServiceImportExcelDHKT {
    
    public String importFile() throws IOException;
    public String updateFile() throws IOException;
    
}
