/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.model;

import java.util.Date;
import java.util.List;
import ocb.ttt.obj.def.StatusSession;

/**
 *
 * @author toanhv1
 */
public class LoginInfo {
    
    private String userName;
    private String userId;
    private Date  exprire;
    private List<Integer> roles;
    private String accessToken;   
    private String hash;
    private StatusSession status;

    public StatusSession getStatus() {
        return status;
    }

    public void setStatus(StatusSession status) {
        this.status = status;
    }
            
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getExprire() {
        return exprire;
    }

    public void setExprire(Date exprire) {
        this.exprire = exprire;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
    
    

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    
}
