package com.suvam.personalbooklibrarymanager.controller;

import com.suvam.personalbooklibrarymanager.model.Book;
import com.suvam.personalbooklibrarymanager.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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

    @GetMapping("")
    public Collection<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        return service.getBook(id);
    }

    @PostMapping("")
    public ResponseEntity<Void> addBook(@RequestBody Book book) {
        service.addBook(book);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBook(@PathVariable long id,
                                           @RequestBody Book book) {
        if (service.updateBook(id, book)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable long id) {
        if (service.deleteBook(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
