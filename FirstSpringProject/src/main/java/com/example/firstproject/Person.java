package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component("PersonBean")
public class Person {
    private String name;
    private String surname;
    private Date birthDate;

    public Person(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Birth Date: " + birthDate;
    }
}
