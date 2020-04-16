/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.model;

import com.ocb.ttt.service.model.ResponseAPI;

/**
 *
 * @author toanhv1
 */
public class ResponeRegister extends ResponseAPI{
      
    
    private DataRegister data;
   

    public DataRegister getData() {
        return data;
    }

    public void setData(DataRegister data) {
        this.data = data;
    }
        
    public ResponeRegister()
    {
        this.setResponseID(createRequestID());
        this.setResponseDateTime(createTime());
    }
   
    
}
