/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.synchro.token.service;

import com.ocb.ttt.synchro.token.model.OcbToken;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public interface ServiceToken {
    
    public String getSSOURCE_APPLICATION_NO();
    public String getTokenFromCard(String pan);  
    public int updateToken(String pan,String token);
    public List<OcbToken> getListPan();
    public int syschroCard2Token();
   
}
