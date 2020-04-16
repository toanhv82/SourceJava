/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.soa;

/**
 *
 * @author toanhv1
 */
public interface ServiceTTT {
    
    public abstract String soa_Change_Contr_Status(String source,String contract_number,String status,String resason);
    public abstract String SOA_Update_Autopayment();
    public abstract String SOA_Delivery_Card();
    
    /**
     * 
     * @param source WEB
     * @param contract_number account number
     * @param status 14 card close 28 card return
     * @param resason 
     * @return 
     */
    
    public abstract String soaChangeStatusCard(String source,String contract_number,String status,String resason);
    public abstract String soaUpdateEComFlag(String source,String card_number,String status);
    public abstract String soaUpdateMotoFlag(String source,String card_number,String status,String reason);
    public String soaUpdateVIP(String source, String card_number, String status);
            
    
}
