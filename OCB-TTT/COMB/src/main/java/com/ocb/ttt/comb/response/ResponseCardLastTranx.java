/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.comb.response;

import com.ocb.ttt.comb.model.DataCardLastTranx;
import com.ocb.ttt.service.model.ResponseAPI;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public class ResponseCardLastTranx  extends ResponseAPI{
    
    private List<DataCardLastTranx> dataCardLastTranx;

    public List<DataCardLastTranx> getDataCardLastTranx() {
        return dataCardLastTranx;
    }

    public void setDataCardLastTranx(List<DataCardLastTranx> dataCardLastTranx) {
        this.dataCardLastTranx = dataCardLastTranx;
    }

    
    
    
}
