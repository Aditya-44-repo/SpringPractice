package com.mphasis.service;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSService {
    public void sendSMS(){
        System.out.println("SMS sent ..");
    }
}
