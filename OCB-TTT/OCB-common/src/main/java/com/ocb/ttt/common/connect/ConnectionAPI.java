/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.common.connect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;

import java.util.Map;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author toanhv1
 */
public class ConnectionAPI {

    public static String postHttp(String url, Map<String, String> mapHeader, Map<String, Object> params) throws URISyntaxException {

        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //mapHeader.put("", url);       
        for (String key : mapHeader.keySet()) {
            headers.set(key, mapHeader.get(key));
        }
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = url;
        URI uri = new URI(baseUrl);

        // headers.setAll(header);
        LinkedMultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.setAll(params);
        HttpEntity<?> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri, entity, String.class);
        return responseEntity.getBody();

    }

    public static String postHttps(String url, Map<String, String> mapHeader, Map<String, Object> params) throws URISyntaxException {

        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //mapHeader.put("", url);       
        for (String key : mapHeader.keySet()) {
            headers.set(key, mapHeader.get(key));
        }

        try {
            //  restTemplate = new RestTemplate(getClientHttpRequestFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }

       

        final String baseUrl = url;
        URI uri = new URI(baseUrl);

        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

        // headers.setAll(header);
        LinkedMultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.setAll(params);
        HttpEntity<?> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(uri, String.class);
        return responseEntity.getBody();

    }

    public static String postJsonObjectHttp(String url, Map<String, String> mapHeader, Object obj) throws URISyntaxException {

        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //mapHeader.put("", url);       
        for (String key : mapHeader.keySet()) {
            headers.set(key, mapHeader.get(key));
        }
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = url;
        URI uri = new URI(baseUrl);

        // headers.setAll(header);
        HttpEntity<?> entity = new HttpEntity<>(obj, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(uri, entity, String.class);
        return responseEntity.getBody();

    }

    public static <T> T postHttp(String url, Map<String, String> mapHeader, Map<String, Object> params, Class<T> className) throws URISyntaxException {

        HttpHeaders headers = new HttpHeaders();
        // headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //mapHeader.put("", url);       
        for (String key : mapHeader.keySet()) {
            headers.set(key, mapHeader.get(key));
        }
        RestTemplate restTemplate = new RestTemplate();
                
        final String baseUrl = url;
        URI uri = new URI(baseUrl);

        // headers.setAll(header);
        LinkedMultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.setAll(params);
        HttpEntity<?> entity = new HttpEntity<>(body, headers);

        ResponseEntity<T> responseEntity = restTemplate.postForEntity(uri, entity, className);

        return responseEntity.getBody();

    }

    public static HttpComponentsClientHttpRequestFactory getClientHttpRequestFactory(){

        try
        {
        
        KeyStore keyStore=getKeyStore();        
        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(
                new SSLContextBuilder()
                .loadTrustMaterial(null, new TrustSelfSignedStrategy())
                .loadKeyMaterial(keyStore, "Ttt@123".toCharArray())
                .build(),
                NoopHostnameVerifier.INSTANCE);

        CloseableHttpClient  httpClient = HttpClients.custom().setSSLSocketFactory( socketFactory).build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        return requestFactory;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return null;

    }

    public static SSLContext getContext() throws Exception {
        return null;

    }

    public static KeyStore getKeyStore() throws Exception {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(new FileInputStream(new File("D:\\source\\tomcat\\tomcat\\conf\\localhost-rsa.jks")),
                "Ttt@123".toCharArray());
        return keyStore;
    }

    public static void main(String[] args) {

        String url = "http://127.0.0.1:8082";
        Map<String, String> mapHeader = new HashMap<>();
        Map<String, Object> params = new HashMap<>();
        try {

            String result = postHttps(url, mapHeader, params);
            System.out.println("com.ocb.ttt.common.connect.ConnectionAPI.main()" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
