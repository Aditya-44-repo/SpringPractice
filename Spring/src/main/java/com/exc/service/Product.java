package com.exc.service;



    public class Product {
        private String name;
        private double price;

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " : ₹" + price;
        }
    }


