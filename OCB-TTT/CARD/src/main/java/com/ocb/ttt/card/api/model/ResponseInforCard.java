/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.card.api.model;

import com.ocb.ttt.service.model.ResponseAPI;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public class ResponseInforCard extends ResponseAPI {
    
    private CardInfo cardInfo;

    public CardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    
       
    
    
}
