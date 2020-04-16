/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import com.ocb.ttt.model.CardInfo;
import com.ocb.ttt.cms.def.Def;
import com.ocb.ttt.cms.def.DefStatusCard;
import com.ocb.ttt.cms.model.request.CardProcess;
import com.ocb.ttt.cms.model.request.DebitCard;
import com.ocb.ttt.cms.model.request.SOAStatus;
import com.ocb.ttt.cms.model.request.SOAStatus1;
import com.ocb.ttt.cms.model.request.StatusLDap;
import com.ocb.ttt.cms.repository.ServiceFile;
import com.ocb.ttt.cms.service.ServiceUploadFile;
import com.ocb.ttt.common.connect.ConnectionAPI;
import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.db.serive.CallStoredProcedure;
import com.ocb.ttt.login.model.UserLogin;
import com.ocb.ttt.model.AccountCardInfo;
import com.ocb.ttt.model.FullNabCPCard;
import com.ocb.ttt.model.ChinhSach;
import com.ocb.ttt.model.LoginInfo;
import com.ocb.ttt.model.request.ReqCardStatus;
import com.ocb.ttt.model.request.ReqContractStatus;
import com.ocb.ttt.service.model.RequestForm;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.convert.JsonPharse;
import ocb.ttt.common.hash.SHAHashing;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceUploadFileImpl implements ServiceUploadFile {

    private static LoggerLoader logger = new LoggerLoader(ServiceUploadFileImpl.class);
    @Autowired
    ServiceFile serviceFile;

    final String Close_card = "33";
    @ConfigValue(Value = "URL_SOA_ACCOUNT_CHANGE_STATUS")
    private String url_soa = "http://localhost:21104/OCB-SOA/Card/changeStatusContract";
    @ConfigValue(Value = "URL_SOA_CARD_CHANGE_STATUS")
    private String url_soa_card = "http://localhost:21104/OCB-SOA/Card/closeCard";

    @Autowired
    private TaskExecutor taskExecutor;

    @Override
    public HashMap<String, Object> uploadFileExcel(MultipartFile file, String user, HttpSession session) {

        String fileName = file.getOriginalFilename();
        try {
            session.setAttribute(Def.UPLOAD_STATUS, true);
            if (fileName.indexOf(".xlsx") >= 0) {

                UploadTask uploadTask = new UploadTask(file, user, session) {
                    @Override
                    protected void process(MultipartFile file, String user, HttpSession session) {
                        try {
                            saveFIleUploadXLSX(file.getInputStream(), user, session);
                        } catch (IOException e) {

                            e.printStackTrace();
                        }
                    }
                };
                taskExecutor.execute(uploadTask);
            } else if (fileName.indexOf(".xls") >= 0) {
                //return saveFIleUploadXLS(file.getInputStream(), user,_request);

                UploadTask uploadTask = new UploadTask(file, user, session) {
                    @Override
                    protected void process(MultipartFile file, String user, HttpSession session) {
                        try {
                            saveFIleUploadXLS(file.getInputStream(), user, session);
                        } catch (IOException e) {

                            e.printStackTrace();
                        }
                    }
                };
                taskExecutor.execute(uploadTask);
            }
        } catch (Exception e) {
            session.setAttribute(Def.UPLOAD_STATUS, false);
            e.printStackTrace();
        }

        HashMap<String, Object> status = new HashMap<>();
        List<String> error = new ArrayList<>();
        error.add("NOT SUPPORT FILE");
        status.put("TOTAL", 0);
        status.put("ERROR", error);
        return status;

    }

    public HashMap<String, Object> saveFIleUploadXLS(InputStream file, String user, HttpSession session) {
        List<CardProcess> list = new ArrayList<>();
        List<String> error = new ArrayList<>();
        CardProcess cardProcess = new CardProcess();
        String check = "";
        int total = 0;
        int count = 0;
        String batchId = getBatchId();
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, 0);
        try {
            HSSFWorkbook wb = new HSSFWorkbook(file);
            HSSFSheet sheet = wb.getSheetAt(0);

            for (Row row : sheet) {//iteration over row using for eac
                count++;
                try {
                    check = String.valueOf((int) row.getCell(0).getNumericCellValue());
                } catch (Exception e) {
                    check = row.getCell(0).getStringCellValue();
                }

                if (check.equalsIgnoreCase("STT")) {
                    continue;
                } else {
                    Cell cCif = row.getCell(1);
                    String cif = "";
                    if (cCif.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                        cif = String.valueOf((int) cCif.getNumericCellValue());
                    } else {
                        cif = cCif.getStringCellValue();
                    }
                    Cell cCardNuber = row.getCell(2);
                    String cardNum = cCardNuber == null ? "" : cCardNuber.getStringCellValue();
                    Cell cType = row.getCell(3);
                    String type = cType == null ? "" : cType.getStringCellValue();
                    Cell cfn = row.getCell(4);
                    String function = cfn == null ? "" : cfn.getStringCellValue();
                    Cell cReason = row.getCell(5);
                    String reason = cReason == null ? "" : cReason.getStringCellValue();

                    cardProcess = new CardProcess();
                    cardProcess.setCif(cif);
                    cardProcess.setCardNumber(cardNum);
                    cardProcess.setType(type);
                    cardProcess.setFunction(function);
                    cardProcess.setReason(reason);
                    cardProcess.setBatchId(batchId);
                    cardProcess.setUser(user);
                    list.add(cardProcess);
                    total++;

//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e1) {
//                        logger.error(e1);
//                    }
                }
            }

            //  return processes(sheet);
        } catch (IOException e) {
            error.add(e.getMessage());
            e.printStackTrace();
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        for (int i = 0; i < list.size(); i++) {
            error.addAll(insertDBCardProcess(list.get(i)));
            session.setAttribute(Def.PROGRESS_UPLOAD, i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                logger.error(e1);
            }
        }
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", count);
        status.put("SUCCESS", total);
        status.put("ERROR", error);
        status.put("BATCH_ID", batchId);
        session.setAttribute(Def.PROGRESS_UPLOAD, status);
        session.setAttribute(Def.UPLOAD_STATUS, false);
        return status;

    }

    public HashMap<String, Object> saveFIleUploadXLSX(InputStream file, String user, HttpSession session) {

        List<CardProcess> list = new ArrayList<>();
        List<String> error = new ArrayList<>();
        CardProcess cardProcess = new CardProcess();
        int total = 0;
        String check = "", rs = "", batchId = "";
        try {
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            batchId = getBatchId();
            for (Row row : sheet) {//iteration over row using for eac
                try {
                    check = String.valueOf((int) row.getCell(0).getNumericCellValue());
                } catch (Exception e) {
                    check = row.getCell(0).getStringCellValue();
                }
                if (check.equalsIgnoreCase("STT")) {
                    continue;
                } else {
                    Cell cCif = row.getCell(1);
                    String cif = getValueCell(cCif);
                    Cell cCardNuber = row.getCell(2);
                    String cardNum = getValueCell(cCardNuber);
                    Cell cType = row.getCell(3);
                    String type = getValueCell(cType);
                    Cell cfn = row.getCell(4);
                    String function = getValueCell(cfn);
                    Cell cReason = row.getCell(5);
                    String reason = getValueCell(cReason);
                    cardProcess = new CardProcess();
                    cardProcess.setCif(cif);
                    cardProcess.setCardNumber(cardNum);
                    cardProcess.setType(type);
                    cardProcess.setFunction(function);
                    cardProcess.setReason(reason);
                    cardProcess.setBatchId(batchId);
                    cardProcess.setUser(user);
                    list.add(cardProcess);
                    total++;

                }
            }

        } catch (IOException e) {
            error.add(e.getMessage());
            e.printStackTrace();
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        for (int i = 0; i < list.size(); i++) {
            error.addAll(insertDBCardProcess(list.get(i)));
            session.setAttribute(Def.PROGRESS_UPLOAD, i);
//             try {
//                        Thread.sleep(3000);
//                 } catch (InterruptedException e1) {
//                        logger.error(e1);
//            }
        }
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", total);
        status.put("ERROR", error);
        status.put("BATCH_ID", batchId);
        session.setAttribute(Def.PROGRESS_UPLOAD, status);
        session.setAttribute(Def.UPLOAD_STATUS, false);
        /**
         *
         */
        // session.setAttribute(Def.UPLOAD_STATUS,false);

        return status;

    }

    private String getValueCell(Cell c) {
        String value = "";
        try {
            if (c.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                value = String.valueOf((int) c.getNumericCellValue());
            } else {
                value = c.getStringCellValue();
            }
        } catch (Exception e) {

        }
        return value;

    }

    private List<String> insertDBCardProcess(CardProcess item) {

        return serviceFile.insertProcess(item);

    }

    private AccountCardInfo getAccountCardInfo(String account_num) {
        return serviceFile.getAccountCardInfo(account_num);
    }

    public List<FullNabCPCard> getNabCPCardInfo(String batch_id) {
        return serviceFile.getNabCPCardInfo(batch_id);
    }

    public List<ChinhSach> getListChinhSach(String MachinhSach) {
        return serviceFile.getListChinhSach(MachinhSach);
    }
    /*
    public List<FullNabCPCard> UpdateNabCPCardChinhSach(String batch_id, String Machinhsach, String contractNumber, String ContractName) {
        List<FullNabCPCard> listCB = serviceFile.UpdateNabCPCardChinhSach(batch_id, Machinhsach, contractNumber, ContractName);
        List<ChinhSach> listCS = getListChinhSach(Machinhsach);
        if (listCS.size() > 0) {
            try {
                UpdateClassifierCardInfo classifierXML = new UpdateClassifierCardInfo("xml/Change_Classifier_Related_Card.xml");
                for (ChinhSach item : listCS) {
                    try {
                        ClassifierModel modelXML = new ClassifierModel();
                        modelXML.setCode(item.getMACHINHSACH());
                        modelXML.setShortName(ContractName);
                        modelXML.setContractNumber(contractNumber);
                        modelXML.setCode(item.getCLASSIFIER_NAME());
                        modelXML.setValue(item.getCLASSIFIER_VALUE());
                        String XmlPush = classifierXML.convertToData(modelXML);
                        ClassifierW4Service sv = new ClassifierW4Service();
                        String result = sv.UpdateClassifier(XmlPush);
                    } catch (Exception e) {
                        //throw e;
                    }
                }
            } catch (Exception e) {
                return null;
            }
        }
        return listCB;
    }
*/

    private String getBatchId() {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("MMddHHmmss");
        String rs = f.format(date);
        return rs;
    }

    private String getBatchIdOpening() {
        String batch = serviceFile.getBatchIdByType("PREPAID");
        return batch;
    }

    @Override
    public List<CardProcess> getListApproveCard(String batchId, String status, String type, String fromDate, String toDate) {

        return serviceFile.getListApproveCard(batchId, status, type, fromDate, toDate);

    }

    public HashMap<String, Object> processCardALL(List<CardProcess> list, String user, HttpServletRequest _request) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        CardInfo cardInfo = new CardInfo();
        AccountCardInfo accountCardInfo = new AccountCardInfo();
        String statusCard = "", statusAcc = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);

            boolean check = false;
            boolean check2 = false;
            if (item.getType().equals("CARD")) {
                cardInfo = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
                if (cardInfo != null && cardInfo.getStatus() != null) {
                    statusCard = cardInfo.getStatus();
                    token = cardInfo.getTokenID();
                    if (item.getFunction().trim().toUpperCase().equals("CLOSE_CARD")) {
                        check = excuteCardSOANew(item, token);
                    } else if (item.getFunction().trim().toUpperCase().equals("ACTIVE_CARD")) {
                        if (statusCard.equals(DefStatusCard.CARD_INACTIVE)) {
                            check = excuteCardSOANew(item, token);
                        } else {
                            item.setResult("Fail Card not Inactive");
                            check = false;
                        }
                    } else if (item.getFunction().trim().toUpperCase().equals("CARD_RETURN")) {
                        if (statusCard.equals(DefStatusCard.CARD_ACCTIVE)) {
                            check = excuteCardSOANew(item, token);
                        } else {
                            item.setResult("Fail Card not OK");
                            check = false;
                        }
                    } else if (item.getFunction().trim().toUpperCase().equals("CLOSE_ACCOUNT")) {
                        if (cardInfo.getAcountNumber() != null) {
                            accountCardInfo = getAccountCardInfo(cardInfo.getAcountNumber());
                            if (accountCardInfo != null && accountCardInfo.getStatusCode() != null) {
                                statusAcc = accountCardInfo.getStatusCode();
                                switch (statusAcc) {
                                    case Def.ACCOUNT_WAITTING_CLOSE_DONE:
                                        item.setResult("Fail Account Waiting Closed (Guarantee done)");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_T60:
                                        item.setResult("Fail Account T60");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_T30:
                                        item.setResult("Fail Account T30");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_OVD:
                                        item.setResult("Fail Account OVD");
                                        check = false;
                                        break;
                                    default:
                                        check = excuteAccountSOANew(item, cardInfo.getAcountNumber());
                                }
                                if (check) {
                                    item.setFunction("CLOSE_CARD");
                                    check2 = excuteCardSOANew(item, token);
                                    if (!check2) {
                                        item.setResult("Fail When Closed Card");
                                        check = false;
                                    }
                                }
                            } else {
                                item.setResult("Fail not Account Info");
                                check = false;
                            }
                        }
                    }
                } else {
                    item.setResult("Fail not Card Info");
                    check = false;
                }
            } else if (item.getType().equals("ACCOUNT")) {
                accountCardInfo = getAccountCardInfo(item.getCardNumber());
                if (accountCardInfo != null && accountCardInfo.getStatusCode() != null) {
                    statusAcc = accountCardInfo.getStatusCode();
                    switch (statusAcc) {
                        case Def.ACCOUNT_WAITTING_CLOSE_DONE:
                            item.setResult("Fail Account Waiting Closed (Guarantee done)");
                            check = false;
                            break;
                        case Def.ACCOUNT_T60:
                            item.setResult("Fail Account T60");
                            check = false;
                            break;
                        case Def.ACCOUNT_T30:
                            item.setResult("Fail Account T30");
                            check = false;
                            break;
                        case Def.ACCOUNT_OVD:
                            item.setResult("Fail Account OVD");
                            check = false;
                            break;
                        default:
                            check = excuteAccountSOANew(item, item.getCardNumber());
                    }
                } else {
                    item.setResult("Fail not Account Info");
                    check = false;
                }

            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }
    
    public HashMap<String, Object> processActiveCard(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        CardInfo cardInfo = new CardInfo();
        String statusCard = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            boolean check = false;
            if (item.getType().equals("CARD")) {
                cardInfo = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
                if (cardInfo != null && cardInfo.getStatus() != null) {
                    statusCard = cardInfo.getStatus();
                    token = cardInfo.getTokenID();
                    if (item.getFunction().trim().toUpperCase().equals("ACTIVE_CARD")) {
                        if (statusCard.equals(DefStatusCard.CARD_INACTIVE)) {
                            check = excuteCardSOANew(item, token);
                        } else {
                            item.setResult("Fail Card not Inactive");
                            check = false;
                        }
                    } else{
                        item.setResult("Fail function not ACTIVE_CARD");
                        check = false;
                    }
                } else {
                    item.setResult("Fail not Card Info");
                    check = false;
                }
            } else {
                item.setResult("Fail TYPE not CARD NUMBER");
                check = false;
            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }
    
    public HashMap<String, Object> processReturnCard(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        CardInfo cardInfo = new CardInfo();
        String statusCard = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            boolean check = false;
            if (item.getType().equals("CARD")) {
                cardInfo = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
                if (cardInfo != null && cardInfo.getStatus() != null) {
                    statusCard = cardInfo.getStatus();
                    token = cardInfo.getTokenID();
                    if (item.getFunction().trim().toUpperCase().equals("CARD_RETURN")) {
                        if (statusCard.equals(DefStatusCard.CARD_ACCTIVE)) {
                            check = excuteCardSOANew(item, token);
                        } else {
                            item.setResult("Fail Card not OK");
                            check = false;
                        }
                    } else{
                        item.setResult("Fail function not CARD_RETURN");
                        check = false;
                    }
                } else {
                    item.setResult("Fail not Card Info");
                    check = false;
                }
            } else {
                item.setResult("Fail TYPE not CARD NUMBER");
                check = false;
            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }
    
    public HashMap<String, Object> processCloseCard(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        CardInfo cardInfo = new CardInfo();
        String statusCard = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            boolean check = false;
            if (item.getType().equals("CARD")) {
                cardInfo = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
                if (cardInfo != null && cardInfo.getStatus() != null) {
                    statusCard = cardInfo.getStatus();
                    token = cardInfo.getTokenID();
                    if (item.getFunction().trim().toUpperCase().equals("CLOSE_CARD")) {
                        check = excuteCardSOANew(item, token);    
                    } else{
                        item.setResult("Fail function not CLOSE_CARD");
                        check = false;
                    }
                } else {
                    item.setResult("Fail not Card Info");
                    check = false;
                }
            } else {
                item.setResult("Fail TYPE not CARD NUMBER");
                check = false;
            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }
    
    public HashMap<String, Object> processCloseAccount(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        CardInfo cardInfo = new CardInfo();
        AccountCardInfo accountCardInfo = new AccountCardInfo();
        String statusAcc = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            boolean check = false, check2 = false;
            if (item.getType().equals("CARD")) {
                cardInfo = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
                if (cardInfo != null && cardInfo.getStatus() != null) {  
                    token = cardInfo.getTokenID();
                    if (item.getFunction().trim().toUpperCase().equals("CLOSE_ACCOUNT")) {
                        if (cardInfo.getAcountNumber() != null) {
                            accountCardInfo = getAccountCardInfo(cardInfo.getAcountNumber());
                            if (accountCardInfo != null && accountCardInfo.getStatusCode() != null) {
                                statusAcc = accountCardInfo.getStatusCode();
                                switch (statusAcc) {
                                    case Def.ACCOUNT_WAITTING_CLOSE_DONE:
                                        item.setResult("Fail Account Waiting Closed (Guarantee done)");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_T60:
                                        item.setResult("Fail Account T60");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_T30:
                                        item.setResult("Fail Account T30");
                                        check = false;
                                        break;
                                    case Def.ACCOUNT_OVD:
                                        item.setResult("Fail Account OVD");
                                        check = false;
                                        break;
                                    default:
                                        check = excuteAccountSOANew(item, cardInfo.getAcountNumber());
                                }
                                if (check) {
                                    item.setFunction("CLOSE_CARD");
                                    check2 = excuteCardSOANew(item, token);
                                    if (!check2) {
                                        item.setResult("Fail When Closed Card");
                                        check = false;
                                    }
                                }
                            } else {
                                item.setResult("Fail not Account Info");
                                check = false;
                            }
                        }else{
                            item.setResult("Fail not Account Info");
                            check = false;
                        }
                    } else {
                        item.setResult("Fail function not CLOSE_ACCOUNT");
                        check = false;
                    }
                } else {
                    item.setResult("Fail not Card Info");
                    check = false;
                }
            } else {
                item.setResult("Fail TYPE not CARD NUMBER");
                check = false;
            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }

    public HashMap<String, Object> processCloseAccountNumber(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        AccountCardInfo accountCardInfo = new AccountCardInfo();
        String statusAcc = "", token = "";
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            boolean check = false;
            if (item.getType().equals("ACCOUNT")) {
                if (item.getFunction().trim().toUpperCase().equals("CLOSE_ACCOUNT")) {
                    accountCardInfo = getAccountCardInfo(item.getCardNumber());
                    if (accountCardInfo != null && accountCardInfo.getStatusCode() != null) {
                        statusAcc = accountCardInfo.getStatusCode();
                        switch (statusAcc) {
                            case Def.ACCOUNT_WAITTING_CLOSE_DONE:
                                item.setResult("Fail Account Waiting Closed (Guarantee done)");
                                check = false;
                                break;
                            case Def.ACCOUNT_T60:
                                item.setResult("Fail Account T60");
                                check = false;
                                break;
                            case Def.ACCOUNT_T30:
                                item.setResult("Fail Account T30");
                                check = false;
                                break;
                            case Def.ACCOUNT_OVD:
                                item.setResult("Fail Account OVD");
                                check = false;
                                break;
                            default:
                                check = excuteAccountSOANew(item, item.getCardNumber());
                        }                         
                    } else {
                        item.setResult("Fail not Account Info");
                        check = false;
                    }   
                } else {
                    item.setResult("Fail function not CLOSE_ACCOUNT");
                    check = false;
                }       
            } else {
                item.setResult("Fail TYPE not ACCOUNT NUMBER");
                check = false;
            }
            info.put(item.getCardNumber(), check);
            if (check) {
                item.setResult("OK");
                serviceFile.updateStatusBatch(item, "Y");
                success += 1;
            } else {
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            try {
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }
    
    public HashMap<String, Object> rejectAllCard(List<CardProcess> list, String user, HttpServletRequest _request) {

        HashMap<String, Object> info = new HashMap<>();
        HttpSession session = _request.getSession();
        int total = 0, success = 0, error = 0;
        for (CardProcess item : list) {
            total++;
            item.setUserAuthorize(user);
            try {
                item.setResult("Rejected");
                serviceFile.updateStatusBatch(item, "R");
                success += 1;
                session.setAttribute("PROCESS_CARD_UPLOAD", total + "/" + list.size());
            } catch (Exception e) {
                item.setResult(null);
                serviceFile.updateStatusBatch(item, "F");
                error += 1;
            }
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", success);
        status.put("ERROR", error);
        session.setAttribute(Def.PROCESS_CARD_UPLOAD, status);
        session.setAttribute(Def.PROCESS_CARD_STATUS, false);

        return info;
    }

    private CardInfo getCardInfoByCif(CardProcess item) {
        CardInfo card = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
        return card;
    }

    private boolean excuteCardtSOA(CardProcess item) {

        CardInfo card = serviceFile.getCardInfoByCif(item.getCif(), item.getCardNumber());
        if (item.getFunction().toUpperCase().equals("ACTIVE_CARD")) {
            if (card != null && card.getStatus() != null && !card.getStatus().equals(DefStatusCard.CARD_INACTIVE)) {
                item.setReason("CARD STILL NOT INACTIVE");
                return false;
            }
        }
        String passApi = "Ttt@1234";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", passApi.trim());
        header.put("Content-Type", "application/json");
        try {
            RequestForm requestForm = new RequestForm();

            ReqCardStatus reqCardStatus = new ReqCardStatus();
            reqCardStatus.setToken_id(card.getTokenID());
            reqCardStatus.setReason(item.getReason());
            reqCardStatus.setSource("API");
            reqCardStatus.setUser(item.getUserAuthorize());

            if (item.getFunction().equals("ACTIVE_CARD")) {
                reqCardStatus.setStatus(DefStatusCard.CARD_ACCTIVE);
                requestForm.setFunction("ACTIVE_CARD");
            } else if (item.getFunction().equals("CARD_RETURN")) {
                requestForm.setFunction("CARD_RETURN");
                reqCardStatus.setStatus(DefStatusCard.CARD_RETURN);
            } else if (item.getFunction().equals("CLOSE_CARD")) {
                requestForm.setFunction("CLOSE_CARD");
                reqCardStatus.setStatus(DefStatusCard.CARD_CLOSE);
            }
            String dataL = JsonPharse.ConvertToString1(reqCardStatus);
            requestForm.setData(dataL);
            requestForm.setHash(SHAHashing.bytesToHex(dataL));
            requestForm.setRequestDateTime(new Date().toString());
            String content = ConnectionAPI.postJsonObjectHttp(url_soa_card.trim(), header, requestForm);

            logger.info(dataL);

            if (convertResult(content).getMsg().equals("OK")) {
                item.setResult("OK");
                return true;
            }

            //StatusLDap status=JsonPharse.ConvertToObj(content, StatusLDap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    private boolean excuteCardSOANew(CardProcess item, String token) {

        String passApi = "Ttt@1234";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", passApi.trim());
        header.put("Content-Type", "application/json");
        try {
            RequestForm requestForm = new RequestForm();

            ReqCardStatus reqCardStatus = new ReqCardStatus();
            reqCardStatus.setToken_id(token);
            reqCardStatus.setReason(item.getReason());
            reqCardStatus.setSource("API");
            reqCardStatus.setUser(item.getUserAuthorize());

            if (item.getFunction().equals("ACTIVE_CARD")) {
                reqCardStatus.setStatus(DefStatusCard.CARD_ACCTIVE);
                requestForm.setFunction("ACTIVE_CARD");
            } else if (item.getFunction().equals("CARD_RETURN")) {
                requestForm.setFunction("CARD_RETURN");
                reqCardStatus.setStatus(DefStatusCard.CARD_RETURN);
            } else if (item.getFunction().equals("CLOSE_CARD")) {
                requestForm.setFunction("CLOSE_CARD");
                reqCardStatus.setStatus(DefStatusCard.CARD_CLOSE);
            }
            String dataL = JsonPharse.ConvertToString1(reqCardStatus);
            requestForm.setData(dataL);
            requestForm.setHash(SHAHashing.bytesToHex(dataL));
            requestForm.setRequestDateTime(new Date().toString());
            String content = ConnectionAPI.postJsonObjectHttp(url_soa_card.trim(), header, requestForm);

            logger.info(dataL);

            if (convertResult(content).getMsg().equals("OK")) {
                item.setResult("OK");
                return true;
            }

            //StatusLDap status=JsonPharse.ConvertToObj(content, StatusLDap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    private SOAStatus1 convertResult1(String rs) {
        return JsonPharse.ConvertToObj(rs, SOAStatus1.class);
    }

    private SOAStatus convertResult(String rs) {
        return JsonPharse.ConvertToObj(rs, SOAStatus.class);
    }

    private boolean excuteAccountSOA(CardProcess item) {

        String account_number = item.getCardNumber();
        if (item.getFunction().trim().toUpperCase().equals("CLOSE_ACCOUNT") && item.getType().equals("CARD")) {
            CardInfo card = getCardInfoByCif(item);
            account_number = (card.getAcountNumber());
        }
//        AccountCardInfo acc= getAccountCardInfo(account_number);
//        
//        if(acc!=null)
//        {
//            if(acc.getStatusCode().equals(Def.ACCOUNT_NORMAL))
//            {
////                item.setResult("ACCOUNT STILL NORMAL");
////                return false;
//            }
//        }else
//        {
//            return false;
//        }
        String passApi = "Ttt@1234";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", passApi.trim());
        header.put("Content-Type", "application/json");
        try {

            RequestForm requestForm = new RequestForm();
            requestForm.setFunction("CLOSE_ACCOUNT");
            ReqContractStatus reqContractStatus = new ReqContractStatus();
            reqContractStatus.setContract_number(account_number);
            reqContractStatus.setReason(item.getReason());
            reqContractStatus.setSource("API");
            reqContractStatus.setUser(item.getUserAuthorize());

            if (item.getFunction().equals("ACCOUNT_NORMAL")) {
                reqContractStatus.setStatus(String.valueOf(Def.ACCOUNT_NORMAL));

            } else if (item.getFunction().equals("CLOSE_ACCOUNT")) {
                reqContractStatus.setStatus(String.valueOf(Def.CLOSE_ACCOUNT));

            }
            String dataL = JsonPharse.ConvertToString1(reqContractStatus);
            requestForm.setData(dataL);
            requestForm.setHash(SHAHashing.bytesToHex(dataL));
            requestForm.setRequestDateTime(new Date().toString());

            String content = ConnectionAPI.postJsonObjectHttp(url_soa.trim(), header, requestForm);

            logger.info(dataL);

            if (convertResult1(content).getStatus().getResult() == 0) {
                return true;
            }

            //StatusLDap status=JsonPharse.ConvertToObj(content, StatusLDap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    private boolean excuteAccountSOANew(CardProcess item, String account_number) {

        String passApi = "Ttt@1234";
        Map<String, String> header = new HashMap<String, String>();
        header.put("user", "soa");
        header.put("pw", passApi.trim());
        header.put("Content-Type", "application/json");
        try {

            RequestForm requestForm = new RequestForm();
            requestForm.setFunction("CLOSE_ACCOUNT");
            ReqContractStatus reqContractStatus = new ReqContractStatus();
            reqContractStatus.setContract_number(account_number);
            reqContractStatus.setReason(item.getReason());
            reqContractStatus.setSource("API");
            reqContractStatus.setUser(item.getUserAuthorize());

            if (item.getFunction().equals("ACCOUNT_NORMAL")) {
                reqContractStatus.setStatus(String.valueOf(Def.ACCOUNT_NORMAL));

            } else if (item.getFunction().equals("CLOSE_ACCOUNT")) {
                reqContractStatus.setStatus(String.valueOf(Def.CLOSE_ACCOUNT));

            }
            String dataL = JsonPharse.ConvertToString1(reqContractStatus);
            requestForm.setData(dataL);
            requestForm.setHash(SHAHashing.bytesToHex(dataL));
            requestForm.setRequestDateTime(new Date().toString());

            String content = ConnectionAPI.postJsonObjectHttp(url_soa.trim(), header, requestForm);

            logger.info(dataL);

            if (convertResult1(content).getStatus().getResult() == 0) {
                return true;
            }

            //StatusLDap status=JsonPharse.ConvertToObj(content, StatusLDap.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public void processCard(List<CardProcess> list, String user, HttpServletRequest request) {

        // HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        HashMap<String, Object> status = new HashMap<>();
        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processCardALL(list, user, request);
                }
            ;
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }

    }
    
    @Override
    public void update_active_card(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processActiveCard(list, user, request);
                };
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }
    
    @Override
    public void update_return_card(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processReturnCard(list, user, request);
                };
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }

    @Override
    public void update_card_close(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processCloseCard(list, user, request);
                };
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }
    
    @Override
    public void update_account_close(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processCloseAccount(list, user, request);
                };
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }
    
    @Override
    public void update_account_number_close(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return processCloseAccountNumber(list, user, request);
                };
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }
    
    @Override
    public void rejectCard(List<CardProcess> list, String user, HttpServletRequest request) {

        HttpSession session = request.getSession();
        try {
            session.setAttribute(Def.PROCESS_CARD_STATUS, true);
            CardTask cardTask = new CardTask(list, user, request) {
                @Override
                protected HashMap<String, Object> process(List<CardProcess> list, String user, HttpServletRequest request) {
                    return rejectAllCard(list, user, request);
                }
            ;
            };         
        taskExecutor.execute(cardTask);
        } catch (Exception e) {
            session.setAttribute(Def.PROCESS_CARD_STATUS, false);
            e.printStackTrace();
        }
    }

    @Override
    public List<CardProcess> getReportApproveCard(String batchId, String status, String type,
            String fromDate, String toDate) {
        return serviceFile.getReportApproveCard(batchId, status, type, fromDate, toDate);
    }

    @Override
    public HashMap<String, Object> uploadFileCardData(MultipartFile file, String user, HttpSession session) {

        String fileName = file.getOriginalFilename();
        try {
            session.setAttribute(Def.UPLOAD_STATUS, true);
            if (fileName.indexOf(".xlsx") >= 0) {
                UploadTask uploadTask = new UploadTask(file, user, session) {
                    @Override
                    protected void process(MultipartFile file, String user, HttpSession session) {
                        try {
                            saveFileCardData(file.getInputStream(), user, session);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };
                taskExecutor.execute(uploadTask);
            }
        } catch (Exception e) {
            session.setAttribute(Def.UPLOAD_STATUS, false);
            e.printStackTrace();
        }

        HashMap<String, Object> status = new HashMap<>();
        List<String> error = new ArrayList<>();
        error.add("NOT SUPPORT FILE");
        status.put("TOTAL", 0);
        status.put("ERROR", error);
        return status;

    }

    public HashMap<String, Object> saveFileCardData(InputStream file, String user, HttpSession session) {

        List<DebitCard> list = new ArrayList<>();
        List<String> error = new ArrayList<>();
        int total = 0;
        String check = "", rs = "", batchId = "";
        try {
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            batchId = getBatchIdOpening();
            for (Row row : sheet) {//iteration over row using for eac
                try {
                    check = String.valueOf((int) row.getCell(0).getNumericCellValue());
                } catch (Exception e) {
                    if (row.getCell(0) != null) {
                        check = row.getCell(0).getStringCellValue();
                    } else {
                        check = "";
                    }
                }
                if (check.equalsIgnoreCase("BRANCH")) {
                    continue;
                } else if (check == null || check.equals("")) {
                    break;
                } else {
                    Cell branch = row.getCell(0);
                    Cell cif_no = row.getCell(1);
                    Cell legal_id = row.getCell(2);
                    Cell place_of_issuer = row.getCell(3);
                    Cell birth_date = row.getCell(4);
                    Cell title = row.getCell(5);
                    Cell first_name = row.getCell(6);
                    Cell family_name = row.getCell(7);
                    Cell emboss_name = row.getCell(8);
                    Cell gender = row.getCell(9);
                    Cell marital = row.getCell(10);
                    Cell employment = row.getCell(11);
                    Cell mobile_no = row.getCell(12);
                    Cell email = row.getCell(13);
                    Cell product = row.getCell(14);
                    Cell rbs_number = row.getCell(15);
                    Cell sale_officer_code = row.getCell(16);
                    Cell connect_school = row.getCell(17);
                    Cell branch_receive = row.getCell(18);
                    Cell transaction_fee_classifier = row.getCell(19);
                    Cell yearly_fee_classifier = row.getCell(20);
                    Cell residence_add = row.getCell(21);
                    Cell current_add = row.getCell(22);

                    DebitCard card = new DebitCard();
                    card.setBrand_code(getValueCell(branch));
                    card.setCif(getValueCell(cif_no));
                    card.setLegal_id(getValueCell(legal_id));
                    card.setMailing_city_code(getValueCell(place_of_issuer));
                    card.setBirth_date(converStringFormat(getValueCell(birth_date)));
                    card.setTitle(getValueCell(title));
                    card.setFirst_name(getValueCell(first_name));
                    card.setFamily_name(getValueCell(family_name));
                    card.setEmbssed_name(getValueCell(emboss_name));
                    card.setEmcoded_name(getValueCell(emboss_name));
                    card.setGender(getValueCell(gender));
                    card.setMarital_status(getValueCell(marital));
                    card.setEmployment_status(getValueCell(employment));
                    card.setMobile_phone(getValueCell(mobile_no));
                    card.setPhone_mobile(getValueCell(mobile_no));
                    card.setPhone_nbr_sms(getValueCell(mobile_no));
                    card.setPhone_no_1(getValueCell(mobile_no));
                    card.setEmail(getValueCell(email));
                    card.setProduction_code(getValueCell(product));
                    card.setAccount1(getValueCell(rbs_number));
                    card.setSale_code(getValueCell(sale_officer_code));
                    card.setConnect_school(getValueCell(connect_school));
                    card.setBrand_receive(getValueCell(branch_receive));
                    card.setCard_tran_fee_class(getValueCell(transaction_fee_classifier));
                    card.setCard_yearly_fee_class(getValueCell(yearly_fee_classifier));
                    card.setUser_branch(getValueCell(branch));
                    card.setAddress1(getValueCell(current_add));
                    card.setMailing_address1(getValueCell(residence_add));

                    //field defaul
                    card.setAccount1_currency("704");
                    card.setAccount1_type("20");
                    card.setBatch_id(batchId);
                    card.setVip("0");
                    card.setOwner_code("I");
                    card.setBasic_card_flag("0");
                    card.setNationality_code("704");
                    card.setIssuer_client("1");
                    card.setSms_flag("1");
                    card.setBirth_city(getValueCell(place_of_issuer));
                    card.setBirth_contr("704");
                    card.setCity_code(getValueCell(place_of_issuer));
                    card.setCountry_code("704");
                    card.setStart_val_date(convertDateToString(new Date()));
                    card.setStatus_code("0");
                    card.setStaff_id("00000");
                    card.setDelivery_flag("0");
                    card.setMailing_country_code("704");
                    card.setPhoto_indicator("0");
                    card.setUser_create(user);
                    card.setUser_authorize(user);
                    card.setAuthorize("W");
                    list.add(card);
                    total++;
                }
            }

        } catch (IOException e) {
            error.add(e.getMessage());
            e.printStackTrace();
        }
        session.setAttribute(Def.PROGRESS_UPLOAD_TOTAL, list.size());
        String source_app_no = "";
        boolean checkSMS = false;
        for (int i = 0; i < list.size(); i++) {
            source_app_no = serviceFile.getSourceAppNp();
            list.get(i).setSource_app_no(source_app_no);
            error.addAll(serviceFile.insertCardPrepaid(list.get(i)));
            checkSMS = serviceFile.insertSmsRegister(list.get(i));
            session.setAttribute(Def.PROGRESS_UPLOAD, i);
        }
        HashMap<String, Object> status = new HashMap<>();
        status.put("TOTAL", total);
        status.put("SUCCESS", total);
        status.put("ERROR", error);
        status.put("BATCH_ID", batchId);
        session.setAttribute(Def.PROGRESS_UPLOAD, status);
        session.setAttribute(Def.UPLOAD_STATUS, false);

        return status;

    }

    private String converStringFormat(String date) {
        String[] ds = date.split("/", 3);
        String dates = (new StringBuilder().append(ds[2]).append(ds[1]).append(ds[0])).toString();
        return dates;
    }

    private String convertDateToString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
        return f.format(date);
    }

    public AccountCardInfo getCardInfo(String account_num) {
        return serviceFile.getAccountCardInfo(account_num);
    }
}
