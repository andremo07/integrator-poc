package com.frwk.salesforce.integrator.service;

import com.frwk.salesforce.integrator.dto.BrandMessage;
import com.frwk.salesforce.integrator.dto.DataInfo;
import com.frwk.salesforce.integrator.dto.Payload;
import com.frwk.salesforce.integrator.dto.TransactionType;
import com.frwk.salesforce.integrator.model.Brand;
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
                    DataInfo data = payload.getAfter();
                    if(data!=null){
                        if (!brandRepository.existsBrandByBrandId(data.getMarcCdMarca())) {
                            brandRepository.save(Brand.prototype(data.getMarcCdMarca()));
                        }
                        //CALL SALESFORCE
                    }
                } else if (transactionType.equals(TransactionType.UPDATE)) {
                } else {
                }
            } catch (Exception e) {

            }
        }
    }
}
