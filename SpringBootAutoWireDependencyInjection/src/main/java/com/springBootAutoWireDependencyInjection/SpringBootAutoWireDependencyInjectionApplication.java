package com.springBootAutoWireDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAutoWireDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootAutoWireDependencyInjectionApplication.class, args);
	
		Student s1= context.getBean(Student.class);
		s1.show();
		
	
	}

}
