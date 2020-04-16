/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.hash;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class AES256 {

    private String ips;
    private Key keySpec;

    private static AES256 instance;

    public static SecretKeySpec  secretKeySpec(String keySeed) throws Exception {
       
        SecretKeySpec  key = new SecretKeySpec(Hex.decodeHex(keySeed),"AES");
       
        return key;
    } 

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
   
    public static String encrypt(String input, String secret) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
         Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");    
        
        int blockSize =16;
            byte[] dataBytes = input.getBytes();
            int plaintTextLength = dataBytes.length;
            if (plaintTextLength % blockSize != 0) {
                plaintTextLength = plaintTextLength + (blockSize - (plaintTextLength % blockSize));
            }
            byte[] plainTextBytes = new byte[plaintTextLength];            
            plainTextBytes=Arrays.copyOf(dataBytes, plaintTextLength);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec(secret));
       
        byte[] encrypted =   cipher.doFinal(plainTextBytes);
        //  System.out.println("ocb.ttt.common.hash.AES256.encrypt()"+toHexString(encrypted));
        
        return new String(Hex.encodeHex(encrypted)).toUpperCase();  
       // return DatatypeConverter.printHexBinary(encrypted).toUpperCase();
    }    
   
    public static byte [] decrypt(byte[] input, String key) {
                
        byte[] output = null;
        Security.addProvider(new BouncyCastleProvider());
        try {
          // SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec(key));
            output = cipher.doFinal(input);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return (output);
    }
    
    public  static String decrypt(String input,String key)
    {
                
        byte[] output = null;
        Security.addProvider(new BouncyCastleProvider());
        try {
          // SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding","BC");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec(key));
            output = cipher.doFinal(hexStringToByteArray(input));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return new String(output);
    }

    public static String convertHexToString(String hex) {

        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        //49204c6f7665204a617661 split into two characters 49, 20, 4c...
        for (int i = 0; i < hex.length() - 1; i += 2) {

            //grab the hex in pairs
            String output = hex.substring(i, (i + 2));
            //convert hex to decimal
            int decimal = Integer.parseInt(output, 16);
            //convert the decimal to character
            sb.append((char) decimal);

            temp.append(decimal);
        }
       // System.out.println("Decimal : " + temp.toString());

        return sb.toString();
    }

    public static byte[] toByteArray(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }

    public static void main(String[] args) {

        String key = "E6674965D7D1081472A58A31B5E1F2A9BFFA370F8FECAD5390A686C9D4EAD349";
        String text = "ocb";
        try {
          
                        
            String en=encrypt(text, key);        
           
            System.out.println("ocb.ttt.common.hash.AES256.main()" +en );
            
           byte[] de=en.getBytes();
           
            String d= decrypt(en,key);
            System.out.println("ocb.ttt.common.hash.AES256.main()"+d);
           
           
            
                        
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static String bytesToHex(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashInBytes.length; i++) {
            sb.append(Integer.toString((hashInBytes[i] & 0xff) + 0x100, 16).substring(1).toUpperCase());
        }
        return sb.toString();

    }
    private static String bytesToHex1(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashInBytes.length; i++) {
            sb.append(Integer.toString((hashInBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();

    }

    private static String bytesToHex2(byte[] hashInBytes) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hashInBytes.length; i++) {
            String hex = Integer.toHexString(0xff & hashInBytes[i]);
            if (hex.length() == 1) sb.append('0');
            sb.append(hex);
        }
        return sb.toString();

    }

}
