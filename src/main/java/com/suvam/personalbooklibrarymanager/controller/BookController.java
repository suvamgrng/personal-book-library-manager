package com.suvam.personalbooklibrarymanager.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
@Component
@SuppressWarnings("unused")
public class BookController {

    @GetMapping("/hello")
    public String hello() {
        return "Book Library API is running";
    }
}
