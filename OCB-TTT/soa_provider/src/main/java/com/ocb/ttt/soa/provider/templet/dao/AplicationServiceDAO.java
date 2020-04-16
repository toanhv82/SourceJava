/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.dao;

import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author toanhv1
 */
@Repository
public class AplicationServiceDAO {
    
    
    @Autowired
    JdbcTemplate jdbc;    
    
    @ConfigParamSQL(Value = "SELECT_GET_RRN")
    private String SQL_GETRRN="select substr(extract(year from sysdate),-1)  ||substr(to_char(sysdate,'MONTH'),1,3)   ||lpad(nab_sq_soa_rrn.nextval,6,'0') RRN from dual";
    
    public  String getRRN()
    {
        String rrn= jdbc.queryForObject(SQL_GETRRN, String.class);
        return rrn;
    }
    
}
