package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainPage {
    private final infoDisplay workerDisplay;

    @Autowired
    public MainPage(infoDisplay workerDisplay) {
        this.workerDisplay = workerDisplay;
    }

    @GetMapping("/home")
    public String listWorkers(Model model) {
        List<WorkerInfo> workers = workerDisplay.getAllWorkers();
        model.addAttribute("workers", workers);
        return "workers_list";
    }

    @GetMapping("/worker/new")
    public String showCreateForm(Model model) {
        model.addAttribute("worker", new WorkerInfo("", "", 0, 0));
        return "worker_form";
    }

    @PostMapping("/worker/create")
    public String createWorker(@ModelAttribute WorkerInfo worker) {
        workerDisplay.addWorker(worker);
        return "redirect:/home";
    }

    @GetMapping("/worker/{type}")
    public String showWorker(@PathVariable String type, Model model) {
        WorkerInfo worker;
        try {
            int index = Integer.parseInt(type);
            worker = workerDisplay.getWorkerByIndex(index);
        } catch (NumberFormatException e) {
            worker = switch (type.toLowerCase()) {
                case "programmer" -> workerDisplay.getProgrammer();
                case "builder" -> workerDisplay.getBuilder();
                case "guard" -> workerDisplay.getGuard();
                default -> null;
            };
        }
        
        if (worker == null) {
            return "redirect:/home";
        }
        
        model.addAttribute("worker", worker);
        model.addAttribute("type", type);
        return "worker_details";
    }
}
