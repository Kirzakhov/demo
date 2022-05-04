package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(DemoApplication.class, args);
		Student s = ctx.getBean(Student.class);
		System.out.println("Student object"+s);
		Student s1 = ctx.getBean(Student.class);
		System.out.println("Student object"+s1);
	}

}
