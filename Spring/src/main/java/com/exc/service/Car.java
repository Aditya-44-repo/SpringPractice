package com.exc.service;


public class Car {
    private String model;
    private Engine engine;
    private int year;

    public Car(String model, Engine engine, int year) {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println(
                "Model: " + model +
                        ", Year: " + year +
                        ", Engine: " + engine.getType() +
                        ", HP: " + engine.getHorsepower()
        );
    }

}
