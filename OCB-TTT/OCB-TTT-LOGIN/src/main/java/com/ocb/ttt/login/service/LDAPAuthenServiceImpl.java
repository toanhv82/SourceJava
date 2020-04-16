/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.login.service;

import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class LDAPAuthenServiceImpl implements LDAPAuthenService{

    @ConfigValue(Value = "ldap_ldapServer")
    private String ldapServer;
    @ConfigValue(Value = "ldap_domain")
    private String domainName;
    
    public boolean loginLDAP(String userId, String password) {   
     System.out.println("loginLDAP.ldapServer:"+ldapServer);
     System.out.println("LDAPAuthenServiceImpl.domainName:"+domainName);
     return LdapAuthen.loginLDAP(userId, password, domainName, ldapServer)==1;
    }
    
}
