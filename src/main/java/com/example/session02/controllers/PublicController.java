package com.example.session02.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {
    @GetMapping
    public String getHomePage() {
        return "home";
    }

    public String getFormPage() {
        return "form";
    }
}