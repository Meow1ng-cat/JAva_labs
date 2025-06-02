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

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(name = "num1") double num1,
            @RequestParam(name = "num2") double num2,
            @RequestParam(name = "operation") String operation,
            Model model
    ) {
        double result;
        String operationSymbol;

        switch (operation.toLowerCase()) {
            case "add":
                result = num1 + num2;
                operationSymbol = "+";
                break;
            case "subtract":
                result = num1 - num2;
                operationSymbol = "-";
                break;
            case "multiply":
                result = num1 * num2;
                operationSymbol = "*";
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    operationSymbol = "/";
                } else {
                    model.addAttribute("error", "Деление на ноль невозможно!");
                    return "calculate_result";
                }
                break;
            default:
                model.addAttribute("error", "Неподдерживаемая операция!");
                return "calculate_result";
        }

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operationSymbol);
        model.addAttribute("result", result);
        
        return "calculate_result";
    }
}
