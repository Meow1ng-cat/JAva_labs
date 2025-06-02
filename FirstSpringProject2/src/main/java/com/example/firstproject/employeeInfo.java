package com.example.firstproject;

public class employeeInfo {
    private Worker worker;
    private int salary;

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public employeeInfo(Worker worker) {this.worker = worker;}
    public void setSalary(int salary) {this.salary = salary;}

    public employeeInfo() {
    }

    @Override
    public String toString() {
        return "Name: " + worker +
                "\nSalary: " + salary;
    }
}
