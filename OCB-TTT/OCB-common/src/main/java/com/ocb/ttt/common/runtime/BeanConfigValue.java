/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.runtime;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.annotation.PostConstruct;
import ocb.ttt.common.anotion.ConfigValue;
import com.ocb.ttt.common.util.LoadConfigFile;
import com.ocb.ttt.common.util.LoadFileClassPath;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.util.ReflectionUtils;

/**
 *
 * @author Win 10
 */
public class BeanConfigValue extends InstantiationAwareBeanPostProcessorAdapter {

    private String fileName;
    private List<String> listFile;

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
                ConfigValue annotation = field.getAnnotation(ConfigValue.class);
                if (annotation == null) {
                    return;
                }
                String aValue = hashMap.get(annotation.Value());
                ReflectionUtils.makeAccessible(field);
                if (field.getAnnotation(ConfigValue.class) != null) {
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

    private Properties getFromListFile() {
        if (listFile != null) {
            List<File> files = new ArrayList<File>();

            for (String item : listFile) {
                files.add(readFileFromPath(item));
            }
            LoadConfigFile configFile = new LoadConfigFile(files);
            return configFile.getProperties();
        }
        return null;
    }

    private File readFileFromPath(String path) {

        if (path.indexOf("url:") >= 0) {
            path = path.substring(path.indexOf("url:") + 4);
        }
        File file = new File(path);
        if (!file.canWrite()) {
            LoadFileClassPath fileClassPath = new LoadFileClassPath();
            file = fileClassPath.getFile(path);
            System.out.println("read config file from classPath");
        }
        return file;

    }

    private void loadAllKey() {

        //   LoadFileClassPath fileClassPath = new LoadFileClassPath();
        Properties prop = null;
        if (listFile != null) {
            prop = getFromListFile();
        } else if (!fileName.isEmpty()) {
            LoadFileClassPath fileClassPath = new LoadFileClassPath();
            try {
                prop = new Properties();
                prop.load(fileClassPath.getResource(fileName));
            } catch (IOException e) {
                e.printStackTrace();
                // handles IO exceptions
            }

        }
        if (prop != null) {
            Set<Object> keys = prop.keySet();
            for (Object k : keys) {
                String key = (String) k;
                hashMap.put(key, prop.getProperty(key));

            };
        }

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getListFile() {
        return listFile;
    }

    public void setListFile(List<String> listFile) {
        this.listFile = listFile;
    }

}
