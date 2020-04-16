/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.db.serive;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.util.DataRowMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author toanhv1
 */

public class JdbcQuerySql {
    
    private static LoggerLoader logger = new LoggerLoader(JdbcQuerySql.class);
    
    public  static   <T> List<T>  query(JdbcTemplate jdbc, String sql, Class<T> className,Object[] obj)
    { 
         List<T> list=new ArrayList<>();
        DataRowMapper dataRowMapper=new DataRowMapper(className);        
        try
        {           
            list=jdbc.query(sql,obj,dataRowMapper);            
            return list;
        }catch(Exception e)
        {
            logger.error(e);
        }     
        return list;
    }
    
    
}
