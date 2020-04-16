/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.sevice.security;


import com.ocb.ttt.service.dto.UserAPI;
import java.util.List;

/**
 *
 * @author toanhv1
 */
public class ServiceUserLogin {
    
    private List<UserAPI> listUser;

    public List<UserAPI> getListUser() {
        return listUser;
    }
    public void setListUser(List<UserAPI> listUser) {
        this.listUser = listUser;
    }
    public UserAPI getUser(String user,int role)
    {
        UserAPI uApi=new UserAPI();
        for(int i=0;i<listUser.size();i++)
        {
            if(listUser.get(i).getUser().equals(user)&(listUser.get(i).getRole()==role))
            {               
                uApi=listUser.get(i);
                return uApi;
            }
        }        
        return uApi;
    }
    public boolean hashContent(String user,String pw,int role)
    {
      
        for(int i=0;i<listUser.size();i++)
        {
            if(listUser.get(i).getPw().equals(pw)&listUser.get(i).getUser().equals(user)&(listUser.get(i).getRole()==role))
            {                               
                return true;
            }
        }        
        return false;
    }
   
    
    
}
