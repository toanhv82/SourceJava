/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.security.key;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.Certificate;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author toanhv1
 */
public class test {

    public static void main(String[] args) {

        String file = "C:\\cms\\config\\keystore.pfx";
        try {

            String fileName = file;
            char[] password = "ttt@123".toCharArray();
            String alias = "256bitkey";

            KeyStore ks = KeyStore.getInstance("pkcs12");
            try (FileInputStream fis = new FileInputStream(fileName)) {
                ks.load(fis, password);
                SecretKey secretKey = (SecretKey) ks.getKey(alias, password);
                System.out.println(new BigInteger(1, secretKey.getEncoded()).toString(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
