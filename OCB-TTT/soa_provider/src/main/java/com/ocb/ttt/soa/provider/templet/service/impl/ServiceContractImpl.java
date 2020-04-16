/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service.impl;

import com.ocb.ttt.soa.provider.templet.dao.ServiceContractDao;
import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractBaseSOA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ocb.ttt.soa.provider.templet.service.ServiceContract;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceContractImpl  implements ServiceContract{

    @Autowired
    ServiceContractDao serviceCardDao;
    
    @Override
    public CardSOA getCardSOA(String token_id) {          
        return serviceCardDao.getCardSOA(token_id);             
    }

    @Override
    public ContractBaseSOA getContactByNumber(String contractNumber) {
        
        return serviceCardDao.getContractBaseSOA(contractNumber);
    }

   
    
    
    
}
