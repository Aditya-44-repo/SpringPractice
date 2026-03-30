package com.mphasis.service;

public class GreetService {
    private String message;

    public GreetService(String message) {
        this.message = message;
    }

    public void greet(){
        System.out.println(message);
    }

    private void destroy() {
        System.out.println("GreetService Destroyed");
    }

    private void init() {
        System.out.println("GreetService Initialized");
    }


}
