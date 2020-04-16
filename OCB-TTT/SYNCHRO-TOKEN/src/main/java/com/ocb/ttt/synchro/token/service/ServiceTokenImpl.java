/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.synchro.token.service;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.common.util.UtilsCard;
import com.ocb.ttt.db.connection.OCBDriverManagerDataSource;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.db.serive.JdbcQuerySql;
import com.ocb.ttt.db.util.DataRowMapper;
import com.ocb.ttt.synchro.token.model.OcbToken;
import java.util.HashMap;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.common.hash.SHAHashing;
import ocb.ttt.obj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceTokenImpl implements ServiceToken{

    private static LoggerLoader logger = new LoggerLoader(ServiceTokenImpl.class);
   // @Autowired
    private JdbcTemplate jdbc;
    @Autowired
    private OCBDriverManagerDataSource dataSource;
    
    @ConfigParamSQL(Value = "CHECK_CONTRACT_TO_TOKEN")
    private String CHECK_CONTRACT_TO_TOKEN;    
    @ConfigParamSQL(Value = "GET_ALL_PAN_IS_NON_TOKEN")
    private String GET_ALL_PAN_IS_NON_TOKEN;
    @ConfigParamSQL(Value = "UPDATE_TOKEN_BY_PAN")
    private String UPDATE_TOKEN_BY_PAN;
    @ConfigParamSQL(Value = "SQL_SOURCE_APPLICATION_NO")
    private String SQL_GETRRN;  
    @Override
    public String getTokenFromCard(String pan) {
       
       return SHAHashing.bytesToHex(pan);
        
    }
    public String getSSOURCE_APPLICATION_NO()
    {
         if(jdbc==null)jdbc=getJdbcTemplate();
        String rrn= jdbc.queryForObject(SQL_GETRRN, String.class);
        return rrn;
    }
    @Override
    public int updateToken(String pan, String token) {        
        try
        {
        if(jdbc==null)jdbc=getJdbcTemplate();
        CallStoredProcedure<Integer> call=new CallStoredProcedure<>(jdbc);        
        HashMap<String,Object> map=new HashMap<>();
        map.put("v_PAN", pan);
        map.put("v_TOKEN_ID", token);
        logger.info("BEGIN ->"+UtilsCard.maskCCNumber(pan));
        int r = call.CallFunction(UPDATE_TOKEN_BY_PAN,"OCBAPI",map);
        logger.info("UPDATE TOKEN TO DB:"+token);
        return r;
        }catch(Exception e)
        {
            logger.error(e);
        }
       return 0;
    }

    @Override
    public List<OcbToken> getListPan() {
        
        if(jdbc==null)jdbc=getJdbcTemplate();
        DataRowMapper dataRowMapper=new DataRowMapper(OcbToken.class);      
       
        List<OcbToken> pans=jdbc.query(GET_ALL_PAN_IS_NON_TOKEN,dataRowMapper);        
        return pans;
    }
    private JdbcTemplate getJdbcTemplate()
    {
       return  new JdbcTemplate(dataSource);
    }
    @Override
    public int syschroCard2Token() {
        
        CallStoredProcedure<Integer> call=new CallStoredProcedure<>(dataSource);        
        HashMap<String,Object> map=new HashMap<>();
        int r = call.CallFunctionDatasource(CHECK_CONTRACT_TO_TOKEN,"OCBAPI",map);
        if(r>0)logger.info("END Processing syn tocket DB:"+ r);
        return r;
    }

    
}
