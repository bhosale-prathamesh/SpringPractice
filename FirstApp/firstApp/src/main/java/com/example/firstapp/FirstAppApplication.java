package com.example.firstapp;

import com.example.firstapp.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FirstAppApplication.class, args);
        System.out.println("Hello World!");
        Person obj = context.getBean(Person.class);
        obj.code();
    }

}
