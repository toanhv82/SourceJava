/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.controler;

import com.ocb.ttt.cms.def.Def;
import com.ocb.ttt.cms.def.DefMessage;
import com.ocb.ttt.cms.def.DefPermision;
import com.ocb.ttt.cms.model.CardPolicy;
import com.ocb.ttt.cms.model.Policy;
import com.ocb.ttt.cms.model.request.CardProcess;
import com.ocb.ttt.cms.model.request.FormLogin;
import com.ocb.ttt.cms.model.request.StatusLDap;
import com.ocb.ttt.cms.repository.ServiceCardCmsDao;
import com.ocb.ttt.cms.service.ServiceClassifier;
import com.ocb.ttt.cms.service.ServiceUploadFile;
import com.ocb.ttt.cms.service.ServiceUsers;
import com.ocb.ttt.cms.service.impl.UploadTask;
import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.login.model.UserLogin;
import com.ocb.ttt.model.AccountCardInfo;
import com.ocb.ttt.model.FullNabCPCard;
import com.ocb.ttt.model.ChinhSach;
import com.ocb.ttt.model.LoginInfo;
import com.ocb.ttt.roles.model.Permission;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.sevice.login.LoginCookieUtil;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.anotion.KeyValue;
import ocb.ttt.common.anotion.PermissionLogin;
import ocb.ttt.common.convert.JsonPharse;
import ocb.ttt.common.hash.SHAHashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.ocb.ttt.roles.service.ServiceCmsPermission;

/**
 *
 * @author Win 10
 */
@Controller
public class MainControler {

    private static LoggerLoader logger = new LoggerLoader(MainControler.class);

    @KeyValue(Value = "loginkey")
    private String key_login;

    @ConfigValue(Value = "URL_LDAP")
    private String URL_LDAP = "";

    @Autowired
    ServiceUploadFile serviceUploadFile;

    @Autowired
    private ServiceUsers serviceUsers;

//    @Autowired
//    private ServiceCmsPermission servicePermission;
    @Autowired
    private ServiceCardCmsDao serviceCardDao;
    
    @Autowired
    private TaskExecutor taskExecutor;
    @Autowired
    private ServiceClassifier  serviceClassifier;
    
    @ResponseBody
    @RequestMapping(value = "/addClientContract", method = RequestMethod.POST)
    public Map<String, Object> addClientContract(HttpServletResponse response, HttpServletRequest request, String batch_id) {
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root(ModelMap model, HttpServletRequest request) {
         return "redirect:login";
    }
    @PermissionLogin(value = 0)
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model, HttpServletRequest request) {

        
                
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {
                    model.addAttribute("USER", info.getUserName());
                    return "page/Upload_card";
                } else {
                    return "redirect:login";
                }

            }
        }
        return "redirect:login";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {

        return "login/index";

    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("token", "");
        HttpSession session = request.getSession();
        session.setAttribute("user", "none");
        response.addCookie(cookie);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        return "redirect:login";

    }

    @RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
    public String postLogin(HttpServletRequest request,ModelMap model, HttpServletResponse response) {

        String usr = request.getParameter("userName");
        String password = request.getParameter("password");
//        String fnc = serviceUsers.getFncCloseCard(usr, usr);
        List<String> roles = serviceUsers.getListRoles(usr, password);
//        int role = 0;
//        if (fnc.equals(Def.FNC_TELLER)) {
//            role = DefPermision.UPLOAD_CARD;
//        }else 
//        if (fnc.equals(Def.FNC_APPROVE)) {
//            role = DefPermision.APPROVE_CARD;
//        }else 
//        if (fnc.equals(Def.FNC_INSERT_CARD_DUMMY)) {
//            role = DefPermision.INSERT_CARD_DUMMY;
//        }else 
//        if (fnc.equals(Def.FNC_UPDATE_POLICY)) {
//            role = DefPermision.UPDATE_POLICY;
//        }
        String login = processRequest(usr, password, roles);
        if (login.isEmpty()) {
            return "redirect:login";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", usr);
        model.addAttribute("USER", usr);
        
        Cookie cookie = new Cookie("token", login);
        response.addCookie(cookie);
        cookie.setHttpOnly(true);
        cookie.setPath("/");

        return "redirect:home";
    }   
    
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String menu(HttpServletRequest request, ModelMap model, HttpServletResponse response) {
        
        Cookie[] cookies = request.getCookies();    
        if(cookies==null) return "redirect:login";
         for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                
                 LoginInfo info = checkLogin(item.getValue());  
                 
                  if (info != null) {
                       model.addAttribute("permission", info.getRoles());
//                     List<String> list = servicePermission.getListPermissionByUser(info.getUserName());
//                     model.addAttribute("permission",list); 
                  } 
                
            }
         }             
        
        return "login/menu";        
        
    }    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(HttpServletRequest request, ModelMap model, HttpServletResponse response) {
        
        Cookie[] cookies = request.getCookies();    
        if(cookies==null) return "redirect:login";
         for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                
                 LoginInfo info = checkLogin(item.getValue());  
                 
                  if (info != null) {
                      
                     // servicePermission.getListPermissionByUser(info.getUserId());
                      
                  } else {
                      
                    return "redirect:login";
                }
                
            }
         }        
                
        return "page/home";
    }

    @RequestMapping(value = "/processPath", method = RequestMethod.GET)
    public String processPath(HttpServletRequest request, ModelMap model, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {
                    if(info.getRoles().get(0)==DefPermision.UPLOAD_CARD){
                        return "redirect:Upload_card";
                    }else if (info.getRoles().get(0)==DefPermision.APPROVE_CARD){
                        return "redirect:Approve_close_card";
                    }else{
                        return "redirect:login";
                    }
                }
            }
        }
        return "redirect:login";
    }
    
    @PermissionLogin(value = DefPermision.UPLOAD_CARD)
    @RequestMapping(value = "/Upload_card", method = RequestMethod.GET)
    public String Upload_card(HttpServletRequest request, ModelMap model, HttpServletResponse response) {

        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {
                    HttpSession session = request.getSession();
                    if (session.getAttribute(Def.UPLOAD_STATUS) != null) {
                        boolean _isUpload = (boolean) session.getAttribute(Def.UPLOAD_STATUS);
                        if (_isUpload) {
                            return "page/success_upload_card";
                        }
                    }
                    session.setAttribute(Def.LOOK_UPLOAD_STATUS, false);
                    model.addAttribute("USER", info.getUserName());
                    return "page/Upload_card";
                } else {
                    return "redirect:login";
                }

            }
        }
        return "redirect:login";
    }
    @RequestMapping(value = "/success_upload_card", method = RequestMethod.GET)
    public String success_upload_card()
    {
         return "page/success_upload_card";
    }
    
    @RequestMapping(value = "/success_approve_card", method = RequestMethod.GET)
    public String success_approve_card()
    {
         return "page/success_approve_card";
    }
    
    @RequestMapping(value = "/success_reject_card", method = RequestMethod.GET)
    public String success_reject_card()
    {
         return "page/success_reject_card";
    }
    
    @PermissionLogin(value = DefPermision.UPLOAD_CARD)
    @RequestMapping(value = "/Upload_card", method = RequestMethod.POST)
    public String POST_Upload_card(ModelMap model, @RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) {

        if (!file.isEmpty()) {
            try {
                LoginInfo info = getLogin(request);
                if (info == null) {
                    return "redirect:login";
                }
                HttpSession session = request.getSession();
                if (session.getAttribute(Def.UPLOAD_STATUS) != null) {
                    boolean _is = (boolean) session.getAttribute(Def.UPLOAD_STATUS);
                    if (_is) {
                        return "redirect:success_upload_card";
                    }
                } else {
                    session.setAttribute(Def.UPLOAD_STATUS, true);
                }
                HashMap<String, Object> inf = serviceUploadFile.uploadFileExcel(file, info.getUserName(), session);

                // model.addAttribute("batch_id",inf.get(""));                
                session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
                return "redirect:success_upload_card";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "page/Upload_card";
    }

    @RequestMapping(value = "/Approve_close_card", method = RequestMethod.GET)
    public String Approve_close_card(HttpServletRequest request) {
        return "page/Approve_close_card";
    }
    
    @RequestMapping(value = "/Approve_close_card_ttt", method = RequestMethod.GET)
    public String Approve_close_card_ttt(HttpServletRequest request) {
        return "page/Approve_close_card_ttt";
    }
    
    @ResponseBody
    @RequestMapping(value = "/approve_report_close_card", method = RequestMethod.GET)
    public Object approve_report_close_card(String batchId, String status, String type, String fromDate, String toDate) {

        List<CardProcess> list = new ArrayList<>();
        list = serviceUploadFile.getReportApproveCard(batchId, status, type, fromDate, toDate);
        return list;
    }
    @ResponseBody
    @RequestMapping(value = "/get_approve_close_card", method = RequestMethod.GET)
    public Object get_approve_close_card(String type, String status, String batchId, 
            String fromDate, String toDate,HttpServletRequest request,ModelMap model) throws ParseException {

        Cookie[] cookies = request.getCookies();
        List<CardProcess> list = new ArrayList<>();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {   
                    HttpSession session = request.getSession();
                    if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                        boolean _isUpload = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                        if (_isUpload) {
                            return "page/success_approve_card";
                        }
                    }                
                    if (type == null) {
                        type = "";
                    }
                    if (status == null) {
                        status = "N";
                    }
                    if (batchId == null) {
                        batchId = "";
                    }  
                    if (fromDate == null) {
                        fromDate = "";
                    }
                    if (toDate == null) {
                        toDate = "";
                    }  
                    list = serviceUploadFile.getListApproveCard(batchId, status, type, fromDate, toDate);                   
                    session.setAttribute(Def.LOOK_UPLOAD_STATUS, false);

                } else {
                    return "redirect:login";
                }

            }
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/update_close_card", method = RequestMethod.POST)
    public String update_approve_close_card(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.processCard(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_active_card", method = RequestMethod.POST)
    public String update_active_card(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.update_active_card(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_return_card", method = RequestMethod.POST)
    public String update_return_card(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.update_return_card(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_card_close", method = RequestMethod.POST)
    public String update_card_close(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.update_card_close(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_account_close", method = RequestMethod.POST)
    public String update_account_close(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.update_account_close(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_account_number_close", method = RequestMethod.POST)
    public String update_account_number_close(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:/success_approve_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.update_account_number_close(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
    }
    
    @ResponseBody
    @RequestMapping(value = "/update_reject_status", method = RequestMethod.POST)
    public Object update_reject_status(@RequestBody List<CardProcess> list, HttpServletRequest request) {
        LoginInfo info = getLogin(request);
        if (info == null) {
            return "redirect:login";
        }
        try {
            HttpSession session = request.getSession();
            if (session.getAttribute(Def.PROCESS_CARD_STATUS) != null) {
                boolean _is = (boolean) session.getAttribute(Def.PROCESS_CARD_STATUS);
                if (_is) {
                    return "redirect:success_reject_card";
                }
            } else {
                session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            }
            serviceUploadFile.rejectCard(list, info.getUserName(), request);
            session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
//            return "redirect:success_approve_card";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "page/Approve_close_card";
//        int l = list.size();
//        serviceUploadFile.rejectCard(list, info.getUserName(), request);
//        return "OK";
    }

    @ResponseBody
    @RequestMapping(value = "/get_progress", method = RequestMethod.GET)
    public Object get_progress(HttpServletRequest request) {

        HttpSession session = request.getSession();
        Object result_1 = session.getAttribute("PROCESS_CARD_STATUS");
        Object result_2 = session.getAttribute("PROCESS_CARD_UPLOAD");
        Object result_3 = session.getAttribute(Def.PROGRESS_UPLOAD);
        Object result_4 = session.getAttribute(Def.UPLOAD_STATUS);
        Object result_5 = session.getAttribute(Def.PROGRESS_UPLOAD_TOTAL);
        Map<String, Object> map = new HashMap<>();
        if (result_1 != null) {
            map.put(Def.PROCESS_CARD_STATUS, result_1);
        }
        if (result_2 != null) {
            map.put(Def.PROCESS_CARD_UPLOAD, result_2);
        }
        if (result_3 != null) {
            map.put(Def.PROGRESS_UPLOAD, result_3);
        }
        if (result_4 != null) {
            map.put(Def.UPLOAD_STATUS, result_4);
        }
        if (result_5 != null) {
            map.put(Def.PROGRESS_UPLOAD_TOTAL, result_5);
        }
        return map;

    }
    
    @RequestMapping(value = "/Import_File_Card_Data", method = RequestMethod.GET)
    public String LoadPageUploadFile(HttpServletRequest request, ModelMap model, HttpServletResponse response) {
        
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {
                    HttpSession session = request.getSession();
                    if (session.getAttribute(Def.UPLOAD_STATUS) != null) {
                        boolean _isUpload = (boolean) session.getAttribute(Def.UPLOAD_STATUS);
                        if (_isUpload) {
                            return "page/success_upload_card";
                        }
                    }
                    session.setAttribute(Def.LOOK_UPLOAD_STATUS, false);
                    model.addAttribute("USER", info.getUserName());
                    return "page/Import_File_Card_Data";  
                } else {
                    return "redirect:login";
                }         
            }
        }
        return "redirect:login";    
    }
    
    @RequestMapping(value = "/Import_File_Card_Data", method = RequestMethod.POST)
    public String ImportFileCardData(ModelMap model, @RequestParam("file") MultipartFile file, 
            HttpServletRequest request, HttpServletResponse response) {     
        if (!file.isEmpty()) {
            try {
                LoginInfo info = getLogin(request);
                if (info == null) {
                    return "redirect:login";
                }
                HttpSession session = request.getSession();
                if (session.getAttribute(Def.UPLOAD_STATUS) != null) {
                    boolean _is = (boolean) session.getAttribute(Def.UPLOAD_STATUS);
                    if (_is) {
                        return "redirect:success_upload_card";
                    }
                } else {
                    session.setAttribute(Def.UPLOAD_STATUS, true);
                }
                HashMap<String, Object> inf = serviceUploadFile.uploadFileCardData(file,info.getUserName(),session);
                session.setAttribute(Def.LOOK_UPLOAD_STATUS, true);
                return "redirect:success_upload_card";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "page/Import_File_Card_Data";
    }

    @ResponseBody
    @RequestMapping(value = "/loginCMS", method = RequestMethod.GET)
    public Map<String, Object> login(HttpServletResponse response, HttpServletRequest request) {
        LoginInfo loginInfo = getLogin(request);

        Map<String, Object> map = new HashMap<>();
        if (loginInfo != null) {
            map.put("status", true);
            String token = LoginCookieUtil.encryptInfo(key_login, loginInfo);
            Cookie cookie = new Cookie("token", token);
            response.addCookie(cookie);
            cookie.setHttpOnly(true);
            cookie.setPath("/");
        } else {
            map.put("status", false);
        }
        return map;
    }

    /**
     * LOGIN LDAP
     *
     */
    private LoginInfo checkLogin(String token) {
        LoginInfo info = LoginCookieUtil.deCrypt(key_login, token);
        if (info == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(info.getExprire());
        c.add(Calendar.SECOND, Def.TIME_OUT);
        Date d1 = c.getTime();
        Date d2 = new Date();
        if (d1.after(d2)) {
            return info;
        }
        return null;

    }

    private String processRequest(String user, String pass, int role) {
        String passApi = "Ttt@123";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "api");
        header.put("pw", SHAHashing.bytesToHex(passApi.trim()));
        header.put("Content-Type", "application/json");
        try {

            RequestForm requestForm = new RequestForm();
            requestForm.setFunction("LDAP");
            UserLogin login = new UserLogin();
            login.setUser(user);
            login.setPassword(pass);
            String dataL = JsonPharse.ConvertToString1(login);

            requestForm.setData(dataL);
            String content = ConnectionAPI.postJsonObjectHttp(URL_LDAP.trim(), header, requestForm);

            StatusLDap status = JsonPharse.ConvertToObj(content, StatusLDap.class);
            if (status.getStatus() == 0) {
                LoginInfo info = new LoginInfo();
                List<Integer> roles = new ArrayList<Integer>();
                roles.add(role);
                info.setRoles(roles);
                info.setUserName(user);
                return LoginCookieUtil.encryptInfo(key_login, info);
            }
            return "";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

        private String processRequest(String user, String pass, List<String> roles) {
        String passApi = "Ttt@123";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "api");
        header.put("pw", SHAHashing.bytesToHex(passApi.trim()));
        header.put("Content-Type", "application/json");
        try {

            RequestForm requestForm = new RequestForm();
            requestForm.setFunction("LDAP");
            UserLogin login = new UserLogin();
            login.setUser(user);
            login.setPassword(pass);
            String dataL = JsonPharse.ConvertToString1(login);

            requestForm.setData(dataL);
            String content = ConnectionAPI.postJsonObjectHttp(URL_LDAP.trim(), header, requestForm);

            StatusLDap status = JsonPharse.ConvertToObj(content, StatusLDap.class);
            if (status.getStatus() == 0) {
                LoginInfo info = new LoginInfo();
                List<Integer> roleInts = new ArrayList<Integer>();
                roleInts = convertRoleToInt(roles);
                info.setRoles(roleInts);
                info.setUserName(user);
                return LoginCookieUtil.encryptInfo(key_login, info);
            }
            return "";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
        
    private List<Integer> convertRoleToInt (List<String> list){
        List<Integer> roles = new ArrayList<>();
        for (String rl : list){
            switch (rl) {
                case "TTT_11":
                    roles.add(DefPermision.UPLOAD_CARD);
                    break;
                case "TTT_12":
                    roles.add(DefPermision.APPROVE_CARD);
                    break;
                case "TTT_13":
                    roles.add(DefPermision.INSERT_CARD_DUMMY);
                    break;
                case "TTT_14":
                    roles.add(DefPermision.UPDATE_POLICY);
                    break;
                case "TTT_15":
                    roles.add(DefPermision.ACTIVE_CARD);
                    break;
                case "TTT_16":
                    roles.add(DefPermision.RETURN_CARD);
                    break;
                case "TTT_17":
                    roles.add(DefPermision.CLOSE_CARD);
                    break;
                case "TTT_18":
                    roles.add(DefPermision.CLOSE_ACCOUNT);
                    break;
                case "TTT_19":
                    roles.add(DefPermision.CLOSE_ACCOUNT_NUMBER);
                    break;
                case "TTT_20":
                    roles.add(DefPermision.APPROVE_CARD_TTT);
                    break;
                default:
            }
        }
        return roles;
    }
    
    private LoginInfo getLogin(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo loginInfo = checkLogin(item.getValue());

                return loginInfo;
            }
        }

        return null;

    }

    //#region PolicyCard
    
    @RequestMapping(value = "/policycard", method = RequestMethod.GET)
    public String PolicyCard(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie item : cookies) {
            if (item.getName().equals("token")) {
                LoginInfo info = checkLogin(item.getValue());
                if (info != null) {
//                    model.addAttribute("USER", info.getUserName());
                    return "page/Policy_Card";
                } else {
                    return "redirect:login";
                }
            }
        }
        return "redirect:login";
        
    }
    @ResponseBody
    @RequestMapping(value = "/searchcardinfo", method = RequestMethod.GET)
    public Object SearchCardInfo(String batch_id){
        List<FullNabCPCard> listCardInfo = serviceUploadFile.getNabCPCardInfo(batch_id);
        return listCardInfo;
    }
    @ResponseBody
    @RequestMapping(value = "/getCustInfo", method = RequestMethod.GET)
    public Object getCustInfo(String cardNumber){
                
       List<CardPolicy> listCardInfo = serviceCardDao.getCardPolicy(cardNumber);
        return listCardInfo;
    }
    
    @ResponseBody
    @RequestMapping(value="/getchinhsach", method = RequestMethod.GET)
    public Object GetChinhSach(String MachinhSach){
        List<Policy> listInfo = serviceCardDao.getPolicys(MachinhSach);
        return listInfo;
    }
    @ResponseBody
    @RequestMapping(value="/updatechinhsach", method = RequestMethod.POST)
    public Object UpdateChinhSach(@RequestBody CardPolicy obj){
                  
        serviceClassifier.updatePolicyClassifier(obj);       
        
       return 1;
        
    }
    //#endregion
}
