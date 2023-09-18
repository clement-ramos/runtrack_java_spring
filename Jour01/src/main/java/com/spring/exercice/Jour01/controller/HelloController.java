package com.spring.exercice.Jour01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greeting.dev}") // Utilisez la propriété "greeting.dev" pour le profil "dev"
    private String greetingMessageDev;

    @Value("${greeting.prod}") // Utilisez la propriété "greeting.prod" pour le profil "prod"
    private String greetingMessageProd;

    @GetMapping("/")
    public String hello() {
        return greetingMessageProd  ; // Utilisez le message de salutation du profil "dev" par défaut
    }
}


