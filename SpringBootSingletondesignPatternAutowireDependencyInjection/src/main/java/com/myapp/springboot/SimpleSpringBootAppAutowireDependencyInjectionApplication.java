package com.myapp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleSpringBootAppAutowireDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SimpleSpringBootAppAutowireDependencyInjectionApplication.class, args);
		
		
// By default Spring framework use singleton design pattern which means it will give you the object prehand , we dont have to wait for object creation
// Even after commenting the below code i got an output as object created bcoz of singleton design pattern followed by spring framework.
		
//		Student s1= context.getBean(Student.class);
//		s1.show();
		
		
// Here i am trying to ask for the two times but i again i got the single obejct only and object created is printing only once bcoz of singleton design pattern. 
		
		Student s1= context.getBean(Student.class);
		s1.show();
		
		Student s2= context.getBean(Student.class);
		
		s2.show();
		
		
	}

}
