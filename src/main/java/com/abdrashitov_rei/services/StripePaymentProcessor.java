package com.abdrashitov_rei.services;

import org.springframework.stereotype.Component;

@Component("stripe")
public class StripePaymentProcessor implements PaymentProcessor{

    public boolean pay(Float amount) throws Exception {
        return amount >= 100;
    }

    @Override
    public <T extends Number> void processPayment(T amount) throws Exception {
        //process payments
    }
}
