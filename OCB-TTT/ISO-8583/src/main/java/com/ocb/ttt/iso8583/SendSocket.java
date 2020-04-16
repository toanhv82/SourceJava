/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.iso8583;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.packager.GenericPackager;


/**
 *
 * @author toanhv1
 */
public class SendSocket {

    static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static void main(String[] args) {

        try {
            SendSocket sendSocket = new SendSocket();       
            
          //  sendSocket.readData();
           
          sendSocket.request();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void request()
    {
        try
        {
            ISOMsg request=setData();
            byte [] b=request.pack();
            String t=String.valueOf(b.length);               
            for(int i=0;i<4-t.length();i++)
            {
                t="0"+t;
            }      
            byte[] b2=t.getBytes();
            
            byte[] data=Arrays.copyOf(b2, b.length+b2.length);
            for(int i=0;i<b.length;i++)
            {
                data[i+b2.length]=b[i];
            }           
            byte[] result= networkTransport(data);
            response(result);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private String getLength(int length)
    {
       
            String t=String.valueOf(length);               
            for(int i=0;i<4-t.length();i++)
            {
                t="0"+t;
            }      
           return t;
        
    }
    
    private void readData()
    {
      //  String data="0200F638401F08C0A0100000600004000000169704480862105552012000000020000000000020000000021816311485755416311402186011000000000000000000000000000000000697048901180985755470400006000000070400006704704003SML000000000000000000000000160008100010772005";
       // String data="0210F638401F0AC0A010000060000400000016970448020822770601200000001000000000001000000011081617378948751617371108601100300000000000000003000000000000069704899008098948755190400007000000090400007704704003SML000000000000000000000000160005100004831007";
        String data="0200F638401F08C0A0140000600004000000165286430290951857002000000000129800003008115000011701384861195401384801175968000000000000000010938600000000000600328600176161195400196794196794000194591840704003SML005SALES000000000000000000000000160019100012340007";
        data=getLength(data.length())+data;
        
        try
        {
            response(data.getBytes());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    
    }
    
    private String response(byte[] res) throws Exception {
   
        byte [] h= Arrays.copyOf(res, 4);
        int length=ISOUtil.parseInt(h)+1;
        byte [] input=new byte[length+1]; 
       // System.out.println("com.ocb.ttt.iso8583.SendSocket.response()"+res.length);
        for(int i=0;i<length-1;i++)
        {
            input[i]=res[i+4];
        }
        
        InputStream inputStream= new FileInputStream(getFile("response.xml"));
        
        GenericPackager packager = new GenericPackager(inputStream);
        
       // GenericPackager packager = new GenericPackager("D:/project/ProjectJava/CardCenter/CardCenter/OCB-TTT/ISO-8583/src/main/resources/T24.xml");
       
        ISOMsg isoMsg = new ISOMsg();
        isoMsg.setPackager(packager);
        isoMsg.unpack((input));
        
        /* 
       isoMsg.setMTI("0800");
       //isoMsg.set(0, "TEMENOSG.ISO");       
       isoMsg.set(1, "0");  
       isoMsg.set(7, "1109071245");
       isoMsg.set(11, "103814");
       isoMsg.set(70, "301");
         */
        // print the DE list
        logISOMsg(isoMsg);   
       // byte[] data = isoMsg.pack();     
        return new String(h);       

    }
    
    private ISOMsg setData() throws ISOException {
        
       try
       {
        InputStream inputStream= new FileInputStream(getFile("T24.xml"));
        
        GenericPackager packager = new GenericPackager(inputStream);
           
       ISOMsg isoMsg = new ISOMsg();
       isoMsg.setPackager(packager);        
       isoMsg.setMTI("0200");       
       isoMsg.set(2, "9704480208227706");  
       isoMsg.set(3, "002000");
       isoMsg.set(4, "000000001000");
       isoMsg.set(6, "000000100000");
       isoMsg.set(7, "110892853");
       isoMsg.set(12, "183217");
       isoMsg.set(11, "926772");
       isoMsg.set(13, "0218");
       //isoMsg.set(18, "6011"); //for ATM
       isoMsg.set(18, "5968"); //for POST       
       isoMsg.set(28, "000000010000");
       isoMsg.set(29, "000000000000");
       isoMsg.set(30, "000000000000");
       isoMsg.set(31, "000000000000");
      // isoMsg.set(32, "970489");    
       isoMsg.set(32, "00");     
       isoMsg.set(37, "900809894875");
       isoMsg.set(41, "00196794");
       isoMsg.set(42, "000000070400006");
       isoMsg.set(49, "704");       
       isoMsg.set(51, "704");
       isoMsg.set(60, "ONUS");
       // isoMsg.set(60, "MAST");
       isoMsg.set(62, "SALES");
       isoMsg.set(82, "000000000000");
       isoMsg.set(83, "000000000000");
       //isoMsg.set(102, "0001100014339009");
       isoMsg.set(102, "0019100012340007");
       printISOMessage(isoMsg);   
      //0200F638401F08C0A0100000600004000000169704480862105552012000000020000000000020000000021816311485755416311402186011000000000000000000000000000000000697048901180985755470400006000000070400006704704003SML000000000000000000000000160008100010772005 
        byte[] data = isoMsg.pack();
      String r=new String(data);
      r=getLength(data.length)+r;
      System.out.println(r);
        
        return isoMsg;
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return null;
    }
    public static final byte[] intToByteArray(int value) {
    return new byte[] {
            (byte)(value >>> 24),
            (byte)(value >>> 16),
            (byte)(value >>> 8),
            (byte)value};
}
    private static void logISOMsg(ISOMsg msg) {
        System.out.println("----ISO MESSAGE-----");
        try {
            System.out.println("  MTI : " + msg.getMTI());
            for (int i = 1; i <= msg.getMaxField(); i++) {
                if (msg.hasField(i)) {
                    System.out.println("    Field-" + i + " : " + msg.getString(i));
                }
            }
        } catch (ISOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("--------------------");
        }
    }

    private byte[] networkTransport(byte[] data) throws UnknownHostException, Exception {
       // Socket connection = new Socket("10.96.20.45", 4009);
        Socket connection = new Socket("10.96.21.32", 4009);
        OutputStream dOut = connection.getOutputStream();
        // dOut.write(data.length); // write length of the message
        dOut.write(data);
       // dOut.flush();
        Thread.sleep(2000);
        InputStream in = connection.getInputStream();
        byte[] messageByte = new byte[1024];   
        
        in.read(messageByte);       
        System.out.println("---:"+new String(messageByte));           
        connection.close();
        return messageByte;
    }

   public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
    private void printISOMessage(ISOMsg isoMsg) {
        try {
            System.out.printf("MTI = %s%n", isoMsg.getMTI());
            for (int i = 1; i <= isoMsg.getMaxField(); i++) {
                if (isoMsg.hasField(i)) {
                    System.out.printf("Field (%s) = %s%n", i, isoMsg.getString(i));
                }
            }
        } catch (ISOException e) {
            e.printStackTrace();
        }
    }
    private File getFile(String fileName) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            // System.out.println("com.ocb.ttt.common.util.LoadFileClassPath.getFile");
            return new File(classLoader.getResource(fileName).getFile());

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }

}
