package com.qucoon.bbspaymentservicesb.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PaymentClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.qucoon.bbspaymentservicesb.client.gen");
        return marshaller;

    }


    @Bean
    public PaymentClient paymentClient(Jaxb2Marshaller marshaller){

        PaymentClient client = new PaymentClient();
        client.setDefaultUri("http://localhost:8080/ws/makepayment");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;

    }

}
