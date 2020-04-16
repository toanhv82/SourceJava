/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service;

import com.ocb.ttt.soa.provider.templet.dao.AplicationServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class AplicationService  {
    
    @Autowired
    public  AplicationServiceDAO aplicationServiceDAO;
    
    public  String getRRN()
    {
        return aplicationServiceDAO.getRRN();
    }
    
}
