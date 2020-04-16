/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.card.api.dao;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.common.util.UtilsCard;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import java.util.ArrayList;
import java.util.List;
import com.ocb.ttt.card.api.model.CardInfo;
import ocb.ttt.common.anotion.ConfigParamSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author toanhv1
 */
@Repository
public class ServiceCardDao {
    
     private  LoggerLoader logger = new LoggerLoader(ServiceCardDao.class);
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @ConfigParamSQL(Value = "API_INQUERY_CARD_BY_ID")
    private String API_INQUERY_CARD_BY_ID;
    
    public List<CardInfo> getListCardInfo(String card)
    {        
       
        logger.info("CARD:"+UtilsCard.maskCCNumber(card));
        try
        {
            CallStoredProcedure<CardInfo> callStoredProcedure =new CallStoredProcedure(jdbcTemplate,CardInfo.class);
            List<Object> param = new ArrayList<>();
            param.add(card);
        
        List<CardInfo> list = callStoredProcedure.query(API_INQUERY_CARD_BY_ID, param, 2);
        return list;
        }catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e);
        }             
        return new ArrayList<CardInfo>();
    }
    
}
