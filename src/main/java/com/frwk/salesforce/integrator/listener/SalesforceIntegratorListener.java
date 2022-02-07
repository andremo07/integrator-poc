package com.frwk.salesforce.integrator.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SalesforceIntegratorListener {

    @KafkaListener(topics = "brand", groupId = "brand_consumers")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
