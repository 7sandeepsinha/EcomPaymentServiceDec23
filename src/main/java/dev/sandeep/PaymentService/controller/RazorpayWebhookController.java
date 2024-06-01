package dev.sandeep.PaymentService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RazorpayWebhookController {

//    @Value("${razorpay.webhook.secret}")
//    private String razorpayWebhookSecret;

    @PostMapping("/rzp/webhook")
    public ResponseEntity<String> webhook(){
        System.out.println("Razorpay webhook called");
        return ResponseEntity.ok("OK");
    }
}
