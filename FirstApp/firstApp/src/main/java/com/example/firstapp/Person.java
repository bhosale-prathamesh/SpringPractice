package com.example.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();
        System.out.println("code");
    }
}
