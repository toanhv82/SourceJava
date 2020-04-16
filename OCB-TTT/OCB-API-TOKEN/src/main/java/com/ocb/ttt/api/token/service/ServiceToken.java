/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.api.token.service;

import com.ocb.ttt.api.token.model.TokenPan;

/**
 *
 * @author toanhv1
 */
public interface ServiceToken {
    
  public TokenPan getInfoCardByCif(String pan,String cif);
    
}
