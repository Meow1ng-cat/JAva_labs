package com.example.firstproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class FirstProjectApplication {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Scanner sc = new Scanner(System.in);
	System.out.println("Select a worker to view their name: \n" +
			"1. Builder \n"+
			"2. Programmer \n" +
			"3. Fast Food Worker \n");
	switch(sc.nextInt()) {
		case 1:
			employeeInfo builder = context.getBean("nameDisplay", employeeInfo.class);
			builder.setSalary(4000);
			System.out.println(builder.toString());
			break;
		case 2:
			employeeInfo programmer = context.getBean("nameDisplay2", employeeInfo.class);
			programmer.setSalary(5000);
			System.out.println(programmer.toString());
			break;
		case 3:
			employeeInfo fastfoodworker = context.getBean("nameDisplay3", employeeInfo.class);
			fastfoodworker.setSalary(3000);
			System.out.println(fastfoodworker.toString());
			break;
		}
		context.close();
	}
}
