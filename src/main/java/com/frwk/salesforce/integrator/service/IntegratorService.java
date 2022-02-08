package com.frwk.salesforce.integrator.service;

import com.frwk.salesforce.integrator.dto.BrandMessage;
import com.frwk.salesforce.integrator.model.Brand;
import com.frwk.salesforce.integrator.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegratorService {

    @Autowired
    private BrandRepository brandRepository;

    public void addBrandToSalesforce(BrandMessage message){
        try {
            if(!brandRepository.existsBrandByBrandId(message.getId())){
                brandRepository.save(Brand.prototype(message.getId()));
            }
            //CALL Salesforce
        }catch (Exception e){
            //TODO Criar exceção especifica
            System.out.println();
        }

    }
}
