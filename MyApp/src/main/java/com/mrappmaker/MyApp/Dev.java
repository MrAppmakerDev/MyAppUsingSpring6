package com.mrappmaker.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // it connects both classes without requiring to create an instance
    private Laptop laptop;

    public void build() {
        laptop.compile();
        System.out.println("Building an awesome spring project!");
    }
}
