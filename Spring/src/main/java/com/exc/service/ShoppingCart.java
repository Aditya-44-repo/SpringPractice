package com.exc.service;


import java.util.List;

public class ShoppingCart {

    private Customer customer;
    private List<Product> products;

    // Constructor Injection
    public ShoppingCart(Customer customer) {
        this.customer = customer;
    }

    // Setter Injection
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void checkout() {
        System.out.println("Customer: " + customer);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
    }
}
