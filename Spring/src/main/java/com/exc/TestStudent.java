package com.exc;

import com.exc.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("prac.config.xml");
        //Exercis 1
        Student student = ctx.getBean("student", Student.class);
        student.display();

        //Exercise 2
        Car car = ctx.getBean("car", Car.class);
        car.displayDetails();

        //Exercise 3
        Library library = ctx.getBean("library", Library.class);
        library.displayLibrary();


        //Exercise 4
        Employee emp1 = ctx.getBean("employee1", Employee.class);
        Employee emp2 = ctx.getBean("employee2", Employee.class);
        emp1.displayEmployee();
        emp2.displayEmployee();


        //Exercise 5
        ShoppingCart cart =
                ctx.getBean("shoppingCart", ShoppingCart.class);

        cart.checkout();



        ctx.close();
    }
}