package com.mrappmaker.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // dependency injection
public class Dev {

    @Autowired // it connects both classes without requiring to create an instance | field injection
    @Qualifier("laptop")
    private Computer computer;

//    public Dev(Computer computer) { // constructor injection
//        this.computer = computer;
//    }

//    @Autowired // setter injection
//    public void setLaptop(Computer computer) {
//        this.computer = computer;
//    }

    public void build() {
        computer.compile();
        System.out.println("Building an awesome spring project!");
    }
}
