/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.config.controller;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.config.service.FileStorageService;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import javax.servlet.http.HttpServletResponse;
import ocb.ttt.common.anotion.ConfigValue;


import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author toanhv1
 */
@Controller
public class ResourceController {
    
     private static LoggerLoader logger = new LoggerLoader(ResourceController.class);   
    
    @ConfigValue(Value = "folder_config")
    private String folder;  
    
    @ResponseBody
    @RequestMapping(value = "/resource/properties/{fileName}", method = RequestMethod.GET)    
    public void downloadFile(@PathVariable String fileName,HttpServletResponse response)
    {
        String filePro=folder+fileName+".properties";        
       try {

            //String fileName="archivo demo.pdf";
            File fileToDownload = new File(filePro);

            if (fileToDownload.exists()) {
                
                //get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(fileToDownload.getName());
			if (mimeType == null) {
				//unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);

			/**
			 * In a regular HTTP response, the Content-Disposition response header is a
			 * header indicating if the content is expected to be displayed inline in the
			 * browser, that is, as a Web page or as part of a Web page, or as an
			 * attachment, that is downloaded and saved locally.
			 * 
			 */

			/**
			 * Here we have mentioned it to show inline
			 */
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + fileToDownload.getName() + "\""));

			 //Here we have mentioned it to show as attachment
			 //response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) fileToDownload.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(fileToDownload));

                        FileCopyUtils.copy(inputStream, response.getOutputStream());
                
            }           
            
            
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        
        
        
    }
    
    
    
    
}
