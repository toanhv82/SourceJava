/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.dao;

/**
 *
 * @author Win 10
 */
public interface CheckAuthorization {
    
    boolean checkAuthorization(String user,String pw,int aipId);
    
}
