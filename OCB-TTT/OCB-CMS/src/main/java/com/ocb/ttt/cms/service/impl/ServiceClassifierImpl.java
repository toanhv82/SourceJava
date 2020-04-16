/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocb.ttt.cms.service.impl;

import com.ocb.ttt.cms.model.CardPolicy;

import com.ocb.ttt.cms.repository.ServiceCardCmsDao;
import com.ocb.ttt.cms.service.ServiceClassifier;
import com.ocb.ttt.model.Classifier;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author toanhv1
 */
@Service
public class ServiceClassifierImpl implements ServiceClassifier{

    @Autowired
    private ServiceCardCmsDao serviceCardDao;
    
    @Override
    public boolean updatePolicyClassifier(CardPolicy policy) {
        
       List<Classifier> list=   getClassifier(policy.getPolicyCode());
       
       
       
       return true;
    }
    
    public List<Classifier> getClassifier(String code)
    {
      return   serviceCardDao.getClassifierByMCS(code);      
        
    }
    private void updateClassifier(String contractNumber, Classifier classifier)
    {
        
    }
    
    
    
}
