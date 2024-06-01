package dev.sandeep.PaymentService.service;

import com.razorpay.RazorpayException;
import dev.sandeep.PaymentService.PaymentRequestDTO;

public interface PaymentService {
    String generatePaymentLink(PaymentRequestDTO paymentRequestDTO) throws RazorpayException;
}
