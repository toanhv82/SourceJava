/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.esb.connection;

import com.ocb.ttt.esb.payment.AccountInfoType;
import com.ocb.ttt.esb.payment.BranchInfoType;
import com.ocb.ttt.esb.payment.CIFInfoType;

import com.ocb.ttt.esb.payment.ExecutePaymentInternalInType;
import com.ocb.ttt.esb.payment.ExecutePaymentInternalOutType;
import com.ocb.ttt.esb.payment.PaymentExecution;
import com.ocb.ttt.esb.payment.PaymentExecution_Service;
import com.ocb.ttt.esb.payment.TransactionInfoType;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import ocb.ttt.common.anotion.ConfigValue;

/**
 *
 * @author toanhv1
 */
public class Payment {
    public static void main(String[] args) {
        
       String _Crd="VND1000106010001";
       String _Deb="VND1754510020001";
       Payment p=new Payment();
       p.send(_Crd,_Deb);
    }    
    private String _CLIENT="KSV";
    private String _CLIENT_CODE="KSVTEST01";
    private String _BRAND_CODE="Card";
    @ConfigValue(Value = "URL_T24_ESB")
    private String _url="http://10.96.23.111:7800/paymentexecution/v1/ws?wsdl";
    
    private  boolean send(String _accountCredit,String _accountDebit)
    {
        URL url = null;
        try {
            QName PAYMENTEXECUTION_QNAME = new QName("http://bian.com.vn/PaymentExecution/", "PaymentExecution");
            url = new URL(_url);
            PaymentExecution_Service  service=new PaymentExecution_Service(url,PAYMENTEXECUTION_QNAME);               
            PaymentExecution soap= service.getPaymentExecutionSOAP();                               
            TransactionInfoType typeInfo=new TransactionInfoType();          
       //    typeInfo.setPRefNum(value);
            typeInfo.setUserId(_CLIENT);
            typeInfo.setClientCode(_CLIENT_CODE);           
            typeInfo.setCRefNum("012344321");
            BranchInfoType branchInfoType=new BranchInfoType();
            branchInfoType.setBranchCode(_BRAND_CODE);
          
            ExecutePaymentInternalInType executePaymentInternalInType=new ExecutePaymentInternalInType();
          
            CIFInfoType fInfoType=new CIFInfoType();
            fInfoType.setCIFNum("");
           
           executePaymentInternalInType.setTransactionInfo(typeInfo);
           executePaymentInternalInType.setMakerCif(fInfoType);
           
           AccountInfoType accountInfoType =new AccountInfoType();
           accountInfoType.setAccountNum(_accountCredit);
          
           AccountInfoType accountDes =new AccountInfoType();
           accountDes.setAccountNum(_accountDebit);
           
           executePaymentInternalInType.setDestinationAccount(accountDes);
           executePaymentInternalInType.setSrcAccount(accountInfoType);
           ExecutePaymentInternalOutType out=  soap.executePaymentInternal(executePaymentInternalInType);
           
           System.out.println("testPayment.Payment.send()"+out.getTransactionInfo().getTransactionErrorCode());
          
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
           return false;
        }      
        return true;
        
    }
    
}
