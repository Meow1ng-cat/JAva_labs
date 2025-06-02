package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component("ProgrammerBean")
public class Programmer extends BaseWorker implements Worker{
    public Programmer() {
        this.name = "Harry";
    }
}
