/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.roles.service.impl;

import com.ocb.ttt.db.util.DataRowMapper;
import com.ocb.ttt.roles.dao.ServiceCmsPermissionDao;
import com.ocb.ttt.roles.model.Permission;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.obj.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.ocb.ttt.roles.service.ServiceCmsPermission;

/**
 *
 * @author toanhv1
 */

@Service
public class ServiceCmsPermissionImpl implements ServiceCmsPermission{

    private static Logger logger = Logger.getLogger(ServiceCmsPermissionImpl.class);
    
    @Autowired
    ServiceCmsPermissionDao permissionDao; 
    
    @Override
    public List<String> getListPermissionByUser(String user) {
       
           return     permissionDao.getListPermissionByUser(user);
        
    }
    
}
