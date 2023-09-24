package models;

import lombok.Data;

enum PaymentStatus {
    SUCCESSFULL,
    FAILED
        }
@Data
public class Payment {
    float amount;
    PaymentStatus status;

    public Payment(float amount) {
        this.amount = amount;
        this.status = PaymentStatus.SUCCESSFULL;
    }


}
