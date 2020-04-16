/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.ws.way4.soa;

import java.util.HashMap;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author toanhv1
 */

public class CreateCardExitClient extends AbstractSOA{

    
    private String fileName="xml/Credit_exist_client_liabi_issu_add_card.xml";
    
    @Override
    protected HashMap getParam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getFileName() {
        return fileName;
    }
    
    
}
