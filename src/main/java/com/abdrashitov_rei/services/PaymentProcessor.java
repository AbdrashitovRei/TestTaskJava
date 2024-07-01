package com.abdrashitov_rei.services;

public interface PaymentProcessor {
    <T extends Number> void processPayment(T amount) throws Exception;
}
