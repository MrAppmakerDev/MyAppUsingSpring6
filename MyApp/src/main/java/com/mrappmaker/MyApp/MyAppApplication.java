package com.mrappmaker.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		Dev obj = context.getBean(Dev.class); // explicitly creating in heap memory
		obj.build(); // now calling a spring component method
//		Dev.build(); // calling a static method
	}

}
