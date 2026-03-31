package com.mphasis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


// emailService is connected or dependent on MailServerConfig
@Service("emailService")
public class EmailService {
    @Autowired  //used for injection _> searches for MainSer... bean and injects it->
    @Qualifier("mailServerConfigb")  // insted of primary this can be used
    private MailServerConfig mailServerConfig;  // now this is an object

    public MailServerConfig getMainServerConfig() {
        return mailServerConfig;
    }

    public void setMainServerConfig(MailServerConfig mainServerConfig) {
        this.mailServerConfig = mainServerConfig;
    }

    public void sendMail(){
        System.out.println("Email sent using : " + mailServerConfig.getIp());
    }
}



