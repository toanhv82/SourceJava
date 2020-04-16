/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.login.service;

/**
 *
 * @author toanhv1
 */
import com.ocb.ttt.common.log.LoggerLoader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

public class LdapAuthen {

    private static final LoggerLoader logger = new LoggerLoader(LdapAuthen.class);

    /*
	 * return value ** 1: User tồn tại và enable ** 0: User tồn tại và disable **
	 * -1: User không tồn tại ** -2: Lỗi
     */
    public static Integer loginLDAP(String userId, String password, String domainName, String ldapServer) {
        userId = userId.trim();
        password = password.trim();
        domainName = domainName.trim();
        ldapServer = ldapServer.trim();

        String searchBase = "";// = "dc=ocb,dc=vn";
        String ldapHost = "ldap://" + ldapServer;
        int i = domainName.lastIndexOf('.');
        if (i > 0 && i < domainName.length()) {
            searchBase = "dc=" + domainName.substring(0, i) + ",dc=" + domainName.substring(i + 1, domainName.length());
        } else {
            logger.error(userId + " Error in  loginLDAP: -2");
            return -2;
        }
        String returnedAtts[] = {"sn", "givenName", "mail", "userAccountControl"};
        String searchFilter = "(&(objectClass=user)(sAMAccountName=" + userId + "))";
        //Create the search controls
        SearchControls searchCtls = new SearchControls();
        searchCtls.setReturningAttributes(returnedAtts);
        //DBCommon.writeDbDetailLog("Authen", logID, requestObject.Username + "^^" + requestObject.Password);
        //Specify the search scope
        searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapHost);        
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, userId + "@" + domainName);
        env.put(Context.SECURITY_CREDENTIALS, password);
        LdapContext ctxGC;
        try {
            ctxGC = new InitialLdapContext(env, null);
            //Search objects in GC using filters
            NamingEnumeration answer = ctxGC.search(searchBase, searchFilter, searchCtls);
            while (answer.hasMoreElements()) {
                SearchResult sr = (SearchResult) answer.next();
                Attributes attrs = (Attributes) sr.getAttributes();
                Map amap;
                if (attrs != null) {
                    amap = new HashMap();
                    NamingEnumeration ne = attrs.getAll();
                    while (ne.hasMore()) {
                        Attribute attr = (Attribute) ne.next();
                        amap.put(attr.getID(), attr.get());
                    }
                    ne.close();
                }
                logger.info(userId + " Login Successful");
                return 1;
            }
            logger.error(userId + " Error in  loginLDAP: -1");
            return -1;

        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error(userId + " Exception in  loginLDAP: -1: " + ex.getMessage());
            return -1;
        }
    }

    public static Integer checkLDAP(String userId, String password, String domainName, String ldapServer, String checkUserId) {
        userId = userId.trim();
        password = password.trim();
        domainName = domainName.trim();
        checkUserId = checkUserId.trim();

        String searchBase = "";// = "dc=ocb,dc=vn";
        String ldapHost = "ldap://" + ldapServer;
        int i = domainName.lastIndexOf('.');
        if (i > 0 && i < domainName.length()) {
            searchBase = "dc=" + domainName.substring(0, i) + ",dc=" + domainName.substring(i + 1, domainName.length());
        } else {
            logger.error(userId + " Error in  checkLDAP: -2");
            return -2;
        }

        String returnedAtts[] = {"sn", "givenName", "mail", "userAccountControl"};
        String searchFilter = "(&(objectClass=user)(sAMAccountName=" + checkUserId + "))";
        //Create the search controls
        SearchControls searchCtls = new SearchControls();
        searchCtls.setReturningAttributes(returnedAtts);
        //DBCommon.writeDbDetailLog("Authen", logID, requestObject.Username + "^^" + requestObject.Password);
        //Specify the search scope
        searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapHost);
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, userId + "@" + domainName);
        env.put(Context.SECURITY_CREDENTIALS, password);
        LdapContext ctxGC;
        try {
            ctxGC = new InitialLdapContext(env, null);
            //Search objects in GC using filters
            NamingEnumeration answer = ctxGC.search(searchBase, searchFilter, searchCtls);
            while (answer.hasMoreElements()) {
                SearchResult sr = (SearchResult) answer.next();
                Attributes attrs = (Attributes) sr.getAttributes();
                Map amap;
                if (attrs != null) {
                    amap = new HashMap();
                    NamingEnumeration ne = attrs.getAll();
                    while (ne.hasMore()) {
                        Attribute attr = (Attribute) ne.next();
                        amap.put(attr.getID(), attr.get());
                    }
                    ne.close();
                }
                logger.info(checkUserId + " checkLDAP Successful");
                return 1;
            }
            logger.error(checkUserId + " Error in  checkLDAP: -1");
            return -1;
        } catch (Exception ex) {
            logger.error(checkUserId + " Exception in  checkLDAP: -1: " + ex.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        
        String user="Toanhv1";
        String pw="Abc@123";
        String url="oricombank.vn"; 
        String domain="oricombank.vn";
        
        int status=LdapAuthen.loginLDAP(user, pw, domain, url);
        
        System.out.println("com.ocb.ttt.login.LdapAuthen.main():"+status);

    }

}
