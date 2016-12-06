package com.testdev.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@Controller
public class AuthController {

    @RequestMapping("/")
    public String auth() {
        return "login";
    }

    @RequestMapping("/deny")
    public String accessDenided() {
        return "accessdenided";
    }

    @RequestMapping("/chat")
    public String printWelcome() {
        return "index";
    }
}
