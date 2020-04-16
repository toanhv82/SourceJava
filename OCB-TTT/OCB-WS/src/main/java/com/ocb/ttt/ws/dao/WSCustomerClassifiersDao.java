/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.dao;

import com.ocb.ttt.ws.way4.model.CardBatch;
import com.ocb.ttt.ws.way4.model.CardFee;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import com.ocb.ttt.db.util.DataRowMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Win 10
 */
@Repository
public class WSCustomerClassifiersDao {
    
    private static Logger logger = Logger.getLogger(WSCustomerClassifiersDao.class);
    
    @Autowired
    JdbcTemplate jdbc;    
    @ConfigParamSQL(Value = "SELECT_GET_RRN")
    private String SQL_GETRRN="select substr(extract(year from sysdate),-1)  ||substr(to_char(sysdate,'MONTH'),1,3)   ||lpad(nab_sq_soa_rrn.nextval,6,'0') RRN from dual";    
    @ConfigParamSQL(Value = "SELECT_CARD_CHANGE_CLASSIFIER")
    private String GET_BATCH_NUMBER;
    @ConfigParamSQL(Value = "SELECT_CARD_FEE_TYPE")
    private String SELECT_CARD_FEE_TYPE;
    @ConfigParamSQL(Value = "UPDATE_PROCESS_CARD_BATCH")
    private String UPDATE_PROCESS_CARD_BATCH;
    @ConfigParamSQL(Value = "UPDATE_PROCESS_CARD_BATCH_1")
    private String UPDATE_PROCESS_CARD_BATCH_1;
    @ConfigParamSQL(Value = "SQL_SOURCE_APPLICATION_NO")
    private String SQL_SOURCE_APPLICATION_NO;    
    @ConfigParamSQL(Value = "SELECT_CARD_CHANGE_STATUS")
    private String SELECT_CARD_CHANGE_STATUS;
    
    public  String getRRN()
    {
        String rrn= jdbc.queryForObject(SQL_GETRRN, String.class);
        return rrn;
    }
    public  String getSOURCE_APPLICATION()
    {
        String rrn= jdbc.queryForObject(SQL_SOURCE_APPLICATION_NO, String.class);
        return rrn;
    }
     public  List<CardBatch>  getBatchUnauthorize(String batchNum,String type,String func)
    {        
        try
        {
            DataRowMapper dataRowMapper=new DataRowMapper(CardBatch.class);
            List<CardBatch> list=jdbc.query(SELECT_CARD_CHANGE_STATUS, new Object[] {batchNum,type,func},dataRowMapper);
            
            return list;
        }catch(Exception e)
        {
            logger.error(e);
        }
        return null;
    }
    public  List<CardBatch>  getBatchUnauthorize(String batchNum)
    {        
        try
        {
            DataRowMapper dataRowMapper=new DataRowMapper(CardBatch.class);
            List<CardBatch> list=jdbc.query(GET_BATCH_NUMBER, new Object[] {batchNum},dataRowMapper);
            return list;
        }catch(Exception e)
        {
            logger.error(e);
        }
        return null;
    }
    public String getClientName(String cardNum)
    {
      return null;
    }
    public  List<CardFee>  getCardFeeByNameType(String name,String type)
    {        
        DataRowMapper dataRowMapper=new DataRowMapper(CardFee.class);
        List<CardFee> list=jdbc.query(SELECT_CARD_FEE_TYPE, new Object[] {name,type},dataRowMapper);
        return list;
    }
    public boolean updateProcesscardBatch(String status,String cardNum,String batch_num)
    {
        int rs= jdbc.update(UPDATE_PROCESS_CARD_BATCH, new Object[]{status,cardNum,cardNum,batch_num});
        
        if(rs==0)
        {
            logger.info("Update fail:"+UPDATE_PROCESS_CARD_BATCH+"->param:"+new Object[]{status,cardNum,cardNum,batch_num});
        }
        
        return rs>0;
    }
    public boolean updateProcesscardBatch(String status,String cardNum,String batch_num,String type,String func)
    {
        int rs= jdbc.update(UPDATE_PROCESS_CARD_BATCH_1, new Object[]{status,cardNum,cardNum,batch_num,type,func});
        
        if(rs==0)
        {
            logger.error("Update fail:"+UPDATE_PROCESS_CARD_BATCH_1+"->param:"+new Object[]{status,cardNum,cardNum,batch_num,type,func});
        }else
        {
            logger.info("Update success:"+rs+"--" +UPDATE_PROCESS_CARD_BATCH_1+"->param:"+new Object[]{status,cardNum,cardNum,batch_num,type,func});
        }
        
        return rs>0;
    }
    
}
