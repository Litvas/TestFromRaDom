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

    @RequestMapping("/index")
    public String printWelcome() {
        return "index";
    }

    @RequestMapping("/deny")
    public String accessDenided() {
        return "accessdenided";
    }
}
