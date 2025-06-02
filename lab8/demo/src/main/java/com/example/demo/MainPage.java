package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {
    private final infoDisplay workerDisplay;

    @Autowired
    public MainPage(infoDisplay workerDisplay) {
        this.workerDisplay = workerDisplay;
    }

    @GetMapping("/home")
    public String text(Model model) {
        model.addAttribute("programmer", workerDisplay.getProgrammer());
        model.addAttribute("builder", workerDisplay.getBuilder());
        model.addAttribute("guard", workerDisplay.getGuard());
        return "main_page";
    }
}
