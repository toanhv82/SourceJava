/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.security.key;

import com.ocb.ttt.common.util.LoadFileClassPath;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.crypto.SecretKey;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.stereotype.Component;

/**
 *
 * @author toanhv1
 */
public class PasswordAES {

    private String password = "ttt@123";
    private String fileKeyStore = "keystore.jceks";
    private String typeKey = "JCEKS";//JCEKS

    public PasswordAES(String pw, String file) {
        this.password = pw;
        this.fileKeyStore = file;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFileKeyStore() {
        return fileKeyStore;
    }

    public void setFileKeyStore(String fileKeyStore) {
        this.fileKeyStore = fileKeyStore;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getKey(String alias) {
        try {
            char[] cPassword = password.toCharArray();
            //String alias = "256bitkey";

            KeyStore ks = KeyStore.getInstance(typeKey);
            LoadFileClassPath fileClassPath = new LoadFileClassPath();

            ks.load(fileClassPath.getResource(fileKeyStore), cPassword);
            SecretKey secretKey = (SecretKey) ks.getKey(alias, cPassword);
            return (new BigInteger(1, secretKey.getEncoded()).toString(16));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getKeyWithPCKS12(String alia, String pw, String pathFile) {
        try {
            KeyStore ks = KeyStore.getInstance("pkcs12");
            try (FileInputStream fis = new FileInputStream(pathFile)) {
                ks.load(fis, pw.toCharArray());

                char[] keyPassword = pw.toCharArray();
                KeyStore.ProtectionParameter entryPassword
                        = new KeyStore.PasswordProtection(keyPassword);
                KeyStore.Entry keyEntry = ks.getEntry(alia, entryPassword);
               
                SecretKey secretKey = (SecretKey) ks.getKey(alia, pw.toCharArray());
                return (new BigInteger(1, secretKey.getEncoded()).toString(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("com.ocb.ttt.common.security.key.PasswordAES.main()" + PasswordAES.getKeyWithPCKS12("key_soa", "ttt@123", "C:\\cms\\config\\keystore.p12"));
    }

}
