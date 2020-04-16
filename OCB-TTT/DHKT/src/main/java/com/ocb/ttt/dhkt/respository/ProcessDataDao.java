/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.respository;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.db.serive.JdbcQuerySql;
import com.ocb.ttt.dhkt.model.CardInfo;
import com.ocb.ttt.dhkt.model.Student_TMP;
import com.ocb.ttt.dhkt.model.Student_Temp;
import java.util.ArrayList;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ProcessDataDao {
    
    @Autowired
    JdbcTemplate jdbc;    
    private  LoggerLoader logger = new LoggerLoader(ImportFileDao.class);
    @ConfigParamSQL(Value = "UPDATE_INFO_CLIENT_NAB_CARD")
    private String UPDATE_INFO_CLIENT_NAB_CARD;  
    @ConfigParamSQL(Value = "INSERT_CLIENT_TMP")
    private String INSERT_CLIENT_TMP;  
    @ConfigParamSQL(Value = "GET_INFO_CLIENT_NAB_CARD")
    private String GET_INFO_CLIENT_NAB_CARD;  
    @ConfigParamSQL(Value = "GET_INFO_CLIENT_NAB_CARD_BY_BATCH")
    private String GET_INFO_CLIENT_NAB_CARD_BY_BATCH;
    @ConfigParamSQL(Value = "UPDATE_CARD_NUMBER")
    private String UPDATE_CARD_NUMBER;
    @ConfigParamSQL(Value = "COUNT_ALL")
    private String COUNT_ALL;
    @ConfigParamSQL(Value = "SELECT_OLD_CARD_NUMBER")
    private String SELECT_OLD_CARD_NUMBER;
    @ConfigParamSQL(Value = "UPDATE_CARD_BY_IDMIFE_AND_CLIENT_CODE")
    private String UPDATE_CARD_BY_IDMIFE_AND_CLIENT_CODE;
    @ConfigParamSQL(Value = "UEH_INQUERY_CARD_BY_IDMIFE")
    private String UEH_INQUERY_CARD_BY_IDMIFE;
    
    public int addSvTmp(Student_TMP item)
    {
        
       // NamedParameterJdbcTemplate jdbcTemplate=new NamedParameterJdbcTemplate(jdbc.getDataSource());
        
        /*CLIENT_CODE,	
            BASIC_CARD_NUMBER,	
            TITLE,	
            EMBOSSED_NAME,
            GENDER,	
            LEGAL_ID,	
            BIRTH_DATE,	
            ACCOUNT1,	
            USER_DEFINED_FIELD1,	
            PHONE_HOME,	
            PHONE_NBR_SMS,		
            AUTHORIZE
        */
        
        String [] ar=item.getBIRTH_DATE().trim().split("/");
        
              
        Object [] obj=new Object[]{
            item.getEMPLOYER(),
            item.getFULL_NAME(),
            item.getBIRTH_DATE(),  
            item.getBIRTH_CITY(),
            item.getGENDER(),
            item.getCLASS(),
            item.getCOURSE(),
            item.getCLASS_YEAR(),
            item.getIDMifare(),
            item.getHEX_CODE(),
            item.getLEGAL_ID(),
            item.getADDRESS1(),
            item.getCLIENT_CODE(),
            item.getACCOUNT1(),
            item.getMOBILE_PHONE(),
            item.getTITLE(),
            item.getBTACH_ID(),
            "N"        
        };         
        int rs= jdbc.update(INSERT_CLIENT_TMP, obj);      
       
        return rs;
    }
    
    public int updateCardNumberById(Student_TMP item)
    {
        int rs =0;
        try {
            Object [] obj=new Object[]{
            item.getCARD_NUMBER(),
            item.getBASIC_CARD_NUMBER(),
            item.getHEX_CODE()
        };         
        rs= jdbc.update(UPDATE_CARD_NUMBER, obj); 
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
        return rs;
    }
    
    public String getClientOldNumber(String cardNumber)
    {
        String tes ="";
        try {
            Object [] obj=new Object[]{
            cardNumber
        };  
          List<Student_Temp> list = JdbcQuerySql.query(jdbc,SELECT_OLD_CARD_NUMBER,Student_Temp.class, obj);
          if(list.size()==1)
          {
              tes = list.get(0).getCLIENT_NUMBER();
          }else
          {
              return "";
          }
        } catch (Exception e) {       
            e.printStackTrace();
            logger.error(e);
        }    
        return tes;
    }
    
    public List<Student_TMP> getListCardNumber(){
        String cn ="";
        List<Student_TMP> list = JdbcQuerySql.query(jdbc,SELECT_OLD_CARD_NUMBER,Student_TMP.class,new Object[]{cn});
        
        
        return list;
    }
    
    public List<Student_TMP> getAll(String batch)
    {       
        List<Student_TMP> list= new ArrayList<Student_TMP>();
        list= JdbcQuerySql.query(jdbc,GET_INFO_CLIENT_NAB_CARD_BY_BATCH, Student_TMP.class,new Object[]{batch});        
        return list;
    }
    
    
    public List<Student_TMP> getAll()
    {       
        List<Student_TMP> list= new ArrayList<Student_TMP>();
        list= JdbcQuerySql.query(jdbc,GET_INFO_CLIENT_NAB_CARD, Student_TMP.class,new Object[]{});        
        return list;
    }
    public int updateCardNumber(String cardNumber,String oldCardNumber, String clientCode,String idMife)
    {     
      return jdbc.update(UPDATE_CARD_BY_IDMIFE_AND_CLIENT_CODE, new Object[]{cardNumber,oldCardNumber,clientCode,idMife});
    }
    public  List<CardInfo> getCardInfo(String id)
    {
        try
        {
        CallStoredProcedure<CardInfo> callStoredProcedure =new CallStoredProcedure(jdbc,CardInfo.class);
        List<Object> param = new ArrayList<>();
        param.add(id);
        List<CardInfo> list = callStoredProcedure.query(UEH_INQUERY_CARD_BY_IDMIFE, param, 2);
        return list;
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }        
        return null ;
    }
    public int getCountAll(){
        int i = 0;
        i = jdbc.queryForInt(COUNT_ALL);
        return i;
    }
    
    
}

