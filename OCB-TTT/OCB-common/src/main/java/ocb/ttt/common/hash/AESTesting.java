/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.hash;
import java.io.UnsupportedEncodingException;
import java.security.Security;
 
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
 
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
 
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 
 
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESTesting {
 
    //add new bouncycastle ciphers
    static {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
	}
 
    public static void main(String[] args) {
 
        // encryption key should be multiple of 16 character long
        //String key = "abcdefghijklmnop";
        String key = "E6674965D7D1081472A58A31B5E1F2A9BFFA370F8FECAD5390A686C9D4EAD349";
        String data = "{\"CardNumber\":\"1234\"}";
 
        String encrypted = AESTesting.encrypt(data, key);
        System.out.println("ENC: " +  encrypted);
        //Decrypt from AES256/ECB/PKCS7Padding
        String decrypted = AESTesting.decrypt(encrypted, key);
        System.out.println("DEC: " +  decrypted);
        //Decrypt from BP-Tools NoPadding
        String decryptedBP = AESTesting.decrypt("A061D99D02ACAD2DAA35EA21E386D917E7427C581011909FE930D3C45AEAF0C5", key);
        System.out.println("DECBP: " +  decryptedBP);
    }
 
    /**
     * encrypt input text
     *
     * @param input
     * @param key
     * @return
     */
    public static String encrypt(String input, String key) {
        byte[] crypted = null;
        try {
 
 			//ASCII KEY
            //SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            
            //HEX KEY
            SecretKeySpec skey = new SecretKeySpec(Hex.decodeHex(key.toCharArray()), "AES");
 
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            crypted = cipher.doFinal(Hex.decodeHex(Hex.encodeHexString(input.getBytes()).toCharArray()));
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
 
        //return new String(Base64.encodeBase64(crypted));
        return new String(Hex.encodeHex(crypted)).toUpperCase();

    }
 
    /**
     * decrypt input text
     *
     * @param input
     * @param key
     * @return
     */
    public static String decrypt(String input, String key){
        byte[] output = null;
        try {
            //ASCII KEY
            //SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            
            //HEX KEY
            SecretKeySpec skey = new SecretKeySpec(Hex.decodeHex(key.toCharArray()), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, skey);
            //output = cipher.doFinal(Base64.decodeBase64(input));
            output = cipher.doFinal(Hex.decodeHex(input.toCharArray()));

            return new String(output,"US-ASCII");
        } catch (Exception e) {
            System.out.println(e.toString());

            return "";
        }

    }
 
}