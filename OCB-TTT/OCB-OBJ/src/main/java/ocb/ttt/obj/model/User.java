/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.obj.model;

import com.ocb.ttt.anotaion.Key;



/**
 *
 * @author Win 10
 */
public class User {
    
    @Key(Value = "USERID")
    private String userId;
    @Key(Value = "APPID")
    private String iD;
    @Key(Value = "PWD")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
