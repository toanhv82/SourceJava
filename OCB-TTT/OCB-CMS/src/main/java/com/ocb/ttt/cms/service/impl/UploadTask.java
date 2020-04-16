/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author toanhv1
 */
public abstract class UploadTask implements Runnable {

    private MultipartFile file;
    private String user;
    private HttpSession session;
    @Override
    public void run() {

        process(file, user,session);
            
    }
    
    public  UploadTask(MultipartFile _fInputStream,String _user,HttpSession _session)
    {
        this.file=_fInputStream;this.user=_user;this.session=_session;
    }
    
    protected abstract void process(MultipartFile file, String user,HttpSession _session);

}
