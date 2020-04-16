/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.model.request;


import com.ocb.ttt.service.model.ResponseAPI;


/**
 *
 * @author toanhv1
 */
public class ResponseCheckStatus extends ResponseAPI{
    
    private DataStatus dataStatus;

    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }
    
    
}
