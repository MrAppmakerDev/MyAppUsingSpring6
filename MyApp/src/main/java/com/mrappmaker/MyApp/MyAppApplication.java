package com.mrappmaker.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyAppApplication.class, args);

//		Dev obj = new Dev(); // explicitly creating in heap memory
//		obj.build(); // calling an instance method
//		Dev.build(); // calling a static method
	}

}
