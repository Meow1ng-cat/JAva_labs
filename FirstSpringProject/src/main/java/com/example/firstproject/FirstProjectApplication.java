package com.example.firstproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class FirstProjectApplication {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Person person = context.getBean("PersonBean", Person.class);
	System.out.println(person.toString());
	context.close();
	}
}
