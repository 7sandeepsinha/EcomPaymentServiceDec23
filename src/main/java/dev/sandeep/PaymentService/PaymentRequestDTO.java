package dev.sandeep.PaymentService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequestDTO {
    private long amount;
    private String orderId;
    private String description;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
}
