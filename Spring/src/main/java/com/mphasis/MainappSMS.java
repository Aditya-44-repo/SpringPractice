package com.mphasis;

import com.mphasis.service.SMSService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainappSMS {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container =
                new ClassPathXmlApplicationContext("Spring.config.xml");

        SMSService smsService =
                container.getBean("smsService", SMSService.class);

        smsService.sendSMS();

        container.close();
    }
}