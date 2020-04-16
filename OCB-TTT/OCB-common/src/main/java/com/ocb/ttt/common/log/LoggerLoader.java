/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.log;
import java.util.Date;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


/**
 *
 * @author MFE
 */
public class LoggerLoader {
    
    private static Logger  logger;
    public LoggerLoader(Class className) {
            logger = Logger.getLogger(className);
    }

    public  void info(Object mess) {
        logger.info(mess);
    }  
    
    public  void error(Object mess) {

        logger.error(mess);
    }
    public  void info(String mess) {

        logger.info(mess);
    }    
    public  void error(String mess) {
        logger.error(mess);
    }
    public  void debug(String mess)
    {
         logger.error(mess);
    }
    public void debug(Object mess)
    {
         logger.error(mess);
    }
    public void warn(Object mess)
    {
         logger.error(mess);
    }
    
    public static void main(String[] args) {
        Date date=new Date();
        date.getTime();
     //   System.out.println("com.ocb.ttt.common.log.LoggerLoader.main()"+date.getTime());
    }
       
}
