/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.roles.dao;

import com.ocb.ttt.db.util.DataRowMapper;
import com.ocb.ttt.roles.model.Permission;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author toanhv1
 */

@Repository
public class ServiceCmsPermissionDao {
    
    
    @Autowired
    JdbcTemplate jdbc;    
    @ConfigParamSQL(Value = "SELECT_GET_RRN")
    private String SQL_GETRRN="select substr(extract(year from sysdate),-1)  ||substr(to_char(sysdate,'MONTH'),1,3)   ||lpad(nab_sq_soa_rrn.nextval,6,'0') RRN from dual";    
    
    @ConfigParamSQL(Value = "SQL_GET_PERMISSION_BY_USER")
    private String SQL_GET_PERMISSION_BY_USER="select p.code from ocb_CMS_user_permission t join ocb_cms_permission p on t.ID_PERMISSION=p.id where UPPER(t.id_user)=UPPER(?)";
    
    
    public List<String> getListPermissionByUser(String user) {
       
            //DataRowMapper dataRowMapper=new DataRowMapper(Integer.class);            
            List<String> list=jdbc.queryForList(SQL_GET_PERMISSION_BY_USER,String.class,new Object[]{user});            
            return list;            
        
    }
    
}
