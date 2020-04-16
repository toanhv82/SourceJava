/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.service.config;

import com.ocb.ttt.common.log.LoggerLoader;
import com.ocb.ttt.service.config.service.FileStorageService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import ocb.ttt.common.anotion.ConfigValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author toanhv1
 */
@Controller
public class MainController {
    
     private static LoggerLoader logger = new LoggerLoader(MainController.class);   
    
    @ConfigValue(Value = "folder_config")
    private String folder;
    
    @Autowired
    FileStorageService fileStorageService;
    
    @RequestMapping(value = "/resource/properties/{fileName}", method = RequestMethod.GET)    
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request)
    {
        String filePro=folder+fileName;        
         Resource resource = fileStorageService.loadFileAsResource(filePro);
         
         String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }
        
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
        
        
    }
    
    
    
    
}
