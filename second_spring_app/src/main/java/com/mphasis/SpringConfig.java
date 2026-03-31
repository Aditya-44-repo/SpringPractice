package com.mphasis;


import com.mphasis.service.MailServerConfig;
import com.mphasis.service.WeatherApp;
import org.springframework.context.annotation.*;


@Configuration // It is similar to spring.config.xml
@ComponentScan(basePackages = {"com.mphasis"})  //where to search for the beans ?
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean("weatherService")  // Helps working with source files -> converts class in jar to bean.
    @Scope("singleton")
    public WeatherApp weatherService(){
        return new WeatherApp();
    }

    // Their are two server for one testing one for production which should we run? which why we use Primary.
    @Bean
    public MailServerConfig mailServerConfig(){
        MailServerConfig m = new MailServerConfig();
        m.setIp("23.24.24");
        m.setLogin("Yo is loging in");
        m.setToken("22");
        return m;
    }
    @Bean
    @Primary  //two with same class datatype primary can be used to make it run over the other one
    public MailServerConfig mailServerConfigb(){
        MailServerConfig m = new MailServerConfig();
        m.setIp("23.24");
        m.setLogin("Yo is loging in");
        m.setToken("22");
        return m;}

}
