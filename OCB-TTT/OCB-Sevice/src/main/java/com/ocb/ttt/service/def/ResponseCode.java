/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.def;

/**
 *
 * @author toanhv1
 */
public interface ResponseCode {
    
    
    public final int Success=200;
    public final int BadRequest=400;
    public final int Unauthorized=401;
    public final int Forbidden=403;
    public final int Conflict=409;
    public final int CardNotExist=404;
    public final int CardStatusInvalid=441;
    
    
            
    
}
