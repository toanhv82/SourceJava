/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import com.ocb.ttt.cms.def.Def;
import com.ocb.ttt.cms.model.request.CardProcess;
import com.ocb.ttt.cms.repository.ServiceFile;
import com.ocb.ttt.cms.repository.ServiceUsersDAO;
import com.ocb.ttt.cms.service.ServiceUsers;
import com.ocb.ttt.common.log.LoggerLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.obj.model.User;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author Win 10
 */
@Service
public class ServiceUsersImpl implements ServiceUsers {

    
    static String view_teller = "TTT_11";
    static String view_approve = "TTT_12";
    static String view_insert_dummy = "TTT_13";
    static String view_update_policy = "TTT_14";
    static String view_active_card = "TTT_15";
    static String view_return_card = "TTT_16";
    static String view_close_card = "TTT_17";
    static String view_close_account = "TTT_18";
    static String view_close_account_number = "TTT_19";
    @Autowired
    ServiceUsersDAO serviceUserDAO;
    @Autowired
    ServiceFile serviceFile;
    
    private static LoggerLoader logger =new LoggerLoader(ServiceUsersImpl.class);

    @Override
    public List<User> getAll() {
        return serviceUserDAO.getALLUser(null, null);
    }

    public List<String> getPriveled(String user) {
        return serviceUserDAO.getPriveled(user);
    }

    @Override
    public String getFncCloseCard(String user, String pw) {

        List<String> listP = serviceUserDAO.getPriveled(user);
        if (listP.indexOf(view_approve) >= 0) {
            return Def.FNC_APPROVE;
        }
        if (listP.indexOf(view_teller) >= 0) {
            return Def.FNC_TELLER;
        }       
        return Def.FNC_HOME;
//        return Def.FNC_APPROVE;
    }
    
    @Override
    public List<String> getListRoles(String user, String pw) {

        List<String> listP = serviceUserDAO.getPriveled(user);
//        List<String> roles = new ArrayList<>();
//        if (listP.indexOf(view_approve) >= 0) {
//            roles.add(Def.FNC_APPROVE);
//        }
//        if (listP.indexOf(view_teller) >= 0) {
//            roles.add(Def.FNC_TELLER);
//        } 
//        if (listP.indexOf(view_insert_dummy) >= 0) {
//            roles.add(Def.FNC_INSERT_CARD_DUMMY);
//        }
//        if (listP.indexOf(view_update_policy) >= 0) {
//            roles.add(Def.FNC_UPDATE_POLICY);
//        }
        return listP;
//        return Def.FNC_APPROVE;
    }

   
}
