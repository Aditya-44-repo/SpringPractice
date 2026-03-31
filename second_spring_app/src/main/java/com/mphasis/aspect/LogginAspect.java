package com.mphasis.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect // cross cutting logic
public class LogginAspect {
    @Before("execution(* com.mphasis.service.OrderService.placeOrder(..))")
    public void before(){

        System.out.println("Loggin Metrics...");
        System.out.println("Before :"+LocalDateTime.now());
    }
    @After("execution(* com.mphasis.service.OrderService.placeOrder(..))")
    public void after(){
        System.out.println("After :"+LocalDateTime.now());
    }
}
