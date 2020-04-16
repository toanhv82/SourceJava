/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.service;

import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.service.model.ResponseAPI;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public interface ProcessFlcService {
    
     public ResponseAPI responseRegister(RequestForm data);
    
}
