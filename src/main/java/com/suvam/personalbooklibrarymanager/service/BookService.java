package com.suvam.personalbooklibrarymanager.service;

import com.suvam.personalbooklibrarymanager.model.Book;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {


    // initialize the map with integer keys and Book values
    private Map<Long, Book> books = new HashMap<>(Map.of(
            1L, new Book(1, "The Alchemist", "Paulo Coelho", "Fiction", 1988),
            2L, new Book(2, "Clean Code", "Robert C. Martin", "Technology", 2008),
            3L, new Book(3, "Atomic Habits", "James Clear", "Self-Help", 2018)
    ));

    public Collection<Book> getAllBooks() {
        return books.values();
    }

    public Book getBook(long id) {
        return books.get(id);
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public boolean updateBook(long id, Book book) {
        if (books.containsKey(id)) {
            book.setId(id);
            books.put(id, book);
            return true;
        }
        return false;
    }

    public boolean deleteBook(long id) {
        if (books.containsKey(id)) {
            books.remove(id);
            return true;
        } else {
            return false;
        }
    }
}
