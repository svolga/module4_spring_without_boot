package ru.practicum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.service.HelloMessageService;

@RestController
@RequestMapping("/hello")
public class HelloMessageController {

    private final HelloMessageService helloMessageService;

    @Autowired
    public HelloMessageController(HelloMessageService helloMessageService) {
        this.helloMessageService = helloMessageService;
    }

    @GetMapping
    public String hello(){
        return helloMessageService.getMessage();
    }



}
