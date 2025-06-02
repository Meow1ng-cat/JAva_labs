package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("beanInfo")
public class WorkerInfo {
    private String firstName;
    private String lastName;
    private int salary;
    private int workHours;

    public WorkerInfo(String firstName, String lastName, int salary, int workHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
