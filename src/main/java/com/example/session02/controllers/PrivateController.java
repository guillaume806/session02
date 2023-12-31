package com.example.session02.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
@RequiredArgsConstructor
public class PrivateController {
    @GetMapping("/secret1")
    public String getSecretPage1() {
        return "private/secret1";
    }

    @GetMapping("secret2")
    public String getSecretPage2() {
        return "private/secret2";
    }
    @GetMapping("/secret3")
    public String getSecretPage3() {
        return "private/secret3";
    }
}
//    docker run --name some-postgres -e POSTGRES_PASSWORD='admin' -p 5432:5432 -d --rm postgres
