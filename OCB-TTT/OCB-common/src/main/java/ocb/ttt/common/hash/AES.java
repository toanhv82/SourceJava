/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.hash;

/**
 *
 * @author toanhv
 */
import com.ocb.ttt.common.log.LoggerLoader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;


public class AES {

    static final LoggerLoader logger = new LoggerLoader(AES.class);

    private static SecretKeySpec secretKey;
    private static byte[] key;

    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key,16);
            String st=new String(key);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            logger.error(e);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            logger.error(e);
        }
    }

    public static String encrypt(String strToEncrypt, String key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));
            //  String st= Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));  
            return DatatypeConverter.printBase64Binary(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
            //   return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));

        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
            logger.error("Error while encrypting:" + e);
        }
        return null;
    }

    public static String decrypt(String strToDecrypt, String key) {
        try {
            setKey(key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decoded = DatatypeConverter.parseBase64Binary(strToDecrypt);

            return new String(cipher.doFinal(decoded));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
            logger.error("Error while decrypting:" + e);
        }
        return null;
    }

    public static void main(String[] args) {

        String key = "Ocb@123";
        String text = "ocb";
        String encry = encrypt(text, key);
        System.out.println("com.payment.security.AES.main():" + encry);
        System.out.println("com.payment.security.AES.main():" + decrypt(encry, key));
    }
}
