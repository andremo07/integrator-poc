package com.frwk.salesforce.integrator.service;

import com.frwk.salesforce.integrator.dto.BrandMessage;
import com.frwk.salesforce.integrator.dto.Payload;
import com.frwk.salesforce.integrator.dto.TransactionType;
import com.frwk.salesforce.integrator.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegratorService {

    @Autowired
    private BrandRepository brandRepository;

    public void addBrandToSalesforce(BrandMessage message) {
        Payload payload = message.getPayload();
        if (payload != null) {
            try {
                TransactionType transactionType = TransactionType.lookup(payload.getOp());
                if (transactionType.equals(TransactionType.CREATE)) {

                } else if (transactionType.equals(TransactionType.UPDATE)) {

                } else {

                }

/*            if (!brandRepository.existsBrandByBrandId(message.get)) {
                brandRepository.save(Brand.prototype(message.getId()));
            }*/
                //CALL Salesforce
            } catch (Exception e) {
                //TODO Criar exceção especifica
                System.out.println();
            }
        }
    }
}
