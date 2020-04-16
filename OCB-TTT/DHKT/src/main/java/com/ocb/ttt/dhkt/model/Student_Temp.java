/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.model;

import com.ocb.ttt.anotaion.Key;

/**
 *
 * @author hiepnp
 */
public class Student_Temp {
    @Key(Value = "CLIENT_NUMBER")
    private String CLIENT_NUMBER;
    
    public String getCLIENT_NUMBER() {
        return CLIENT_NUMBER;
    }

    public void setCLIENT_NUMBER(String CLIENT_NUMBER) {
        this.CLIENT_NUMBER = CLIENT_NUMBER;
    }
    
    
}
