/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service;

import com.ocb.ttt.cms.model.request.CardProcess;
import java.io.InputStream;
import java.util.List;
import ocb.ttt.obj.model.User;

/**
 *
 * @author Win 10
 */
public interface ServiceUsers {
    List<User> getAll();   
    String getFncCloseCard(String user,String pw);
    List<String> getListRoles(String user, String pw);
   // List<String> saveFIleUploadXLS(InputStream file);
   // List<String> saveFIleUploadXLSX(InputStream file);
   // List<String> insertDBCardProcess(List<CardProcess> list);
    
       
    
    
}

