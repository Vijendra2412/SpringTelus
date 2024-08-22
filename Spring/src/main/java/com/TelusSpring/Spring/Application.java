package com.TelusSpring.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
/* //1. manually create object ---Alien.java
		SpringApplication.run(Application.class, args);
		Alien obj = new Alien();
		obj.code();
 */
/*
		//2. Spring Create Object

		ApplicationContext context =  SpringApplication.run(Application.class, args);  // these line for communicate with IoC Container
		Alien obj = context.getBean(Alien.class);
		obj.code(); //Output :- its vj class

		// in this v can create another object
		Alien obj1 = context.getBean(Alien.class);
		obj1.code();//Output :- its vj class


 */

		//3. @AutoWiring
		ApplicationContext context =  SpringApplication.run(Application.class, args);  // these line for communicate with IoC Container
		Alien obj = context.getBean(Alien.class);
		obj.code();

	}

}
