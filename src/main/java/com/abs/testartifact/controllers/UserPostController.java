package com.abs.testartifact.controllers;

import com.abs.testartifact.dao.UserDao;
import com.abs.testartifact.models.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserPostController {

    private UserDao daoDo;

    @PostMapping()
    public String createUser(@ModelAttribute("create") @Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "register";
        daoDo.create(user);
        return "redirect:/admin";
    }
}
