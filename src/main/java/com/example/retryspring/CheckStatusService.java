package com.example.retryspring;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class CheckStatusService {
    @Retryable(value = RuntimeException.class , maxAttempts = 3,backoff = @Backoff(3000))
    public String checkStatus(String trackingNumber){
        System.out.println("calling another service to get status!!");
        throw new RuntimeException("service not available");

        //return "approved";
    }

}