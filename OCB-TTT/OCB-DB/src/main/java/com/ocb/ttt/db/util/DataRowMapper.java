/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.db.util;

import com.ocb.ttt.anotaion.Key;
import com.ocb.ttt.common.log.LoggerLoader;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.ReflectionUtils;

/**
 *
 * @author toanhv
 */
public class DataRowMapper<T> implements RowMapper<T> {

    private static LoggerLoader logger = new LoggerLoader(DataRowMapper.class);
    private Class className;

    public DataRowMapper(Class cl) {
        this.className = cl;

    }

    public DataRowMapper() {
        this.className = this.getClass();
    }

    @Override
    public T mapRow(ResultSet rs, int i) {
        try {
            Class<T> objclass = className;
            Object obj = objclass.newInstance();
            // Object obj = className.newInstance();
            List<Field> f = getFieldByAnnotaionKey(className);
            for (Field field : f) {
                ReflectionUtils.makeAccessible(field);
                Key a = field.getAnnotation(Key.class);
                String col_name = a.Value();

                if (field.getType().isAssignableFrom(Integer.class)) {
                    ReflectionUtils.setField(field, obj, rs.getInt(col_name));
                } else if (field.getType().isAssignableFrom(long.class)) {
                    ReflectionUtils.setField(field, obj, rs.getLong(col_name));
                } else {
                    if (field.getType().isAssignableFrom(double.class)) {
                        ReflectionUtils.setField(field, obj, rs.getDouble(col_name));
                    } else {
                        ReflectionUtils.setField(field, obj, rs.getString(col_name));

                    }
                }

            }
            return (T) obj;
        } catch (Exception e) {
             logger.error(e);

            e.printStackTrace();
        }
        return null;
    }

    public List<T> mapRowList(ResultSet rs) {

        List<T> list = new ArrayList<T>();

        try {
            
            Class<T> objclass = className;
            while (rs.next()) {
                
                Object obj = objclass.newInstance();
                // Object obj = className.newInstance();
                List<Field> f = getFieldByAnnotaionKey(className);  
              
                if(className.equals(String.class))
                {
                    obj= rs.getString(1);
                    list.add((T)obj);
                    continue;
                }                
                for (Field field : f) {
                    ReflectionUtils.makeAccessible(field);
                    Key a = field.getAnnotation(Key.class);
                    String col_name = a.Value();
                    try
                    {
                    if (field.getType().isAssignableFrom(int.class)) {
                        ReflectionUtils.setField(field, obj, rs.getInt(col_name));
                    } else if (field.getType().isAssignableFrom(long.class)) {
                        ReflectionUtils.setField(field, obj, rs.getLong(col_name));
                    } else {
                        if (field.getType().isAssignableFrom(double.class)) {
                            ReflectionUtils.setField(field, obj, rs.getDouble(col_name));
                        } else {
                            ReflectionUtils.setField(field, obj, rs.getString(col_name));

                        }
                    }
                    }catch(SQLException e)
                    {
                        logger.error("INVALID COLUM:"+col_name);
                      //  e.printStackTrace();
                    }

                }
                
                list.add((T)obj);
                
                // ;
                
            }           
           
        } catch (Exception e) {

            logger.error(e);
            e.printStackTrace();
        }

        return list;
    }

    public void test() {
        List<Field> l = getFieldByAnnotaionKey(className);
    }

    private List<Field> getFieldByAnnotaionKey(Class className) {
        List<Field> fieldList = new ArrayList<Field>();
        if (className == null) {
            return fieldList;
        }
        if (className.getClass().getSuperclass() != null) {
            Field[] f = className.getDeclaredFields();
            for (Field item : f) {

                Key a = item.getAnnotation(Key.class);
                if (a != null) {
                    fieldList.add(item);
                }

            }
            List<Field> field2 = getFieldByAnnotaionKey(className.getSuperclass());
            fieldList.addAll(field2);
            return fieldList;
        } else {
            return fieldList;
        }
    }

}
