package com.example.session02.controllers;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {
    @GetMapping
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/form")
    public String getFormPage() {


        return "form";
    }
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        HttpSession session) {

        if ("utilisateur".equals(username) && "mot_de_passe".equals(password)) {

            session.setAttribute("utilisateurConnecte", true);


            return "redirect:/private/secret1";
        } else {

            return "/form";
        }
    }

}