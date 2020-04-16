/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service;

import com.ocb.ttt.cms.model.request.CardProcess;
import com.ocb.ttt.cms.model.request.DebitCard;
import com.ocb.ttt.model.AccountCardInfo;
import com.ocb.ttt.model.FullNabCPCard;
import com.ocb.ttt.model.ChinhSach;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author toanhv1
 */
public interface ServiceUploadFile {
    
    HashMap<String, Object> uploadFileExcel(MultipartFile file,String user,HttpSession session);
    List<CardProcess>  getListApproveCard(String batchId,String status,String type,String fromDate,String toDate);
    void processCard(List<CardProcess> list,String user,HttpServletRequest request);
    void update_active_card(List<CardProcess> list,String user,HttpServletRequest request);
    void update_return_card(List<CardProcess> list,String user,HttpServletRequest request);
    void update_card_close(List<CardProcess> list,String user,HttpServletRequest request);
    void update_account_close(List<CardProcess> list,String user,HttpServletRequest request);
    void update_account_number_close(List<CardProcess> list,String user,HttpServletRequest request);
    void rejectCard(List<CardProcess> list,String user,HttpServletRequest request);
    List<CardProcess>  getReportApproveCard(String batchId,String status,String type,String fromDate, String toDate);
    HashMap<String, Object> uploadFileCardData(MultipartFile file,String user,HttpSession session);
    AccountCardInfo getCardInfo(String account_num);
    List<FullNabCPCard> getNabCPCardInfo(String batch_id);
    List<ChinhSach> getListChinhSach(String MachinhSach);
   // List<FullNabCPCard> UpdateNabCPCardChinhSach(String batch_id, String Machinhsach, String contractNumber, String ContractName);
}
