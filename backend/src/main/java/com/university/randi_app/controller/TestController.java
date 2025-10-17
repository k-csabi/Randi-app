package com.university.randi_app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Mukodik a test oldal";
    }

    @GetMapping("/home")
    public String home() {
        return "Mukodik az alap oldal";
    }
}

