package com.anothercoldev.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anothercoldev.curso.springboot.webapp.springboot_web.models.DTO.ParamDTO;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false) String message) {

        ParamDTO param = new ParamDTO();
        param.setMessage(message != null ? message : "No message");

        return param;
    }

}
