/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.dao;


import com.ocb.ttt.comb.model.CustomerCards;
import com.ocb.ttt.comb.model.DataCardInquiry;
import com.ocb.ttt.comb.model.DataCardLastTranx;
import com.ocb.ttt.common.log.LoggerLoader;
import java.util.ArrayList;
import java.util.List;
import ocb.ttt.common.anotion.ConfigParamSQL;
import ocb.ttt.common.hash.SHAHashing;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author Win 10
 */
@Component
public class ServiceUsersDAO {

    private static LoggerLoader logger = new LoggerLoader(ServiceUsersDAO.class);

    @Autowired
    JdbcTemplate jdbc;
    @ConfigParamSQL(Value = "CALL_LOGIN_API")
    private String SQL_LOGIN_API;
    @ConfigParamSQL(Value = "CALL_KHDC_INQUERY_CARD")
    private String CALL_KHDC_INQUERY_CARD;
    @ConfigParamSQL(Value = "CALL_KHDC_CARD_LAST_TRANX")
    private String CALL_KHDC_CARD_LAST_TRANX;
    @ConfigParamSQL(Value = "KHDC_INQUERY_CARD_BY_ID")
    private String KHDC_INQUERY_CARD_BY_ID;

    public boolean getLogin(String user, String pass, int role) {
        logger.info("Processing login:" + user + "-role:" + role);
        int r = jdbc.queryForObject(SQL_LOGIN_API, new Object[]{user, encryptPassword(pass), role}, Integer.class);
        logger.info("Processing login:" + user + "-role:" + role + "- is:" + (r > 0));
        return r > 0;
    }

    public DataCardInquiry getDataCardInquiry(String cardNum) {

        try {

            CallStoredProcedure<DataCardInquiry> callStoredProcedure = new CallStoredProcedure<>(jdbc, DataCardInquiry.class);

            List<Object> param = new ArrayList<>();
            param.add(cardNum);

            //  callStoredProcedure.query("KHDC_INQUERY_CARD", cardNum, param);
            List<DataCardInquiry> list = callStoredProcedure.query(CALL_KHDC_INQUERY_CARD, param, 2);

            if (list.size() > 0) {
                logger.info("getDataCardInquiry:" + CALL_KHDC_INQUERY_CARD + " with cardNum:" + cardNum);
                return list.get(0);
            } else {
                logger.error("Can't get getDataCardInquiry:" + CALL_KHDC_INQUERY_CARD + " with cardNum:" + cardNum);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
        return null;
    }

    public List<DataCardLastTranx> getDataCardLastTranx(String cardNum) {
        try {
            CallStoredProcedure<DataCardLastTranx> callStoredProcedure = new CallStoredProcedure<>(jdbc, DataCardLastTranx.class);
            List<Object> param = new ArrayList<>();
            param.add(cardNum);
            List<DataCardLastTranx> list = callStoredProcedure.query(CALL_KHDC_CARD_LAST_TRANX, param, 2);

            if (list.size() > 0) {
                logger.info("getDataCardLastTranx:" + CALL_KHDC_CARD_LAST_TRANX + " with cardNum:" + cardNum);
                return list;
            } else {
                logger.error("Can't get getDataCardLastTranx:" + CALL_KHDC_CARD_LAST_TRANX + " with cardNum:" + cardNum);
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
        return null;
    }
    public List<CustomerCards> getCustomerCards(String customerId)
    {
        try
        {
            CallStoredProcedure<CustomerCards> callStoredProcedure = new CallStoredProcedure<>(jdbc, CustomerCards.class);
            List<Object> param = new ArrayList<>();
            param.add(customerId);
            
            List<CustomerCards> list = callStoredProcedure.query(KHDC_INQUERY_CARD_BY_ID, param, 2);

            if (list.size() > 0) {
                logger.info("getCustomerCards:" + KHDC_INQUERY_CARD_BY_ID + " with customerId:" + customerId);
                return list;
            } else {
                logger.error("Can't get getCustomerCards:" + KHDC_INQUERY_CARD_BY_ID + " with customerId:" + customerId);
                return null;
            }
        }catch(Exception e)
        {
            e.printStackTrace();;
        }
        
        return null;
    }

    private String encryptPassword(String pw) {
        return SHAHashing.bytesToHex(pw);
        //   return null;
    }

}
