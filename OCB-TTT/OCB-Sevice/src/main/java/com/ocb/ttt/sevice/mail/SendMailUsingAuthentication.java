package com.ocb.ttt.sevice.mail;

import com.ocb.ttt.common.log.LoggerLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;

public class SendMailUsingAuthentication {

    public String SMTP_HOST_NAME;
    public String SMTP_AUTH_USER;
    public String SMTP_AUTH_PWD;
    public String SMTP_SIG_HTM;
    public String SMTP_BODY_HTM;
    public String SMTP_SIG_PICS;

    public void setSMTP_AUTH_PWD(String SMTP_AUTH_PWD) {
        this.SMTP_AUTH_PWD = SMTP_AUTH_PWD;
    }

    public void setSMTP_AUTH_USER(String SMTP_AUTH_USER) {
        this.SMTP_AUTH_USER = SMTP_AUTH_USER;
    }

    public void setSMTP_HOST_NAME(String SMTP_HOST_NAME) {
        this.SMTP_HOST_NAME = SMTP_HOST_NAME;
    }

    public String getSMTP_HOST_NAME() {
        return SMTP_HOST_NAME;
    }

    public void setSMTP_SIG_HTM(String SMTP_SIG_HTM) {
        this.SMTP_SIG_HTM = SMTP_SIG_HTM;
    }

    public void setSMTP_BODY_HTM(String SMTP_BODY_HTM) {
        this.SMTP_BODY_HTM = SMTP_BODY_HTM;
    }

    public void setSMTP_SIG_PICS(String SMTP_SIG_PICS) {
        this.SMTP_SIG_PICS = SMTP_SIG_PICS;
    }

    public void postMail(ArrayList<EmailBean> recipients, String subject, String message, String from, File[] file, boolean att)
            throws FileNotFoundException, IOException, InterruptedException {
        LoggerLoader log = new LoggerLoader(SendMailUsingAuthentication.class);// LoggerLoader.getLogger("SendMailUsingAuthentication");

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", this.getSMTP_HOST_NAME());
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
//        props.put("mail.smtp.port", "587");         // tripm yeu cau chuyen port

        Authenticator auth = new SMTPAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);

        session.setDebug(false);
        Message msg = new MimeMessage(session);

        InternetAddress addressFrom;
        try {
            addressFrom = new InternetAddress(from);
            msg.setFrom(addressFrom);
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }

        InternetAddress[] addressTo = new InternetAddress[1];

        for (int k = 0; k < recipients.size(); k++) {
            EmailBean recipient = recipients.get(k);
            try {
                log.info("-----------------------------------------------------");
                if (session == null) {
                    auth = new SMTPAuthenticator();
                    session = Session.getInstance(props, auth);
                    msg = new MimeMessage(session);
                    addressFrom = new InternetAddress(from);
                    msg.setFrom(addressFrom);
                }
                addressTo[0] = new InternetAddress(recipient.getAddress());
                msg.setRecipients(Message.RecipientType.TO, addressTo);
//                InternetAddress[] myBccList = InternetAddress.parse("huyvuad@gmail.com");
//                msg.addRecipients(Message.RecipientType.BCC, myBccList);

                msg.setSubject(subject);

                log.info("To: " + addressTo[0]);

                Multipart multipart = new MimeMultipart();

                File f = new File(this.SMTP_SIG_HTM);
                InputStream is = new FileInputStream(f);
                byte[] bytes = new byte[is.available()];
                is.read(bytes);
                String sig = new String(bytes, "UTF-8");

                BodyPart messageBodyPart = new MimeBodyPart();
                String s = message + sig;
                messageBodyPart.setContent(s, "text/html; charset=utf-8");
                multipart.addBodyPart(messageBodyPart);

                for (int i = 0; i < file.length; i++) {
                    messageBodyPart = new MimeBodyPart();
                    DataSource source = new FileDataSource(file[i]);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setHeader("Content-ID", "<the-img-" + i + ">");
                    messageBodyPart.setHeader("Content-Type", "image/gif");
                    messageBodyPart.setHeader("discrete-type", "image");
                    messageBodyPart.setHeader("content-transfer-encoding", "base64");
                    messageBodyPart.setFileName(file[i].getName());
                    messageBodyPart.setDisposition(MimeBodyPart.INLINE);
                    multipart.addBodyPart(messageBodyPart);
                }

                if (att == true) {
                    if (recipient.getAttachment().length == 0) {
                        log.info("Fail: without attach file " + addressTo[0]);
                        break;
                    }
                    for (int i = 0; i < recipient.getAttachment().length; i++) {
                        if (!recipient.getAttachment()[i].getName().isEmpty()) {
                            messageBodyPart = new MimeBodyPart();
                            messageBodyPart.setHeader("Content-Type", "text/pdf");
                            DataSource source = new FileDataSource(recipient.getAttachment()[i]);
                            messageBodyPart.setDataHandler(new DataHandler(source));
                            messageBodyPart.setFileName(recipient.getAttachment()[i].getName());
                            multipart.addBodyPart(messageBodyPart);

                            log.info("Attachment: " + recipient.getAttachment()[i].getName());
                        }

                    }
                    String attt = multipart.getBodyPart(4).getFileName();
                    log.info("attt " + attt);
                    if (attt == null) {
                        break;
                    }
                }

                msg.setContent(multipart);
                log.debug("begin send to: " + addressTo[0]);
                Transport.send(msg);
                log.debug("send Succ to: " + addressTo[0] + " Count " + k);
////                Thread.sleep(2000);
//                if ((k + 1) % 50 == 0) 
//                {
//                    log.debug("Sleep..................");
//                    Thread.sleep(30000);
//                    
//                    session = null;
//
//                }
            } catch (Exception e) {
                log.info("send fail to: " + addressTo[0] + " Count " + k + "\n" + e);
            }

            //                Thread.sleep(2000);
            if ((k + 1) % 40 == 0) {
                log.debug("Sleep..................");
                Thread.sleep(40000);

                session = null;

            }

        }
    }

    private class SMTPAuthenticator extends Authenticator {

        private SMTPAuthenticator() {
        }

        public PasswordAuthentication getPasswordAuthentication() {
            String username = SendMailUsingAuthentication.this.SMTP_AUTH_USER;
            String password = SendMailUsingAuthentication.this.SMTP_AUTH_PWD;
            return new PasswordAuthentication(username, password);
        }
    }

}
