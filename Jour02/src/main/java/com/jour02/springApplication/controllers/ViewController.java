package com.jour02.springApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/")
    public String showForm() {
        return "view";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("name") String name, Model model) {
        String welcomeMessage = "Bienvenue, " + name + " !";
        model.addAttribute("welcomeMessage", welcomeMessage);
        return "view";
    }
}
