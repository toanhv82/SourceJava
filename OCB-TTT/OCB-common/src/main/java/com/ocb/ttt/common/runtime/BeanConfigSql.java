/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.runtime;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import javax.annotation.PostConstruct;
import ocb.ttt.common.anotion.ConfigParamSQL;
import com.ocb.ttt.common.util.LoadConfigFile;
import com.ocb.ttt.common.util.LoadFileClassPath;
import java.io.IOException;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.util.ReflectionUtils;

/**
 *
 * @author Win 10
 */
public class BeanConfigSql extends InstantiationAwareBeanPostProcessorAdapter {

    private String fileName;

    final HashMap<String, String> hashMap = new HashMap<String, String>();

    @PostConstruct
    public void init() {
        loadAllKey();
    }

    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {

        ReflectionUtils.doWithFields(bean.getClass(), new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalAccessException {
                ConfigParamSQL annotation = field.getAnnotation(ConfigParamSQL.class);
                if (annotation == null) {
                    return;
                }
                String aValue = annotation.Value();
                ReflectionUtils.makeAccessible(field);
                if (field.getAnnotation(ConfigParamSQL.class) != null) {

                    field.set(bean, hashMap.get(aValue));
                }
            }
        }
        );
        return bean;
    }

    private void loadAllKey() {

        LoadFileClassPath fileClassPath = new LoadFileClassPath();       
        Properties prop = new Properties();
        try
        {
               prop.load(fileClassPath.getResource(fileName));
               
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        Set<Object> keys = prop.keySet();

        for (Object k : keys) {
            String key = (String) k;

            hashMap.put(key, prop.getProperty(key));

        };

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
