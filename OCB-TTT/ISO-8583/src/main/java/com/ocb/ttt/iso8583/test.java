/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.iso8583;

import java.util.Arrays;

/**
 *
 * @author toanhv1
 */
public class test {
    
    public static void main(String[] args) {
        
        
        
        int leng=244;
        String t=String.valueOf(leng);               
        for(int i=0;i<4-t.length();i++)
        {
            t="0"+t;
        }      
        byte[] b2=t.getBytes();        
        for(byte b:b2)
        {
            System.out.println("com.ocb.ttt.iso8583.test.main()"+b);
           
               
        }
        
        
    }
    
    
}
