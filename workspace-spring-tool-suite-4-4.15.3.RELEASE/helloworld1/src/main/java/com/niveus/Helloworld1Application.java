package com.niveus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Helloworld1Application {

	public static void main(String[] args) {
		SpringApplication.run(Helloworld1Application.class, args);
		System.out.println("Hello world");
		Person p=new Person();
		p.setFirstname("John");
		p.setLastname("Pinto");
		System.out.println(p.getFirstname());
	}

}
