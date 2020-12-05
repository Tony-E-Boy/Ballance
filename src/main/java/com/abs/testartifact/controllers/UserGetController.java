package com.abs.testartifact.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserGetController {

    @GetMapping("/")
    public String indexPage(){return "index";}

    @GetMapping("/index")
    public String indexPageToo(){return "index";}

    @GetMapping("/login")
    public String loginPage() {return "login";}

    @GetMapping("/registration")
    public String registrationPage(){return "register";}
}
