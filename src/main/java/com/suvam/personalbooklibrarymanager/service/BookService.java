package com.suvam.personalbooklibrarymanager.service;

import com.suvam.personalbooklibrarymanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {


    // initialize the map with integer keys and Book values
    private Map<Integer, Book> books = new HashMap<>(Map.of(
            1, new Book(1, "The Alchemist", "Paulo Coelho", "Fiction", 1988),
            2, new Book(2, "Clean Code", "Robert C. Martin", "Technology", 2008),
            3, new Book(3, "Atomic Habits", "James Clear", "Self-Help", 2018)
    ));

    public Collection<Book> getALLBooks() {
        return books.values();
    }

    public Book getBook(int id) {
        return books.get(id);
    }
}
