package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageViewController {
    @RequestMapping("/home")
    public ModelAndView showview() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home.jsp");
        mv.addObject("main","welcome");
        return mv;
    }
}
