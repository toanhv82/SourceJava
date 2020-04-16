/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.hash;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESECBNoPadding {

    static private final int BASELENGTH = 128;
    static private final int LOOKUPLENGTH = 16;
    static final private byte[] hexNumberTable = new byte[BASELENGTH];
    static final private char[] lookUpHexAlphabet = new char[LOOKUPLENGTH];
    static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    static {
        for (int i = 0; i < BASELENGTH; i++) {
            hexNumberTable[i] = -1;
        }
        for (int i = '9'; i >= '0'; i--) {
            hexNumberTable[i] = (byte) (i - '0');
        }
        for (int i = 'F'; i >= 'A'; i--) {
            hexNumberTable[i] = (byte) (i - 'A' + 10);
        }
        for (int i = 'f'; i >= 'a'; i--) {
            hexNumberTable[i] = (byte) (i - 'a' + 10);
        }

        for (int i = 0; i < 10; i++) {
            lookUpHexAlphabet[i] = (char) ('0' + i);
        }
        for (int i = 10; i <= 15; i++) {
            lookUpHexAlphabet[i] = (char) ('A' + i - 10);
        }
    }

    /**
     * Convert hex string to byte array
     *     
* @param encoded encoded string
     * @return return array of byte to encode
     */
    static public byte[] hexToBytes(String encoded) {
        if (encoded == null) {
            return null;
        }
        int lengthData = encoded.length();
        if (lengthData % 2 != 0) {
            return null;
        }

        char[] binaryData = encoded.toCharArray();
        int lengthDecode = lengthData / 2;
        byte[] decodedData = new byte[lengthDecode];
        byte temp1, temp2;
        char tempChar;
        for (int i = 0; i < lengthDecode; i++) {
            tempChar = binaryData[i * 2];
            temp1 = (tempChar < BASELENGTH) ? hexNumberTable[tempChar] : -1;
            if (temp1 == -1) {
                return null;
            }
            tempChar = binaryData[i * 2 + 1];
            temp2 = (tempChar < BASELENGTH) ? hexNumberTable[tempChar] : -1;
            if (temp2 == -1) {
                return null;
            }
            decodedData[i] = (byte) ((temp1 << 4) | temp2);
        }
        return decodedData;
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

    /**
     * Convert byte array to hex string
     *     
* @param bytes
     * @return
     */
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static String encrypt(String key, String data) {

// Convert hexadecimal key to bytes
// byte[] keyBytes = hexToBytes(key);
        byte[] keyBytes = hexStringToByteArray(key);
        try {
            SecretKeySpec skeySpec = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");

// Handle padding
            int blockSize = cipher.getBlockSize();
            byte[] dataBytes = data.getBytes();
            int plaintTextLength = dataBytes.length;
            if (plaintTextLength % blockSize != 0) {
                plaintTextLength = plaintTextLength + (blockSize - (plaintTextLength % blockSize));
            }
            byte[] plainTextBytes = new byte[plaintTextLength];
            System.arraycopy(dataBytes, 0, plainTextBytes, 0, dataBytes.length);

            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

            byte[] encrypted = cipher.doFinal(plainTextBytes);

// Convert bytes to hexadecimal string
            return bytesToHex(encrypted);

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String key = "E6674965D7D1081472A58A31B5E1F2A9BFFA370F8FECAD5390A686C9D4EAD349";
        String data = "{\"CardNumber\":\"9704480221171220\"}";

        String encryptedData = encrypt(key, data);

        System.out.println(encryptedData);
    }

}
