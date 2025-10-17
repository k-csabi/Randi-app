package com.university.randiapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "Mukodik a test oldal";
    }

    @GetMapping("/")
    public String home() {
        return "Mukodik az alap oldal";
    }
}

