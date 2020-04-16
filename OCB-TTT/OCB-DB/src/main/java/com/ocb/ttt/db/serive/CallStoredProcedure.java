/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.db.serive;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.object.StoredProcedure;
import java.util.Map;
import com.ocb.ttt.db.util.DataRowMapper;
import java.math.BigDecimal;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author toanhv1
 */
public class CallStoredProcedure<T> extends StoredProcedure {
    
 private DataSource dataSource;
 private JdbcTemplate jdbcTemplate;
 //private SimpleJdbcCall simpleJdbcCall;
 private Class className;
 public CallStoredProcedure(JdbcTemplate jdbcTemplate)
 {
     this.jdbcTemplate=jdbcTemplate;
     dataSource= jdbcTemplate.getDataSource();    
 }
 public CallStoredProcedure(DataSource ds)
 {
     this.dataSource=ds;
 }
 public CallStoredProcedure(JdbcTemplate jdbcTemplate,Class<T> className)
 {
     this.jdbcTemplate=jdbcTemplate;
     dataSource= jdbcTemplate.getDataSource();
     this.className=className;
 }
 public  int CallFunction(String fncName,String packgeName,Map<String,Object> param)
 {
     jdbcTemplate.setResultsMapCaseInsensitive(true);
     SimpleJdbcCall call = new SimpleJdbcCall(dataSource)
              .withFunctionName(fncName).withCatalogName(packgeName);
     MapSqlParameterSource map = new MapSqlParameterSource();
     for ( String key : param.keySet() ) {
         
         map.addValue(key, param.get(key));            
     }     
     SqlParameterSource paramMap = map;  
     BigDecimal sum = call.executeFunction(BigDecimal.class, paramMap);
     return sum.intValue();
 } 
 public  int CallFunctionDatasource(String fncName,String packgeName,Map<String,Object> param)
 {
     jdbcTemplate.setResultsMapCaseInsensitive(true);
     SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate)
              .withFunctionName(fncName).withCatalogName(packgeName);
     MapSqlParameterSource map = new MapSqlParameterSource();
     for ( String key : param.keySet() ) {
         
         map.addValue(key, param.get(key));            
     }     
     SqlParameterSource paramMap = map;  
     BigDecimal sum = call.executeFunction(BigDecimal.class, paramMap);
     return sum.intValue();
 } 

 public List<T> query(String spName,String resultSetName,Map<String,Object> param)
 {         
     DataRowMapper<T> dataRowMapper=new DataRowMapper<>(className);     
     jdbcTemplate.setResultsMapCaseInsensitive(true);
     SimpleJdbcCall simpleJdbcCall= new SimpleJdbcCall(jdbcTemplate);      
     simpleJdbcCall.withProcedureName(spName).returningResultSet(resultSetName, dataRowMapper);
     SqlParameterSource paramaters = new MapSqlParameterSource().addValues(param);      
     
     Map out= simpleJdbcCall.execute(paramaters);     
     if (out == null) {
            return Collections.emptyList();
        } else {
            return (List) out.get(resultSetName);
        }        
         
     
 }
 /**
  * 
  * @param spName
  * @param param
  * @param out_pr
  * @return
  * @throws SQLException 
  */
 public  List<T> query(String spName,List<Object> param,int out_pr) throws SQLException
 {
     
    // Statement statement = dataSource.getConnection().createStatement();     
     CallableStatement statement = dataSource.getConnection().prepareCall(spName);          
    
     for(int i=0;i<param.size();i++)
     {
         if(param.get(i) instanceof Integer)
         {
             statement.setInt(i+1,Integer.valueOf(String.valueOf(param.get(i))));
         }else if(param.get(i) instanceof Double)
         {
             statement.setDouble(i+1,Double.valueOf(String.valueOf(param.get(i))));
         } else
         {
             statement.setString(i+1, String.valueOf(param.get(i)));
         }
                  
     }     
     //statement.setString(1, "");
     statement.registerOutParameter(out_pr, OracleTypes.CURSOR);
     statement.execute();
     
     ResultSet resultSet = (ResultSet) statement.getObject(out_pr);    
     
     DataRowMapper<T> dataRowMapper=new DataRowMapper<>(className);
     
     List<T> list=dataRowMapper.mapRowList(resultSet);     
     
     return list;
     
 }
    
}
