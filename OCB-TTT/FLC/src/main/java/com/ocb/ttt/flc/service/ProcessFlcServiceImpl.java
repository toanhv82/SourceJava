/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.flc.service;

import com.ocb.ttt.flc.dao.ServiceRegisterFLC;
import com.ocb.ttt.flc.model.request.DataStatus;
import com.ocb.ttt.flc.model.request.RegisterCustomerForm;
import com.ocb.ttt.flc.model.request.ResponseCheckStatus;
import com.ocb.ttt.service.def.ResponseStatus;
import com.ocb.ttt.service.model.RequestForm;
import com.ocb.ttt.service.model.RequestInput;
import com.ocb.ttt.service.model.ResponseAPI;
import com.ocb.ttt.sevice.mail.SendMail;
import com.ocb.ttt.sevice.mail.UtilEmail;
import java.util.List;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.AES;
import ocb.ttt.ocb.common.convert.JsonPharse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ProcessFlcServiceImpl implements ProcessFlcService{

    private static Logger logger = Logger.getLogger(ProcessFlcServiceImpl.class);
    @Autowired
    ServiceRegisterFLC serviceRegisterFLC;
    @Autowired
    SendMail sendMail;
    @ConfigValue(Value = "EMAIL_FROM_CARD")
    private String email_from;
    @ConfigValue(Value = "EMAIL_CC_CARD")
    private String email_CC;
    @ConfigValue(Value = "url_sign")
    private String url_sign;
    
    @ConfigValue(Value = "file_email")
    private String fileEmail;
    
    @ConfigValue(Value = "key")
    private String key;
    public ResponseAPI responseRegister(RequestForm data) {

        ResponseAPI responseAPI = new ResponseAPI();
        responseAPI.setFunction("CustomerRegister");

        responseAPI.setResponseID(responseAPI.createRequestID());

        String stData = data.getData();

        JsonPharse<RegisterCustomerForm> jsonPharse = new JsonPharse<>();

        try {
            RegisterCustomerForm customerForm = jsonPharse.ConvertToObject(stData, RegisterCustomerForm.class);

            List<RegisterCustomerForm> list = serviceRegisterFLC.getListCustomerByRegister(data.getRequestID(), customerForm.getCustomerID());

            if (list.size() > 0) {

                RegisterCustomerForm item=list.get(0);
                
                if(item.getCustomerID().equals(customerForm.getCustomerID()))
                {
                       responseAPI.setResponseCode(450);    
                       responseAPI.setDescription("DUPLICATE CUSTOMER ID");
                        return responseAPI;
                }else if(item.getRequestId().equals(customerForm.getRequestId()))
                {
                      responseAPI.setResponseCode(409);  
                      responseAPI.setDescription("DUPLICATE REQUEST ID");
                       return responseAPI;
                      
                }else
                {
                    responseAPI.setResponseCode(409);  
                    responseAPI.setDescription("CONFLIC REQUEST");
                    return responseAPI;
                }     
               
            } else {
                /*
                String customerId,String email,String phone,String fullName,String requestId 
                 */

                int r = serviceRegisterFLC.insertCustomerFLC(customerForm.getCustomerID(), customerForm.getEmail(), customerForm.getPhoneNumber(), customerForm.getFullName(), data.getRequestID());

                if (r == 0) {
                    responseAPI.setResponseCode(450);
                    responseAPI.setDescription("DUPLICATE DATA");
                    return responseAPI;
                }

            }

           responseAPI.setResponseCode(200);

            return responseAPI;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
            responseAPI.setDescription("NOT DATA FORMAT JSON");
            responseAPI.setResponseCode(500);
            return responseAPI;
        }

    }
    public ResponseAPI checkStatus(RequestForm data) {

        ResponseCheckStatus res = new ResponseCheckStatus();
        res.setFunction("checkRegister");
        try {
            DataStatus dataStatus = new DataStatus();

            res.setResponseDateTime(res.createTime());
            res.setResponseID(res.createRequestID());
            res.setResponseCode(200);
            List<RegisterCustomerForm> list = serviceRegisterFLC.getListCustomerByRegister(data.getRequestID(), null);

            if (list.size() == 0) {
                dataStatus.setStatus(ResponseStatus.NOT_REGISTER.toString());
            } else {

                dataStatus.setStatus(ResponseStatus.PROCESSING.toString());
                dataStatus.setType("NOTSET");
            }
            res.setDataStatus(dataStatus);

            return res;

        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();;
        }

        return res;
    }
    public ResponseAPI reSendMail(RequestForm data) {
        
        ResponseAPI responseAPI = new ResponseAPI();
        responseAPI.setFunction("reSendMail");
        try
        {
           String subject="THONG BAO DANG KY THE TIN DUNG";
           String conntest="";           
           String stData=data.getData();
           JsonPharse<RequestInput> jsonPharse = new JsonPharse<>();
           RequestInput input=jsonPharse.ConvertToObject(stData, RequestInput.class);           
           List<RegisterCustomerForm> list = serviceRegisterFLC.getListCustomerByRegister(input.getInput(),"");           
           if(list.size()==1)
           {
               RegisterCustomerForm item=list.get(0);
                
              // String email=list.get(0).getEmail();
               String link=url_sign;
               conntest+=link+AES.encrypt(key, input.getInput());
               /*String email_from, String email_to, String email_cc, String subject, String content*/
               UtilEmail loadEmail=new UtilEmail();
               conntest=loadEmail.LoadFile(fileEmail);
               
               conntest=conntest.replace("[link]", url_sign + "/" + item.getRequestId());
               conntest=conntest.replace("[Name]", item.getFullName());
               sendMail.SendMail(email_from, item.getEmail(), email_CC, subject, conntest);
              
               responseAPI.setResponseCode(200);
               
               return responseAPI;
               
           }else
           {
               responseAPI.setResponseCode(500);
           }
           
           
            
        }catch(Exception e )
        {
            e.printStackTrace();
            logger.error(e);
        }
        
        return responseAPI;
        
    }
    public RegisterCustomerForm getInfo(String registerId) {
        RegisterCustomerForm result = new RegisterCustomerForm();
        try
        {         
           List<RegisterCustomerForm> list = serviceRegisterFLC.getListCustomerByRegister(registerId,"");     
            if (list!=null && list.size()>0) {
                result = list.get(0);
            }
        }catch(Exception e )
        {
            e.printStackTrace();
            logger.error(e);
        }
        
        return result;
        
    }
    public int UpdateStatusCustomerFLCByRequest(String requestID){
        int result = 0;
        try {
            result = serviceRegisterFLC.updateStatusCustomerFLC(requestID);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e);
        }
        return result;
    }
}
