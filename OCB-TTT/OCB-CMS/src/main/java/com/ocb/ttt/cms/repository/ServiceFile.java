/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.repository;


import com.ocb.ttt.cms.model.request.CardProcess;
import com.ocb.ttt.cms.model.request.DebitCard;
import com.ocb.ttt.cms.service.impl.ServiceUploadFileImpl;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.db.util.DataRowMapper;
import com.ocb.ttt.model.AccountCardInfo;
import com.ocb.ttt.model.FullNabCPCard;
import com.ocb.ttt.model.ChinhSach;
import com.ocb.ttt.model.CardInfo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceFile {

    private static LoggerLoader logger = new LoggerLoader(ServiceFile.class);

    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "INSERT_CARD_PROCESS")
    private String INSERT_CARD_PROCESS;
    @ConfigParamSQL(Value = "SQL_GET_ALL_CARD_BATCH")
    private String SQL_GET_ALL_CARD_BATCH;
    @ConfigParamSQL(Value = "SQL_UPDATE_CARD_BATCH_1")
    private String SQL_UPDATE_CARD_BATCH_1;
    @ConfigParamSQL(Value = "SQL_UPDATE_CARD_BATCH_2")
    private String SQL_UPDATE_CARD_BATCH_2;
    @ConfigParamSQL(Value = "SQL_GET_INFO_CARD_BY_CIF")
    private String SQL_GET_INFO_CARD_BY_CIF;
    @ConfigParamSQL(Value = "SQL_GET_INFO_ACCOUNT_BY_ID")
    private String SQL_GET_INFO_ACCOUNT_BY_ID = "SQL_GET_INFO_ACCOUNT_BY_ID";
    @ConfigParamSQL(Value = "GET_BATCH_ID_BY_TYPE")
    private String GET_BATCH_ID_BY_TYPE;
    @ConfigParamSQL(Value = "UEH_INSERT_CARD_DUMMY")
    private String UEH_INSERT_CARD_DUMMY;
    @ConfigParamSQL(Value = "GET_SOURCE_APPLICATION_NO")
    private String GET_SOURCE_APPLICATION_NO;
    @ConfigParamSQL(Value = "INSERT_SMS_REGISTER")
    private String INSERT_SMS_REGISTER;
    @ConfigParamSQL(Value = "SQL_GET_BY_BATCH")
    private String SQL_GET_BY_BATCH;
    @ConfigParamSQL(Value = "SQL_GET_ALL_CHINHSACH")
    private String SQL_GET_ALL_CHINHSACH;
    @ConfigParamSQL(Value = "SQL_UPDATE_CHINHSACH")
    private String SQL_UPDATE_CHINHSACH;
    
    
    public List<String> insertProcess(List<CardProcess> list) {
        List<String> error = new ArrayList<>();
        for (CardProcess item : list) {
            int rs = 0;
            try {
                Object[] obj = new Object[]{
                    item.getCif().isEmpty()?1:item.getCif(),
                    item.getCardNumber(),
                    item.getType(),
                    item.getFunction().toUpperCase(),
                    item.getReason(),
                    item.getBatchId(),
                    new Date(),
                    "N",
                    item.getUser()

                };
                rs = jdbc.update(INSERT_CARD_PROCESS, obj);

            } catch (Exception e) {
                e.printStackTrace();
                error.add(item.getCardNumber() + "--" + e.getMessage());
            }
        }
        return error;
    }
    public List<String> insertProcess(CardProcess item) {
        List<String> error = new ArrayList<>();
       
            int rs = 0;
            try {
                Object[] obj = new Object[]{
                    item.getCif().isEmpty()?1:item.getCif(),
                    item.getCardNumber(),
                    item.getType(),
                    item.getFunction().toUpperCase(),
                    item.getReason(),
                    item.getBatchId(),
                    new Date(),
                    "N",
                    item.getUser()
                };
                rs = jdbc.update(INSERT_CARD_PROCESS, obj);

            } catch (Exception e) {
                e.printStackTrace();
                error.add(item.getCardNumber() + "--" + e.getMessage());
            }        
        return error;
    }
    public  CardInfo getCardInfoByCif(String cif,String cardNumber)
    {
        try
        {
            CallStoredProcedure<CardInfo> callStoredProcedure =new CallStoredProcedure(jdbc,CardInfo.class);
            List<Object> param = new ArrayList<>();
            param.add(cif);
            param.add(cardNumber);
            List<CardInfo> list = callStoredProcedure.query(SQL_GET_INFO_CARD_BY_CIF, param, 3);
            return list.size()==0? new CardInfo():list.get(0);
            
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return null;
    }   
    public AccountCardInfo getAccountCardInfo(String account_num)
    {
        try
        {
            CallStoredProcedure<AccountCardInfo> callStoredProcedure =new CallStoredProcedure(jdbc,AccountCardInfo.class);
            List<Object> param = new ArrayList<>();
            param.add(account_num);
            List<AccountCardInfo> list = callStoredProcedure.query(SQL_GET_INFO_ACCOUNT_BY_ID, param, 2);
            return list.size()==0? new AccountCardInfo():list.get(0);
            
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return null;
    }
    
    public List<FullNabCPCard> getNabCPCardInfo(String batch_id)
    {
        try
        {
            CallStoredProcedure<FullNabCPCard> callStoredProcedure =new CallStoredProcedure(jdbc,FullNabCPCard.class);
            List<Object> param = new ArrayList<>();
            param.add(batch_id);
            List<FullNabCPCard> list = callStoredProcedure.query(SQL_GET_BY_BATCH, param, 2);
            return list.size()==0 ? null : list;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return null;
    }
    
    public List<ChinhSach> getListChinhSach(String MachinhSach)
    {
        try
        {
            CallStoredProcedure<ChinhSach> callStoredProcedure =new CallStoredProcedure(jdbc,ChinhSach.class);
            List<Object> param = new ArrayList<>();
            param.add(MachinhSach);
            List<ChinhSach> list = callStoredProcedure.query(SQL_GET_ALL_CHINHSACH, param, 2);
            return list.size()==0 ? null : list;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return null;
    }
    
    public List<FullNabCPCard> UpdateNabCPCardChinhSach(String batch_id, String Machinhsach, String contractNumber, String ContractName)
    {
        try
        {
            CallStoredProcedure<FullNabCPCard> callStoredProcedure =new CallStoredProcedure(jdbc,FullNabCPCard.class);
            List<Object> param = new ArrayList<>();
            param.add(batch_id);
            param.add(Machinhsach);
            List<FullNabCPCard> list = callStoredProcedure.query(SQL_UPDATE_CHINHSACH, param, 3);
            return list.size()==0 ? null : list;
            
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return null;
    }

    public List<CardProcess> getListApproveCard(String batchId, String status, String type, String fromDate, String toDate) {
        try {
            CallStoredProcedure<CardProcess> callStoredProcedure = new CallStoredProcedure<>(jdbc, CardProcess.class);
            List<Object> param = new ArrayList<>();
            param.add(batchId);
            param.add(status);
            param.add(type);
            param.add(fromDate);
            param.add(toDate);
            List<CardProcess> list = callStoredProcedure.query(SQL_GET_ALL_CARD_BATCH, param, 6);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
    public List<CardProcess> getReportApproveCard(String batchId, String status, String type, String fromDate, String toDate) {
         try {
            CallStoredProcedure<CardProcess> callStoredProcedure = new CallStoredProcedure<>(jdbc, CardProcess.class);
            List<Object> param = new ArrayList<>();
            param.add(batchId);
            param.add(status);
            param.add(type);
            param.add(fromDate);
            param.add(toDate);

            List<CardProcess> list = callStoredProcedure.query(SQL_GET_ALL_CARD_BATCH, param, 6);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
    public int updateStatusBatch(CardProcess item, String status) {

        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(jdbc.getDataSource());
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("v_status", status);
        paramMap.put("v_user", item.getUserAuthorize());
        paramMap.put("v_cif", item.getCif());
        paramMap.put("BATCH_ID", item.getBatchId());
        paramMap.put("card_num", item.getCardNumber());
        paramMap.put("result", item.getResult()==null?"Fail":item.getResult());
        int r=0;
        if(item.getType().equals("CARD"))
        {
          r= jdbcTemplate.update(SQL_UPDATE_CARD_BATCH_1, paramMap);
        }
        if(item.getType().equals("ACCOUNT"))
        {
          r= jdbcTemplate.update(SQL_UPDATE_CARD_BATCH_2, paramMap);
        }
        return r;
    }
    
    public List<String> insertCardPrepaid(DebitCard item) {
        List<String> error = new ArrayList<>();
//        for (DebitCard item : list) {
            int rs = 0;
            try {
                NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(jdbc.getDataSource());
                Map<String, Object> paramTemp = new HashMap();              
                paramTemp.put("BANK_CODE", item.getBank_code());
                paramTemp.put("BATCH_ID", item.getBatch_id());
                paramTemp.put("CLIENT_CODE", item.getCif());
                paramTemp.put("BRANCH_CODE", item.getBrand_code());
                paramTemp.put("VIP_FLAG", item.getVip());
                paramTemp.put("OWNER_CODE", item.getOwner_code());
                paramTemp.put("BASIC_CARD_FLAG", item.getBasic_card_flag());
                paramTemp.put("TITLE", item.getTitle());
                paramTemp.put("FAMILY_NAME", item.getFamily_name());
                paramTemp.put("FIRST_NAME", item.getFirst_name());
                paramTemp.put("EMBOSSED_NAME", item.getEmbssed_name());
                paramTemp.put("ENCODED_NAME", item.getEmcoded_name());
                paramTemp.put("MARITAL_STATUS", item.getMarital_status());
                paramTemp.put("GENDER", item.getGender());
                paramTemp.put("LEGAL_ID", item.getLegal_id());
                paramTemp.put("NATIONALITY_CODE", item.getNationality_code());
                paramTemp.put("CREDIT_LIMIT", item.getCredit_limit());               
                paramTemp.put("ISSUER_CLIENT", item.getIssuer_client());
                paramTemp.put("BIRTH_DATE", item.getBirth_date());
                paramTemp.put("BIRTH_CITY", item.getBirth_city());
                paramTemp.put("BIRTH_COUNTRY", item.getBirth_contr());
                paramTemp.put("CITY_CODE", item.getCity_code());
                paramTemp.put("COUNTRY_CODE", item.getCountry_code());
                paramTemp.put("MOBILE_PHONE", item.getMobile_phone());
                paramTemp.put("EMAIL_ID", item.getEmail());
                paramTemp.put("EMPL_COUNTRY_CODE", "704");
                paramTemp.put("EMPL_CITY_CODE", "HCM");
                paramTemp.put("START_VAL_DATE", item.getStart_val_date());
                paramTemp.put("PRODUCT_CODE", item.getProduction_code());
                paramTemp.put("ACCOUNT1", item.getAccount1());
                paramTemp.put("ACCOUNT1_CURRENCY", item.getAccount1_currency());
                paramTemp.put("ACCOUNT1_TYPE", item.getAccount1_type());
                paramTemp.put("STATUS_CODE", item.getStatus_code());
                paramTemp.put("STAFF_ID", item.getStaff_id());
                paramTemp.put("DELIVERY_FLAG", item.getDelivery_flag());
                paramTemp.put("MAILING_CITY_CODE", item.getMailing_city_code());
                paramTemp.put("MAILING_COUNTRY_CODE", item.getMailing_country_code());
                paramTemp.put("PHONE_MOBILE", item.getPhone_mobile());
                paramTemp.put("PHONE_NO_1", item.getPhone_mobile());
                paramTemp.put("PHONE_HOME", item.getPhone_mobile());
                paramTemp.put("PHOTO_INDICATOR", item.getPhoto_indicator());
                paramTemp.put("SOURCE_APPLICATION_NO", item.getSource_app_no());
                paramTemp.put("USER_CREATE", item.getUser_create());
                paramTemp.put("DATE_CREATE", new Date());
                paramTemp.put("USER_AUTHORIZE", item.getUser_authorize());
                paramTemp.put("DATE_AUTHORIZE", new Date());
                paramTemp.put("USER_BRANCH", item.getUser_branch());
                paramTemp.put("AUTHORIZE", item.getAuthorize());
                paramTemp.put("CONNECT_SCHOOL", item.getConnect_school());
                paramTemp.put("BRANCH_RECEIVE_CARD", item.getBrand_receive());
                paramTemp.put("SMS_FLAG", item.getSms_flag());
                paramTemp.put("PHONE_NBR_SMS", item.getPhone_nbr_sms());               
                paramTemp.put("CARD_TRAN_FEE_CLASS", item.getCard_tran_fee_class());
                paramTemp.put("CARD_YEARLY_FEE_CLASS", item.getCard_yearly_fee_class());
                paramTemp.put("SOURCE_APPLICATION_NO", item.getSource_app_no());
                paramTemp.put("EMPLOYMENT_STATUS", item.getEmployment_status());
                paramTemp.put("RESTRICTED", "N");
                paramTemp.put("ADDRESS1", item.getAddress1());
                paramTemp.put("MAILING_ADDRESS1", item.getMailing_address1());
                
              
                rs = jdbcTemplate.update(UEH_INSERT_CARD_DUMMY, paramTemp);

            } catch (Exception e) {
                e.printStackTrace();
                error.add(item.getCif()+ "--" + e.getMessage());
            }
//        }
        return error;
    }
    
    public String getBatchIdByType (String type){
        String batchId = "";
        List<String> listBatchs = jdbc.query(GET_BATCH_ID_BY_TYPE, new RowMapper<String>(){
                            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                                    return rs.getString(1);}},type);
        if (listBatchs!=null && listBatchs.size() == 1) {
            batchId = listBatchs.get(0);
        }
        return batchId;
    }
    
    public String getSourceAppNp (){
        String sourceNo = "";
        List<String> list = jdbc.query(GET_SOURCE_APPLICATION_NO, new RowMapper<String>(){
                            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                                    return rs.getString(1);}});
        if (list!=null && list.size() == 1) {
            sourceNo = list.get(0);
        }
        return sourceNo;
    }
    
    public boolean insertSmsRegister(DebitCard item) {
        int rs = 0;
        try {
            NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(jdbc.getDataSource());
            Map<String, Object> paramTemp = new HashMap();              
            paramTemp.put("ACCOUNT_NUMBER", "1");
            paramTemp.put("CARD_NUMBER", "1");
            paramTemp.put("DATE_CREATE", new Date());
            paramTemp.put("USER_CREATE", item.getUser_create());
            paramTemp.put("PHONE_NUMBER", item.getPhone_mobile());
            paramTemp.put("MAIN_SUB", "M");
            paramTemp.put("CARD_TYPE", "D");
            paramTemp.put("SOURCE_NO", item.getSource_app_no());
            paramTemp.put("PROCESSED", "N");

            rs = jdbcTemplate.update(INSERT_SMS_REGISTER, paramTemp);

        } catch (Exception e) {              
            e.printStackTrace();
            return false;
        }
        if (rs == 1) {
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
