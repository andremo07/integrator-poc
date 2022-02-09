package com.frwk.salesforce.integrator.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.frwk.salesforce.integrator.dto.BrandMessage;
import com.frwk.salesforce.integrator.service.IntegratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class BrandListener {

    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private IntegratorService integratorService;

    @KafkaListener(topics = "brand", groupId = "brand_consumers")
    public void listenBrandMessage(String message, Acknowledgment ack) {
        try {
            BrandMessage brandMessage = mapper.readValue(message,BrandMessage.class);
            integratorService.addBrandToSalesforce(brandMessage);
        } catch (JsonProcessingException e) {
            //TODO adicionar logs
            e.printStackTrace();
        } finally {
            ack.acknowledge();
        }
    }
}
