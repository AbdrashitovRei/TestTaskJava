package com.abdrashitov_rei.services;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PaypalPaymentProcessor implements PaymentProcessor{

    public void makePayment(Integer amount) throws Exception {
        if (amount > 100000) {
            throw new Exception("PayPal payment failed: amount exceeds limit");
        }
    }

    @Override
    public <T extends Number> void processPayment(T amount) throws Exception {
        //process payments
    }
}
