/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocb.ttt.common.convert;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;
import org.springframework.util.ReflectionUtils;

/**
 *
 * @author toanhv
 */
public class JsonPharse<T> {

    public <T> T ConvertToObject(String st, Class<T> typeClass) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Object obj = mapper.readValue(st, typeClass);
            return (T) obj;
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String ConvertToString(T obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {

            String jsonInString = "";

            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

            return jsonInString;

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static <T> String ConvertToString1(T obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {

            String jsonInString = "";

            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

            return jsonInString;

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static <T> T ConvertToObj(String st, Class<T> typeClass) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Object obj = mapper.readValue(st, typeClass);
            return (T) obj;
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T ConvertToOjectNew(String jsonData, Class<T> typeClass) {
        Map<String, String> map = ConvertToObj(jsonData, Map.class);

        try {
            Field[] fields = typeClass.getDeclaredFields();
            Object obj = typeClass.newInstance();
            for (Field field : fields) {
                ReflectionUtils.makeAccessible(field);
                String v = map.get(field.getName()) != null ? map.get(field.getName()) : "";
               if (field.getType().isAssignableFrom(Integer.class)) {
                    ReflectionUtils.setField(field, obj,Integer.valueOf(v));
                } else if (field.getType().isAssignableFrom(long.class)) {
                    ReflectionUtils.setField(field, obj, Long.valueOf(v));
                } else {
                    if (field.getType().isAssignableFrom(double.class)) {
                        ReflectionUtils.setField(field, obj,Double.valueOf(v));
                    } else {
                        ReflectionUtils.setField(field, obj,v);

                    }
                }

            }

            return (T) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
