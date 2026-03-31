package com.mphasis;

import com.mphasis.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppOrderService {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(SpringConfig.class);  //creating the container

//        GreetService gree = container.getBean("greetService", GreetService.class);  // created obj greet with id and class
//        gree.greet();

        OrderService o= container.getBean("orderService",OrderService.class); // (id,class)
        o.placeOrder();  //AOP

//        WeatherApp weatherService = container.getBean("weatherService",WeatherApp.class);
//        System.out.println(weatherService.getWeather("pune"));
//          jar file integrationn


        container.close();
    }
}
