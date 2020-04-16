/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.dhkt.service;

import com.ocb.ttt.dhkt.model.Student_TMP;
import com.ocb.ttt.dhkt.respository.ProcessDataDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ImportFileSV {
    
    @Autowired
    ProcessDataDao importFileDao;    
    
    public  HashMap<String,Object> importToDB(List<Student_TMP> list)
    {
        HashMap<String,Object> listStatus=new HashMap<String, Object>();
        for(Student_TMP item:list)
        {
           int r= importFileDao.addSvTmp(item);
           listStatus.put(item.getCLIENT_CODE(), r);
        }        
        return listStatus;
    }
       
    public  HashMap<String,Object> updateToDB(List<Student_TMP> list)
    {
        HashMap<String,Object> listStatus=new HashMap<String, Object>();
        String oldCarNumber = "";
        List<Student_TMP> listTMP= new ArrayList<Student_TMP>();
            listTMP = importFileDao.getAll();
        List<Student_TMP> listImport=new ArrayList<Student_TMP>();
        for(Student_TMP item:listTMP)
        {          
            boolean status=false;
            for(Student_TMP tmp:list)
            {
                if(item.getHEX_CODE()!=null && tmp.getHEX_CODE()!=null && !tmp.getHEX_CODE().isEmpty() 
                        && tmp.getHEX_CODE().equals(item.getHEX_CODE()))
                {
                    status=true;
                    oldCarNumber = importFileDao.getClientOldNumber(tmp.getCARD_NUMBER());
                    item.setCARD_NUMBER(tmp.getCARD_NUMBER());
                    item.setBASIC_CARD_NUMBER(oldCarNumber);
                    break;                    
                }
            }
            listImport.add(item);         
        }                    
        for(Student_TMP item:listImport)
        {
            //import to DB 
            importFileDao.updateCardNumber(item.getCARD_NUMBER(),item.getBASIC_CARD_NUMBER(),item.getCLIENT_CODE(),item.getHEX_CODE());
        }            
        return listStatus;
    }
}
