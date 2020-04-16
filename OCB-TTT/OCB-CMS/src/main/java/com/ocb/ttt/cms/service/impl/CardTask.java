/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import com.ocb.ttt.cms.model.request.CardProcess;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author toanhv1
 */

public abstract class CardTask implements Runnable{

    private List<CardProcess> list;
    private String user;
    private HttpServletRequest request;
    public CardTask(List<CardProcess> list,String user,HttpServletRequest request)
    {
        this.list=list;
        this.user=user;
        this.request=request;
    }    
    @Override
    public void run() {
        
        process(list, user,request);
        
    }
    protected abstract HashMap<String, Object> process(List<CardProcess> list, String user,HttpServletRequest request);

    public List<CardProcess> getList() {
        return list;
    }

    public void setList(List<CardProcess> list) {
        this.list = list;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
}
