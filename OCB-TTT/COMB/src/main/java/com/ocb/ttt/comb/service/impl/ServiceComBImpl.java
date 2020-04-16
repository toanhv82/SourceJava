/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.service.impl;


import com.ocb.ttt.comb.dao.ServiceUsersDAO;
import com.ocb.ttt.comb.model.CustomerCards;
import com.ocb.ttt.comb.model.DataCardInquiry;
import com.ocb.ttt.comb.model.DataCardLastTranx;
import com.ocb.ttt.comb.service.ServiceComB;
import java.util.List;
import ocb.ttt.ocb.obj.comb.CardBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Win 10
 */
@Service
public class ServiceComBImpl implements ServiceComB{

    @Autowired
    ServiceUsersDAO serviceUsersDAO;

    @Override
    public DataCardInquiry getCardBalance(String accountNumber) {
        
         return  serviceUsersDAO.getDataCardInquiry(accountNumber);
    }

    @Override
    public List<DataCardLastTranx> getDataCardLastTranx(String accountNumber) {
      return serviceUsersDAO.getDataCardLastTranx(accountNumber);
    }

    @Override
    public List<CustomerCards> getCustomerCards(String customerId) {
        return serviceUsersDAO.getCustomerCards(customerId);
    }
   

    
   
    
}
