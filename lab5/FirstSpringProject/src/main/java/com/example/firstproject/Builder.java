package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component("BuilderBean")
public class Builder extends BaseWorker implements Worker{
    public Builder() {
        this.name = "Bob";
    }
}
