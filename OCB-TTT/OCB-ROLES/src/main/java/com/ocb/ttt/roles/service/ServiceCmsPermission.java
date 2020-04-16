/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.roles.service;

import com.ocb.ttt.roles.model.Permission;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public interface ServiceCmsPermission {
    
    List<String> getListPermissionByUser(String user); 
    
    
}
