package com.anothercoldev.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Spring Rest");
        body.put("description", "Curso de Spring Boot");
        body.put("version", "1.0");
        return body;
    }
}
