/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.card.api.service;


import java.util.ArrayList;
import java.util.List;
import com.ocb.ttt.card.api.dao.ServiceCardDao;
import com.ocb.ttt.card.api.model.CardInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceCardInfo {    
    
    @Autowired
    private ServiceCardDao serviceCardDao;
    
    public  List<CardInfo> getcardInfo(String cardNum)
    {
              
            List<CardInfo> list= serviceCardDao.getListCardInfo(cardNum);
           return list;
    }
    
}
