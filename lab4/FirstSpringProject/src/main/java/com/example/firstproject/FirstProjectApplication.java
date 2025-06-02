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
			System.out.println(builder.toString());
			break;
		case 2:
			employeeInfo programmer = context.getBean("nameDisplay2", employeeInfo.class);
			employeeInfo programmer2 = context.getBean("nameDisplay2", employeeInfo.class);
			System.out.println("Update worker's salary: ");
			programmer2.setSalary(sc.nextInt());
			System.out.println("Old information: \n" + programmer.toString());
			System.out.println("Updated information: \n" + programmer2.toString());
			break;
		case 3:
			employeeInfo fastFoodWorker = context.getBean("nameDisplay3", employeeInfo.class);
			System.out.println(fastFoodWorker.toString());
			break;
		}
		context.close();
	}
}
