/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author toanhv1
 */
public class EncryptCard {
    
    public static void main(String[] args) {
        
        
        System.out.println("ocb.ttt.common.util.EncryptCard.main():"+EncryptCard.EncryptCard("540239826396424"));
    }
    
    public static String EncryptCard(String card)
    {        
        Pattern p = Pattern.compile("/^.{5}/");        
        if(card.length()<=8) return "NOT CARD";
        Matcher matcher = p.matcher(card);       
        System.out.println(matcher.group(0));    
        return card;
        
        
        
        
    }
    
}
