package com.mphasis;

import com.mphasis.service.EmailService;
import com.mphasis.service.MailServerConfig;
import com.mphasis.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainAppservice {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext container= new ClassPathXmlApplicationContext("Spring.config.xml");

        MailServerConfig config =
                container.getBean("mailServerConfig", MailServerConfig.class);


        EmailService emailService =
                container.getBean("emailService", EmailService.class);
        //        System.out.println(config.getIp());
//        System.out.println(config.getLogin());
//        System.out.println(config.getToken());

//         Constructor
        OrderService orderService = container.getBean(OrderService.class);
        orderService.placeOrder();







        container.close();
        container.registerShutdownHook();
    }
}