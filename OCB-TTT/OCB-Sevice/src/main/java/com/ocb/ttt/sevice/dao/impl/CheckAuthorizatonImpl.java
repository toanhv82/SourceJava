/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.dao.impl;


import com.ocb.ttt.sevice.dao.CheckAuthorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Win 10
 */
@Service
public class CheckAuthorizatonImpl implements  CheckAuthorization{

    @Autowired
    ServiceLoginAPI serviceUsersDAO;
    @Override
    public boolean checkAuthorization(String user, String pw,int apiId) {               
        return serviceUsersDAO.getLogin(user, pw, apiId);        
    }
    
}
