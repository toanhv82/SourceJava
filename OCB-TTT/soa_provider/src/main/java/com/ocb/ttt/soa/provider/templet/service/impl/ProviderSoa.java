/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.soa.provider.templet.service.impl;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.model.Classifier;
import com.ocb.ttt.model.request.ReqContractStatus;
import com.ocb.ttt.sevice.security.ServiceProcessKey;
import com.ocb.ttt.sevice.soa.ServiceAplication;
import com.ocb.ttt.sevice.soa.ServiceSOA;
import com.ocb.ttt.sevice.soa.ServiceTTT;
import com.ocb.ttt.soa.provider.templet.ChangeClassifer;
import com.ocb.ttt.soa.provider.templet.ResetPin;
import com.ocb.ttt.soa.provider.templet.model.CardSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractBaseSOA;
import com.ocb.ttt.soa.provider.templet.model.ContractClassifier;
import com.ocb.ttt.soa.provider.templet.model.ReqStatusCard;
import com.ocb.ttt.soa.provider.templet.model.ResponseSoa;
import com.ocb.ttt.soa.provider.templet.service.ContextApp;
import ocb.ttt.common.convert.JsonPharse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ocb.ttt.soa.provider.templet.service.ServiceContract;

/**
 *
 * @author toanhv1
 */
@Service
public class ProviderSoa extends ContextApp {

    private static LoggerLoader logger = new LoggerLoader(ProviderSoa.class);
    @Autowired
    ServiceContract serviceContract;
    @Autowired
    private ServiceAplication serviceAplication;
    @Autowired
    ServiceProcessKey serviceProcessKey;
    
    
    private final String serviceName = "ServiceSOAPostToWay4";
    private final String serviceTTTName = "ServiceTTT";

    public String resetPin(String token_id) {
        try {
            CardSOA cardSOA = serviceContract.getCardSOA(token_id);
            ResetPin resetPin = new ResetPin();
            String reg = serviceAplication.getSQN();
            String client_id = cardSOA.getClientNumber();
            String contract_num = cardSOA.getContractNumber();
            String xml = resetPin.generalXML(contract_num, client_id, reg);
            ServiceSOA ServiceSOA = getBean(serviceName);
            logger.info("BEGIN: resetPin " + token_id);
            String result = ServiceSOA.postData(xml);
            logger.info("END resetPin:" + token_id);
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String changeStatusCard(String json_data) {
        try {

            ReqStatusCard reqStatusCard = JsonPharse.ConvertToObj(json_data, ReqStatusCard.class);
            if (reqStatusCard.getUser().isEmpty() || reqStatusCard.getUser() == null) {
                return "NOT USER";
            }
            CardSOA cardSOA = serviceContract.getCardSOA(reqStatusCard.getToken_id());
            cardSOA.setRegNumber(serviceAplication.getSQN());
            cardSOA.setReason(reqStatusCard.getReason());
            String source = reqStatusCard.getSource() == null ? "WEB" : reqStatusCard.getSource();
            ServiceTTT serviceTTT = getBean(serviceTTTName);
            logger.info("Begin:" + reqStatusCard.getUser() + "--:" + reqStatusCard.getToken_id() + "-- status:" + reqStatusCard.getStatus() + "--" + reqStatusCard.getReason());

            String result = serviceTTT.soaChangeStatusCard(source, cardSOA.getContractNumber(), reqStatusCard.getStatus(), reqStatusCard.getStatus());
            logger.info("Result:" + result);
            logger.info("End------------------------------------------------------------");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String SOACloseAccount() {
        return "";
    }

    public String changeContractStatus(String json_data) {
        try {
            ServiceTTT serviceTTT = getBean(serviceTTTName);
            ReqContractStatus reqStatusCard = JsonPharse.ConvertToObj(json_data, ReqContractStatus.class);
            if (reqStatusCard.getUser() == null || reqStatusCard.getUser() == null) {
                return "NOT USER";
            }
            String source = reqStatusCard.getSource() == null ? "WEB" : reqStatusCard.getSource();
            logger.info("Begin:" + reqStatusCard.getUser() + "--:" + reqStatusCard.getContract_number() + "-- status:" + reqStatusCard.getStatus() + "--" + reqStatusCard.getReason());
            String result = serviceTTT.soa_Change_Contr_Status(source, reqStatusCard.getContract_number(), reqStatusCard.getStatus(), reqStatusCard.getReason());
            logger.info("Result:" + "-->result:" + result);
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String updateEcom(String json_data) {
        try {
            ServiceTTT serviceTTT = getBean(serviceTTTName);
            ReqStatusCard reqStatusCard = JsonPharse.ConvertToObj(json_data, ReqStatusCard.class);
            if (reqStatusCard.getUser().isEmpty() || reqStatusCard.getUser() == null) {
                return "NOT USER";
            }
            CardSOA cardSOA = serviceContract.getCardSOA(reqStatusCard.getToken_id());
            String source = reqStatusCard.getSource() == null ? "WEB" : reqStatusCard.getSource();
            logger.info("Begin:" + reqStatusCard.getUser() + "--:" + reqStatusCard.getToken_id() + "-- status:" + reqStatusCard.getStatus() + "--user:" + reqStatusCard.getUser());
            String result = serviceTTT.soaUpdateEComFlag(source, cardSOA.getContractNumber(), reqStatusCard.getStatus());
            logger.info("Result:" + result);
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String updateMoto(String json_data) {
        try {
            ServiceTTT serviceTTT = getBean(serviceTTTName);
            logger.info("Json:" + json_data);
            ReqStatusCard reqStatusCard = JsonPharse.ConvertToObj(json_data, ReqStatusCard.class);
            if (reqStatusCard.getUser().isEmpty() || reqStatusCard.getUser() == null) {
                return "NOT USER";
            }
            CardSOA cardSOA = serviceContract.getCardSOA(reqStatusCard.getToken_id());
            String source = reqStatusCard.getSource() == null ? "WEB" : reqStatusCard.getSource();
            logger.info("Begin:" + reqStatusCard.getUser() + "--:" + reqStatusCard.getToken_id() + "-- status:" + reqStatusCard.getStatus() + "--user:" + reqStatusCard.getUser());
            String result = serviceTTT.soaUpdateMotoFlag(source, cardSOA.getContractNumber(), reqStatusCard.getStatus(), reqStatusCard.getReason());
            logger.info("Result:" + result);
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String updateVip(String json_data) {
        try {
            ServiceTTT serviceTTT = getBean(serviceTTTName);
            logger.info("Bgin updateVip ->Json:" + json_data);
            ReqStatusCard reqStatusCard = JsonPharse.ConvertToObj(json_data, ReqStatusCard.class);
            if (reqStatusCard.getUser().isEmpty() || reqStatusCard.getUser() == null) {
                return "NOT USER";
            }
            String source = reqStatusCard.getSource() == null ? "WEB" : reqStatusCard.getSource();
            CardSOA cardSOA = serviceContract.getCardSOA(reqStatusCard.getToken_id());
            logger.info("Begin:" + reqStatusCard.getUser() + "--:" + reqStatusCard.getToken_id() + "-- status:" + reqStatusCard.getStatus() + "--user:" + reqStatusCard.getUser());
            String result = serviceTTT.soaUpdateVIP(source, cardSOA.getContractNumber(), reqStatusCard.getStatus());
            logger.info("Result:" + result);
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String updateClassifierForCard(ContractClassifier cc) {
        try {
            CardSOA contract = serviceContract.getCardSOA(cc.getContractNumber());
            Classifier classifer = new Classifier();
            classifer.setName(cc.getName());
            classifer.setValue(cc.getValue());
            ChangeClassifer changeClassifer = new ChangeClassifer();
            String xml = changeClassifer.generalXML(contract, classifer,cc.getReason());
            ServiceSOA ServiceSOA = getBean(serviceName);
            logger.info("BEGIN: updateClassifier ");
            String result = ServiceSOA.postData(xml);
            logger.info("END updateClassifier:");
            logger.info("End------------------------------------------------------------");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public String updateClassifierForContract(ContractClassifier cc) {
        try {
            ChangeClassifer changeClassifer = new ChangeClassifer("xml/Change_Classifier.xml");
            Classifier classifer = new Classifier();
            classifer.setName(cc.getName());
            classifer.setValue(cc.getValue());
            
            ContractBaseSOA baseSOA=  serviceContract.getContactByNumber(cc.getContractNumber());            
            baseSOA.setRegNumber(serviceAplication.getSQN());
            
            String xml = changeClassifer.generalXML(baseSOA, classifer,cc.getReason());
            ServiceSOA ServiceSOA = getBean(serviceName);
            logger.info("BEGIN: updateClassifier " + baseSOA.getShortName());
            String result = ServiceSOA.postData(xml);
            logger.info("END updateClassifier:" + baseSOA.getShortName());
            logger.info("End------------------------------------------------------------");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }

        return "";
    }

    public static ResponseSoa convertResult(String result) {
        ResponseSoa responseSoa = new ResponseSoa();
        try {
            String r = result.substring(result.indexOf("<result>") + 8, result.indexOf("</result>"));
            responseSoa.setResult(r);
            if (r.equals("0") || r.equals("00")) {
                logger.warn("CALL SOA OK");
                responseSoa.setMes("OK");
            } else {
                logger.info("CALL SOA FAIL");
                responseSoa.setMes("FAIL");
            }

            return responseSoa;
        } catch (Exception e) {
            responseSoa.setResult("-1");
            responseSoa.setMes("NOT DEFINE");
            logger.error(e);
        }
        return responseSoa;
    }

    public static void main(String[] args) {
        //  String result="<result>99</result><msg>Cannot get Short name ->No_Data_Found or too many results, card -> 9704480609370451</msg>";        
        //  System.out.println("com.ocb.ttt.soa.provider.templet.service.impl.ProviderSoa.main():"+getResult(result));
    }

}
