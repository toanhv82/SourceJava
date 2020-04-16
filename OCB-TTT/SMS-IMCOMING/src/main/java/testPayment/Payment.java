/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPayment;

import com.com.ttt.sms.BranchInfoType;
import com.ocb.ttt.esb.payment.AccountInfoType;
import com.ocb.ttt.esb.payment.CIFInfoType;

import com.ocb.ttt.esb.payment.ExecutePaymentInternalInType;
import com.ocb.ttt.esb.payment.ExecutePaymentInternalOutType;
import com.ocb.ttt.esb.payment.PaymentExecution;
import com.ocb.ttt.esb.payment.PaymentExecution_Service;
import com.ocb.ttt.esb.payment.TransactionInfoType;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author toanhv1
 */
public class Payment {
    public static void main(String[] args) {
        send();
    }
    
    private static void send()
    {
        URL url = null;
        try {
            QName PAYMENTEXECUTION_QNAME = new QName("http://bian.com.vn/PaymentExecution/", "PaymentExecution");
            url = new URL("http://10.96.23.111:8800/paymentexecution/v1/ws?wsdl");
            PaymentExecution_Service  service=new PaymentExecution_Service(url,PAYMENTEXECUTION_QNAME);  
             
           PaymentExecution soap= service.getPaymentExecutionSOAP();                               
           TransactionInfoType typeInfo=new TransactionInfoType();
          
       //    typeInfo.setPRefNum(value);
           typeInfo.setUserId("KSV");
           typeInfo.setClientCode("KSVTEST01");           
         //  typeInfo.setCRefNum("012344321");
           BranchInfoType branchInfoType=new BranchInfoType();
           branchInfoType.setBranchCode("VN0010168");
          
           ExecutePaymentInternalInType executePaymentInternalInType=new ExecutePaymentInternalInType();
          
           CIFInfoType fInfoType=new CIFInfoType();
           fInfoType.setCIFNum("");
        
          
           executePaymentInternalInType.setTransactionInfo(typeInfo);
           executePaymentInternalInType.setMakerCif(fInfoType);
           
           AccountInfoType accountInfoType =new AccountInfoType();
           accountInfoType.setAccountNum("VND1000106010001");
          
            AccountInfoType accountDes =new AccountInfoType();
           accountInfoType.setAccountNum("VND1754510020001");
           
           executePaymentInternalInType.setDestinationAccount(accountDes);
           executePaymentInternalInType.setSrcAccount(accountInfoType);
           ExecutePaymentInternalOutType out=  soap.executePaymentInternal(executePaymentInternalInType);
           
            System.out.println("testPayment.Payment.send()"+out.getTransactionInfo().getTransactionErrorCode());
          
        } catch (MalformedURLException ex) {
           ex.printStackTrace();
        }
      
        
        
    }
    
}
