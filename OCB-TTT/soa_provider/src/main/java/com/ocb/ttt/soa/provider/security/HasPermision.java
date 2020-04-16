/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.security;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.def.Container;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import ocb.ttt.common.anotion.PermissionSOA;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author Win 10
 */
@Aspect
@Component
public class HasPermision {

    private static LoggerLoader logger = new LoggerLoader(HasPermision.class); 
    @Autowired
    AuthenticationSOA authenticationSOA;
    @Around("@annotation(ocb.ttt.common.anotion.PermissionSOA)")
    public Object logBefore(ProceedingJoinPoint proceedingJoinPoint) {
        
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        PermissionSOA myAnnotation = method.getAnnotation(PermissionSOA.class);
        int value = myAnnotation.value();
        System.out.println("logBefore() is running!");
        System.out.println("Point Name : " + proceedingJoinPoint.getSignature().getName());
        System.out.println("arguments : " + Arrays.toString(proceedingJoinPoint.getArgs()));
        HttpServletRequest request
                = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        Map<String, String> patam = getHeadersInfo(request);
        boolean isLogin=    authenticationSOA.getLogin(patam.get(Container.user_login_api),patam.get(Container.pw_login_api),
                value);            
        System.out.println("isLogin:" + isLogin);         
        try {
            if(isLogin)
            {                        
                
                Object joinPoint = proceedingJoinPoint.proceed();              
                return joinPoint;
            }           
            
        } catch (Throwable e) {
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
