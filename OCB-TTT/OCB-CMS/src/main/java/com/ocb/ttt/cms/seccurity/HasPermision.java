/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.seccurity;

import com.ocb.ttt.cms.def.Def;
import com.ocb.ttt.cms.def.DefMessage;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.model.LoginInfo;
import com.ocb.ttt.sevice.login.LoginCookieUtil;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.anotion.KeyValue;
import ocb.ttt.common.anotion.PermissionLogin;
import ocb.ttt.common.anotion.PermissionSOA;
import ocb.ttt.obj.def.StatusSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author Win 10
 */
@Aspect
public class HasPermision {

    private static LoggerLoader logger = new LoggerLoader(com.ocb.ttt.sevice.security.HasPermision.class);

    @KeyValue(Value = "loginkey")
    private String key_login;
    
    @Around("@annotation(ocb.ttt.common.anotion.PermissionLogin)")
    public Object checkSession(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = signature.getMethod();
        PermissionLogin myAnnotation = method.getAnnotation(PermissionLogin.class);
        int value = myAnnotation.value();
        
        
        try
        {
            Object joinPoint = proceedingJoinPoint.proceed();              
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
          //  HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();
            
            LoginInfo info=getLogin(request);            
            if(info.getStatus()==StatusSession.ALIVE)
            {         
                               
                
                if(checkPermission(info,value))
                {                    
                    return joinPoint;
                }else
                {
                    info.setStatus(StatusSession.DECLINE);
                }     
                
                
                
              
            }else
            {
                
                return "redirect:login";
            }
           
        }catch(Throwable e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        HashMap<String, String> p = new HashMap<String, String>();
        p.put("status", "Accept denied");
        return p;

    }
    public boolean checkPermission(LoginInfo loginInfo,int value)
    {
        List<Integer> list= loginInfo.getRoles();
        
        if(list.indexOf(value)>=0)
        {
            return true;
        }  
        
        return false;
    }
    private LoginInfo getLogin(HttpServletRequest request)
    {
        Cookie[] cookies=request.getCookies();         
         for(Cookie item:cookies)
         {
             if(item.getName().equals("token"))
             {
                 LoginInfo loginInfo=getInfoLogin(item.getValue());                 
                 if(checkExpire(loginInfo))
                 {
                    loginInfo.setStatus(StatusSession.ALIVE);
                 }else
                 {
                    request.setAttribute("message", DefMessage.SESSION_EXPRIRE);                
                    loginInfo.setStatus(StatusSession.TIME_OUT);
                 }
                  return loginInfo;
             }
         }
         
         return null;
        
    }
    private boolean  checkExpire(LoginInfo loginInfo)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(loginInfo.getExprire());
        c.add(Calendar.SECOND,Def.TIME_OUT); 
        Date d1=  c.getTime();                
        Date d2 = new Date();
        if(d1.after(d2))
        {
            return true;
        } 
        return false;
    }
    private LoginInfo getInfoLogin(String token)
    {
        LoginInfo info=LoginCookieUtil.deCrypt(key_login, token);           
        return info;
       
           
    }

}
