package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainPage {
    @GetMapping("/home")
    public String text() {
        return "main_page";
    }

    //Added in Lab5
    @GetMapping("/positions")
    public String positions(@RequestParam("job") String job, @RequestParam("salary") int salary, Model model) {
        model.addAttribute("params1",job);
        model.addAttribute("params2",salary);
        return "job_info";
    }
}




