/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author toanhv1
 */
public class FormatDate {
    
    public static  String covertToTime(String dateInString)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));            
            return formatter.format(date);

        } catch (ParseException e) {
            //e.printStackTrace();
        }
        
        return dateInString;
    }
    
}
