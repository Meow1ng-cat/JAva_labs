package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component("FastFoodBean")
public class FastFoodWorker extends BaseWorker implements Worker{
    public FastFoodWorker() {
        this.name = "John";
    }
}
