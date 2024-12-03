package com.mrappmaker.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // dependency injection
public class Dev {

    @Autowired // it connects both classes without requiring to create an instance | field injection
    private Laptop laptop;

    public void build() {
        laptop.compile();
        System.out.println("Building an awesome spring project!");
    }
}
