package com.mphasis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {

    @Autowired
//    @Qualifier -> beans with same name this is used
    private EmailService emailService;

    public EmailService getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(){
        emailService.sendMail();
        System.out.println("your order is placed");
    }
}
