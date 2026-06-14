package com.suvam.personalbooklibrarymanager.controller;

import com.suvam.personalbooklibrarymanager.model.Book;
import com.suvam.personalbooklibrarymanager.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Book Library API is running";
    }

    @GetMapping("/getBooks")
    public Collection<Book> getAllBooks() {
        return service.getALLBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return service.getBook(id);
    }
}
