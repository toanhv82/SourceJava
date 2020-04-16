/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.login.service;


/**
 *
 * @author toanhv1
 */

public interface LDAPAuthenService {
    public boolean loginLDAP(String userId, String password);
    
}
