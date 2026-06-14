package com.suvam.personalbooklibrarymanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private String title;
    private String author;
    private String genre;
    private int year;
}
