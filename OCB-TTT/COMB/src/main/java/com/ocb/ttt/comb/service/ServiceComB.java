/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.service;


import com.ocb.ttt.comb.model.CustomerCards;
import com.ocb.ttt.comb.model.DataCardInquiry;
import com.ocb.ttt.comb.model.DataCardLastTranx;
import java.util.List;


/**
 *
 * @author Win 10
 */
public interface ServiceComB {
    
    DataCardInquiry getCardBalance(String accountNumber);
    List<DataCardLastTranx> getDataCardLastTranx(String accountNumber);
    List<CustomerCards> getCustomerCards(String customerId);
}
