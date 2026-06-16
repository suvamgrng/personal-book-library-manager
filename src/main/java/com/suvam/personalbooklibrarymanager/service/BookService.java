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

    public Collection<Book> searchBooks(String author, String genre) {
        return books.values() // gets all books
                .stream() // Converts to stream
                .filter(book -> { // Loops
                    boolean matches = true;
                    if (author != null) { // Only executes if author is not empty
                        matches = matches && book.getAuthor().equalsIgnoreCase(author); // If author found then it returns true otherwise false
                    }
                    if (genre != null) { // Only executes if author is not empty
                        matches = matches && book.getGenre().equalsIgnoreCase(genre); // If genre found then it returns true otherwise false
                    }
                    return matches; // If genre and author is found then returns true OTHERWISE false
                })
                .toList(); // returns author and genre
    }
}
