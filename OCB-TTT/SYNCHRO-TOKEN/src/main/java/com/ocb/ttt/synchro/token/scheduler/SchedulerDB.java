/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.synchro.token.scheduler;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.sevice.runtime.ApplicationContextUtils;
import com.ocb.ttt.synchro.token.provider.ProviderToken;
import java.text.SimpleDateFormat;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
@Component
public class SchedulerDB {
      
   private static final LoggerLoader log =new LoggerLoader(SchedulerDB.class);
   private static final String providerName="ProviderToken";
   private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
   private final int delay=10;
   
   private ProviderToken pro;
      
   
   @Scheduled(fixedDelay = 1000*60*60,initialDelay = 5000)  
   public void synchroDB() {        
        int r=getProvider().synchroDB2Token();
        if(r>0)
        {
            log.info("synchroDB:"+r);
        }        
       // log.info("The time is now {}", dateFormat.format(new Date()));
       // System.out.println("com.ocb.ttt.synchro.token.scheduler.Scheduler.reportCurrentTime()"+getProvider().getToken("12345"));
    }
    @Scheduled(fixedDelay = 100*60,initialDelay = 5000)
    public void synchroToken() {        
        int r=getProvider().synchroToken();
        if(r>0)
        {
            log.info("synchroDB:"+r);
        }        
       // log.info("The time is now {}", dateFormat.format(new Date()));
       // System.out.println("com.ocb.ttt.synchro.token.scheduler.Scheduler.reportCurrentTime()"+getProvider().getToken("12345"));
    }    
    private ProviderToken getProvider()
    {
        if(pro==null)
        {
            ApplicationContext appCtx = ApplicationContextUtils
				.getApplicationContext();
           pro = (ProviderToken) appCtx.getBean(providerName); 
        }                 
        return pro;
    }
    
}
