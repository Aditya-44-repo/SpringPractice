package com.mphasis.service;

public class OrderService {
    private EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder() {
        System.out.println("order places");
        emailService.sendMail();
    }

    public EmailService getEmailService() {
        return emailService;
    }
}