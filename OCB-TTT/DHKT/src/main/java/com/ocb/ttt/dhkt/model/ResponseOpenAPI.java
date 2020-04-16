/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.model;

import com.ocb.ttt.service.model.ResponseAPI;

/**
 *
 * @author toanhv1
 */
public class ResponseOpenAPI extends ResponseAPI{
    
    private CardInfo data;

    public CardInfo getData() {
        return data;
    }

    public void setData(CardInfo data) {
        this.data = data;
    }

   
    
    
}
