/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.db.connection;

import com.ocb.ttt.common.security.key.PasswordAES;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.crypto.SecretKey;
import ocb.ttt.common.anotion.ConfigValue;
import ocb.ttt.common.hash.AES256;


public class OCBDriverManagerDataSource extends org.springframework.jdbc.datasource.DriverManagerDataSource{
      
    private String key="";
    @ConfigValue(Value = "password_keystore")
    String password="ttt@123";
    @ConfigValue(Value = "fileName_keystore")
    final String fileName="keystore.jceks";
    @ConfigValue(Value = "alias_keystore_db")
    private final String alia="256bitkey";
    
      
    @PostConstruct
    public void init() {           
        PasswordAES passwordAES=new PasswordAES(password, fileName);
       // System.out.println("com.ocb.ttt.common.security.key.PasswordAES.main()"+PasswordAES.getKeyWithAlias("key_soa"));
        key=  passwordAES.getKey(alia);
    }    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }  
    @Override
    public String getPassword()
    {
        return deEncrypt();
    }    
    private String deEncrypt()
    {        
        return AES256.decrypt(super.getPassword(), key);
    }
//    private  Connection getconnection() throws SQLException
//    {
//        String user=super.getUsername();
//        String pw=deEncrypt();        
//        String url=super.getUrl();
//       try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.
//                getConnection(url,user,pw);
//                       System.out.println("Created DB Connection....");
//                       return con;
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//       return null;
//       
//    }
//    @Override
//     protected Connection getConnectionFromDriver(Properties props) throws SQLException {
//        
//         if(connection==null)connection=getconnection();  
//         
//         if(connection.isClosed())
//         {
//            connection.close();
//            connection=getconnection(); 
//         }
//         return connection;
//         
//    }
    
    
}
