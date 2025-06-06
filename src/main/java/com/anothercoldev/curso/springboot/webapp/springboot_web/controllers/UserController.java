package com.anothercoldev.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.anothercoldev.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("another", "coldev");
        user.setEmail("anothercol@dev.com");
        model.addAttribute("title", "Hola mundo SpringBoot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    //This method sets an global model attribute for this controller and returns the list of users 
    //that can be used in every view rendered by a function in this controller
    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = new ArrayList<User>();
        users.add(new User("another", "coldev"));
        users.add(new User("Primer", "prime"));
        users.add(new User("Segundo", "Sec"));
        return users;
    }
}
