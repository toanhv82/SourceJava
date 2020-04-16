/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.controler;


import com.ocb.ttt.service.def.Container;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.sevice.dao.CheckAuthorization;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author toanhv1
 */
public class MainControler {
    
    @Autowired
    CheckAuthorization authorization;
    
    private static Logger logger = Logger.getLogger(MainControler.class);
    
    protected Map<String, String> getHeadersInfo(HttpServletRequest request) {

        String ip = request.getRemoteAddr();
        logger.info("Request from IP:"+ip);
        Map<String, String> map = new HashMap<String, String>();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            map.put(key, value);
        }

        return map;
    }
    
    protected void loggerRequest(RequestForm data)
    {
       logger.info("Reuqest ID:"+data.getRequestID());
       logger.info("Reuqest Time:"+data.getRequestDateTime());
       logger.info("Reuqest Function:"+data.getFunction());
        
    }
    /**
     * 
     * @param request
     * @param role customer role
     * @return 
     */
    protected boolean login(HttpServletRequest request,int role )
    {
        Map<String,String> map=new HashMap<>();
        map=this.getHeadersInfo(request);
        String user=map.get(Container.user_login_api);
        String pw=map.get(Container.pw_login_api);        
        boolean isLogin=authorization.checkAuthorization(user, pw, role);
        logger.info("LOGIN:"+user+"Role:"+role+" STatus:"+isLogin);
        return isLogin;
    }
   
}
