package service;

import models.Payment;

import java.util.ArrayList;

public class PaymentManager {
    ArrayList<Payment> payments;

    public PaymentManager() {
        this.payments = new ArrayList<>();
    }

    public Payment add(float amount) {
        Payment payment = new Payment(amount);
        this.payments.add(payment);
        return payment;
    }
}
