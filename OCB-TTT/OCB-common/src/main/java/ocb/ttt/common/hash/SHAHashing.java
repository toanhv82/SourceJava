/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 *
 * @author toanhv
 */
public class SHAHashing {

    public static void main(String[] args) throws Exception {
        System.out.println(SHAHashing.bytesToHex("Ocb@123"));
    }

    public static String bytesToHex( String password) {
        try
        {
        System.out.println("Hash : ....");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }      

        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        
        return  hexString.toString();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }
    public static String bytesToHex2( String password) {
        String sha1 = "";
        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(password.getBytes("UTF-8"));
            sha1 = AESECBNoPadding.bytesToHex(crypt.digest());
            } catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    return sha1;
    }
    public static String randomKey()
    {
        int max=10000;int min=0;
        Random rd=new Random();
        int r= rd.nextInt((max - min) + 1) + min;        
        return SHAHashing.bytesToHex2(String.valueOf("5421720065218508"));
                
    }
}
