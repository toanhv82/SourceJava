/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.def;

/**
 *
 * @author toanhv1
 */
public interface Def {
    
    public final String FNC_TELLER="TELLER";
    public final String FNC_APPROVE="APPROVE";
    public final String FNC_INSERT_CARD_DUMMY="INSERT_CARD_DUMMY";
    public final String FNC_UPDATE_POLICY="UPDATE_POLICY";
    public final String FNC_HOME="HOME";
    
    public final int CLOSE_CARD=14;  //14-Card Closed
    public final int CARD_RETURN=28;  //28-Card Returned
    public final int CLOSE_ACCOUNT=12; //33-Account Waiting Closed (Guarantee Waiting) 12-Account Waiting Closed (Guarantee Done);
    public final int ACTIVE_CARD=0;
   
    
    public final int TIME_OUT=60;
    
    public final String PROCESS_CARD_STATUS="PROCESS_CARD_STATUS";
    public final String PROCESS_CARD_UPLOAD="PROCESS_CARD_UPLOAD";
    public final String PROGRESS_UPLOAD="PROGRESS_UPLOAD";
    public final String PROGRESS_UPLOAD_TOTAL="PROGRESS_UPLOAD_TOTAL";
    public final String UPLOAD_STATUS="UPLOAD_STATUS";
    public final String LOOK_UPLOAD_STATUS="LOOK_UPLOAD_STATUS";
    
    public final String ACCOUNT_NORMAL="00";
    public final String ACCOUNT_CLOSE="13";
    public final String ACCOUNT_WAITTING_CLOSE="33";
    public final String ACCOUNT_WAITTING_CLOSE_DONE="12";
    public final String ACCOUNT_T60="34";
    public final String ACCOUNT_T30="35";
    public final String ACCOUNT_OVD="38";
    public final String ACCOUNT_DICLINE="05";
    
        
    
    
}
