///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.ocb.ttt.cms.service.impl;
//
//import com.ocb.ttt.cms.service.ServiceImportExcelDHKT;
//import com.ocb.ttt.dhkt.model.Student_TMP;
//import com.ocb.ttt.dhkt.service.ImportFileSV;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//import ocb.ttt.common.anotion.ConfigValue;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author toanhv1
// */
//@Service
//public class ServiceImportExcelDHKTImpl implements ServiceImportExcelDHKT{
//
//    @ConfigValue(Value = "file_excel_dhkt")
//    private String fileName;
//    @ConfigValue(Value = "DS_ID_DHKT_Total")
//    private String fileNameUpdate;
//    @Autowired
//    ImportFileSV importFileSV;
//    
//    @Override
//    public String importFile() throws IOException{
//        
//        List<Student_TMP> list=new ArrayList<>();
//        FileInputStream excelFile = new FileInputStream(new File(fileName));
//        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);     
//        Sheet datatypeSheet = workbook.getSheetAt(0);
//        Iterator<Row> iterator = datatypeSheet.iterator();       
//        while (iterator.hasNext()) {                     
//            
//             Student_TMP student=new Student_TMP();            
//             Row currentRow = iterator.next();       
//             if(!checkRowData(currentRow))
//             {
//                 continue;
//             }
//             String EMPLOYER=getValueCell(currentRow.getCell(1));
//             String FULL_NAME=getValueCell(currentRow.getCell(2));
//             String BIRTH_DATE= getValueCell(currentRow.getCell(3));
//             String BIRTH_CITY= getValueCell(currentRow.getCell(4));
//             String GENDER=getValueCell(currentRow.getCell(5));
//             String CLASS=getValueCell(currentRow.getCell(6));
//             String COURSE=getValueCell(currentRow.getCell(7));
//             String CLASS_YEAR=getValueCell(currentRow.getCell(8));
//             String IDMifare=getValueCell(currentRow.getCell(9));
//             String HEX_CODE=getValueCell(currentRow.getCell(10));
//             String LEGAL_ID=getValueCell(currentRow.getCell(11));
//             String ADDRESS=getValueCell(currentRow.getCell(13));
//             String CLIENT_CODE =getValueCell(currentRow.getCell(14));
//             String RBS_number=getValueCell(currentRow.getCell(15));
//             String PHONE_NUMBER=getValueCell(currentRow.getCell(16));
//                         
//             //String TITLE=currentRow.getCell(15).getStringCellValue(); 
//                              
//             String TITLE=GENDER.equals("Nữ")?"MISS":"MR";             
//            if(HEX_CODE.isEmpty()&&CLIENT_CODE.isEmpty()){
//                 break;
//            }  
//            if(getValueCell(currentRow.getCell(0)).isEmpty())
//            {
//                continue;
//            }
//            String [] ar=BIRTH_DATE.split("/");
//            String dateTime="";
//            if(ar.length>2)
//            {
//                dateTime=ar[2]+ar[1]+ar[0];
//            } 
//            student.setEMPLOYER(EMPLOYER);
//            student.setFULL_NAME(FULL_NAME);
//            student.setBIRTH_DATE(dateTime);
//            student.setBIRTH_CITY(BIRTH_CITY);
//            student.setGENDER(GENDER.equals("Nữ")?"F":"M");
//            student.setCLASS(CLASS);
//            student.setCOURSE(COURSE);
//            student.setCLASS_YEAR(CLASS_YEAR);
//            student.setIDMifare(IDMifare);
//            student.setHEX_CODE(HEX_CODE);
//            student.setLEGAL_ID(LEGAL_ID);
//            student.setADDRESS1(ADDRESS);
//            student.setCLIENT_CODE(CLIENT_CODE);
//            student.setACCOUNT1(RBS_number);
//            student.setMOBILE_PHONE(PHONE_NUMBER);
//            student.setAUTHORIZE("N");
//            student.setTITLE(TITLE);
//            student.setBTACH_ID(getSQN());
//            list.add(student);                          
//         }
//        
//       HashMap<String,Object> status=importFileSV.importToDB(list);
//        
//               
//       return "";
//    }
//    
//    @Override
//    public String updateFile() throws IOException{
//        
//        List<Student_TMP> list=new ArrayList<>();
//        FileInputStream excelFile = new FileInputStream(new File(fileNameUpdate));
//        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);     
//        Sheet datatypeSheet = workbook.getSheetAt(0);
//        Iterator<Row> iterator = datatypeSheet.iterator();       
//        while (iterator.hasNext()) {                     
//            
//             Student_TMP student=new Student_TMP();            
//             Row currentRow = iterator.next();       
//             if(!checkRowDataUpdate(currentRow))
//             {
//                 continue;
//             }
//             String HEX_CODE  =getValueCell(currentRow.getCell(1)).trim();
//             String CARD_NUMBER =getValueCell(currentRow.getCell(2)).trim();                
//            if(HEX_CODE.isEmpty()){
//                 break;
//            }  
//            if(getValueCell(currentRow.getCell(0)).isEmpty())
//            {
//                continue;
//            }
//             student.setHEX_CODE(HEX_CODE);
//             student.setCARD_NUMBER(CARD_NUMBER);
//
//             list.add(student);             
//             
//         }
//        
//       HashMap<String,Object> status=importFileSV.updateToDB(list);
//       return "";
//    }
//    
//    private boolean checkRowData(Row row)
//    {
//        if(row.getCell(0)!=null&&row.getCell(0).getCellTypeEnum()==CellType.NUMERIC)
//        {
//            return true;
//        }else
//        {
//            return false;
//        }
//    }
//    private boolean checkRowDataUpdate(Row row)
//    {
//        if(row.getCell(0)!=null && !row.getCell(0).getStringCellValue().trim().equalsIgnoreCase("stt"))
//        {
//            return true;
//        }else
//        {
//            return false;
//        }
//    }
//    private String getValueCell(Cell cell)
//    {
//        if(cell==null) return "";
//        String value="";
//        if(cell.getCellTypeEnum()==CellType.NUMERIC)
//        {            
//           double d=cell.getNumericCellValue();
//           value=  new DecimalFormat("#").format(d);
//        }else if(cell.getCellTypeEnum()==CellType.BLANK)
//        {
//            return "";
//        }else
//        {
//             value=cell.getStringCellValue();
//        }
//        return value;
//    }
//    
//    private String getSQN()
//    {
//        Date date=new Date();        
//        String ms="";
//        Random ran=new Random();        
//        SimpleDateFormat f = new SimpleDateFormat("yyyMMdd");
//        String dateStr = f.format(date);        
//        String h=date.getHours()>=10?String.valueOf(date.getHours()):"0"+String.valueOf(date.getHours());
//        String m=date.getMinutes()>=10?String.valueOf(date.getMinutes()):"0"+String.valueOf(date.getMinutes());
//        String s=date.getSeconds()>=10?String.valueOf(date.getSeconds()):"0"+String.valueOf(date.getSeconds());       
//        ms=h+m+s;
//        return ms;
//    }
//    
//    
//}
