/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service;

import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractBaseSOA;

/**
 *
 * @author toanhv1
 */
public interface ServiceContract {
    
    public CardSOA getCardSOA(String token_id);    
    public ContractBaseSOA getContactByNumber(String contractNumber);
     
}
