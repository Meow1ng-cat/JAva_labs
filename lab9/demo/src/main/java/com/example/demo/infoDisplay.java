package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("infoDisplay")
public class infoDisplay {
    private final List<WorkerInfo> workers = new ArrayList<>();
    private final WorkerInfo programmer;
    private final WorkerInfo builder;
    private final WorkerInfo guard;

    public infoDisplay(@Qualifier("programmer") WorkerInfo programmer,
                      @Qualifier("builder") WorkerInfo builder,
                      @Qualifier("guard") WorkerInfo guard) {
        this.programmer = programmer;
        this.builder = builder;
        this.guard = guard;
        
        // Add default workers to the list
        workers.add(programmer);
        workers.add(builder);
        workers.add(guard);
    }

    public List<WorkerInfo> getAllWorkers() {
        return workers;
    }

    public void addWorker(WorkerInfo worker) {
        workers.add(worker);
    }

    public WorkerInfo getProgrammer() {
        return programmer;
    }

    public WorkerInfo getBuilder() {
        return builder;
    }

    public WorkerInfo getGuard() {
        return guard;
    }

    public WorkerInfo getWorkerByIndex(int index) {
        if (index >= 0 && index < workers.size()) {
            return workers.get(index);
        }
        return null;
    }
}
