package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("infoDisplay")
public class infoDisplay {
    public infoDisplay(@Qualifier("programmer") WorkerInfo programmer,
                       @Qualifier("builder") WorkerInfo builder,
                       @Qualifier("guard") WorkerInfo guard) {
        this.programmer = programmer;
        this.builder = builder;
        this.guard = guard;
    }

    private WorkerInfo programmer;
    private WorkerInfo builder;
    private WorkerInfo guard;

}
