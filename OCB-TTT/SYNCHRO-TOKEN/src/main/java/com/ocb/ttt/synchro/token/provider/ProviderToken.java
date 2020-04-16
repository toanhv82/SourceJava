/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.synchro.token.provider;

import com.ocb.ttt.synchro.token.model.OcbToken;
import com.ocb.ttt.synchro.token.service.ServiceToken;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service("ProviderToken")
public class ProviderToken {
    
    @Autowired
    ServiceToken serviceToken;    
    
    public String getToken(String pan)
    {
        return serviceToken.getSSOURCE_APPLICATION_NO();
       // return serviceToken.getTokenFromCard(pan);
    }    
    public  List<OcbToken> getListPan()
    {
        return serviceToken.getListPan();
    }
    public  int synchroDB2Token()
    {
        return serviceToken.syschroCard2Token();
    }
    public  int synchroToken()
    {
        int r=0;
        List<OcbToken> list=getListPan();
        for(int i=0;i<list.size();i++)
        {
           String tk=getToken(list.get(i).getPan());
           r+=serviceToken.updateToken(list.get(i).getPan(), tk);
        }           
        return r;
    }
    
    
}
