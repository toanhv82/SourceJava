/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.response;

import com.ocb.ttt.comb.model.CustomerCards;
import com.ocb.ttt.service.model.ResponseAPI;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public class ResponseCustomerCard extends ResponseAPI{
    
    private List<CustomerCards> customerCards;
    private String hasCard;
    
    public List<CustomerCards> getCustomerCards() {
        return customerCards;
    }
    public void setCustomerCards(List<CustomerCards> customerCards) {
        this.customerCards = customerCards;
    }

    public String getHasCard() {
        return hasCard;
    }

    public void setHasCard(String hasCard) {
        this.hasCard = hasCard;
    }

       
      
    
    
    
}
