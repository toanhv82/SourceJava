/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.repository;

import com.ocb.ttt.cms.model.CardPolicy;
import com.ocb.ttt.cms.model.Policy;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.model.CardInfo;
import com.ocb.ttt.model.Classifier;
import com.ocb.ttt.service.model.RequestForm;
import java.util.ArrayList;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class ServiceCardCmsDao {
    
    private static LoggerLoader logger = new LoggerLoader(ServiceCardCmsDao.class);
    
    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "SQL_GET_CUST_INFO_BY_NUMBER")
    private String SQL_GET_CUST_INFO_BY_NUMBER;
    @ConfigParamSQL(Value = "SQL_GET_POLICY_INFO_BY_TYPE_CODE")
    private String SQL_GET_POLICY_INFO_BY_TYPE_CODE;
    @ConfigParamSQL(Value = "SQL_GET_MCS_CLASSIFIER_BY_MCS")
    private String SQL_GET_MCS_CLASSIFIER_BY_MCS;
    
    
    public  List<CardPolicy> getCardPolicy(String accountNum)
    {
        logger.info(accountNum);
        try
        {
            CallStoredProcedure<CardPolicy> callStoredProcedure =new CallStoredProcedure(jdbc,CardPolicy.class);
            List<Object> param = new ArrayList<>();
            param.add(accountNum);
            List<CardPolicy> list= callStoredProcedure.query(SQL_GET_CUST_INFO_BY_NUMBER, param, 2);
            return list;
        }catch(Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }     
        
       List<CardPolicy> list=  new ArrayList<CardPolicy>();       
       return list;
       
    }
    public List<Policy> getPolicys(String code)
    {
         logger.info(code);
        try
        {
            CallStoredProcedure<Policy> callStoredProcedure =new CallStoredProcedure(jdbc,Policy.class);
            List<Object> param = new ArrayList<>();
            param.add(code);
            List<Policy> list= callStoredProcedure.query(SQL_GET_POLICY_INFO_BY_TYPE_CODE, param, 2);
            return list;
        }catch(Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        List<Policy> list=  new ArrayList<Policy>();       
        return list;
    }
    public List<Classifier> getClassifierByMCS(String code)
    {
        try
        {
            CallStoredProcedure<Classifier> callStoredProcedure =new CallStoredProcedure(jdbc,Classifier.class);
            List<Object> param = new ArrayList<>();
            param.add(code);
            List<Classifier> list= callStoredProcedure.query(SQL_GET_MCS_CLASSIFIER_BY_MCS, param, 2);
            return list;
        }catch(Exception e)
        {
            logger.error(e);
            e.printStackTrace();
        }
        List<Classifier> list=  new ArrayList<Classifier>();       
        return list;
    }
    public  void updateClassifier2Way4(String contractNumber, Classifier classifier)
    {
        
        RequestForm requestForm=new RequestForm();
        
    }
    
}
