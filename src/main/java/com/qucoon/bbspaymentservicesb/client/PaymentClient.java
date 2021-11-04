package com.qucoon.bbspaymentservicesb.client;

import com.qucoon.bbspaymentservicesb.api.request.AddPaymentLocal;
import com.qucoon.bbspaymentservicesb.api.response.AddPaymentLocalResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class PaymentClient extends WebServiceGatewaySupport {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentClient.class);

    public AddPaymentLocalResponse makePayment(AddPaymentLocal paymentLocal){


        logger.info("Requesting payment service from " + paymentLocal.getSourceAccount());

        AddPaymentLocalResponse paymentLocalResponse =
                (AddPaymentLocalResponse) getWebServiceTemplate()
                .marshalSendAndReceive(paymentLocal);

        return paymentLocalResponse;

    }


}
