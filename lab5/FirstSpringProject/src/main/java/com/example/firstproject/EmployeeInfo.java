package com.example.firstproject;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("InfoBean")
@Scope("prototype")
public class EmployeeInfo {
    private Worker worker;
    private Worker worker2;
    private Worker worker3;
    @Value("${builder.salary}")
    private int salary;
    @Value("20000")
    private int salary2;
    @Value("${fastfood.salary}")
    private int salary3;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    @Autowired
    public EmployeeInfo(@Qualifier("BuilderBean") Worker worker, @Qualifier("ProgrammerBean") Worker worker2, @Qualifier("FastFoodBean") Worker worker3) {
        this.worker = worker;
        this.worker2 = worker2;
        this.worker3 = worker3;
    }
    public void setSalary(int salary) {this.salary = salary;}
    public void setSalary2(int salary2) {this.salary2 = salary2;}
    public void setSalary3(int salary3) {this.salary3 = salary3;}
    @PostConstruct
    public void testInitMethod() {
        System.out.println("Init done");
    }
    @PreDestroy
    public void testDestroyMethod() {
        System.out.println("Destroy done");
    }

    public String Builder() {
        return "Name: " + worker +
                "\nSalary: " + salary;
    }
    public String Programmer() {
        return "Name: " + worker2 +
                "\nSalary: " + salary2;
    }
    public String FastFoodWorker() {
        return "Name: " + worker3 +
                "\nSalary: " + salary3;
    }
}
