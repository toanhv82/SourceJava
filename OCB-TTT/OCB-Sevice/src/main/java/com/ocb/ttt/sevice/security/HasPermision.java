/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.security;

import com.ocb.ttt.common.log.LoggerLoader;
import javax.servlet.http.HttpServletRequest;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 *
 * @author Win 10
 */
@Aspect
public class HasPermision {
    private static LoggerLoader logger = new LoggerLoader(HasPermision.class); 
    
    
    @Around("@annotation(ocb.ttt.common.anotion.PermissionApi)")   
    public Object logBefore(ProceedingJoinPoint proceedingJoinPoint) {
        try
        {
            Object joinPoint = proceedingJoinPoint.proceed();              
            return joinPoint;
        }catch(Throwable e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        HashMap<String, String> p = new HashMap<String, String>();
        p.put("status", "Accept denied");
        return p;
		
    }
    
    private Map<String, String> getHeadersInfo(HttpServletRequest request) {

        Map<String, String> map = new HashMap<String, String>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
}
