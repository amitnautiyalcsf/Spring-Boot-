package com.springBootPrototypeAutoWireDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class SpringBootPrototypeAutoWireDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootPrototypeAutoWireDependencyInjectionApplication.class, args);
	
		
		// Now when i use scope as a prototype , the moment i ask for the instance(getBean) at that point it will create an object for us, so in total this time i got two objects.
		
		Student s1= context.getBean(Student.class);
		s1.show();
		
		Student s2= context.getBean(Student.class);
		
		s2.show();
		
	// If i commented the above code does it create any object for me.... No it will not bcoz we use scope as a prototype means only get an object when we ask for the instance(getBean).
		
		
	}

}
