package com.example.firstproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class FirstProjectApplication {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Scanner sc = new Scanner(System.in);
	System.out.println("Select a worker to view their info: \n" +
			"1. Builder \n"+
			"2. Programmer \n" +
			"3. Fast Food Worker \n");
	switch(sc.nextInt()) {
		case 1:
			EmployeeInfo builder = context.getBean("InfoBean", EmployeeInfo.class);
			System.out.println(builder.Builder());
			break;
		case 2:
			EmployeeInfo programmer = context.getBean("InfoBean", EmployeeInfo.class);
			EmployeeInfo programmer2 = context.getBean("InfoBean", EmployeeInfo.class);
			System.out.println("Update worker's salary: ");
			programmer2.setSalary2(sc.nextInt());
			System.out.println("Old information: \n" + programmer.Programmer());
			System.out.println("Updated information: \n" + programmer2.Programmer());
			break;
		case 3:
			EmployeeInfo fastFoodWorker = context.getBean("InfoBean", EmployeeInfo.class);
			System.out.println(fastFoodWorker.FastFoodWorker());
			break;
	}
	context.close();
	}
}
