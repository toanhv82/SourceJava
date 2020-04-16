/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.mail;

import com.ocb.ttt.service.controler.MainControler;
import com.sun.mail.smtp.SMTPTransport;
import java.util.Properties;
import org.springframework.stereotype.Service;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


import ocb.ttt.common.anotion.ConfigValue;
import org.apache.log4j.Logger;

/**
 *
 * @author toanhv1
 */
@Service
public class SendMail {

    private static Logger logger = Logger.getLogger(SendMail.class);
    @ConfigValue(Value = "SMTP_SERVER")
    private   String SMTP_SERVER = "mail.ocb.com.vn";
    @ConfigValue(Value = "USERNAME")
    private   String USERNAME = "card_center";
    @ConfigValue(Value = "PASSWORD")
    private   String PASSWORD = "Pui&678";
    @ConfigValue(Value = "SMTP_PORT")
    private String PORT="587";
    @ConfigValue(Value = "EMAIL_FROM_CARD")
    private String email_from;

   // private static final String EMAIL_FROM = "From@gmail.com";
   // private static final String EMAIL_TO = "email_1@yahoo.com, email_2@gmail.com";
   /// private static final String EMAIL_TO_CC = "";

  ///  private static final String EMAIL_SUBJECT = "Test Send Email via SMTP (ATTACHMENT)";
   /// private static final String EMAIL_TEXT = "Hello Java Mail \n ABC123";

    public void SendMail(String email_from, String email_to, String email_cc, String subject, String content) throws MessagingException{

        Properties properties = new Properties();
        properties.put("mail.smtp.host", SMTP_SERVER);
        properties.put("mail.transport.protocol", "smtp");
        //properties.put("mail.smtps.ssl.enable", "false");      
        properties.put("mail.smtp.user", USERNAME);
        properties.put("mail.smtp.password", PASSWORD);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", PORT); // default port 25
        
         Session session = Session.getDefaultInstance(properties,  
            new javax.mail.Authenticator() {  
              protected PasswordAuthentication getPasswordAuthentication() {  
            return new PasswordAuthentication(USERNAME,PASSWORD);  
              }  
            });  
   
            Message msg = new MimeMessage(session);
            Multipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();            
            messageBodyPart.setContent(content, "text/html; charset=utf-8");
            messageBodyPart.setHeader("content-transfer-encoding", "base64");
            multipart.addBodyPart(messageBodyPart);
                        
            msg.setFrom(new InternetAddress(email_from));
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email_to, false));
            msg.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(email_cc, false));
            msg.setSubject(subject);

            msg.setContent(multipart);
            Transport.send(msg);  
            logger.info("SENT MAIL to:"+email_to);
       
    }
    
    public static void main(String[] args) {
        
        SendMail mail=new SendMail();
        String email_from="card_center@ocb.com.vn";
        String email_to="hiepnp@ocb.com.vn";
        String subject="Thong Bao Mo The Tai OCB";
        String content="";     
        try
        {
          UtilEmail email=new UtilEmail();
          String message = email.LoadFile("c:/cms/temp_email_flc");          
           mail.SendMail(email_from, email_to, "", subject, message);
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
