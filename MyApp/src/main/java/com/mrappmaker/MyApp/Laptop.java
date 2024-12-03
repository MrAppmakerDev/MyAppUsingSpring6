package com.mrappmaker.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compiling the code!");
    }
}
