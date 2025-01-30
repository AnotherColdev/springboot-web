package com.anothercoldev.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.anothercoldev.curso.springboot.webapp.springboot_web.models.User;
import com.anothercoldev.curso.springboot.webapp.springboot_web.models.DTO.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("another", "coldev");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Spring Rest");
        body.put("description", "Curso de Spring Boot");
        body.put("version", "1.0");
        body.put("user", user);
        return body;
    }

    @GetMapping("/details-dto")
    public UserDTO detailsDTO() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("another");
        userDTO.setEmail("anothercol@dev.com");
        userDTO.setPassword("123456");
        return userDTO;
    }

    @GetMapping("/list")
    public List<User> list() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("another", "coldev"));
        userList.add(new User("Pepito", "perez"));
        userList.add(new User("capito", "capo"));
        return userList;
    }
}