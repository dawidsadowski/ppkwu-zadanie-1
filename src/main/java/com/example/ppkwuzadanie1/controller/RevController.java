package com.example.ppkwuzadanie1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RevController {

    @GetMapping()
    String getHelpText() {
        return "Aby skorzystać z usługi rev, wpisz tekst po ukośniku w URL żądania, np. /HelloWorld";
    }

    @GetMapping("/{text}")
    StringBuffer getRevText(@PathVariable("text") String text) {
        return new StringBuffer(text).reverse();
    }
}
