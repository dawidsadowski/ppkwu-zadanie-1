package com.example.ppkwuzadanie1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RevController {

    @GetMapping("{text}")
    String getRevText(@PathVariable("text") String text) {
        return text;
    }
}
