/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.runtime;

import com.ocb.ttt.common.security.key.PasswordAES;
import java.lang.reflect.Field;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.util.ReflectionUtils;
import ocb.ttt.common.anotion.KeyValue;

/**
 *
 * @author toanhv1
 */
public class BeanConfigKeyValues extends InstantiationAwareBeanPostProcessorAdapter {
    
    private String fileName;
    private String password;
    
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    
    @PostConstruct
    public void init() {
       
    }
    
    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {

       final PasswordAES passwordAES=new PasswordAES(password, fileName);       
        
        ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalAccessException {
                
                KeyValue annotation = field.getAnnotation(KeyValue.class);
                if (annotation == null) {
                    return;
                }               
                String aValue =passwordAES.getKey(annotation.Value());                
                ReflectionUtils.makeAccessible(field);
                if (field.getAnnotation(KeyValue.class) != null) {
                    if (aValue == null || aValue.isEmpty()) {
                        field.set(bean, "");
                    } else if (field.getType().equals(Integer.class)) {

                        field.set(bean, Integer.valueOf(aValue));
                    } else {
                        field.set(bean, aValue);
                    }

                }
            }
        }
        );
        return bean;
    }    

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
}
